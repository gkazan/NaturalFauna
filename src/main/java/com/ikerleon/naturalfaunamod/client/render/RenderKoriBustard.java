package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelKoriBustard;
import com.ikerleon.naturalfaunamod.entity.EntityKoriBustard;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderKoriBustard extends RenderLivingZAWA<EntityKoriBustard> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/koribustard/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/koribustard/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/koribustard/texturechild.png");


	public RenderKoriBustard(RenderManager rm) {
		super(rm, new ModelKoriBustard(), 0.4F);
	}
	
	protected ResourceLocation getEntityTexture(EntityKoriBustard entity)
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
		}
	}
  
	
	public static class RenderFactory implements IRenderFactory<EntityKoriBustard>{
		@Override
		public Render<? super EntityKoriBustard> createRenderFor(RenderManager manager) {
			return new RenderKoriBustard(manager);
		    }
	    }
}