package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.water.EntityPacificWalrus;
import org.zawamod.init.ZAWAItems;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityGreySeal extends EntityPacificWalrus {
	
	public EntityGreySeal(World worldIn) {		
		super(worldIn);
		this.setSize(1.5F, 0.6F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.28D));
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
	
	@Override
	public int setVariants() {
		return 1;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.PescatarianItems(stack);
	}
	
	public boolean hopToWater()
	  {
	    return false;
	  }
	
	public boolean isLandBreather()
	  {
	    return true;
	  }
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.pinniped_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.pinniped_vial, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.18D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
			this.dropItem(ZAWAItems.blubber, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGreySeal(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.NEUTRAL;
	}
}