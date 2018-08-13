package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.base.ZAWABaseFlying;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityGroundHornbill extends ZAWABaseFlying {
	
	  private int standNum;
	  Random random = new Random();

	public EntityGroundHornbill(World worldIn) {		
		super(worldIn);
		this.setSize(0.5F, 1F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAILookIdle(this));
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.bird_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.bird_vial, 1);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundHandler.GROUNDHORNBILL_LIVING;
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
    
	public int setFlyTicks()
	{
	    return 4;
	}
    
    @Override
    public void onLivingUpdate()
    { 	  
     this.standNum=rand.nextInt(75);
  		
     if(this.stand && this.standNum==2) {
  		this.stand=false;
     }
     super.onLivingUpdate();
     
     }
    
    @Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.stand=true;
		if(!this.isChild()) {
		}
		return super.attackEntityFrom(source, amount);
	}
    
	@Override
	public int setVariants() {
		return 1;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.LeafEaterItems(stack);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(13.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.16D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.bird_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.bird_meat, 1);
		this.dropItem(ItemInit.GROUND_HORNBILL_FEATHER, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityGroundHornbill(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}