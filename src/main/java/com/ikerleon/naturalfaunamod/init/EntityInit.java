package com.ikerleon.naturalfaunamod.init;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.NaturalFaunaMain;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityBlueGnu;
import com.ikerleon.naturalfaunamod.entity.EntityBushbuck;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCheetah;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityEstuaryStingray;
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

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	private static int id = 0;
	
	public static void register() {
		registerEntity();
	}

	private static void registerEntity() {
		createEntity(EntityPuffin.class, "atlantic_puffin", 0, 16739840);
		createEntity(EntityCourser.class, "cream-coloured_courser",16764783, 2241888);
		createEntity(EntityAvocet.class, "avocet", 16777215, 0);
		createEntity(EntityCamel.class, "camel", 11701829, 6504960);
		createEntity(EntityHyena.class, "spotted_hyena", 10191180, 11038720);
		createEntity(EntityCantabricCapercaillie.class, "cantabric_capercaillie", 0, 15534345);
		createEntity(EntityGrantsGazelle.class, "grants_gazelle", 16767134, 16771012);
		createEntity(EntityNautilus.class, "nautilus", 14840691, 16777215);
		createEntity(EntityPuma.class, "puma", 13870196, 16378843);
		createEntity(EntityBlueGnu.class, "blue_gnu", 4145750, 15916216);
		createEntity(EntityKoriBustard.class, "kori_bustard", 14074788, 3158063);
		createEntity(EntityOstrich.class, "common_ostrich", 0, 16777215);
		createEntity(EntityRoeDeer.class, "european_roe_deer", 7024896, 9858120);
		createEntity(EntityXenopus.class, "xenopus_frog", 16375134, 16773032);
		createEntity(EntityBushbuck.class, "cape_bushbuck", 7356945, 8347969);
		createEntity(EntityCheetah.class, "african_cheetah", 16769440, 2959648);
		createEntity(EntityRedBilledTropicbird.class, "red_Billed_Tropicbird", 16777215, 5197391);
		createEntity(EntityRedBilledHornbill.class, "red_Billed_hornbill", 14208687, 14854656);
		createEntity(EntityTuraco.class, "turaco", 4362558, 4946595);
		createEntity(EntitySaddlebillStork.class, "saddlebilled_stork", 0, 16375134);
		createEntity(EntityPeregrineFalcon.class, "peregrine_falcon", 6711144, 15723587);
		createEntity(EntityEstuaryStingray.class, "estuary_stingray", 8676357, 10713600);
		createEntity(EntityWillowPtarmigan.class, "willow_ptarmigan", 16382457, 9315602);
	}
	
	private static void createEntity(Class entityClass , String entityName, int Color1,int Color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(NFReference.MOD_ID + ":" + entityName), entityClass, entityName, id++, NaturalFaunaMain.instance, 50, 1, true, Color1, Color2);
		NaturalFaunaMain.addAnimal(entityClass);
	}

}
