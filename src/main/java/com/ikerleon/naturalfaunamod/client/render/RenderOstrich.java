package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelOstrich;
import com.ikerleon.naturalfaunamod.entity.EntityOstrich;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
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
	}

    protected ResourceLocation getEntityTexture(EntityOstrich entity)
    {
    	if(entity.isChild() || entity.getGender()==Gender.FEMALE) {
    		return texturefemale;
    	}
    	else if(entity.getGender()==Gender.FEMALE) {
    		return texturefemale;
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
	
    public static class RenderFactory implements IRenderFactory<EntityOstrich>{
	@Override
	public Render<? super EntityOstrich> createRenderFor(RenderManager manager) {
		return new RenderOstrich(manager);
	    }
    }
}
