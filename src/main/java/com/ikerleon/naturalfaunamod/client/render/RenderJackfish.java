package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelJackFish;
import com.ikerleon.naturalfaunamod.entity.EntityJackfish;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderJackfish
  extends RenderLivingZAWA<EntityJackfish>
{
  public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/jackfish/texture.png");
  
  public RenderJackfish(RenderManager m)
  {
    super(m, new ModelJackFish(), 0.0F);
  }
  protected void preRenderCallback(EntityJackfish entitylivingbaseIn, float partialTickTime)
  {
    GlStateManager.scale(1.3D, 1.3D, 1.3D);
    GlStateManager.translate(0, 0.4D, 0);
    super.preRenderCallback(entitylivingbaseIn, partialTickTime);
  }
  
  protected ResourceLocation getEntityTexture(EntityJackfish entity)
  {
    return getTextureOfVar(0);
  }
  
  public ResourceLocation getTextureOfVar(int varient)
  {
	switch (varient) {
	  case 0:
	  default:
	     return texture;
	}
  }
  
  public static class RenderFactory implements IRenderFactory<EntityJackfish>{
	@Override
	public Render<? super EntityJackfish> createRenderFor(RenderManager manager) {
		return new RenderJackfish(manager);
	    }
  }

}
