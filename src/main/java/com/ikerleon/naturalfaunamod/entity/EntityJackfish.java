package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.water.EntityFishBase;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityJackfish
extends EntityFishBase
{
public EntityJackfish(World worldIn)
{
  super(worldIn, false);
  setSize(0.4F, 0.4F);
}

protected void applyEntityAttributes()
{
  super.applyEntityAttributes();
  getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26D);
  getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3.0D);
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
  return null;
}

public boolean hopToWater()
{
  return true;
}
}
