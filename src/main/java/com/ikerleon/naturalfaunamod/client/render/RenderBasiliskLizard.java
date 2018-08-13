package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelBasiliskLizard;
import com.ikerleon.naturalfaunamod.entity.EntityBasiliskLizard;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBasiliskLizard extends RenderLivingZAWA<EntityBasiliskLizard> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/basilisklizard/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/basilisklizard/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/basilisklizard/texture3.png");

	public RenderBasiliskLizard(RenderManager rm) {
		super(rm, new ModelBasiliskLizard(), 0.2F);
	}

    protected ResourceLocation getEntityTexture(EntityBasiliskLizard entity)
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
			case 1:
				return texture2;	
			case 2:
				return texture3;	
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityBasiliskLizard>{
	@Override
	public Render<? super EntityBasiliskLizard> createRenderFor(RenderManager manager) {
		return new RenderBasiliskLizard(manager);
	    }
    }
}