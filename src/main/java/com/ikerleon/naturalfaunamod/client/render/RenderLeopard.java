package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelLeopard;
import com.ikerleon.naturalfaunamod.entity.EntityLeopard;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLeopard extends RenderLivingZAWA<EntityLeopard> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/leopard/texture.png");
	public static final ResourceLocation texture_2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/leopard/texture2.png");
	public static final ResourceLocation textureMelanic = new ResourceLocation(NFReference.MOD_ID, "textures/entity/leopard/texture3.png");
	public static final ResourceLocation texture_4 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/leopard/texture4.png");
	
	
	public RenderLeopard(RenderManager rm) {
		super(rm, new ModelLeopard(), 0.4F);
	}

    protected ResourceLocation getEntityTexture(EntityLeopard entity)
    {
    	if(entity.isChild()) {
    		return ZAWARenderUtils.none;
    	}
    	else if(entity.melanicTexture==2){
    		return textureMelanic;
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
				return texture_4;
		}
	}
	
    public static class RenderFactory implements IRenderFactory<EntityLeopard>{
	@Override
	public Render<? super EntityLeopard> createRenderFor(RenderManager manager) {
		return new RenderLeopard(manager);
	    }
    }
}

