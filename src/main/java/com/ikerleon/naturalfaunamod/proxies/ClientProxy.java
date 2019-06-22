package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.client.render.*;
import com.ikerleon.naturalfaunamod.entity.*;

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
		RenderingRegistry.registerEntityRenderingHandler(EntityCommonLoon.class, new RenderCommonLoon.RenderFactory());
	}
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
