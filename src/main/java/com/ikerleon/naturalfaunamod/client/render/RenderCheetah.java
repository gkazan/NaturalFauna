package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCheetah;
import com.ikerleon.naturalfaunamod.entity.EntityCheetah;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCheetah extends RenderLivingZAWA<EntityCheetah> {
	
	public static final ResourceLocation texturemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture.png");
	public static final ResourceLocation texturemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture2.png");
	public static final ResourceLocation texturespotless = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturespotless.png");
	public static final ResourceLocation texturemale4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture4.png");
	public static final ResourceLocation texturemale5 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texture5.png");
	public static final ResourceLocation texturefemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale.png");
	public static final ResourceLocation texturefemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale2.png");
	public static final ResourceLocation texturefemale3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale3.png");
	public static final ResourceLocation texturefemale4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturefemale3.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/texturechild.png");
	public static final ResourceLocation textureking = new ResourceLocation(NFReference.MOD_ID, "textures/entity/cheetah/textureking.png");
	
	public RenderCheetah(RenderManager rm) {
		super(rm, new ModelCheetah(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityCheetah entity)
    {
    	if(entity.isChild()) {
    		return texturechild;
    	}
    	else {
    		if(entity.getGender()==Gender.FEMALE){
    			switch (entity.getAnimalType()) {
    			case 0:
    				default: return texturefemale;
    			case 1:
    				return texturefemale2;
    			case 2:
    				return texturefemale;
    			case 3:
    				return texturefemale4;
    			case 4:
    				return texturefemale;
    			case 5:
    				return textureking;
    			case 6:
    				return texturespotless;
    		    }
        	}
    		else {
    		return getTextureOfVar(entity.getAnimalType());
    		}
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
				return texturemale;
			case 3:
				return texturemale4;
			case 4:
				return texturemale5;
			case 5:
				return textureking;
			case 6:
				return texturespotless;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityCheetah>{
	@Override
	public Render<? super EntityCheetah> createRenderFor(RenderManager manager) {
		return new RenderCheetah(manager);
	    }
    }
}