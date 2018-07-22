package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelPtargimanChild;
import com.ikerleon.naturalfaunamod.client.model.ModelPtarmigan;
import com.ikerleon.naturalfaunamod.client.model.ModelPtarmiganFlying;
import com.ikerleon.naturalfaunamod.entity.EntityWillowPtarmigan;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWillowPtarmigan extends RenderLivingZAWA<EntityWillowPtarmigan> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ptarmigan/texture.png");
	public static final ResourceLocation textureWinter = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ptarmigan/texturewinter.png");
	public static final ResourceLocation textureFemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ptarmigan/texturefemale.png"); 
	public static final ResourceLocation textureFemaleWinter = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ptarmigan/texturefemalewinter.png"); 
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ptarmigan/texturechild.png"); 
	
	public RenderWillowPtarmigan(RenderManager rm) {
		super(rm, new ModelPtarmigan(), 0.4F);
		this.addLayer(new LayerWillowPtarmigan(this));
	}
	
	protected ResourceLocation getEntityTexture(EntityWillowPtarmigan entity)
    {
    	if((entity.getGender()== Gender.FEMALE) || (!entity.isChild() && entity.onGround==false && entity.isInWater()==false) || entity.isChild()){
    		return ZAWARenderUtils.none;
    	}
    	else if(entity.biome == Biomes.TAIGA) {
    		return texture;
    	}
    	else if(entity.biome == Biomes.TAIGA_HILLS) {
    		return texture;
    	}
    	else if(entity.biome == Biomes.REDWOOD_TAIGA) {
    		return texture;
    	}
    	else if(entity.biome == Biomes.REDWOOD_TAIGA_HILLS) {
    		return texture;
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
				return textureWinter;
		}
	}
	
	public ResourceLocation getTextureOfVarFe(int varient) {
		switch (varient) {
			case 0:
			default:
				return textureFemaleWinter;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerWillowPtarmigan
	  implements LayerRenderer<EntityWillowPtarmigan>
	{
	  private final RenderWillowPtarmigan render;
	  private final ModelPtarmigan modelfemale = new ModelPtarmigan();
	  private final ModelPtarmiganFlying modelflying = new ModelPtarmiganFlying();
	  private final ModelPtargimanChild modelchild = new ModelPtargimanChild();
	  
	  public LayerWillowPtarmigan(RenderWillowPtarmigan re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityWillowPtarmigan kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible() && kat.isChild()==false)
	    {
	      if (kat.getGender()==Gender.FEMALE) {
	    	    GlStateManager.pushMatrix();
	    	    GlStateManager.scale(0.9F, 0.9F, 0.9F);
	    	    GlStateManager.translate(0.0F, 0.14F, 0.0F);
	    	    if(kat.onGround==false && kat.isInWater()==false) {
	    	    	this.render.bindTexture(ZAWARenderUtils.none);
	    	    }
	    	    else {
	    	    	if(kat.biome == Biomes.TAIGA) {
	    	    		this.render.bindTexture(this.render.textureFemale);
	    	    	}
	    	    	else if(kat.biome == Biomes.TAIGA_HILLS) {
	    	    		this.render.bindTexture(this.render.textureFemale);
	    	    	}
	    	    	else if(kat.biome == Biomes.REDWOOD_TAIGA) {
	    	    		this.render.bindTexture(this.render.textureFemale);
	    	    	}
	    	    	else if(kat.biome == Biomes.REDWOOD_TAIGA_HILLS) {
	    	    		this.render.bindTexture(this.render.textureFemale);
	    	    	}
	    	    	else {
		                this.render.bindTexture(this.render.getTextureOfVarFe(kat.getAnimalType()));
	    	    	}
	    	    } 
		        this.modelfemale.setModelAttributes(this.render.getMainModel());
		        this.modelfemale.render(kat, f, f1, f2, f3, f4, f6);
		        this.modelfemale.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
		        GlStateManager.popMatrix();
		      }
	      if(kat.onGround==false && kat.isInWater()==false) {
	    	  if(kat.getGender()==Gender.MALE) {
	    		    if(kat.biome == Biomes.TAIGA) {
	    			  this.render.bindTexture(this.render.texture);
	    	    	}
	    	    	else if(kat.biome == Biomes.TAIGA_HILLS) {
	    	    		this.render.bindTexture(this.render.texture);
	    	    	}
	    	    	else if(kat.biome == Biomes.REDWOOD_TAIGA) {
	    	    		this.render.bindTexture(this.render.texture);
	    	    	}
	    	    	else if(kat.biome == Biomes.REDWOOD_TAIGA_HILLS) {
	    	    		this.render.bindTexture(this.render.texture);
	    	    	}
	    	    	else {
	    	    		this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
	    	    	}
	  	        this.modelflying.setModelAttributes(this.render.getMainModel());
	  	        this.modelflying.render(kat, f, f1, f2, f3, f4, f6);
	  	        this.modelflying.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
	    	  }
	    	  else {
	    		GlStateManager.pushMatrix();
		    	GlStateManager.scale(0.9F, 0.9F, 0.9F);
		    	GlStateManager.translate(0.0F, 0.14F, 0.0F);
		    	if(kat.biome == Biomes.TAIGA) {
    	    		this.render.bindTexture(this.render.textureFemale);
    	    	}
    	    	else if(kat.biome == Biomes.TAIGA_HILLS) {
    	    		this.render.bindTexture(this.render.textureFemale);
    	    	}
    	    	else if(kat.biome == Biomes.REDWOOD_TAIGA) {
    	    		this.render.bindTexture(this.render.textureFemale);
    	    	}
    	    	else if(kat.biome == Biomes.REDWOOD_TAIGA_HILLS) {
    	    		this.render.bindTexture(this.render.textureFemale);
    	    	}
    	    	else {
	                this.render.bindTexture(this.render.getTextureOfVarFe(kat.getAnimalType()));
    	    	}
	    		this.modelflying.setModelAttributes(this.render.getMainModel());
			    this.modelflying.render(kat, f, f1, f2, f3, f4, f6);
			    this.modelflying.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
			    GlStateManager.popMatrix(); 
	    	  }
	      }
	    }
	    else if (!kat.isInvisible() && kat.isChild()==true) {
	    	GlStateManager.pushMatrix();
    	    GlStateManager.scale(0.5F, 0.5F, 0.5F);
    	    GlStateManager.translate(0.0F, 1.44F, 0.0F);
	        this.render.bindTexture(this.render.texturechild);
	        this.modelchild.setModelAttributes(this.render.getMainModel());
	        this.modelchild.render(kat, f, f1, f2, f3, f4, f6);
	        this.modelchild.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
	        GlStateManager.popMatrix();
	    }
	  }
	  
	  public boolean shouldCombineTextures()
	  {
	    return true;
	  }
	}
  
	
	public static class RenderFactory implements IRenderFactory<EntityWillowPtarmigan>{
		@Override
		public Render<? super EntityWillowPtarmigan> createRenderFor(RenderManager manager) {
			return new RenderWillowPtarmigan(manager);
		    }
	    }
}
