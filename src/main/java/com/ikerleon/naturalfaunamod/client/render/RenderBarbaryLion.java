package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.data.Gender;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelBarbaryLion;
import com.ikerleon.naturalfaunamod.entity.EntityBarbaryLion;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBarbaryLion extends RenderLivingZAWA<EntityBarbaryLion> {
	
	public static final ResourceLocation texturemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/barbarylion/texturemale.png");
	public static final ResourceLocation texturemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/barbarylion/texturemale2.png");
	public static final ResourceLocation texturemale3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/barbarylion/texturemale3.png");
	public static final ResourceLocation texturefemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/barbarylion/texturefemale.png");
	public static final ResourceLocation texturefemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/barbarylion/texturefemale2.png");
	public static final ResourceLocation texturefemale3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/barbarylion/texturefemale3.png");
	public static final ResourceLocation texturefemale4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/barbarylion/texturefemale4.png");
	
	public RenderBarbaryLion(RenderManager rm) {
		super(rm, new ModelBarbaryLion(), 0.4F);
		addLayer(new LayerBarbaryLion(this));
	}

    protected ResourceLocation getEntityTexture(EntityBarbaryLion entity)
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
				default: return texturemale;
			case 1:
				return texturemale2;
			case 2:
				return texturemale3;
			case 3:
				return texturemale;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerBarbaryLion
	  implements LayerRenderer<EntityBarbaryLion>
	{
	  private final RenderBarbaryLion render;
	  private final ModelBarbaryLion modelfemale = new ModelBarbaryLion();
	  
	  public LayerBarbaryLion(RenderBarbaryLion re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityBarbaryLion kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible())
	    {
	      if (kat.getGender()==Gender.FEMALE) {
	    	  switch (kat.getAnimalType()) {
	          case 0: default:  this.render.bindTexture(render.texturefemale); break;
	          case 1:  this.render.bindTexture(render.texturefemale2); break;
	          case 2:  this.render.bindTexture(render.texturefemale3); break;
	          case 3:  this.render.bindTexture(render.texturefemale4);
	    	  }
		        this.modelfemale.setModelAttributes(this.render.getMainModel());
		        this.modelfemale.render(kat, f, f1, f2, f3, f4, f6);
		        this.modelfemale.setRotationAngles(f, f1, f3, f4, f5, f6, kat);     
		        }
	    }
	  }
	  @Override
      public boolean shouldCombineTextures() {
		  return false;
	}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityBarbaryLion>{
	@Override
	public Render<? super EntityBarbaryLion> createRenderFor(RenderManager manager) {
		return new RenderBarbaryLion(manager);
	    }
    }
}
