package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.client.render.RenderAvocet;
import com.ikerleon.naturalfaunamod.client.render.RenderAxolotl;
import com.ikerleon.naturalfaunamod.client.render.RenderBarbaryPartridge;
import com.ikerleon.naturalfaunamod.client.render.RenderBasiliskLizard;
import com.ikerleon.naturalfaunamod.client.render.RenderBison;
import com.ikerleon.naturalfaunamod.client.render.RenderBlueGnu;
import com.ikerleon.naturalfaunamod.client.render.RenderBushbuck;
import com.ikerleon.naturalfaunamod.client.render.RenderCamel;
import com.ikerleon.naturalfaunamod.client.render.RenderCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.client.render.RenderCheetah;
import com.ikerleon.naturalfaunamod.client.render.RenderCourser;
import com.ikerleon.naturalfaunamod.client.render.RenderEstuaryStingray;
import com.ikerleon.naturalfaunamod.client.render.RenderGrantsGazelle;
import com.ikerleon.naturalfaunamod.client.render.RenderGroundHornbill;
import com.ikerleon.naturalfaunamod.client.render.RenderHyena;
import com.ikerleon.naturalfaunamod.client.render.RenderKoriBustard;
import com.ikerleon.naturalfaunamod.client.render.RenderMarmoset;
import com.ikerleon.naturalfaunamod.client.render.RenderNautilus;
import com.ikerleon.naturalfaunamod.client.render.RenderOstrich;
import com.ikerleon.naturalfaunamod.client.render.RenderPaddlefish;
import com.ikerleon.naturalfaunamod.client.render.RenderPeregrineFalcon;
import com.ikerleon.naturalfaunamod.client.render.RenderPuffin;
import com.ikerleon.naturalfaunamod.client.render.RenderPuma;
import com.ikerleon.naturalfaunamod.client.render.RenderRedBilledHornbill;
import com.ikerleon.naturalfaunamod.client.render.RenderRedBilledTropicbird;
import com.ikerleon.naturalfaunamod.client.render.RenderRoeDeer;
import com.ikerleon.naturalfaunamod.client.render.RenderSaddlebillStork;
import com.ikerleon.naturalfaunamod.client.render.RenderTuraco;
import com.ikerleon.naturalfaunamod.client.render.RenderWillowPtarmigan;
import com.ikerleon.naturalfaunamod.client.render.RenderXenopus;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityAxolotl;
import com.ikerleon.naturalfaunamod.entity.EntityBarbaryPartridge;
import com.ikerleon.naturalfaunamod.entity.EntityBasiliskLizard;
import com.ikerleon.naturalfaunamod.entity.EntityBison;
import com.ikerleon.naturalfaunamod.entity.EntityBlueGnu;
import com.ikerleon.naturalfaunamod.entity.EntityBushbuck;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCheetah;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityEstuaryStingray;
import com.ikerleon.naturalfaunamod.entity.EntityGrantsGazelle;
import com.ikerleon.naturalfaunamod.entity.EntityGroundHornbill;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;
import com.ikerleon.naturalfaunamod.entity.EntityKoriBustard;
import com.ikerleon.naturalfaunamod.entity.EntityMarmoset;
import com.ikerleon.naturalfaunamod.entity.EntityNautilus;
import com.ikerleon.naturalfaunamod.entity.EntityOstrich;
import com.ikerleon.naturalfaunamod.entity.EntityPaddlefish;
import com.ikerleon.naturalfaunamod.entity.EntityPeregrineFalcon;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityPuma;
import com.ikerleon.naturalfaunamod.entity.EntityRedBilledHornbill;
import com.ikerleon.naturalfaunamod.entity.EntityRedBilledTropicbird;
import com.ikerleon.naturalfaunamod.entity.EntityRoeDeer;
import com.ikerleon.naturalfaunamod.entity.EntitySaddlebillStork;
import com.ikerleon.naturalfaunamod.entity.EntityTuraco;
import com.ikerleon.naturalfaunamod.entity.EntityWillowPtarmigan;
import com.ikerleon.naturalfaunamod.entity.EntityXenopus;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	
	@Override
	public void registerRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPuffin.class, new RenderPuffin.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityCourser.class, new RenderCourser.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityAvocet.class, new RenderAvocet.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityCamel.class, new RenderCamel.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityHyena.class, new RenderHyena.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityCantabricCapercaillie.class, new RenderCantabricCapercaillie.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGrantsGazelle.class, new RenderGrantsGazelle.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityNautilus.class, new RenderNautilus.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityPuma.class, new RenderPuma.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueGnu.class, new RenderBlueGnu.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityKoriBustard.class, new RenderKoriBustard.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityOstrich.class, new RenderOstrich.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityRoeDeer.class, new RenderRoeDeer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityXenopus.class, new RenderXenopus.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBushbuck.class, new RenderBushbuck.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityCheetah.class, new RenderCheetah.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityRedBilledTropicbird.class, new RenderRedBilledTropicbird.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityRedBilledHornbill.class, new RenderRedBilledHornbill.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityTuraco.class, new RenderTuraco.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntitySaddlebillStork.class, new RenderSaddlebillStork.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityPeregrineFalcon.class, new RenderPeregrineFalcon.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityEstuaryStingray.class, new RenderEstuaryStingray.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityWillowPtarmigan.class, new RenderWillowPtarmigan.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityPaddlefish.class, new RenderPaddlefish.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityGroundHornbill.class, new RenderGroundHornbill.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityMarmoset.class, new RenderMarmoset.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityAxolotl.class, new RenderAxolotl.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBison.class, new RenderBison.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBarbaryPartridge.class, new RenderBarbaryPartridge.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBasiliskLizard.class, new RenderBasiliskLizard.RenderFactory());
	}
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
