package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelOstrich;
import com.ikerleon.naturalfaunamod.entity.EntityOstrich;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderOstrich extends RenderLivingZAWA<EntityOstrich> {
	
	public static final ResourceLocation texturemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ostrich/texturemale.png");
	public static final ResourceLocation texturefemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/ostrich/texturefemale.png");
	
	public RenderOstrich(RenderManager rm) {
		super(rm, new ModelOstrich(), 0.4F);
		addLayer(new LayerOstrich(this));
	}

    protected ResourceLocation getEntityTexture(EntityOstrich entity)
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
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerOstrich
	  implements LayerRenderer<EntityOstrich>
	{
	  private final RenderOstrich render;
	  private final ModelOstrich modelfemale = new ModelOstrich();
	  
	  public LayerOstrich(RenderOstrich re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntityOstrich kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible())
	    {
	      if (kat.getGender()==Gender.FEMALE) {
                this.render.bindTexture(render.texturefemale);
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
	
    public static class RenderFactory implements IRenderFactory<EntityOstrich>{
	@Override
	public Render<? super EntityOstrich> createRenderFor(RenderManager manager) {
		return new RenderOstrich(manager);
	    }
    }
}
