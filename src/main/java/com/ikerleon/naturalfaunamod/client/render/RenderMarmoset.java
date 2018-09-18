package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelMarmoset;
import com.ikerleon.naturalfaunamod.client.model.ModelMarmosetStanding;
import com.ikerleon.naturalfaunamod.entity.EntityMarmoset;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;

@SideOnly(Side.CLIENT)
public class RenderMarmoset extends RenderLivingZAWA<EntityMarmoset> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/marmoset/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/marmoset/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/marmoset/texture3.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/marmoset/texturechild.png");

	public RenderMarmoset(RenderManager rm) {
		super(rm, new ModelMarmoset(), 0.2F);
		this.addLayer(new LayerMarmoset(this));
	}
	
	protected void preRenderCallback(EntityMarmoset entitylivingbaseIn, float partialTickTime)
	  {
	    if (entitylivingbaseIn.isBesideClimbableBlock()) {
	      if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.EAST))
	      {
	        GlStateManager.rotate(90.0F, -1.0F, 0.0F, 0.0F);
	        GlStateManager.translate(0.0F, 0.0F, 0.0F);
	      } 
	      else if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.WEST))
	      {
	        GlStateManager.rotate(90.0F, -1.0F, 0.0F, 0.0F);
	        GlStateManager.translate(0.0F, 0.0F, -0.4F);
	      }
	      else if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.NORTH))
	      {
	        GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
	        GlStateManager.translate(0.0F, 0.0F, -0.4F);
	      }
	      else if (entitylivingbaseIn.getHorizontalFacing().equals(EnumFacing.SOUTH))
	      {
	        GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
	        GlStateManager.translate(0.0F, 0.0F, -0.4F);
	      }
	    }
	    super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	  }

    protected ResourceLocation getEntityTexture(EntityMarmoset entity)
    {
    	if(entity.isChild()) {
    		if(entity.getStatus()==EntityMarmoset.MarmosetState.STANDING) {
    			return BookwormRenderUtils.none;
    		}
    		else {
    			return texturechild;
    		}
    	}
    	else if(entity.getStatus()==EntityMarmoset.MarmosetState.STANDING) {
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
			default:
				return texture;
			case 1:
				return texture2;
			case 2:
				return texture3;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerMarmoset
	  implements LayerRenderer<EntityMarmoset>
	{
	  private final RenderMarmoset render;
	  private final ModelMarmosetStanding modelF = new ModelMarmosetStanding();
	  
	  public LayerMarmoset(RenderMarmoset re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityMarmoset kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible())
	    {
	      if (kat.getStatus() == EntityMarmoset.MarmosetState.STANDING && kat.isChild()==false) {
	        this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
	        this.modelF.setModelAttributes(this.render.getMainModel());
	        this.modelF.render(kat, f, f1, f2, f3, f4, f6);
	        this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
	      }
	      if (kat.getStatus() == EntityMarmoset.MarmosetState.STANDING && kat.isChild()==true) {
		        this.render.bindTexture(this.render.texturechild);
		        this.modelF.setModelAttributes(this.render.getMainModel());
		        this.modelF.render(kat, f, f1, f2, f3, f4, f6);
		        this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
		  }
	    }
	  }
	  
	  public boolean shouldCombineTextures()
	  {
	    return true;
	  }
	}
	
    public static class RenderFactory implements IRenderFactory<EntityMarmoset>{
	@Override
	public Render<? super EntityMarmoset> createRenderFor(RenderManager manager) {
		return new RenderMarmoset(manager);
	    }
    }
}
