package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelBlueGnu;
import com.ikerleon.naturalfaunamod.entity.EntityBlueGnu;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBlueGnu extends RenderLivingZAWA<EntityBlueGnu> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture3.png");
	public static final ResourceLocation texture4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture4.png");
	public static final ResourceLocation texture5 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture5.png");
	
	public RenderBlueGnu(RenderManager rm) {
		super(rm, new ModelBlueGnu(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityBlueGnu entity)
    {
    	if(entity.isChild()) {
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
				default: return texture;
			case 1:
				return texture2;
			case 2:
				return texture3;
			case 3:
				return texture4;
			case 4:
				return texture5;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityBlueGnu>{
	@Override
	public Render<? super EntityBlueGnu> createRenderFor(RenderManager manager) {
		return new RenderBlueGnu(manager);
	    }
    }
}