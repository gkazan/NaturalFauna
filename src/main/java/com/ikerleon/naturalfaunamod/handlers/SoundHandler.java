package com.ikerleon.naturalfaunamod.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {
	
	private static int size=0;

	public static SoundEvent CAPERCAILLIE_LEKKING;
	public static SoundEvent CAPERCAILLIE_FEMALE_LIVING;
	public static SoundEvent AVOCET_LIVING;
	public static SoundEvent AVOCET_HURT;
	public static SoundEvent HYENA_LIVING;
	public static SoundEvent HYENA_HURT;
	public static SoundEvent HYENA_DEATH;
	
	public static void registerSounds() {
		size=SoundEvent.REGISTRY.getKeys().size();
		
		CAPERCAILLIE_LEKKING = registerSound("entity.capercaillie.lekking");
		CAPERCAILLIE_FEMALE_LIVING = registerSound("entity.capercaillie.female_living");
		AVOCET_LIVING = registerSound("entity.avocet.ambient");
		AVOCET_HURT = registerSound("entity.avocet.hurt");
		HYENA_LIVING = registerSound("entity.hyena.ambient");
		HYENA_HURT = registerSound("entity.hyena.hurt");
		HYENA_DEATH = registerSound("entity.hyena.death");
	}
	
	  private static SoundEvent registerSound(String s) { ResourceLocation l = new ResourceLocation("faunanatural:" + s);
	    SoundEvent event = new SoundEvent(l);
	    event.setRegistryName(s);
	    ForgeRegistries.SOUND_EVENTS.register(event);
	    return event;
	  }

}
