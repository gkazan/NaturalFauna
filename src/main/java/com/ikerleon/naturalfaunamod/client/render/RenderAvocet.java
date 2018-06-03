package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import net.minecraft.client.renderer.GlStateManager;
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
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/avocet/child_texture.png");

	public RenderAvocet(RenderManager rm) {
		super(rm, new ModelAvocet(), 0.4F);
		this.addLayer(new LayerAvocet(this));
	}
	
	
	
    protected ResourceLocation getEntityTexture(EntityAvocet entity)
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
			default:
				return texture;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerAvocet
	  implements LayerRenderer<EntityAvocet>
	{
	  private final RenderAvocet render;
	  private final ModelAvocet modelchild = new ModelAvocet();
	  
	  public LayerAvocet(RenderAvocet re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityAvocet kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible())
	    {
	      if (kat.isChild()) {
	    	    GlStateManager.pushMatrix();
	    	    GlStateManager.scale(0.6F, 0.6F, 0.6F);
	    	    GlStateManager.translate(0.0F, 1F, 0.0F);
		        this.render.bindTexture(this.render.texturechild);
		        this.modelchild.setModelAttributes(this.render.getMainModel());
		        this.modelchild.render(kat, f, f1, f2, f3, f4, f6);
		        this.modelchild.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
		        GlStateManager.popMatrix();
		      }
	    }
	  }
	  
	  public boolean shouldCombineTextures()
	  {
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