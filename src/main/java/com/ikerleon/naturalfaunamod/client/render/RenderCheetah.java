package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.data.Gender;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCheetah;
import com.ikerleon.naturalfaunamod.entity.EntityCheetah;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCheetah extends RenderLivingZAWA<EntityCheetah> {
	
	public static final ResourceLocation texturemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture.png");
	public static final ResourceLocation texturemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture2.png");
	public static final ResourceLocation texturespotless = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturespotless.png");
	public static final ResourceLocation texturemale4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture4.png");
	public static final ResourceLocation texturemale5 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture5.png");
	public static final ResourceLocation texturefemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale.png");
	public static final ResourceLocation texturefemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale2.png");
	public static final ResourceLocation texturefemale3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale3.png");
	public static final ResourceLocation texturefemale4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale3.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturechild.png");
	public static final ResourceLocation textureking = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/textureking.png");
	
	public RenderCheetah(RenderManager rm) {
		super(rm, new ModelCheetah(), 0.4F);
		addLayer(new LayerCheetah(this));
	}

    protected ResourceLocation getEntityTexture(EntityCheetah entity)
    {
    	if(entity.isChild() || entity.getGender()==Gender.FEMALE) {
    		return ZAWARenderUtils.none;
    	}
    	else {
    		if(entity.kingTexture==2) {
    			return textureking;
    		}
    		else if(entity.spotlessTexture==2) {
    			return texturespotless;
    		}
    		else {
    		return getTextureOfVar(entity.getAnimalType());
    		}
    	}
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
				default: return texturemale;
			case 1:
				return texturemale2;
			case 2:
				return texturemale;
			case 3:
				return texturemale4;
			case 4:
				return texturemale5;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerCheetah
	  implements LayerRenderer<EntityCheetah>
	{
	  private final RenderCheetah render;
	  private final ModelCheetah modelfemale = new ModelCheetah();
	  private final ModelCheetah modelchild = new ModelCheetah();
	  
	  public LayerCheetah(RenderCheetah re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityCheetah kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
		  if (!kat.isInvisible() && !kat.isChild() && kat.spotlessTexture != 2 && kat.kingTexture != 2)
		    {
		      if (kat.getGender()==Gender.FEMALE) {
		    	  switch (kat.getAnimalType()) {
		          case 0: default:  this.render.bindTexture(render.texturefemale); break;
		          case 1:  this.render.bindTexture(render.texturefemale2); break;
		          case 2:  this.render.bindTexture(render.texturefemale3); break;
		          case 3:  this.render.bindTexture(render.texturefemale4); break;
		          case 4:  this.render.bindTexture(render.texturefemale); break;
		    	  }
			        this.modelfemale.setModelAttributes(this.render.getMainModel());
			        this.modelfemale.render(kat, f, f1, f2, f3, f4, f6);
			        this.modelfemale.setRotationAngles(f, f1, f3, f4, f5, f6, kat);     
			        }
		    }
		    if (!kat.isInvisible() && kat.isChild()) {
		      if(kat.isChild()) {
	      		    GlStateManager.pushMatrix();
		    	    GlStateManager.scale(0.6F, 0.6F, 0.6F);
		    	    GlStateManager.translate(0.0F, 1F, 0.0F);
		    	    this.render.bindTexture(render.texturechild);
			        this.modelchild.setModelAttributes(this.render.getMainModel());
			        this.modelchild.render(kat, f, f1, f2, f3, f4, f6);
			        this.modelchild.setRotationAngles(f, f1, f3, f4, f5, f6, kat); 
			        GlStateManager.popMatrix();
		      }
		    }
	  }
	  @Override
      public boolean shouldCombineTextures() {
		  return false;
	}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityCheetah>{
	@Override
	public Render<? super EntityCheetah> createRenderFor(RenderManager manager) {
		return new RenderCheetah(manager);
	    }
    }
}