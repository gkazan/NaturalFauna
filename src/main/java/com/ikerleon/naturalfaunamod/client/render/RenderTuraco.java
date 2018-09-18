package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelTuraco;
import com.ikerleon.naturalfaunamod.client.model.ModelTuracoFlying;
import com.ikerleon.naturalfaunamod.entity.EntityTuraco;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderTuraco extends RenderLivingZAWA<EntityTuraco> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/Turaco/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/Turaco/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/Turaco/texture3.png");
	public static final ResourceLocation textureFlying = new ResourceLocation(NFReference.MOD_ID, "textures/entity/Turaco/texture_flying.png");
	public static final ResourceLocation texture2Flying = new ResourceLocation(NFReference.MOD_ID, "textures/entity/Turaco/texture2_flying.png");
	public static final ResourceLocation texture3Flying = new ResourceLocation(NFReference.MOD_ID, "textures/entity/Turaco/texture3_flying.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/Turaco/texturechild.png");

	public RenderTuraco(RenderManager rm) {
		super(rm, new ModelTuraco(), 0.4F);
		addLayer(new LayerTuraco(this, this));
	}
	
    protected ResourceLocation getEntityTexture(EntityTuraco entity)
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
	
    public class LayerTuraco implements LayerRenderer<EntityTuraco>{
		
		private final RenderTuraco render;
		private final ModelTuracoFlying modelF = new ModelTuracoFlying();
		
		public LayerTuraco(RenderTuraco e, RenderTuraco re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityTuraco e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
			if(!e.isInvisible()) {
				if(!e.onGround && !e.isChild()) {
					switch (e.getAnimalType()) {
					case 0:
					default:
						this.render.bindTexture(RenderTuraco.textureFlying);
						break;
					case 1:
						this.render.bindTexture(RenderTuraco.texture2Flying);
						break;
					case 2:
						this.render.bindTexture(RenderTuraco.texture3Flying);
				}
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

	public static class RenderFactory implements IRenderFactory<EntityTuraco>{
		@Override
		public Render<? super EntityTuraco> createRenderFor(RenderManager manager) {
			return new RenderTuraco(manager);
		    }
	    }
}