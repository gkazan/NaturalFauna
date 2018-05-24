package com.ikerleon.naturalfaunamod.handlers;

import com.ikerleon.naturalfaunamod.NFReference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundHandler {
	
	private static int size=0;

	public static SoundEvent CAPERCAILLIE_LEKKING;
	
	public static void init() {
		size=SoundEvent.REGISTRY.getKeys().size();
		
		CAPERCAILLIE_LEKKING = register("ambient.capercaillie.lekking");
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation location=new ResourceLocation(NFReference.MOD_ID, ":" + name);
		SoundEvent e = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, e);
		net.minecraftforge.fml.common.registry.ForgeRegistries.SOUND_EVENTS.register(e);
		size++;
		return e;
	}
}
