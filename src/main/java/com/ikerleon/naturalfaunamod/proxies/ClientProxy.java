package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.client.render.RenderAvocet;
import com.ikerleon.naturalfaunamod.client.render.RenderCamel;
import com.ikerleon.naturalfaunamod.client.render.RenderCourser;
import com.ikerleon.naturalfaunamod.client.render.RenderGreySeal;
import com.ikerleon.naturalfaunamod.client.render.RenderPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityGreySeal;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	
	@Override
	public void registerRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityPuffin.class, new RenderPuffin.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityCourser.class, new RenderCourser.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityAvocet.class, new RenderAvocet.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityCamel.class, new RenderCamel.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGreySeal.class, new RenderGreySeal.RenderFactory());
	}
}
