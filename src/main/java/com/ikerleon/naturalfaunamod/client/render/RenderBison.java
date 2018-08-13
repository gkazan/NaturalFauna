package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelBison;
import com.ikerleon.naturalfaunamod.entity.EntityBison;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBison extends RenderLivingZAWA<EntityBison> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bison/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bison/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bison/texture3.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bison/texturechild.png");

	public RenderBison(RenderManager rm) {
		super(rm, new ModelBison(), 0.6F);
	}

    protected ResourceLocation getEntityTexture(EntityBison entity)
    {
    	if(entity.isChild()) {
    		return texturechild;
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
			case 2:
				return texture3;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityBison>{
	@Override
	public Render<? super EntityBison> createRenderFor(RenderManager manager) {
		return new RenderBison(manager);
	    }
    }
}