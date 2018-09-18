package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelAxolotl;
import com.ikerleon.naturalfaunamod.entity.EntityAxolotl;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAxolotl extends RenderLivingZAWA<EntityAxolotl> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/axolotl/texture.png");
	public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/axolotl/texture2.png");
	public static final ResourceLocation texture3 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/axolotl/texture3.png");

	public RenderAxolotl(RenderManager rm) {
		super(rm, new ModelAxolotl(), 0.1F);
	} 

    protected ResourceLocation getEntityTexture(EntityAxolotl entity)
    {
    	if(entity.isChild()) {
    		return getTextureOfVar(entity.getAnimalType());
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
	
    public static class RenderFactory implements IRenderFactory<EntityAxolotl>{
	@Override
	public Render<? super EntityAxolotl> createRenderFor(RenderManager manager) {
		return new RenderAxolotl(manager);
	    }
    }
}