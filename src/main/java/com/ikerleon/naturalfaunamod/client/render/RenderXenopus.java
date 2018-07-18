package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelXenopus;
import com.ikerleon.naturalfaunamod.client.model.ModelXenopusChild;
import com.ikerleon.naturalfaunamod.entity.EntityXenopus;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderXenopus extends RenderLivingZAWA<EntityXenopus> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/xenopus/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/xenopus/texturechild.png");

	public RenderXenopus(RenderManager rm) {
		super(rm, new ModelXenopus(), 0.4F);
		addLayer(new LayerXenopus(this, this));
	}
	
	protected void preRenderCallback(EntityXenopus entitylivingbaseIn, float partialTickTime)
	{
	    GlStateManager.rotate (180,0,1,0);
	    super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

    protected ResourceLocation getEntityTexture(EntityXenopus entity)
    {
    	if(entity.isChild()) {
    		return ZAWARenderUtils.none;
    	}
    	else {
    		return getTextureOfVar(0);
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
	
   public class LayerXenopus implements LayerRenderer<EntityXenopus>{
		
		private final RenderXenopus render;
		private final ModelXenopusChild modelF = new ModelXenopusChild();
		
		public LayerXenopus(RenderXenopus e, RenderXenopus re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityXenopus e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
			if(!e.isInvisible()) {
				if(e.isChild()) {
					this.render.bindTexture(this.render.texturechild);
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
	
    public static class RenderFactory implements IRenderFactory<EntityXenopus>{
	@Override
	public Render<? super EntityXenopus> createRenderFor(RenderManager manager) {
		return new RenderXenopus(manager);
	    }
    }
}
