package com.ikerleon.naturalfaunamod.proxies;

import com.ikerleon.naturalfaunamod.configuration.NaturalFaunaConfig;
import com.ikerleon.naturalfaunamod.entity.*;
import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.EntityInit;
import com.ikerleon.naturalfaunamod.init.ItemInit;
import com.ikerleon.naturalfaunamod.init.NaturalFaunaCrafting;
import com.ikerleon.naturalfaunamod.util.BiomeDictionaryUtil;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import org.zawamod.configuration.ZAWAConfig;
import org.zawamod.util.SpawnData;

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
			EntityRegistry.addSpawn(EntityPuffin.class, NaturalFaunaConfig.spawns.atlantic_puffin.spawnChance, NaturalFaunaConfig.spawns.atlantic_puffin.minGroup, NaturalFaunaConfig.spawns.atlantic_puffin.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.atlantic_puffin.biomes)}));
			EntityRegistry.addSpawn(EntityCourser.class, NaturalFaunaConfig.spawns.cream_coloured_courser.spawnChance, NaturalFaunaConfig.spawns.cream_coloured_courser.minGroup, NaturalFaunaConfig.spawns.cream_coloured_courser.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.cream_coloured_courser.biomes)}));
			EntityRegistry.addSpawn(EntityAvocet.class, NaturalFaunaConfig.spawns.avocet.spawnChance, NaturalFaunaConfig.spawns.avocet.minGroup, NaturalFaunaConfig.spawns.avocet.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.avocet.biomes)}));
			EntityRegistry.addSpawn(EntityCamel.class, NaturalFaunaConfig.spawns.camel.spawnChance, NaturalFaunaConfig.spawns.camel.minGroup, NaturalFaunaConfig.spawns.camel.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.camel.biomes)}));
			EntityRegistry.addSpawn(EntityHyena.class, NaturalFaunaConfig.spawns.spotted_hyena.spawnChance, NaturalFaunaConfig.spawns.spotted_hyena.minGroup, NaturalFaunaConfig.spawns.spotted_hyena.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.spotted_hyena.biomes)}));
			EntityRegistry.addSpawn(EntityCantabricCapercaillie.class, NaturalFaunaConfig.spawns.cantabric_capercaillie.spawnChance, NaturalFaunaConfig.spawns.cantabric_capercaillie.minGroup, NaturalFaunaConfig.spawns.cantabric_capercaillie.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.cantabric_capercaillie.biomes)}));
			EntityRegistry.addSpawn(EntityGrantsGazelle.class, NaturalFaunaConfig.spawns.grants_gazelle.spawnChance, NaturalFaunaConfig.spawns.grants_gazelle.minGroup, NaturalFaunaConfig.spawns.grants_gazelle.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.grants_gazelle.biomes)}));
			EntityRegistry.addSpawn(EntityNautilus.class, NaturalFaunaConfig.spawns.nautilus.spawnChance, NaturalFaunaConfig.spawns.nautilus.minGroup, NaturalFaunaConfig.spawns.nautilus.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.nautilus.biomes)}));
			EntityRegistry.addSpawn(EntityPuma.class, NaturalFaunaConfig.spawns.puma.spawnChance, NaturalFaunaConfig.spawns.puma.minGroup, NaturalFaunaConfig.spawns.puma.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.puma.biomes)}));
			EntityRegistry.addSpawn(EntityBlueGnu.class, NaturalFaunaConfig.spawns.blue_gnu.spawnChance, NaturalFaunaConfig.spawns.blue_gnu.minGroup, NaturalFaunaConfig.spawns.blue_gnu.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.blue_gnu.biomes)}));
			EntityRegistry.addSpawn(EntityKoriBustard.class, NaturalFaunaConfig.spawns.kori_bustard.spawnChance, NaturalFaunaConfig.spawns.kori_bustard.minGroup, NaturalFaunaConfig.spawns.kori_bustard.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.kori_bustard.biomes)}));
			EntityRegistry.addSpawn(EntityOstrich.class, NaturalFaunaConfig.spawns.common_ostrich.spawnChance, NaturalFaunaConfig.spawns.common_ostrich.minGroup, NaturalFaunaConfig.spawns.common_ostrich.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.common_ostrich.biomes)}));
			EntityRegistry.addSpawn(EntityRoeDeer.class, NaturalFaunaConfig.spawns.european_roe_deer.spawnChance, NaturalFaunaConfig.spawns.european_roe_deer.minGroup, NaturalFaunaConfig.spawns.european_roe_deer.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.european_roe_deer.biomes)}));
			EntityRegistry.addSpawn(EntityXenopus.class, NaturalFaunaConfig.spawns.xenopus_frog.spawnChance, NaturalFaunaConfig.spawns.xenopus_frog.minGroup, NaturalFaunaConfig.spawns.xenopus_frog.maxGroup, EnumCreatureType.WATER_CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.xenopus_frog.biomes)}));
			EntityRegistry.addSpawn(EntityBushbuck.class, NaturalFaunaConfig.spawns.cape_bushbuck.spawnChance, NaturalFaunaConfig.spawns.cape_bushbuck.minGroup, NaturalFaunaConfig.spawns.cape_bushbuck.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.cape_bushbuck.biomes)}));
			EntityRegistry.addSpawn(EntityCheetah.class, NaturalFaunaConfig.spawns.african_cheetah.spawnChance, NaturalFaunaConfig.spawns.african_cheetah.minGroup, NaturalFaunaConfig.spawns.african_cheetah.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.african_cheetah.biomes)}));
			EntityRegistry.addSpawn(EntityRedBilledTropicbird.class, NaturalFaunaConfig.spawns.red_Billed_Tropicbird.spawnChance, NaturalFaunaConfig.spawns.red_Billed_Tropicbird.minGroup, NaturalFaunaConfig.spawns.red_Billed_Tropicbird.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.red_Billed_Tropicbird.biomes)}));
			EntityRegistry.addSpawn(EntityRedBilledHornbill.class, NaturalFaunaConfig.spawns.red_Billed_hornbill.spawnChance, NaturalFaunaConfig.spawns.red_Billed_hornbill.minGroup, NaturalFaunaConfig.spawns.red_Billed_hornbill.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.red_Billed_hornbill.biomes)}));
			EntityRegistry.addSpawn(EntityTuraco.class, NaturalFaunaConfig.spawns.turaco.spawnChance, NaturalFaunaConfig.spawns.turaco.minGroup, NaturalFaunaConfig.spawns.turaco.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.turaco.biomes)}));
			EntityRegistry.addSpawn(EntitySaddlebillStork.class, NaturalFaunaConfig.spawns.saddlebilled_stork.spawnChance, NaturalFaunaConfig.spawns.saddlebilled_stork.minGroup, NaturalFaunaConfig.spawns.saddlebilled_stork.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.saddlebilled_stork.biomes)}));
			EntityRegistry.addSpawn(EntityPeregrineFalcon.class, NaturalFaunaConfig.spawns.peregrine_falcon.spawnChance, NaturalFaunaConfig.spawns.peregrine_falcon.minGroup, NaturalFaunaConfig.spawns.peregrine_falcon.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.peregrine_falcon.biomes)}));
			EntityRegistry.addSpawn(EntityEstuaryStingray.class, NaturalFaunaConfig.spawns.estuary_stingray.spawnChance, NaturalFaunaConfig.spawns.estuary_stingray.minGroup, NaturalFaunaConfig.spawns.estuary_stingray.maxGroup, EnumCreatureType.WATER_CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.estuary_stingray.biomes)}));
			EntityRegistry.addSpawn(EntityWillowPtarmigan.class, NaturalFaunaConfig.spawns.willow_ptarmigan.spawnChance, NaturalFaunaConfig.spawns.willow_ptarmigan.minGroup, NaturalFaunaConfig.spawns.willow_ptarmigan.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.willow_ptarmigan.biomes)}));
			EntityRegistry.addSpawn(EntityPaddlefish.class, NaturalFaunaConfig.spawns.american_paddlefish.spawnChance, NaturalFaunaConfig.spawns.american_paddlefish.minGroup, NaturalFaunaConfig.spawns.american_paddlefish.maxGroup, EnumCreatureType.WATER_CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.american_paddlefish.biomes)}));
			EntityRegistry.addSpawn(EntityGroundHornbill.class, NaturalFaunaConfig.spawns.southern_ground_hornbill.spawnChance, NaturalFaunaConfig.spawns.southern_ground_hornbill.minGroup, NaturalFaunaConfig.spawns.southern_ground_hornbill.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.southern_ground_hornbill.biomes)}));
			EntityRegistry.addSpawn(EntityMarmoset.class, NaturalFaunaConfig.spawns.marmoset.spawnChance, NaturalFaunaConfig.spawns.marmoset.minGroup, NaturalFaunaConfig.spawns.marmoset.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.marmoset.biomes)}));
			EntityRegistry.addSpawn(EntityAxolotl.class, NaturalFaunaConfig.spawns.axolotl.spawnChance, NaturalFaunaConfig.spawns.axolotl.minGroup, NaturalFaunaConfig.spawns.axolotl.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.axolotl.biomes)}));
			EntityRegistry.addSpawn(EntityBison.class, NaturalFaunaConfig.spawns.american_bison.spawnChance, NaturalFaunaConfig.spawns.american_bison.minGroup, NaturalFaunaConfig.spawns.american_bison.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.american_bison.biomes)}));
			EntityRegistry.addSpawn(EntityBarbaryPartridge.class, NaturalFaunaConfig.spawns.barbary_partridge.spawnChance, NaturalFaunaConfig.spawns.barbary_partridge.minGroup, NaturalFaunaConfig.spawns.barbary_partridge.maxGroup, EnumCreatureType.CREATURE,
                    SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.barbary_partridge.biomes)}));
			EntityRegistry.addSpawn(EntityBasiliskLizard.class, NaturalFaunaConfig.spawns.basilisk_lizard.spawnChance, NaturalFaunaConfig.spawns.basilisk_lizard.minGroup, NaturalFaunaConfig.spawns.basilisk_lizard.maxGroup, EnumCreatureType.CREATURE,
					SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.basilisk_lizard.biomes)}));
			EntityRegistry.addSpawn(EntityCommonLoon.class, NaturalFaunaConfig.spawns.common_loon.spawnChance, NaturalFaunaConfig.spawns.common_loon.minGroup, NaturalFaunaConfig.spawns.common_loon.maxGroup, EnumCreatureType.CREATURE,
					SpawnData.mergeBiomes(new Biome[][]{getBiomes(NaturalFaunaConfig.spawns.common_loon.biomes)}));
		}
		
		NaturalFaunaCrafting.Init(event);
	}

	private Biome[] getBiomes(String[] strings) {
        Biome[] b = new Biome[strings.length];
        int i = 0;
        for (String s : strings) {
            try {
                b[i] = ForgeRegistries.BIOMES.getValue(new ResourceLocation(s));
                i++;
            } catch (NullPointerException e) {
                System.out.println("The specified biome \'" + s + "\' does not exist. This is an error of the player-set config.");
            }
        }
        return b;
    }
	
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public void registerRenders() {

	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
}
