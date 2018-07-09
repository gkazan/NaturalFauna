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
	public static SoundEvent GNU_LIVING;
	public static SoundEvent GNU_HURT;
	public static SoundEvent COURSER_HURT;
	public static SoundEvent SEAL_LIVING;
	public static SoundEvent LITTLE_BUSTARD_SONG;
	public static SoundEvent ROE_DEER_LIVING;
	public static SoundEvent ROE_DEER_HURT;
	public static SoundEvent OSTRICH_BOOMING;
	public static SoundEvent PUMA_HURT;
	public static SoundEvent BUSHBUCK_HURT;
	public static SoundEvent GAZELLE_HURT;
	public static SoundEvent CHEETAH_CHIRP;

	
	public static void registerSounds() {
		
		size=SoundEvent.REGISTRY.getKeys().size();
		
		CAPERCAILLIE_LEKKING = registerSound("entity.capercaillie.lekking");
		CAPERCAILLIE_FEMALE_LIVING = registerSound("entity.capercaillie.female_living");
		AVOCET_LIVING = registerSound("entity.avocet.ambient");
		AVOCET_HURT = registerSound("entity.avocet.hurt");
		HYENA_LIVING = registerSound("entity.hyena.ambient");
		HYENA_HURT = registerSound("entity.hyena.hurt");
		HYENA_DEATH = registerSound("entity.hyena.death");
		GNU_LIVING = registerSound("entity.gnu.living");
		GNU_HURT = registerSound("entity.gnu.hurt");
		COURSER_HURT = registerSound("entity.courser.hurt");
		SEAL_LIVING = registerSound("entity.greyseal.living");
		LITTLE_BUSTARD_SONG = registerSound("entity.littlebustard.song");
		ROE_DEER_LIVING = registerSound("entity.roedeer.living");
		ROE_DEER_HURT = registerSound("entity.roedeer.hurt");
		OSTRICH_BOOMING = registerSound("entity.ostrich.booming");
		PUMA_HURT = registerSound("entity.puma.hurt");
		BUSHBUCK_HURT = registerSound("entity.bushbuck.hurt");
		GAZELLE_HURT = registerSound("entity.gazelle.hurt");
		CHEETAH_CHIRP = registerSound("entity.cheetah.chirp");
	}
	
	  private static SoundEvent registerSound(String s) { ResourceLocation l = new ResourceLocation("faunanatural:" + s);
	    SoundEvent event = new SoundEvent(l);
	    event.setRegistryName(s);
	    ForgeRegistries.SOUND_EVENTS.register(event);
	    return event;
	  }

}
