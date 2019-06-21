package com.ikerleon.naturalfaunamod.configuration;

import com.google.common.collect.Lists;
import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.util.BiomeDictionaryUtil;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.zawamod.util.SpawnData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Config(modid = NFReference.MOD_ID, name = NFReference.NAME+"/"+NFReference.VERSION+"/"+NFReference.MOD_ID)
@Config.LangKey("config.naturalfauna.title")
public class NaturalFaunaConfig {
    @Config.Name("Separate Natural Spawns")
    @Config.Comment("Set this to true if you'd like Natural Fauna entities to spawn despite ZAWA's Natural Spawning settings.")
    public static boolean separateNaturalSpawns = false;
    @Config.Name("Natural Spawns")
    @Config.Comment("This only works if Separate Natural Spawns is set to true. Set this to false to disable all Natural Fauna's spawning.")
    public static boolean naturalSpawns = true;

    @Config.Comment("Spawns Configuration")
    public static final Spawns spawns = new Spawns();
    public static class Spawns {
        @Config.Name("atlantic_puffin")
        public final SpawnSettings atlantic_puffin = new SpawnSettings(30, 1, 10, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN)));
        @Config.Name("cream_coloured_courser")
        public final SpawnSettings cream_coloured_courser = new SpawnSettings(20, 1, 6, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY)));
        @Config.Name("avocet")
        public final SpawnSettings avocet = new SpawnSettings(45, 1, 9, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER)));
        @Config.Name("camel")
        public final SpawnSettings camel = new SpawnSettings(10, 1, 5, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA))));
        @Config.Name("spotted_hyena")
        public final SpawnSettings spotted_hyena = new SpawnSettings(10, 1, 7, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
        @Config.Name("cantabric_capercaillie")
        public final SpawnSettings cantabric_capercaillie = new SpawnSettings(5, 1, 6, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD), new Biome[]{Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.FOREST, Biomes.EXTREME_HILLS_WITH_TREES})));
        @Config.Name("grants_gazelle")
        public final SpawnSettings grants_gazelle = new SpawnSettings(10, 1, 8, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA))));
        @Config.Name("nautilus")
        public final SpawnSettings nautilus = new SpawnSettings(20, 1, 3, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN)));
        @Config.Name("puma")
        public final SpawnSettings puma = new SpawnSettings(10, 1, 1, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN)));
        @Config.Name("blue_gnu")
        public final SpawnSettings blue_gnu = new SpawnSettings(10, 1, 7, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
        @Config.Name("kori_bustard")
        public final SpawnSettings kori_bustard = new SpawnSettings(5, 1, 1, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA))));
        @Config.Name("common_ostrich")
        public final SpawnSettings common_ostrich = new SpawnSettings(10, 1, 4, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA))));
        @Config.Name("european_roe_deer")
        public final SpawnSettings european_roe_deer = new SpawnSettings(30, 1, 3, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.FOREST)));
        @Config.Name("xenopus_frog")
        public final SpawnSettings xenopus_frog = new SpawnSettings(30, 1, 2, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER)));
        @Config.Name("cape_bushbuck")
        public final SpawnSettings cape_bushbuck = new SpawnSettings(10, 1, 1, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA))));
        @Config.Name("african_cheetah")
        public final SpawnSettings african_cheetah = new SpawnSettings(10, 1, 1, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA))));
        @Config.Name("red_Billed_Tropicbird")
        public final SpawnSettings red_Billed_Tropicbird = new SpawnSettings(30, 1, 7, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.OCEAN), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.BEACH))));
        @Config.Name("red_Billed_hornbill")
        public final SpawnSettings red_Billed_hornbill = new SpawnSettings(10, 1, 3, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
        @Config.Name("turaco")
        public final SpawnSettings turaco = new SpawnSettings(30, 1, 1, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA))));
        @Config.Name("saddlebilled_stork")
        public final SpawnSettings saddlebilled_stork = new SpawnSettings(10, 1, 2, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
        @Config.Name("peregrine_falcon")
        public final SpawnSettings peregrine_falcon = new SpawnSettings(10, 1, 3, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.SPARSE))));
        @Config.Name("estuary_stingray")
        public final SpawnSettings estuary_stingray = new SpawnSettings(30, 1, 2, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER)));
        @Config.Name("willow_ptarmigan")
        public final SpawnSettings willow_ptarmigan = new SpawnSettings(20, 1, 6, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.MOUNTAIN), new Biome[]{Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS})));
        @Config.Name("american_paddlefish")
        public final SpawnSettings american_paddlefish = new SpawnSettings(30, 1, 2, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.SWAMP), BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER))));
        @Config.Name("southern_ground_hornbill")
        public final SpawnSettings southern_ground_hornbill = new SpawnSettings(20, 1, 4, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.HOT, BiomeDictionary.Type.SAVANNA)));
        @Config.Name("marmoset")
        public final SpawnSettings marmoset = new SpawnSettings(20, 1, 4, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.JUNGLE)));
        @Config.Name("axolotl")
        public final SpawnSettings axolotl = new SpawnSettings(20, 1, 4, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.RIVER)));
        @Config.Name("american_bison")
        public final SpawnSettings american_bison = new SpawnSettings(20, 1, 8, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.PLAINS)));
        @Config.Name("barbary_partridge")
        public final SpawnSettings barbary_partridge = new SpawnSettings(10, 2, 12, SpawnData.getBiomeIDS(BiomeDictionaryUtil.FusionBiomes(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.SAVANNA), BiomeDictionaryUtil.getBiomesFromTypes(BiomeDictionary.Type.SANDY, BiomeDictionary.Type.HOT))));
        @Config.Name("basilisk_lizard")
        public final SpawnSettings basilisk_lizard = new SpawnSettings(10, 1, 2, SpawnData.getBiomeIDS(BiomeDictionaryUtil.getBiomesFromType(BiomeDictionary.Type.JUNGLE)));
    }

    public static class SpawnSettings {
        @Config.Name("Spawn Chance")
        public int spawnChance;
        @Config.Name("Min Group")
        public int minGroup;
        @Config.Name("Max Group")
        public int maxGroup;
        @Config.Name("Spawn Biomes")
        public String[] biomes;

        SpawnSettings(int spawnChance, int minGroup, int maxGroup, String[] biomes) {
            this.spawnChance = spawnChance;
            this.minGroup = minGroup;
            this.maxGroup = maxGroup;
            this.biomes = biomes;
        }
    }

    @Mod.EventBusSubscriber(modid = NFReference.MOD_ID)
    private static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(NFReference.MOD_ID)) {
                ConfigManager.sync(NFReference.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}
