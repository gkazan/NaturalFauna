package com.ikerleon.naturalfaunamod.init;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.NaturalFaunaMain;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	private static int id = 0;
	
	private static void register() {
		registerEntity();
	}

	private static void registerEntity() {
		
	}
	
	private static void createEntity(Class entityClass, String entityName) {
		EntityRegistry.registerModEntity(new ResourceLocation(NFReference.MOD_ID + ":" + entityName), entityClass, entityName, id++, NaturalFaunaMain.instance, 50, 1, true);
		NaturalFaunaMain.addAnimal(entityClass);
	}

}
