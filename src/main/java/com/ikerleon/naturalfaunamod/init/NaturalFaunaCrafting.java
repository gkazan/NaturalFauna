package com.ikerleon.naturalfaunamod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NaturalFaunaCrafting {

	public static void Init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemInit.STINGRAY_MEAT_RAW, 1), new ItemStack(ItemInit.STINGRAY_MEAT_COOKED, 1), 4.0F);	
	}

}
