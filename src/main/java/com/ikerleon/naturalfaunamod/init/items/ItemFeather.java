package com.ikerleon.naturalfaunamod.init.items;

import com.ikerleon.naturalfaunamod.NaturalFaunaMain;
import com.ikerleon.naturalfaunamod.init.ItemInit;
import com.ikerleon.naturalfaunamod.util.IHasModel;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;

public class ItemFeather extends ItemRecord implements IHasModel
{
  public ItemFeather(String unloc, SoundEvent sound)
  {
	super(unloc, sound);
	maxStackSize=64;
    setUnlocalizedName(unloc);
    setRegistryName(unloc);
    setCreativeTab(NaturalFaunaMain.tabFeathers);
    
    ItemInit.ITEMS.add(this);
  }

  @Override
  public void registerModels() {
    NaturalFaunaMain.proxy.registerItemRenderer(this, 0, "inventory");;
  }
  
  public EnumRarity getRarity(ItemStack stack)
  {
      return EnumRarity.COMMON;
  }
}
