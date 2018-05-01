package com.ikerleon.naturalfaunamod;

import org.zawamod.ZAWAAddon;
import org.zawamod.ZAWAAddonHandler;
import org.zawamod.entity.base.ZAWABaseLand;

import com.ikerleon.naturalfaunamod.proxies.CommonProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = NFReference.MOD_ID, name = NFReference.NAME, version = NFReference.VERSION, dependencies = NFReference.DENPEND)
public class NaturalFaunaMain {

	private static ZAWAAddon mod = new ZAWAAddon(NFReference.MOD_ID);
	
	@SidedProxy(serverSide = NFReference.SERVER_PROXY_CLASS, clientSide = NFReference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance(NFReference.MOD_ID)
	public static NaturalFaunaMain instance;
	
	public static void addAnimal(Class<? extends ZAWABaseLand> animal) {
		mod.addAnimalToAddon(animal);
	}
	
	@EventHandler()
	public static void preInit(FMLPreInitializationEvent event) {
		mod.setModelPath("com.ikerleon.naturalfaunamod.client.model");
		mod.setRenderPath("com.ikerleon.naturalfaunamod.client.render");
		
		ZAWAAddonHandler.addMod(mod);
		
		proxy.preInit(event);
		proxy.registerRenders();
	}
	
	@EventHandler()
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler()
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
