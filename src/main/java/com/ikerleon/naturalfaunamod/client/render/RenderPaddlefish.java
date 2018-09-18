package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelPaddlefish;
import com.ikerleon.naturalfaunamod.entity.EntityPaddlefish;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPaddlefish extends RenderLivingZAWA<EntityPaddlefish> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/paddlefish/texture.png");

	public RenderPaddlefish(RenderManager rm) {
		super(rm, new ModelPaddlefish(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityPaddlefish entity)
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
	
    public static class RenderFactory implements IRenderFactory<EntityPaddlefish>{
	@Override
	public Render<? super EntityPaddlefish> createRenderFor(RenderManager manager) {
		return new RenderPaddlefish(manager);
	    }
    }
}
