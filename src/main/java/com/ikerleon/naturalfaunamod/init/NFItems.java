package com.ikerleon.naturalfaunamod.init;

import org.zawamod.init.items.ItemSpawnEggZAWA;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class NFItems {
	
	public static final Item puffin_egg = new ItemSpawnEggZAWA("atlantic_puffin", null);

	public static void registerRenders()  {
	      ModelLoader.setCustomModelResourceLocation(NFItems.puffin_egg, 0, new ModelResourceLocation(NFItems.puffin_egg.getRegistryName(), "inventory"));
	}
	  

}
