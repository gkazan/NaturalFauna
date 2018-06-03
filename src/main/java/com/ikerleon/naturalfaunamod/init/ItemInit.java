package com.ikerleon.naturalfaunamod.init;

import java.util.List;
import java.util.ArrayList;

import com.ikerleon.naturalfaunamod.init.items.ItemFeather;

import net.minecraft.item.Item;

public class ItemInit {
	  public static final List<Item> ITEMS = new ArrayList<Item>();

	  public static Item CAPERCAILLIE_FEATHER = new ItemFeather("feather_capercaillie");
	  public static Item AVOCET_FEATHER = new ItemFeather("feather_avocet");
	  public static Item COURSER_FEATHER = new ItemFeather("feather_courser");
	  public static Item KORIBUSTARD_FEATHER = new ItemFeather("feather_kori_bustard");
	  public static Item LITTLEBUSTARD_FEATHER = new ItemFeather("feather_little_bustard");
	  public static Item OSTRICH_FEATHER = new ItemFeather("feather_ostrich");
	  public static Item PUFFIN_FEATHER = new ItemFeather("feather_puffin");

}
