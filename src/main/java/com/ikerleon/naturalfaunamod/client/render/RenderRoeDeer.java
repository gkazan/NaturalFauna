package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.data.Gender;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelRoeDeer;
import com.ikerleon.naturalfaunamod.client.render.RenderBushbuck.LayerBushbuck;
import com.ikerleon.naturalfaunamod.entity.EntityRoeDeer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderRoeDeer extends RenderLivingZAWA<EntityRoeDeer> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texture2.png");
	public static final ResourceLocation texturefemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texturefemale.png");
	public static final ResourceLocation texturefemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/roedeer/texturefemale2.png");

	public RenderRoeDeer(RenderManager rm) {
		super(rm, new ModelRoeDeer(), 0.4F);
		addLayer(new LayerRoeDeer(this));
	}

    protected ResourceLocation getEntityTexture(EntityRoeDeer entity)
    {
    	if(entity.isChild() || entity.getGender()==Gender.FEMALE) {
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
			case 1:
				return texture2;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerRoeDeer
	  implements LayerRenderer<EntityRoeDeer>
	{
	  private final RenderRoeDeer render;
	  private final ModelRoeDeer modelfemale = new ModelRoeDeer();
	  private final ModelRoeDeer modelchild = new ModelRoeDeer();
	  
	  public LayerRoeDeer(RenderRoeDeer re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityRoeDeer kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible() && !kat.isChild())
	    {
	      if (kat.getGender()==Gender.FEMALE) {
	    	  switch (kat.getAnimalType()) {
	          case 0: default:  this.render.bindTexture(render.texturefemale); break;
	          case 1:  this.render.bindTexture(render.texturefemale2); break;
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
	    	    this.render.bindTexture(render.texturefemale);
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
	
    public static class RenderFactory implements IRenderFactory<EntityRoeDeer>{
	@Override
	public Render<? super EntityRoeDeer> createRenderFor(RenderManager manager) {
		return new RenderRoeDeer(manager);
	    }
    }
}