package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityBlueGnu;
import com.ikerleon.naturalfaunamod.entity.EntityBushbuck;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCheetah;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityGrantsGazelle;
import com.ikerleon.naturalfaunamod.entity.EntityGreySeal;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;
import com.ikerleon.naturalfaunamod.entity.EntityKoriBustard;
import com.ikerleon.naturalfaunamod.entity.EntityNautilus;
import com.ikerleon.naturalfaunamod.entity.EntityOstrich;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityPuma;
import com.ikerleon.naturalfaunamod.entity.EntityRedBilledHornbill;
import com.ikerleon.naturalfaunamod.entity.EntityRedBilledTropicbird;
import com.ikerleon.naturalfaunamod.entity.EntityRoeDeer;
import com.ikerleon.naturalfaunamod.entity.EntitySaddlebillStork;
import com.ikerleon.naturalfaunamod.entity.EntityTuraco;
import com.ikerleon.naturalfaunamod.entity.EntityXenopus;
import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.EntityInit;
import com.ikerleon.naturalfaunamod.util.BiomeDictionaryUtil;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event)
	{	
		SoundHandler.registerSounds();
		EntityInit.register();
	}
	
	public void init(FMLInitializationEvent event) {
		
		EntityRegistry.addSpawn(EntityCantabricCapercaillie.class, 30, 0, 6, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD));
		EntityRegistry.addSpawn(EntityAvocet.class, 80, 0, 9, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
		EntityRegistry.addSpawn(EntityPuffin.class, 60, 0, 10, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN));
		EntityRegistry.addSpawn(EntityCourser.class, 50, 0, 6, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY));
		EntityRegistry.addSpawn(EntityHyena.class, 40, 0, 7, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityCamel.class, 40, 0, 5, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityGreySeal.class, 50, 0, 4, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.OCEAN, BiomeDictionary.Type.COLD));
		EntityRegistry.addSpawn(EntityGrantsGazelle.class, 40, 0, 8, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityNautilus.class, 50, 0, 3, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN));
		EntityRegistry.addSpawn(EntityPuma.class, 30, 0, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN));
		EntityRegistry.addSpawn(EntityBlueGnu.class, 50, 0, 7, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityKoriBustard.class, 40, 0, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityOstrich.class, 50, 0, 4, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityRoeDeer.class, 60, 0, 3, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.FOREST));
		EntityRegistry.addSpawn(EntityXenopus.class, 50, 0, 2, EnumCreatureType.WATER_CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
		EntityRegistry.addSpawn(EntityCheetah.class, 40, 0, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
		EntityRegistry.addSpawn(EntityBushbuck.class, 40, 0, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityTuraco.class, 50, 0, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityRedBilledHornbill.class, 40, 0, 3, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityRedBilledTropicbird.class, 60, 0, 7, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN));
		EntityRegistry.addSpawn(EntitySaddlebillStork.class, 40, 0, 2, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
	}
	
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public void registerRenders() {

	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
}
