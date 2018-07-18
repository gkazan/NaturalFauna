package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelPeregrineFalcon;
import com.ikerleon.naturalfaunamod.client.model.ModelPeregrineFalconFlying;
import com.ikerleon.naturalfaunamod.entity.EntityPeregrineFalcon;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderPeregrineFalcon extends RenderLivingZAWA<EntityPeregrineFalcon>{

	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/falcon/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/falcon/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/falcon/texture3.png");

	public RenderPeregrineFalcon(RenderManager rm) {
		super(rm, new ModelPeregrineFalcon(), 0.4F);
		addLayer(new LayerPeregrineFalcon(this, this));
	}
	
	protected ResourceLocation getEntityTexture(EntityPeregrineFalcon entity)
    {
		if(!entity.isChild() && entity.onGround==false && entity.isInWater()==false) {
			return ZAWARenderUtils.none;
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
			case 1:
				return texture2;
			case 2:
				return texture3;
		}
	}
	
	public class LayerPeregrineFalcon implements LayerRenderer<EntityPeregrineFalcon>{
		
		private final RenderPeregrineFalcon render;
		private final ModelPeregrineFalconFlying modelF = new ModelPeregrineFalconFlying();
		
		public LayerPeregrineFalcon(RenderPeregrineFalcon e, RenderPeregrineFalcon re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityPeregrineFalcon e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
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

	public static class RenderFactory implements IRenderFactory<EntityPeregrineFalcon>{
		@Override
		public Render<? super EntityPeregrineFalcon> createRenderFor(RenderManager manager) {
			return new RenderPeregrineFalcon(manager);
		}
	}
	
}
