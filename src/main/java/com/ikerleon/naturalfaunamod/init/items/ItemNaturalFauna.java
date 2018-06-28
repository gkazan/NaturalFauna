package com.ikerleon.naturalfaunamod.init.items;

import com.ikerleon.naturalfaunamod.NaturalFaunaMain;
import com.ikerleon.naturalfaunamod.init.ItemInit;
import com.ikerleon.naturalfaunamod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemNaturalFauna extends Item implements IHasModel
{
  public ItemNaturalFauna(String unloc)
  {
    setUnlocalizedName(unloc);
    setRegistryName(unloc);
    setCreativeTab(NaturalFaunaMain.tabItems);
    
    ItemInit.ITEMS.add(this);
  }

  @Override
  public void registerModels() {
    NaturalFaunaMain.proxy.registerItemRenderer(this, 0, "inventory");;
  }
}