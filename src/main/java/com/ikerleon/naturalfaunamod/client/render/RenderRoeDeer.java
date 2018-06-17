package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.data.Gender;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelRoeDeer;
import com.ikerleon.naturalfaunamod.entity.EntityRoeDeer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRoeDeer extends RenderLivingZAWA<EntityRoeDeer> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texture2.png");
	public static final ResourceLocation texturefemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texturefemale.png");
	public static final ResourceLocation texturefemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texturefemale2.png");

	public RenderRoeDeer(RenderManager rm) {
		super(rm, new ModelRoeDeer(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityRoeDeer entity)
    {
    	if(entity.isChild() || entity.getGender()==Gender.FEMALE) {
    		return ZAWARenderUtils.none;
    	}
    	else {
    		return getTextureOfVar(entity.getAnimalType());
    	}
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
			default:
				return texture;
			case 1:
				return texture2;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityRoeDeer>{
	@Override
	public Render<? super EntityRoeDeer> createRenderFor(RenderManager manager) {
		return new RenderRoeDeer(manager);
	    }
    }
}