package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelHyena;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;


import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHyena extends RenderLivingZAWA<EntityHyena> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hyena/texture.png");
	public static final ResourceLocation texture_2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hyena/texture_2.png");
	public static final ResourceLocation texture_3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/hyena/texture_3.png");

	public RenderHyena(RenderManager rm) {
		super(rm, new ModelHyena(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityHyena entity)
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
				default: return texture;
			case 1:
				return texture_2;
			case 2:
				return texture_3;
			
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityHyena>{
	@Override
	public Render<? super EntityHyena> createRenderFor(RenderManager manager) {
		return new RenderHyena(manager);
	    }
    }
}
