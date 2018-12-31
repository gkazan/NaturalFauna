package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.configuration.NaturalFaunaConfig;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityAxolotl;
import com.ikerleon.naturalfaunamod.entity.EntityBarbaryPartridge;
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
import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.EntityInit;
import com.ikerleon.naturalfaunamod.init.ItemInit;
import com.ikerleon.naturalfaunamod.init.NaturalFaunaCrafting;
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
import net.minecraftforge.oredict.OreDictionary;
import org.zawamod.configuration.ZAWAConfig;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event)
	{	
		SoundHandler.registerSounds();
		EntityInit.register();
	}
	
	public void init(FMLInitializationEvent event) {
		
	    OreDictionary.registerOre("feather", ItemInit.MALE_CAPERCAILLIE_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.FEMALE_CAPERCAILLIE_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.AVOCET_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.COURSER_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.KORIBUSTARD_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.OSTRICH_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.PUFFIN_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.REDBILLEDHORNBILL_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.REDBILLEDTROPICBIRD_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.SADDLEBILLEDSTORK_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.VIOLETTURACO_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.REDCRESTEDTURACO_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.GREATBLUETURACO_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.FALCON_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.PTARMIGAN_FEATHER);
	    OreDictionary.registerOre("feather", ItemInit.GROUND_HORNBILL_FEATHER);

		if ((ZAWAConfig.canSpawn && !NaturalFaunaConfig.separateNaturalSpawns) || (NaturalFaunaConfig.separateNaturalSpawns && NaturalFaunaConfig.naturalSpawns)) {
			EntityRegistry.addSpawn(EntityPuffin.class, NaturalFaunaConfig.spawns.atlantic_puffin.spawnChance, NaturalFaunaConfig.spawns.atlantic_puffin.minGroup, NaturalFaunaConfig.spawns.atlantic_puffin.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN));
			EntityRegistry.addSpawn(EntityCourser.class, NaturalFaunaConfig.spawns.cream_coloured_courser.spawnChance, NaturalFaunaConfig.spawns.cream_coloured_courser.minGroup, NaturalFaunaConfig.spawns.cream_coloured_courser.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY));
			EntityRegistry.addSpawn(EntityAvocet.class, NaturalFaunaConfig.spawns.avocet.spawnChance, NaturalFaunaConfig.spawns.avocet.minGroup, NaturalFaunaConfig.spawns.avocet.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
			EntityRegistry.addSpawn(EntityCamel.class, NaturalFaunaConfig.spawns.camel.spawnChance, NaturalFaunaConfig.spawns.camel.minGroup, NaturalFaunaConfig.spawns.camel.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
			EntityRegistry.addSpawn(EntityHyena.class, NaturalFaunaConfig.spawns.spotted_hyena.spawnChance, NaturalFaunaConfig.spawns.spotted_hyena.minGroup, NaturalFaunaConfig.spawns.spotted_hyena.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
			EntityRegistry.addSpawn(EntityCantabricCapercaillie.class, NaturalFaunaConfig.spawns.cantabric_capercaillie.spawnChance, NaturalFaunaConfig.spawns.cantabric_capercaillie.minGroup, NaturalFaunaConfig.spawns.cantabric_capercaillie.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD), new Biome[]{Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.FOREST, Biomes.EXTREME_HILLS_WITH_TREES}));
			EntityRegistry.addSpawn(EntityGrantsGazelle.class, NaturalFaunaConfig.spawns.grants_gazelle.spawnChance, NaturalFaunaConfig.spawns.grants_gazelle.minGroup, NaturalFaunaConfig.spawns.grants_gazelle.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
			EntityRegistry.addSpawn(EntityNautilus.class, NaturalFaunaConfig.spawns.nautilus.spawnChance, NaturalFaunaConfig.spawns.nautilus.minGroup, NaturalFaunaConfig.spawns.nautilus.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN));
			EntityRegistry.addSpawn(EntityPuma.class, NaturalFaunaConfig.spawns.puma.spawnChance, NaturalFaunaConfig.spawns.puma.minGroup, NaturalFaunaConfig.spawns.puma.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN));
			EntityRegistry.addSpawn(EntityBlueGnu.class, NaturalFaunaConfig.spawns.blue_gnu.spawnChance, NaturalFaunaConfig.spawns.blue_gnu.minGroup, NaturalFaunaConfig.spawns.blue_gnu.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
			EntityRegistry.addSpawn(EntityKoriBustard.class, NaturalFaunaConfig.spawns.kori_bustard.spawnChance, NaturalFaunaConfig.spawns.kori_bustard.minGroup, NaturalFaunaConfig.spawns.kori_bustard.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
			EntityRegistry.addSpawn(EntityOstrich.class, NaturalFaunaConfig.spawns.common_ostrich.spawnChance, NaturalFaunaConfig.spawns.common_ostrich.minGroup, NaturalFaunaConfig.spawns.common_ostrich.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
			EntityRegistry.addSpawn(EntityRoeDeer.class, NaturalFaunaConfig.spawns.european_roe_deer.spawnChance, NaturalFaunaConfig.spawns.european_roe_deer.minGroup, NaturalFaunaConfig.spawns.european_roe_deer.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.FOREST));
			EntityRegistry.addSpawn(EntityXenopus.class, NaturalFaunaConfig.spawns.xenopus_frog.spawnChance, NaturalFaunaConfig.spawns.xenopus_frog.minGroup, NaturalFaunaConfig.spawns.xenopus_frog.maxGroup, EnumCreatureType.WATER_CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
			EntityRegistry.addSpawn(EntityBushbuck.class, NaturalFaunaConfig.spawns.cape_bushbuck.spawnChance, NaturalFaunaConfig.spawns.cape_bushbuck.minGroup, NaturalFaunaConfig.spawns.cape_bushbuck.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
			EntityRegistry.addSpawn(EntityCheetah.class, NaturalFaunaConfig.spawns.african_cheetah.spawnChance, NaturalFaunaConfig.spawns.african_cheetah.minGroup, NaturalFaunaConfig.spawns.african_cheetah.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
			EntityRegistry.addSpawn(EntityRedBilledTropicbird.class, NaturalFaunaConfig.spawns.red_Billed_Tropicbird.spawnChance, NaturalFaunaConfig.spawns.red_Billed_Tropicbird.minGroup, NaturalFaunaConfig.spawns.red_Billed_Tropicbird.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.BEACH)));
			EntityRegistry.addSpawn(EntityRedBilledHornbill.class, NaturalFaunaConfig.spawns.red_Billed_hornbill.spawnChance, NaturalFaunaConfig.spawns.red_Billed_hornbill.minGroup, NaturalFaunaConfig.spawns.red_Billed_hornbill.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
			EntityRegistry.addSpawn(EntityTuraco.class, NaturalFaunaConfig.spawns.turaco.spawnChance, NaturalFaunaConfig.spawns.turaco.minGroup, NaturalFaunaConfig.spawns.turaco.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
			EntityRegistry.addSpawn(EntitySaddlebillStork.class, NaturalFaunaConfig.spawns.saddlebilled_stork.spawnChance, NaturalFaunaConfig.spawns.saddlebilled_stork.minGroup, NaturalFaunaConfig.spawns.saddlebilled_stork.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
			EntityRegistry.addSpawn(EntityPeregrineFalcon.class, NaturalFaunaConfig.spawns.peregrine_falcon.spawnChance, NaturalFaunaConfig.spawns.peregrine_falcon.minGroup, NaturalFaunaConfig.spawns.peregrine_falcon.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.SPARSE)));
			EntityRegistry.addSpawn(EntityEstuaryStingray.class, NaturalFaunaConfig.spawns.estuary_stingray.spawnChance, NaturalFaunaConfig.spawns.estuary_stingray.minGroup, NaturalFaunaConfig.spawns.estuary_stingray.maxGroup, EnumCreatureType.WATER_CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
			EntityRegistry.addSpawn(EntityWillowPtarmigan.class, NaturalFaunaConfig.spawns.willow_ptarmigan.spawnChance, NaturalFaunaConfig.spawns.willow_ptarmigan.minGroup, NaturalFaunaConfig.spawns.willow_ptarmigan.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN), new Biome[]{Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS}));
			EntityRegistry.addSpawn(EntityPaddlefish.class, NaturalFaunaConfig.spawns.american_paddlefish.spawnChance, NaturalFaunaConfig.spawns.american_paddlefish.minGroup, NaturalFaunaConfig.spawns.american_paddlefish.maxGroup, EnumCreatureType.WATER_CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.SWAMP), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER)));
			EntityRegistry.addSpawn(EntityGroundHornbill.class, NaturalFaunaConfig.spawns.southern_ground_hornbill.spawnChance, NaturalFaunaConfig.spawns.southern_ground_hornbill.minGroup, NaturalFaunaConfig.spawns.southern_ground_hornbill.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA));
			EntityRegistry.addSpawn(EntityMarmoset.class, NaturalFaunaConfig.spawns.marmoset.spawnChance, NaturalFaunaConfig.spawns.marmoset.minGroup, NaturalFaunaConfig.spawns.marmoset.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.JUNGLE));
			EntityRegistry.addSpawn(EntityAxolotl.class, NaturalFaunaConfig.spawns.axolotl.spawnChance, NaturalFaunaConfig.spawns.axolotl.minGroup, NaturalFaunaConfig.spawns.axolotl.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER));
			EntityRegistry.addSpawn(EntityBison.class, NaturalFaunaConfig.spawns.american_bison.spawnChance, NaturalFaunaConfig.spawns.american_bison.minGroup, NaturalFaunaConfig.spawns.american_bison.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.PLAINS));
			EntityRegistry.addSpawn(EntityBarbaryPartridge.class, NaturalFaunaConfig.spawns.barbary_partridge.spawnChance, NaturalFaunaConfig.spawns.barbary_partridge.minGroup, NaturalFaunaConfig.spawns.barbary_partridge.maxGroup, EnumCreatureType.CREATURE, BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.SAVANNA), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.SANDY, BiomeDictionary.Type.HOT)));
		}
		
		NaturalFaunaCrafting.Init(event);
	}
	
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public void registerRenders() {

	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
}
