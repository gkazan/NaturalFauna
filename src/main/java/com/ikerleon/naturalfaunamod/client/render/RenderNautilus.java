package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelNautilus;
import com.ikerleon.naturalfaunamod.entity.EntityNautilus;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderNautilus extends RenderLivingZAWA<EntityNautilus> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/nautilus/texture.png");

	public RenderNautilus(RenderManager rm) {
		super(rm, new ModelNautilus(), 0.4F);
	}
	
	protected void preRenderCallback(EntityNautilus entitylivingbaseIn, float partialTickTime)
	{
		if(!entitylivingbaseIn.isInWater() && !entitylivingbaseIn.isInLava())
	    GlStateManager.rotate (90,0,0,1);
		GlStateManager.translate (-0.1,0.3,0.4);
	    super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	}

    protected ResourceLocation getEntityTexture(EntityNautilus entity)
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
	
    public static class RenderFactory implements IRenderFactory<EntityNautilus>{
	@Override
	public Render<? super EntityNautilus> createRenderFor(RenderManager manager) {
		return new RenderNautilus(manager);
	    }
    }
}
