package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityBasiliskLizard extends ZAWABaseLand {
	
	boolean waterPose;
	
	public EntityBasiliskLizard(World worldIn) {		
		super(worldIn);
		this.setSize(0.6F, 0.3F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.5D));

	}

    public float getEyeHeight()
    {
        return this.height;
    }
	
	@Override
	public int setVariants() {
		return 3;
	}
	
	@Override
	public void onEntityUpdate() {
		BlockPos pos = new BlockPos(this);
		
		if (this.inWater) {
		    this.motionY=0;
		}
		
		if (this.world.getBlockState(pos.down()).getMaterial() == Material.WATER) {
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.32D);
			this.waterPose=true;
		}
		else {
			this.waterPose=false;
		}
		super.onEntityUpdate();
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.InsectivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.FROG_KIBBLE, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.FROG_VIAL, 1);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26D);
	}
    
    @Override
    protected void doWaterSplashEffect() {
    }
    
    @Override
    protected SoundEvent getSplashSound() {
    	return null;
    }

	@Override
	public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.COOKED_FROG_LEG, 1);
		else
			this.dropItem(ZAWAItems.RAW_FROG_LEG, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityBasiliskLizard(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}