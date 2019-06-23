package com.ikerleon.naturalfaunamod.configuration;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.util.BiomeDictionaryUtil;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static org.zawamod.util.SpawnData.getBiomeIDS;
import static org.zawamod.util.SpawnData.getBiomesOfType;
import static org.zawamod.util.SpawnData.mergeBiomes;

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
        public final SpawnSettings atlantic_puffin = new SpawnSettings(30, 1, 10, getBiomeIDS(getBiomesOfType(Type.OCEAN)));
        @Config.Name("cream_coloured_courser")
        public final SpawnSettings cream_coloured_courser = new SpawnSettings(20, 1, 6, getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SANDY)));
        @Config.Name("avocet")
        public final SpawnSettings avocet = new SpawnSettings(45, 1, 9, getBiomeIDS(getBiomesOfType(Type.RIVER)));
        @Config.Name("camel")
        public final SpawnSettings camel = new SpawnSettings(10, 1, 5, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA))));
        @Config.Name("spotted_hyena")
        public final SpawnSettings spotted_hyena = new SpawnSettings(10, 1, 7, getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA)));
        @Config.Name("cantabric_capercaillie")
        public final SpawnSettings cantabric_capercaillie = new SpawnSettings(5, 1, 6, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.FOREST, Type.COLD), new Biome[]{Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.FOREST, Biomes.EXTREME_HILLS_WITH_TREES})));
        @Config.Name("grants_gazelle")
        public final SpawnSettings grants_gazelle = new SpawnSettings(10, 1, 8, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA))));
        @Config.Name("nautilus")
        public final SpawnSettings nautilus = new SpawnSettings(20, 1, 3, getBiomeIDS(getBiomesOfType(Type.OCEAN)));
        @Config.Name("puma")
        public final SpawnSettings puma = new SpawnSettings(10, 1, 1, getBiomeIDS(getBiomesOfType(Type.MOUNTAIN)));
        @Config.Name("blue_gnu")
        public final SpawnSettings blue_gnu = new SpawnSettings(10, 1, 7, getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA)));
        @Config.Name("kori_bustard")
        public final SpawnSettings kori_bustard = new SpawnSettings(5, 1, 1, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA))));
        @Config.Name("common_ostrich")
        public final SpawnSettings common_ostrich = new SpawnSettings(10, 1, 4, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA))));
        @Config.Name("european_roe_deer")
        public final SpawnSettings european_roe_deer = new SpawnSettings(30, 1, 3, getBiomeIDS(getBiomesOfType(Type.FOREST)));
        @Config.Name("xenopus_frog")
        public final SpawnSettings xenopus_frog = new SpawnSettings(30, 1, 2, getBiomeIDS(getBiomesOfType(Type.RIVER)));
        @Config.Name("cape_bushbuck")
        public final SpawnSettings cape_bushbuck = new SpawnSettings(10, 1, 1, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA))));
        @Config.Name("african_cheetah")
        public final SpawnSettings african_cheetah = new SpawnSettings(10, 1, 1, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SANDY), BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA))));
        @Config.Name("red_Billed_Tropicbird")
        public final SpawnSettings red_Billed_Tropicbird = new SpawnSettings(30, 1, 7, getBiomeIDS(mergeBiomes(getBiomesOfType(Type.OCEAN), getBiomesOfType(Type.BEACH))));
        @Config.Name("red_Billed_hornbill")
        public final SpawnSettings red_Billed_hornbill = new SpawnSettings(10, 1, 3, getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA)));
        @Config.Name("turaco")
        public final SpawnSettings turaco = new SpawnSettings(30, 1, 1, getBiomeIDS(mergeBiomes(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.JUNGLE), BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA))));
        @Config.Name("saddlebilled_stork")
        public final SpawnSettings saddlebilled_stork = new SpawnSettings(10, 1, 2, getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA)));
        @Config.Name("peregrine_falcon")
        public final SpawnSettings peregrine_falcon = new SpawnSettings(10, 1, 3, getBiomeIDS(mergeBiomes(getBiomesOfType(Type.MOUNTAIN), getBiomesOfType(Type.SPARSE))));
        @Config.Name("estuary_stingray")
        public final SpawnSettings estuary_stingray = new SpawnSettings(30, 1, 2, getBiomeIDS(getBiomesOfType(Type.RIVER)));
        @Config.Name("willow_ptarmigan")
        public final SpawnSettings willow_ptarmigan = new SpawnSettings(20, 1, 6, getBiomeIDS(mergeBiomes(getBiomesOfType(Type.MOUNTAIN), Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS)));
        @Config.Name("american_paddlefish")
        public final SpawnSettings american_paddlefish = new SpawnSettings(30, 1, 2, getBiomeIDS(mergeBiomes(getBiomesOfType(Type.SWAMP), getBiomesOfType(Type.RIVER))));
        @Config.Name("southern_ground_hornbill")
        public final SpawnSettings southern_ground_hornbill = new SpawnSettings(20, 1, 4, getBiomeIDS(BiomeDictionaryUtil.getBiomesFromTypes(Type.HOT, Type.SAVANNA)));
        @Config.Name("marmoset")
        public final SpawnSettings marmoset = new SpawnSettings(20, 1, 4, getBiomeIDS(getBiomesOfType(Type.JUNGLE)));
        @Config.Name("axolotl")
        public final SpawnSettings axolotl = new SpawnSettings(20, 1, 4, getBiomeIDS(getBiomesOfType(Type.RIVER)));
        @Config.Name("american_bison")
        public final SpawnSettings american_bison = new SpawnSettings(20, 1, 8, getBiomeIDS(getBiomesOfType(Type.PLAINS)));
        @Config.Name("barbary_partridge")
        public final SpawnSettings barbary_partridge = new SpawnSettings(10, 2, 12, getBiomeIDS(mergeBiomes(getBiomesOfType(Type.SAVANNA), BiomeDictionaryUtil.getBiomesFromTypes(Type.SANDY, Type.HOT))));
        @Config.Name("basilisk_lizard")
        public final SpawnSettings basilisk_lizard = new SpawnSettings(10, 1, 2, getBiomeIDS(getBiomesOfType(Type.JUNGLE)));
        @Config.Name("common_loon")
        public final SpawnSettings common_loon = new SpawnSettings(20, 2, 4, getBiomeIDS(mergeBiomes(getBiomesOfType(Type.RIVER), getBiomesOfType(Type.OCEAN), getBiomesOfType(Type.BEACH))));
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
