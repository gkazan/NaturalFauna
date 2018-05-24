package com.ikerleon.naturalfaunamod.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundHandler {
	
	private static int size=0;

	public static SoundEvent CAPERCAILLIE_LEKKING;
	
	public static void init() {
		size=SoundEvent.REGISTRY.getKeys().size();
		
		CAPERCAILLIE_LEKKING = registerSound("capercaillie.lekking");
	}
	
	  private static SoundEvent registerSound(String s) { ResourceLocation l = new ResourceLocation("faunanatural:" + s);
	    SoundEvent event = new SoundEvent(l);
	    event.setRegistryName(s);
	    net.minecraftforge.fml.common.registry.ForgeRegistries.SOUND_EVENTS.register(event);
	    return event;
	  }

}
