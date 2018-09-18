package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelPuffin;
import com.ikerleon.naturalfaunamod.client.model.ModelPuffinFlying;
import com.ikerleon.naturalfaunamod.client.model.ModelPuffinWater;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderPuffin extends RenderLivingZAWA<EntityPuffin> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/puffin/texture.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/puffin/child_texture.png");

	public RenderPuffin(RenderManager rm) {
		super(rm, new ModelPuffin(), 0.4F);
		this.addLayer(new LayerPuffin(this));
	}
	
    protected ResourceLocation getEntityTexture(EntityPuffin entity)
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
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerPuffin implements LayerRenderer<EntityPuffin> {
	    private final RenderPuffin render;
	    private final ModelPuffinWater modelW = new ModelPuffinWater();
	    private final ModelPuffinFlying modelF = new ModelPuffinFlying();

	    public LayerPuffin(RenderPuffin re)
	    {
	        this.render = re;
	    }
	 
	    public void doRenderLayer(EntityPuffin kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	    {	    	
	        if (!kat.isInvisible())
	        {
	        	if(kat.isInWater() && kat.isChild()==false) {
	        		this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
		            this.modelW.setModelAttributes(this.render.getMainModel());
		            this.modelW.setRotationAngles(f,f1,f3,f4,f5,f6, kat);
		            this.modelW.render(kat, f, f1, f2, f3, f4, f6);
	        	}
	        	if(!kat.onGround && !kat.isChild()) {
	        		if(kat.isInWater()) {
	        			this.render.bindTexture(BookwormRenderUtils.none);
	        		}
	        		else {
	        			this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
	        		}					
			        this.modelF.setModelAttributes(this.render.getMainModel());
			        this.modelF.render(kat, f, f1, f2, f3, f4, f6);
			        this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
				}
	        }
	    }

		@Override
		public boolean shouldCombineTextures() {
			return false;
		}
	}
	
	public static class RenderFactory implements IRenderFactory<EntityPuffin>{
		@Override
		public Render<? super EntityPuffin> createRenderFor(RenderManager manager) {
			return new RenderPuffin(manager);
		}
	}
}
