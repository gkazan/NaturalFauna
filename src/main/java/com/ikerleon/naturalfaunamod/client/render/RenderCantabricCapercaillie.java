package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCantabricCapercaillie extends RenderLivingZAWA<EntityCantabricCapercaillie> {
	
	public static final ResourceLocation texturemain = new ResourceLocation(NFReference.MOD_ID, "textures/entity/urogallo/urogallo.png");

	public RenderCantabricCapercaillie(RenderManager rm) {
		super(rm, new ModelCantabricCapercaillie(), 0.4F);
	}
	
    protected ResourceLocation getEntityTexture(EntityCantabricCapercaillie entity)
    {
    		return getTextureOfVar(entity.getAnimalType());
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
			default:
				return texturemain;
		}
	}
	
	public static class RenderFactory implements IRenderFactory<EntityCantabricCapercaillie>{
		@Override
		public Render<? super EntityCantabricCapercaillie> createRenderFor(RenderManager manager) {
			return new RenderCantabricCapercaillie(manager);
		    }
	    }
}
