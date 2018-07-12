package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelAvocet;
import com.ikerleon.naturalfaunamod.client.model.ModelAvocetFlying;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAvocet extends RenderLivingZAWA<EntityAvocet> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/avocet/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/avocet/texturechild.png");

	public RenderAvocet(RenderManager rm) {
		super(rm, new ModelAvocet(), 0.4F);
		addLayer(new LayerAvocet(this, this));
	}
	
    protected ResourceLocation getEntityTexture(EntityAvocet entity)
    {
    	if(!entity.isChild() && !entity.onGround) {
			return ZAWARenderUtils.none;
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
	
    public class LayerAvocet implements LayerRenderer<EntityAvocet>{
		
		private final RenderAvocet render;
		private final ModelAvocetFlying modelF = new ModelAvocetFlying();
		
		public LayerAvocet(RenderAvocet e, RenderAvocet re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityAvocet e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
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

	public static class RenderFactory implements IRenderFactory<EntityAvocet>{
		@Override
		public Render<? super EntityAvocet> createRenderFor(RenderManager manager) {
			return new RenderAvocet(manager);
		    }
	    }
}