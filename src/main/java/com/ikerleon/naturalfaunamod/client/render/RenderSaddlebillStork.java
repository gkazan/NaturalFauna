package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelSaddlebillStork;
import com.ikerleon.naturalfaunamod.client.model.ModelSaddlebillStorkFly;
import com.ikerleon.naturalfaunamod.client.model.ModelSaddlebillStorkSit;
import com.ikerleon.naturalfaunamod.entity.EntitySaddlebillStork;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSaddlebillStork extends RenderLivingZAWA<EntitySaddlebillStork> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/saddlebill/texture.png");
	
	public RenderSaddlebillStork(RenderManager rm) {
		super(rm, new ModelSaddlebillStork(), 0.4F);
		this.addLayer(new LayerSaddlebillStork(this));
	}
	
	protected ResourceLocation getEntityTexture(EntitySaddlebillStork entity)
    {
            return getTextureOfVar(entity.getAnimalType());
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
	public class LayerSaddlebillStork
	  implements LayerRenderer<EntitySaddlebillStork>
	{
	  private final RenderSaddlebillStork render;
	  private final ModelSaddlebillStorkSit modelF = new ModelSaddlebillStorkSit();
	  private final ModelSaddlebillStorkFly modelflying = new ModelSaddlebillStorkFly();
	  
	  public LayerSaddlebillStork(RenderSaddlebillStork re)
	  {
	    this.render = re;
	  }
	  
	  public void doRenderLayer(EntitySaddlebillStork kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	  {
	    if (!kat.isInvisible() && kat.isChild()==false)
	    {
	      if (kat.getStatus() == EntitySaddlebillStork.SaddlebillStorkState.SIT) {
	        this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
	        this.modelF.setModelAttributes(this.render.getMainModel());
	        this.modelF.render(kat, f, f1, f2, f3, f4, f6);
	        this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
	      }
	      if(kat.onGround==false && kat.isInWater()==false) {
	        this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
	  	    this.modelflying.setModelAttributes(this.render.getMainModel());
	  	    this.modelflying.render(kat, f, f1, f2, f3, f4, f6);
	  	    this.modelflying.setRotationAngles(f, f1, f3, f4, f5, f6, kat);
	      }
	    }
	  }
	  
	  public boolean shouldCombineTextures()
	  {
	    return true;
	  }
	}
  
	
	public static class RenderFactory implements IRenderFactory<EntitySaddlebillStork>{
		@Override
		public Render<? super EntitySaddlebillStork> createRenderFor(RenderManager manager) {
			return new RenderSaddlebillStork(manager);
		    }
	    }
}