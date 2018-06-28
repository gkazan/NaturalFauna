package com.ikerleon.naturalfaunamod.init.items;

import com.ikerleon.naturalfaunamod.NaturalFaunaMain;
import com.ikerleon.naturalfaunamod.init.ItemInit;
import com.ikerleon.naturalfaunamod.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ItemDagger extends ItemSword implements IHasModel
{
  public ItemDagger(String unloc)
  {
	super(ToolMaterial.STONE);
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