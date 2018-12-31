package com.ikerleon.naturalfaunamod.configuration;

import com.ikerleon.naturalfaunamod.NFReference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = NFReference.MOD_ID)
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
        public final SpawnSettings atlantic_puffin = new SpawnSettings(70, 1, 10);
        @Config.Name("cream_coloured_courser")
        public final SpawnSettings cream_coloured_courser = new SpawnSettings(60, 1, 6);
        @Config.Name("avocet")
        public final SpawnSettings avocet = new SpawnSettings(90, 1, 9);
        @Config.Name("camel")
        public final SpawnSettings camel = new SpawnSettings(50, 1, 5);
        @Config.Name("spotted_hyena")
        public final SpawnSettings spotted_hyena = new SpawnSettings(50, 1, 7);
        @Config.Name("cantabric_capercaillie")
        public final SpawnSettings cantabric_capercaillie = new SpawnSettings(40, 1, 6);
        @Config.Name("grants_gazelle")
        public final SpawnSettings grants_gazelle = new SpawnSettings(50, 1, 8);
        @Config.Name("nautilus")
        public final SpawnSettings nautilus = new SpawnSettings(60, 1, 3);
        @Config.Name("puma")
        public final SpawnSettings puma = new SpawnSettings(50, 1, 1);
        @Config.Name("blue_gnu")
        public final SpawnSettings blue_gnu = new SpawnSettings(50, 1, 7);
        @Config.Name("kori_bustard")
        public final SpawnSettings kori_bustard = new SpawnSettings(40, 1, 1);
        @Config.Name("common_ostrich")
        public final SpawnSettings common_ostrich = new SpawnSettings(50, 1, 4);
        @Config.Name("european_roe_deer")
        public final SpawnSettings european_roe_deer = new SpawnSettings(70, 1, 3);
        @Config.Name("xenopus_frog")
        public final SpawnSettings xenopus_frog = new SpawnSettings(60, 1, 2);
        @Config.Name("cape_bushbuck")
        public final SpawnSettings cape_bushbuck = new SpawnSettings(50, 1, 1);
        @Config.Name("african_cheetah")
        public final SpawnSettings african_cheetah = new SpawnSettings(50, 1, 1);
        @Config.Name("red_Billed_Tropicbird")
        public final SpawnSettings red_Billed_Tropicbird = new SpawnSettings(70, 1, 7);
        @Config.Name("red_Billed_hornbill")
        public final SpawnSettings red_Billed_hornbill = new SpawnSettings(50, 1, 3);
        @Config.Name("turaco")
        public final SpawnSettings turaco = new SpawnSettings(70, 1, 1);
        @Config.Name("saddlebilled_stork")
        public final SpawnSettings saddlebilled_stork = new SpawnSettings(50, 1, 2);
        @Config.Name("peregrine_falcon")
        public final SpawnSettings peregrine_falcon = new SpawnSettings(50, 1, 3);
        @Config.Name("estuary_stingray")
        public final SpawnSettings estuary_stingray = new SpawnSettings(60, 1, 2);
        @Config.Name("willow_ptarmigan")
        public final SpawnSettings willow_ptarmigan = new SpawnSettings(60, 1, 6);
        @Config.Name("american_paddlefish")
        public final SpawnSettings american_paddlefish = new SpawnSettings(60, 1, 2);
        @Config.Name("southern_ground_hornbill")
        public final SpawnSettings southern_ground_hornbill = new SpawnSettings(60, 1, 4);
        @Config.Name("marmoset")
        public final SpawnSettings marmoset = new SpawnSettings(60, 1, 4);
        @Config.Name("axolotl")
        public final SpawnSettings axolotl = new SpawnSettings(60, 1, 4);
        @Config.Name("american_bison")
        public final SpawnSettings american_bison = new SpawnSettings(60, 1, 8);
        @Config.Name("barbary_partridge")
        public final SpawnSettings barbary_partridge = new SpawnSettings(50, 2, 12);
    }

    public static class SpawnSettings {
        @Config.Name("Spawn Chance")
        public int spawnChance;
        @Config.Name("Min Group")
        public int minGroup;
        @Config.Name("Max Group")
        public int maxGroup;

        SpawnSettings(int spawnChance, int minGroup, int maxGroup) {
            this.spawnChance = spawnChance;
            this.minGroup = minGroup;
            this.maxGroup = maxGroup;
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
