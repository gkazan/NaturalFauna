package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityBlueGnu;
import com.ikerleon.naturalfaunamod.entity.EntityBushbuck;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCheetah;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityGrantsGazelle;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;
import com.ikerleon.naturalfaunamod.entity.EntityKoriBustard;
import com.ikerleon.naturalfaunamod.entity.EntityNautilus;
import com.ikerleon.naturalfaunamod.entity.EntityOstrich;
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
import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.EntityInit;
import com.ikerleon.naturalfaunamod.util.BiomeDictionaryUtil;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
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
		
		EntityRegistry.addSpawn(EntityCantabricCapercaillie.class, 40, 1, 6, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD), new Biome[] {Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.FOREST, Biomes.EXTREME_HILLS_WITH_TREES}));
		EntityRegistry.addSpawn(EntityAvocet.class, 90, 1, 9, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
		EntityRegistry.addSpawn(EntityPuffin.class, 70, 1, 10, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN));
		EntityRegistry.addSpawn(EntityCourser.class, 60, 1, 6, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY));
		EntityRegistry.addSpawn(EntityHyena.class, 50, 1, 7, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityCamel.class, 50, 1, 5, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityGrantsGazelle.class, 50, 1, 8, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityNautilus.class, 60, 1, 3, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN));
		EntityRegistry.addSpawn(EntityPuma.class, 50, 1, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN));
		EntityRegistry.addSpawn(EntityBlueGnu.class, 50, 1, 7, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityKoriBustard.class, 40, 1, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityOstrich.class, 50, 1, 4, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityRoeDeer.class, 70, 1, 3, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.FOREST));
		EntityRegistry.addSpawn(EntityXenopus.class, 60, 1, 2, EnumCreatureType.WATER_CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
		EntityRegistry.addSpawn(EntityCheetah.class, 50, 1, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
		EntityRegistry.addSpawn(EntityBushbuck.class, 50, 1, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityTuraco.class, 70, 1, 1, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));	
		EntityRegistry.addSpawn(EntityRedBilledHornbill.class, 50, 1, 3, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityRedBilledTropicbird.class, 70, 1, 7, EnumCreatureType.CREATURE,BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.BEACH)));
		EntityRegistry.addSpawn(EntitySaddlebillStork.class, 50, 1, 2, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
		EntityRegistry.addSpawn(EntityPeregrineFalcon.class, 50, 1, 3, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.SPARSE)));
		EntityRegistry.addSpawn(EntityWillowPtarmigan.class, 60, 1, 6, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN), new Biome[] {Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS}));
	}
	
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public void registerRenders() {

	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
}
