package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelBlueGnu;
import com.ikerleon.naturalfaunamod.client.model.ModelBlueGnuChild;
import com.ikerleon.naturalfaunamod.entity.EntityBlueGnu;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBlueGnu extends RenderLivingZAWA<EntityBlueGnu> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture3.png");
	public static final ResourceLocation texturegolden = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture4.png");
	public static final ResourceLocation texturealbino = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texture5.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gnu/texturechild.png");
	
	public RenderBlueGnu(RenderManager rm) {
		super(rm, new ModelBlueGnu(), 0.4F);
		addLayer(new LayerBlueGnu(this, this));
	}

    protected ResourceLocation getEntityTexture(EntityBlueGnu entity)
    {
    	if(entity.isChild()) {
    		return ZAWARenderUtils.none;
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
				return texture2;
			case 2:
				return texture3;
		}
	}
    
    public class LayerBlueGnu implements LayerRenderer<EntityBlueGnu>{
		
		private final RenderBlueGnu render;
		private final ModelBlueGnuChild modelF = new ModelBlueGnuChild();
		
		public LayerBlueGnu(RenderBlueGnu e, RenderBlueGnu re)
		{
		    this.render = re;
		}

		@Override
		public void doRenderLayer(EntityBlueGnu e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
			if(!e.isInvisible()) {
				if(e.isChild()) {
					this.render.bindTexture(RenderBlueGnu.texturechild);
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
	
    public static class RenderFactory implements IRenderFactory<EntityBlueGnu>{
	@Override
	public Render<? super EntityBlueGnu> createRenderFor(RenderManager manager) {
		return new RenderBlueGnu(manager);
	    }
    }
}
