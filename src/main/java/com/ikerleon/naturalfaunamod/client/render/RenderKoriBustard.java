package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelKoriBustard;
import com.ikerleon.naturalfaunamod.client.model.ModelKoriBustardFlying;
import com.ikerleon.naturalfaunamod.entity.EntityKoriBustard;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderKoriBustard extends RenderLivingZAWA<EntityKoriBustard> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/koribustard/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/koribustard/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/koribustard/texturechild.png");


	public RenderKoriBustard(RenderManager rm) {
		super(rm, new ModelKoriBustard(), 0.4F);
		addLayer(new LayerKoriBustard(this, this));
	}
	
	protected ResourceLocation getEntityTexture(EntityKoriBustard entity)
    {
		if(!entity.isChild() && !entity.onGround) {
			return BookwormRenderUtils.none;
		}
	    else {
	    	if(entity.isChild()) {
    		  return texturechild;
    	    }
    	    else {
    		  return getTextureOfVar(entity.getAnimalType());
    	    }
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
	
	public class LayerKoriBustard implements LayerRenderer<EntityKoriBustard>{
		
		private final RenderKoriBustard render;
		private final ModelKoriBustardFlying modelF = new ModelKoriBustardFlying();
		
		public LayerKoriBustard(RenderKoriBustard e, RenderKoriBustard re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityKoriBustard e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
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

	public static class RenderFactory implements IRenderFactory<EntityKoriBustard>{
		@Override
		public Render<? super EntityKoriBustard> createRenderFor(RenderManager manager) {
			return new RenderKoriBustard(manager);
		}
	}
}