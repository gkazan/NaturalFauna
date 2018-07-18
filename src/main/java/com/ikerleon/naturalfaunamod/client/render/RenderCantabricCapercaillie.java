package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.client.model.ModelCantabricCapercaillieCelo;
import com.ikerleon.naturalfaunamod.client.model.ModelCantabricCapercaillieFlying;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCantabricCapercaillie extends RenderLivingZAWA<EntityCantabricCapercaillie> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/capercaillie/texture.png");
	public static final ResourceLocation textureFemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/capercaillie/texturefemale.png"); 
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/capercaillie/texturechild.png"); 
	
	public RenderCantabricCapercaillie(RenderManager rm) {
		super(rm, new ModelCantabricCapercaillie(), 0.4F);
		this.addLayer(new LayerCantabricCapercaillie(this));
	}
	
	protected ResourceLocation getEntityTexture(EntityCantabricCapercaillie entity)
    {
    	if((entity.getStatus() != EntityCantabricCapercaillie.CantabricCapercaillieState.NORMAL) || (entity.getGender()==Gender.FEMALE && entity.isChild()==false) || (!entity.isChild() && entity.onGround==false && entity.isInWater()==false)) {
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
	
	@SideOnly(Side.CLIENT)
	public class LayerCantabricCapercaillie
	  implements LayerRenderer<EntityCantabricCapercaillie>
	{
	  private final RenderCantabricCapercaillie render;
	  private final ModelCantabricCapercaillieCelo modelF = new ModelCantabricCapercaillieCelo();
	  private final ModelCantabricCapercaillie modelfemale = new ModelCantabricCapercaillie();
	  private final ModelCantabricCapercaillieFlying modelflying = new ModelCantabricCapercaillieFlying();
	  
	  public LayerCantabricCapercaillie(RenderCantabricCapercaillie re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityCantabricCapercaillie kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible() && kat.isChild()==false)
	    {
	      if (kat.getStatus() == EntityCantabricCapercaillie.CantabricCapercaillieState.CELO) {
	        this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
	        this.modelF.setModelAttributes(this.render.getMainModel());
	        this.modelF.render(kat, f, f1, f2, f3, f4, f6);
	        this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
	      }
	      if (kat.getGender()==Gender.FEMALE) {
	    	    GlStateManager.pushMatrix();
	    	    GlStateManager.scale(0.8F, 0.8F, 0.8F);
	    	    GlStateManager.translate(0.0F, 0.34F, 0.0F);
	    	    if(kat.onGround==false && kat.isInWater()==false) {
	    	    	this.render.bindTexture(ZAWARenderUtils.none);
	    	    }
	    	    else {
		            this.render.bindTexture(RenderCantabricCapercaillie.textureFemale);
	    	    } 
		        this.modelfemale.setModelAttributes(this.render.getMainModel());
		        this.modelfemale.render(kat, f, f1, f2, f3, f4, f6);
		        this.modelfemale.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
		        GlStateManager.popMatrix();
		      }
	      if(kat.onGround==false && kat.isInWater()==false) {
	    	  if(kat.getGender()==Gender.MALE) {
	    		this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
	  	        this.modelflying.setModelAttributes(this.render.getMainModel());
	  	        this.modelflying.render(kat, f, f1, f2, f3, f4, f6);
	  	        this.modelflying.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
	    	  }
	    	  else {
	    		GlStateManager.pushMatrix();
		    	GlStateManager.scale(0.8F, 0.8F, 0.8F);
		    	GlStateManager.translate(0.0F, 0.34F, 0.0F);
		    	this.render.bindTexture(RenderCantabricCapercaillie.textureFemale);
	    		this.modelflying.setModelAttributes(this.render.getMainModel());
			    this.modelflying.render(kat, f, f1, f2, f3, f4, f6);
			    this.modelflying.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
			    GlStateManager.popMatrix(); 
	    	  }
	      }
	    }
	  }
	  
	  public boolean shouldCombineTextures()
	  {
	    return true;
	  }
	}
  
	
	public static class RenderFactory implements IRenderFactory<EntityCantabricCapercaillie>{
		@Override
		public Render<? super EntityCantabricCapercaillie> createRenderFor(RenderManager manager) {
			return new RenderCantabricCapercaillie(manager);
		    }
	    }
}
