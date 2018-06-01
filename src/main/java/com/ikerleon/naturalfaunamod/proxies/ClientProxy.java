package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.client.render.RenderAvocet;
import com.ikerleon.naturalfaunamod.client.render.RenderBarbaryLion;
import com.ikerleon.naturalfaunamod.client.render.RenderBlueGnu;
import com.ikerleon.naturalfaunamod.client.render.RenderCamel;
import com.ikerleon.naturalfaunamod.client.render.RenderCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.client.render.RenderCourser;
import com.ikerleon.naturalfaunamod.client.render.RenderGrantsGazelle;
import com.ikerleon.naturalfaunamod.client.render.RenderGreySeal;
import com.ikerleon.naturalfaunamod.client.render.RenderHyena;
import com.ikerleon.naturalfaunamod.client.render.RenderJackfish;
import com.ikerleon.naturalfaunamod.client.render.RenderKoriBustard;
import com.ikerleon.naturalfaunamod.client.render.RenderLeopard;
import com.ikerleon.naturalfaunamod.client.render.RenderLittleBustard;
import com.ikerleon.naturalfaunamod.client.render.RenderNautilus;
import com.ikerleon.naturalfaunamod.client.render.RenderOstrich;
import com.ikerleon.naturalfaunamod.client.render.RenderPuffin;
import com.ikerleon.naturalfaunamod.client.render.RenderPuma;
import com.ikerleon.naturalfaunamod.client.render.RenderRoeDeer;
import com.ikerleon.naturalfaunamod.client.render.RenderXenopus;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityBarbaryLion;
import com.ikerleon.naturalfaunamod.entity.EntityBlueGnu;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityGrantsGazelle;
import com.ikerleon.naturalfaunamod.entity.EntityGreySeal;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;
import com.ikerleon.naturalfaunamod.entity.EntityJackfish;
import com.ikerleon.naturalfaunamod.entity.EntityKoriBustard;
import com.ikerleon.naturalfaunamod.entity.EntityLeopard;
import com.ikerleon.naturalfaunamod.entity.EntityLittleBustard;
import com.ikerleon.naturalfaunamod.entity.EntityNautilus;
import com.ikerleon.naturalfaunamod.entity.EntityOstrich;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityPuma;
import com.ikerleon.naturalfaunamod.entity.EntityRoeDeer;
import com.ikerleon.naturalfaunamod.entity.EntityXenopus;

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
		RenderingRegistry.registerEntityRenderingHandler(EntityBarbaryLion.class, new RenderBarbaryLion.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGrantsGazelle.class, new RenderGrantsGazelle.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityJackfish.class, new RenderJackfish.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityNautilus.class, new RenderNautilus.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityPuma.class, new RenderPuma.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueGnu.class, new RenderBlueGnu.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityKoriBustard.class, new RenderKoriBustard.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityOstrich.class, new RenderOstrich.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityRoeDeer.class, new RenderRoeDeer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityXenopus.class, new RenderXenopus.RenderFactory());
	}
}
