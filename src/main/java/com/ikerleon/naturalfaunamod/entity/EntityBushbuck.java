package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.Gender;
import org.zawamod.entity.land.EntityAfricanLion;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityBushbuck extends ZAWABaseLand {
	
	public EntityBushbuck(World worldIn) {		
		super(worldIn, 0.28D);
		this.setSize(1F, 1.3F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.28D));
        this.tasks.addTask(4, new ZAWABaseLand.AIAvoidEntity(this, EntityAfricanLion.class, 10.0F, 2.2D, 2.2D));
        this.tasks.addTask(4, new ZAWABaseLand.AIAvoidEntity(this, EntityHyena.class, 10.0F, 2.2D, 2.2D));
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
		return new ItemStack(ZAWAItems.unglate_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.unglate_vial, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.large_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.large_meat_raw, 1);
		if(this.getGender()==Gender.MALE) {
			this.dropItem(ItemInit.HORN, 1);
		}
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityBushbuck(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}
