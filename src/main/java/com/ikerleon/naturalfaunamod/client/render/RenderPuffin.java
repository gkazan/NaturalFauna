package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPuffin extends RenderLivingZAWA<EntityPuffin> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/puffin/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/puffin/child_texture.png");

	public RenderPuffin(RenderManager rm) {
		super(rm, new ModelPuffin(), 0.4F);
	}
	
    protected ResourceLocation getEntityTexture(EntityPuffin entity)
    {
    	if(entity.isChild()) {
    		return getTextureOfVarChild(entity.getAnimalType());
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
		}
	}
	
	public ResourceLocation getTextureOfVarChild(int varient) {
		switch (varient) {
			case 0:
			default:
				return texturechild;
		}
	}
	
	public static class RenderFactory implements IRenderFactory<EntityPuffin>{
		@Override
		public Render<? super EntityPuffin> createRenderFor(RenderManager manager) {
			return new RenderPuffin(manager);
		}
	}
}
