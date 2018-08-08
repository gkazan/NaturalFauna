package com.ikerleon.naturalfaunamod.init.items;

import org.zawamod.init.items.ItemZAWAFood;

import com.ikerleon.naturalfaunamod.NaturalFaunaMain;
import com.ikerleon.naturalfaunamod.init.ItemInit;
import com.ikerleon.naturalfaunamod.util.IHasModel;

public class ItemNaturalFaunaFood extends ItemZAWAFood implements IHasModel{

	public ItemNaturalFaunaFood(int amount, float saturation, boolean isWolfFood, String unloc) {
		super(amount, saturation, isWolfFood, unloc);
		setCreativeTab(NaturalFaunaMain.tabItems);
	    ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
	    NaturalFaunaMain.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
