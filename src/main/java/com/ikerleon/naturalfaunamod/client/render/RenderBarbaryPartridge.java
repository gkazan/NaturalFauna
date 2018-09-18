package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelBarbaryPartridge;
import com.ikerleon.naturalfaunamod.client.model.ModelBarbaryPartridgeFlying;
import com.ikerleon.naturalfaunamod.entity.EntityBarbaryPartridge;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderBarbaryPartridge extends RenderLivingZAWA<EntityBarbaryPartridge> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/partridge/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/partridge/texturechild.png");

	public RenderBarbaryPartridge(RenderManager rm) {
		super(rm, new ModelBarbaryPartridge(), 0.3F);
		addLayer(new LayerBarbaryPartridge(this, this));
	} 
	
    protected ResourceLocation getEntityTexture(EntityBarbaryPartridge entity)
    {
    	if(!entity.onGround) {
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
		}
	}
	
    public class LayerBarbaryPartridge implements LayerRenderer<EntityBarbaryPartridge>{
		
		private final RenderBarbaryPartridge render;
		private final ModelBarbaryPartridgeFlying modelF = new ModelBarbaryPartridgeFlying();
		
		public LayerBarbaryPartridge(RenderBarbaryPartridge e, RenderBarbaryPartridge re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityBarbaryPartridge e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
			if(!e.isInvisible()) {
				if(!e.onGround && !e.isChild()) {
					this.render.bindTexture(this.render.getTextureOfVar(e.getAnimalType()));
			        this.modelF.setModelAttributes(this.render.getMainModel());
			        this.modelF.render(e, f, f1, f2, f3, f4, f6);
			        this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, e);
				}
				if(!e.onGround && e.isChild()) {
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

	public static class RenderFactory implements IRenderFactory<EntityBarbaryPartridge>{
		@Override
		public Render<? super EntityBarbaryPartridge> createRenderFor(RenderManager manager) {
			return new RenderBarbaryPartridge(manager);
		    }
	    }
}
