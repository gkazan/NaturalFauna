package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.client.render.RenderAvocet;
import com.ikerleon.naturalfaunamod.client.render.RenderCamel;
import com.ikerleon.naturalfaunamod.client.render.RenderCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.client.render.RenderCourser;
import com.ikerleon.naturalfaunamod.client.render.RenderGreySeal;
import com.ikerleon.naturalfaunamod.client.render.RenderHyena;
import com.ikerleon.naturalfaunamod.client.render.RenderLeopard;
import com.ikerleon.naturalfaunamod.client.render.RenderLittleBustard;
import com.ikerleon.naturalfaunamod.client.render.RenderPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityGreySeal;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;
import com.ikerleon.naturalfaunamod.entity.EntityLeopard;
import com.ikerleon.naturalfaunamod.entity.EntityLittleBustard;
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
		RenderingRegistry.registerEntityRenderingHandler(EntityHyena.class, new RenderHyena.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityCantabricCapercaillie.class, new RenderCantabricCapercaillie.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityLittleBustard.class, new RenderLittleBustard.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityLeopard.class, new RenderLeopard.RenderFactory());
	}
}
