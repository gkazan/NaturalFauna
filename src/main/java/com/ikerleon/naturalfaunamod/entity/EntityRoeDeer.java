package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.Gender;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityRoeDeer extends ZAWABaseLand {
	
	private World world;
	
	public EntityRoeDeer(World worldIn) {		
		super(worldIn);
		this.setSize(1.4F, 1.2F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.28D));
        
        this.world=worldIn;
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
	
	@Override
	public int setVariants() {
		return 2;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		long i = world.getWorldTime();
		if(this.isChild()==false) {
	    if((i>6000)) {
            if(i>=14000) {
            	return SoundHandler.ROE_DEER_LIVING;
            }
            else {
            	return null;
            }
	    }	    
	    else {
	    	return SoundHandler.ROE_DEER_LIVING;
	    }
		}
		else {
			return null;
		}
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource s)
	{
	    return SoundHandler.ROE_DEER_HURT;
	}
	
	@Override
	public boolean sexualDimorphism()
	{
	  return true;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.HerbivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.UNGULATE_KIBBLE, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.UNGULATE_VIAL, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
	}

	@Override
	public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.LARGE_MEAT_COOKED, 1);
		else
			this.dropItem(ZAWAItems.LARGE_MEAT_RAW, 1);
		if(this.getGender()==Gender.MALE) {
			this.dropItem(ItemInit.HORN, 1);
		}
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityRoeDeer(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.NEUTRAL;
	}
}