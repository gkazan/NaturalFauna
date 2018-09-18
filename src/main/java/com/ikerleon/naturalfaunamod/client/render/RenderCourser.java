package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCourser;
import com.ikerleon.naturalfaunamod.client.model.ModelCourserFlying;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderCourser extends RenderLivingZAWA<EntityCourser> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/courser/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/courser/texturechild.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/courser/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/courser/texture3.png");
	
	public RenderCourser(RenderManager rm) {
		super(rm, new ModelCourser(), 0.4F);
		addLayer(new LayerCourser(this, this));
	}	
	
    protected ResourceLocation getEntityTexture(EntityCourser entity)
    { 	
    	if(!entity.isChild() && !entity.onGround) {
			return BookwormRenderUtils.none;
		}
    	else if(entity.isChild()) {
    		return texturechild;
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
	
	 public class LayerCourser implements LayerRenderer<EntityCourser>{
			
			private final RenderCourser render;
			private final ModelCourserFlying modelF = new ModelCourserFlying();
			
			public LayerCourser(RenderCourser e, RenderCourser re)
			{
			    this.render = re;
			}

			@Override
			public void doRenderLayer(EntityCourser e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
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

    public static class RenderFactory implements IRenderFactory<EntityCourser>{
	@Override
	public Render<? super EntityCourser> createRenderFor(RenderManager manager) {
		return new RenderCourser(manager);
	    }
    }
}