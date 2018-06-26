package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelGrantsGazelle;
import com.ikerleon.naturalfaunamod.entity.EntityGrantsGazelle;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGrantsGazelle extends RenderLivingZAWA<EntityGrantsGazelle> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gazelle/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gazelle/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gazelle/texture3.png");
	public static final ResourceLocation texture4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gazelle/texture4.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/gazelle/texturechild.png");
	
	public RenderGrantsGazelle(RenderManager rm) {
		super(rm, new ModelGrantsGazelle(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityGrantsGazelle entity)
    {
    	if(entity.isChild()) {
    		return texturechild;
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
				return texture2;
			case 2:
				return texture3;
			case 3:
				return texture4;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityGrantsGazelle>{
	@Override
	public Render<? super EntityGrantsGazelle> createRenderFor(RenderManager manager) {
		return new RenderGrantsGazelle(manager);
	    }
    }
}
