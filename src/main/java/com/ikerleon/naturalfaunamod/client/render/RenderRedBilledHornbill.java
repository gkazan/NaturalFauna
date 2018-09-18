package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelRedBilledHornbill;
import com.ikerleon.naturalfaunamod.client.model.ModelRedBilledHornbillFlying;
import com.ikerleon.naturalfaunamod.entity.EntityRedBilledHornbill;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderRedBilledHornbill extends RenderLivingZAWA<EntityRedBilledHornbill> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hornbill/texture.png");

	public RenderRedBilledHornbill(RenderManager rm) {
		super(rm, new ModelRedBilledHornbill(), 0.4F);
		addLayer(new LayerRedBilledHornbill(this, this));
	}
	
    protected ResourceLocation getEntityTexture(EntityRedBilledHornbill entity)
    {
    	if(!entity.isChild() && !entity.onGround) {
			return BookwormRenderUtils.none;
		}
        else if(entity.isChild()) {
    		return texture;
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
	
    public class LayerRedBilledHornbill implements LayerRenderer<EntityRedBilledHornbill>{
		
		private final RenderRedBilledHornbill render;
		private final ModelRedBilledHornbillFlying modelF = new ModelRedBilledHornbillFlying();
		
		public LayerRedBilledHornbill(RenderRedBilledHornbill e, RenderRedBilledHornbill re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityRedBilledHornbill e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
			if(!e.isInvisible()) {
				if(!e.onGround && !e.isChild()) {
					this.render.bindTexture(this.render.getTextureOfVar(e.getAnimalType()));
			        this.modelF.setModelAttributes(this.render.getMainModel());
			        this.modelF.render(e, f, f1, f2, f3, f4, f6);
			        this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, e);
				}
			}
		}

		@Override
		public boolean shouldCombineTextures() {
			return true;
		}
		
	}

	public static class RenderFactory implements IRenderFactory<EntityRedBilledHornbill>{
		@Override
		public Render<? super EntityRedBilledHornbill> createRenderFor(RenderManager manager) {
			return new RenderRedBilledHornbill(manager);
		    }
	    }
}