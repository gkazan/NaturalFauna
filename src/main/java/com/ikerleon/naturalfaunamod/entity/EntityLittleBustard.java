package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.Gender;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityLittleBustard extends ZAWABaseLand {
	
	private World world;
	
	public EntityLittleBustard(World worldIn) {		
		super(worldIn, 0.20D);
		this.setSize(0.5F, 1.0F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.20D));
        this.tasks.addTask(0, new EntityAILookIdle(this));
        
        this.world=worldIn;
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
    
	@Override
	public boolean sexualDimorphism()
	{
	  return true;
	}
	
	@Override
	public int setVariants() {
		return 1;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		long i = world.getWorldTime();
		if((this.getGender()==Gender.MALE)&&(this.isChild()==false)) {
	    if(i>=6000) {
	    	if(i>=23000) {
	    	return SoundHandler.LITTLE_BUSTARD_SONG;
	    	}
	    	else {
	    		return null;
	    	}
	    }
	    else {
	    	return SoundHandler.LITTLE_BUSTARD_SONG;
	    }
		}
		else {
			return null;
		}
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.InsectivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.bird_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.bird_vial, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.bird_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.bird_meat, 1);
		this.dropItem(ItemInit.LITTLEBUSTARD_FEATHER, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityLittleBustard(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}