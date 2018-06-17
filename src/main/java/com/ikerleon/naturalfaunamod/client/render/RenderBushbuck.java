package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.data.Gender;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelBushbuck;
import com.ikerleon.naturalfaunamod.entity.EntityBushbuck;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBushbuck extends RenderLivingZAWA<EntityBushbuck> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bushbuck/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bushbuck/texture2.png");
	public static final ResourceLocation texturefemale = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bushbuck/texturefemale.png");
	public static final ResourceLocation texturefemale2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bushbuck/texturefemale2.png");
	public static final ResourceLocation texturechild = new ResourceLocation(NFReference.MOD_ID, "textures/entity/bushbuck/texturechild.png");
	
	public RenderBushbuck(RenderManager rm) {
		super(rm, new ModelBushbuck(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityBushbuck entity)
    {
    	if(entity.isChild()) {
    		return texturechild;
    	}
        else if(entity.getGender()==Gender.FEMALE) {
    		switch (entity.getAnimalType()) {
			case 0:
				default: return texturefemale;
			case 1:
				return texturefemale2;
    	    }
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
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityBushbuck>{
	@Override
	public Render<? super EntityBushbuck> createRenderFor(RenderManager manager) {
		return new RenderBushbuck(manager);
	    }
    }
    
}
