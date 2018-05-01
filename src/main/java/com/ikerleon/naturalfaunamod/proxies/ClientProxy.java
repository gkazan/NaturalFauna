package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.client.render.RenderPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	
	@Override
	public void registerRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityPuffin.class, new RenderPuffin.RenderFactory());
	}
}
