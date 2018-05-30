package com.ikerleon.naturalfaunamod.init;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.NaturalFaunaMain;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityBarbaryLion;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityGreySeal;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;
import com.ikerleon.naturalfaunamod.entity.EntityLeopard;
import com.ikerleon.naturalfaunamod.entity.EntityLittleBustard;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

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
		createEntity(EntityGreySeal.class, "grey_seal", 11382189, 5658198);
		createEntity(EntityHyena.class, "spotted_hyena", 10191180, 11038720);
		createEntity(EntityCantabricCapercaillie.class, "cantabric_capercaillie", 0, 15534345);
		createEntity(EntityLittleBustard.class, "little_bustard", 11900255, 16777215);
		createEntity(EntityLeopard.class, "leopard", 13215598, 3481856);
		createEntity(EntityBarbaryLion.class, "barbary_lion", 14072706, 6307848);
	}
	
	private static void createEntity(Class entityClass , String entityName, int Color1,int Color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(NFReference.MOD_ID + ":" + entityName), entityClass, entityName, id++, NaturalFaunaMain.instance, 50, 1, true, Color1, Color2);
		NaturalFaunaMain.addAnimal(entityClass);
	}

}
