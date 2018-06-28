package com.ikerleon.naturalfaunamod.init;

import java.util.ArrayList;
import java.util.List;

import com.ikerleon.naturalfaunamod.init.items.ItemDagger;
import com.ikerleon.naturalfaunamod.init.items.ItemFeather;
import com.ikerleon.naturalfaunamod.init.items.ItemNaturalFauna;

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
	  public static Item HORN_DAGGER = new ItemDagger("dagger_horn");
	  public static Item TOOTH_DAGGER = new ItemDagger("dagger_tooth");
	  public static Item CARNIVORE_TOOTH = new ItemNaturalFauna("tooth_carnivore");
	  public static Item HORN = new ItemNaturalFauna("horn");
	  public static Item CHEETAH_FUR = new ItemNaturalFauna("fur_cheetah");
	  public static Item GNU_HIDE = new ItemNaturalFauna("hide_gnu");
	  public static Item HYENA_FUR = new ItemNaturalFauna("fur_hyena");
	  public static Item GAZELLE_HIDE = new ItemNaturalFauna("hide_gazelle");
}
