package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityPuma extends ZAWABaseLand {
	
	public EntityPuma(World worldIn) {		
		super(worldIn, 0.28D);
		this.setSize(1.6F, 1.3F);
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
		return 2;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.CarnivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.big_cat_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.bigcat_vial, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.carnivore_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.carnivore_meat_raw, 1);
		this.dropItem(ZAWAItems.thick_fur, 1);
		this.dropItem(ItemInit.CARNIVORE_TOOTH, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityPuma(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.AGGRESSIVE;
	}
}
