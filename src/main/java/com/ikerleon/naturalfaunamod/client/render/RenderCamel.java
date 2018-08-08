package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCamel extends RenderLivingZAWA<EntityCamel> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/camel/texture.png");

	public RenderCamel(RenderManager rm) {
		super(rm, new ModelCamel(), 0.4F);
	}
	
	@Override
	protected void preRenderCallback(EntityCamel arg0, float arg1) {
		if(arg0.isChild()) {
			GlStateManager.translate (-0.2,0,-0.5);
		}
		else {
	        GlStateManager.translate (-0.5,0,-0.7);
		}
		super.preRenderCallback(arg0, arg1);
	}

    protected ResourceLocation getEntityTexture(EntityCamel entity)
    {
    	if(entity.isChild()) {
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
				return texture;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityCamel>{
	@Override
	public Render<? super EntityCamel> createRenderFor(RenderManager manager) {
		return new RenderCamel(manager);
	    }
    }
}