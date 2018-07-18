package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseFlying;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.init.ZAWAItems;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityPeregrineFalcon extends ZAWABaseFlying{

	public EntityPeregrineFalcon(World worldIn) {		
		super(worldIn);
		this.setSize(0.75F, 0.5F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.20D));
        this.tasks.addTask(0, new EntityAILookIdle(this));
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
	    return 200;
	}
	
	/*@Override
	protected SoundEvent getAmbientSound()
	{
	    if(!this.onGround && !this.isInWater()) {
	    	return SoundHandler.TROPICBIRD_FLYING;
	    }
	    else {
	    	return null;
	    }
	}*/
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.CarnivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.raptor_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.raptor_vial, 1);
	}
	
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.stand=true;
		return super.attackEntityFrom(source, amount);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(14.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.18D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning()) {
			this.dropItem(ZAWAItems.bird_meat_cooked, 1);
		}
		else {
			this.dropItem(ZAWAItems.bird_meat, 1);
		}	    
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityPeregrineFalcon(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.NEUTRAL;
	}
}

