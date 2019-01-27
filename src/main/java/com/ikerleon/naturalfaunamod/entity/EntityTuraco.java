package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseFlying;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityTuraco extends ZAWABaseFlying {
	
	  private int standNum;
	  private int livingNum;
	
	public EntityTuraco(World worldIn) {		
		super(worldIn);
		this.setSize(0.5F, 0.9F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.26D));
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
	
	@Override
	public int setVariants() {
		return 3;
	}
	
	public int setFlyTicks()
	{
	    return 15;
	}
	
	public boolean hasValidSit()
	{
	    return true;
	}

	
	@Override
	protected SoundEvent getAmbientSound()
	{
	    livingNum=rand.nextInt(2)+1;
	    
	    if(this.onGround) {
	    	if(livingNum==1) {
		    	return SoundHandler.TURACO_LIVING;
		    }
		    else {
		    	return SoundHandler.TURACO_LIVING2;
		    }
	    }
	    else {
	    	return SoundHandler.TURACO_FLYING;
	    }
	}	
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.LeafEaterItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.BIRD_KIBBLE, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.BIRD_VIAL, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26D);
	}
	
	@Override
	public void onLivingUpdate() {
		this.standNum=rand.nextInt(45);
  		
		super.onLivingUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.playSound(SoundHandler.TURACO_FLYING, 1, 1);
		return super.attackEntityFrom(source, amount);
	}

	@Override
	public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.BIRD_MEAT_COOKED, 1);
		else
			this.dropItem(ZAWAItems.BIRD_MEAT, 1);
		if(this.getAnimalType()==0) {
		    this.dropItem(ItemInit.REDCRESTEDTURACO_FEATHER, 1);
		}
		else if(this.getAnimalType()==1) {
		    this.dropItem(ItemInit.VIOLETTURACO_FEATHER, 1);
		}
		if(this.getAnimalType()==2) {
		    this.dropItem(ItemInit.GREATBLUETURACO_FEATHER, 1);
		}
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityTuraco(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}

	@Override
	public Item getLaidEgg() {
		return null;
	}
}
