package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseWater;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.init.ZAWAItems;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityEstuaryStingray extends ZAWABaseWater {
	
	public EntityEstuaryStingray(World worldIn)	
	{
		super(worldIn, false);
		setSize(0.6F, 0.2F);
	}

	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.01D);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
    }

	protected void dropFewItems(boolean b, int i)
	{
		if (isBurning()) {
			 dropItem(Items.COOKED_FISH, 1);
		} else {
			 dropItem(Items.FISH, 1);
		}
	}
	
	public EntityAgeable createChild(EntityAgeable ageable) {
	    return new EntityEstuaryStingray(this.world);
	}

	public boolean hopToWater()
	{
	    return false;
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.NEUTRAL;
	}

	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.tortoise_kibble, 1);
	}

	@Override
	public int setVariants() {
		return 1;
	}
	
	public float rotation = this.renderYawOffset;
	  
	  public void onLivingUpdate()
	  {
	    this.rotation = this.renderYawOffset;
	    
	    super.onLivingUpdate();
	  }

	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.tortoise_vial, 1);
	}
}