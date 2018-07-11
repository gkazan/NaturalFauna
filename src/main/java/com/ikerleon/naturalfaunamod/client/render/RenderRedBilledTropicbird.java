package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelRedBilledTropicbird;
import com.ikerleon.naturalfaunamod.client.model.ModelRedBilledTropicbirdFlying;
import com.ikerleon.naturalfaunamod.entity.EntityRedBilledTropicbird;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderRedBilledTropicbird extends RenderLivingZAWA<EntityRedBilledTropicbird>{

	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/tropicbird/texture.png");

	public RenderRedBilledTropicbird(RenderManager rm) {
		super(rm, new ModelRedBilledTropicbird(), 0.4F);
		addLayer(new LayerRedBilledTropicbird(this, this));
	}
	
	protected ResourceLocation getEntityTexture(EntityRedBilledTropicbird entity)
    {
		if(!entity.isChild() && entity.onGround==false && entity.isInWater()==false) {
			return ZAWARenderUtils.none;
		}
	    else {
//	    	if(entity.isChild()) {
//    		  return texturechild;
//    	    }
//    	    else {
    		  return getTextureOfVar(entity.getAnimalType());
//    	    }
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
	
	public class LayerRedBilledTropicbird implements LayerRenderer<EntityRedBilledTropicbird>{
		
		private final RenderRedBilledTropicbird render;
		private final ModelRedBilledTropicbirdFlying modelF = new ModelRedBilledTropicbirdFlying();
		
		public LayerRedBilledTropicbird(RenderRedBilledTropicbird e, RenderRedBilledTropicbird re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityRedBilledTropicbird e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
			if(!e.isInvisible()) {
				if(e.onGround==false && !e.isChild() && e.isInWater()==false) {
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

	public static class RenderFactory implements IRenderFactory<EntityRedBilledTropicbird>{
		@Override
		public Render<? super EntityRedBilledTropicbird> createRenderFor(RenderManager manager) {
			return new RenderRedBilledTropicbird(manager);
		}
	}
	
}
