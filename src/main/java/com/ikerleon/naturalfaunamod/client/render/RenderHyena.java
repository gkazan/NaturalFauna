package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelHyena;
import com.ikerleon.naturalfaunamod.client.model.ModelHyenaChild;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderHyena extends RenderLivingZAWA<EntityHyena> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hyena/texture.png");
	public static final ResourceLocation texture_2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hyena/texture2.png");
	public static final ResourceLocation texture_3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hyena/texture3.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hyena/texturechild.png");
	
	public RenderHyena(RenderManager rm) {
		super(rm, new ModelHyena(), 0.4F);
		addLayer(new LayerHyena(this, this));
	}

    protected ResourceLocation getEntityTexture(EntityHyena entity)
    {
    	if(entity.isChild()) {
    		return BookwormRenderUtils.none;
    	}
    	else { 
    		return getTextureOfVar(entity.getAnimalType());
    	}
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
				default: return texture;
			case 1:
				return texture_2;
			case 2:
				return texture_3;	
		}
	}
	
    public class LayerHyena implements LayerRenderer<EntityHyena>{
		
		private final RenderHyena render;
		private final ModelHyenaChild modelF = new ModelHyenaChild();
		
		public LayerHyena(RenderHyena e, RenderHyena re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityHyena e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
			if(!e.isInvisible()) {
				if(e.isChild()) {
					this.render.bindTexture(RenderHyena.texturechild);
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
	
    public static class RenderFactory implements IRenderFactory<EntityHyena>{
	@Override
	public Render<? super EntityHyena> createRenderFor(RenderManager manager) {
		return new RenderHyena(manager);
	    }
    }
}
