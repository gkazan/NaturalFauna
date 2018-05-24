package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.EntityInit;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	
	public void preInit(FMLPreInitializationEvent event)
	{	
		EntityInit.register();
	}
	
	public void init(FMLInitializationEvent event) {
		SoundHandler.init();
	}
	
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public void registerRenders() {

	}
}
