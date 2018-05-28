package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelLittleBustard;
import com.ikerleon.naturalfaunamod.entity.EntityLittleBustard;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLittleBustard extends RenderLivingZAWA<EntityLittleBustard> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/littlebustard/texture.png");


	public RenderLittleBustard(RenderManager rm) {
		super(rm, new ModelLittleBustard(), 0.4F);
	}
	
	protected ResourceLocation getEntityTexture(EntityLittleBustard entity)
    {
    	return getTextureOfVar(entity.getAnimalType());
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
			default:
				return texture;
		}
	}
  
	
	public static class RenderFactory implements IRenderFactory<EntityLittleBustard>{
		@Override
		public Render<? super EntityLittleBustard> createRenderFor(RenderManager manager) {
			return new RenderLittleBustard(manager);
		    }
	    }
}

