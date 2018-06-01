package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.water.EntityFishBase;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityXenopus extends EntityFishBase {
	
	public EntityXenopus(World worldIn)	
		{
			  super(worldIn, false);
			  setSize(0.3F, 0.3F);
			}

			protected void applyEntityAttributes()
			{
			  super.applyEntityAttributes();
			  getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.05D);
			  getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
			}

			public EntityAgeable createChild(EntityAgeable ageable) {
			  return null;
			}

			public boolean hopToWater()
			{
			  return false;
			}
}