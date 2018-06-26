package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.ai.EntityAIAttackEnts;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.land.EntityAmurLeopard;
import org.zawamod.entity.land.EntityMeerkat;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.Gender;
import org.zawamod.init.ZAWAItems;

import com.google.common.base.Predicate;
import com.ikerleon.naturalfaunamod.handlers.SoundHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityHyena extends EntityAmurLeopard {
	
	  private World world;
	
	public EntityHyena(World worldIn) {		
		super(worldIn);
		this.targetTasks.addTask(4, new EntityAIAttackEnts(this, EntityLiving.class, false, new EntityHyenaAttack(this)));
        this.world=worldIn;
	}
	
	public class EntityHyenaAttack
	  implements Predicate
	  {
		EntityHyenaAttack(EntityHyena this$0) {}
	    
	    public boolean func_180094_a(Entity e)
	    {
	      return ((e instanceof EntityGrantsGazelle)) || ((e instanceof EntityMeerkat)) ||  ((e instanceof EntityCow)) || ((e instanceof EntityPig)) || ((e instanceof EntitySheep)) || ((e instanceof EntityChicken)) || ((e instanceof EntityPig));
	    }
	    
	    public boolean apply(Object o) {
	      return func_180094_a((Entity)o);
	    }
	  }
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
	
	@Override
	public int setVariants() {
		return 5;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		long i = world.getWorldTime();
		
	    if((i>=14000)) {
	    	return SoundHandler.HYENA_LIVING;
	    }
	    else {
	    	return null;
	    }
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource s)
	{
	    return SoundHandler.HYENA_HURT;
	}
	
	@Override
    protected SoundEvent getDeathSound()
    {
        return SoundHandler.HYENA_DEATH;
    }
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.CarnivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.canine_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.canine_vial, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.carnivore_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.carnivore_meat_raw, 1);
		this.dropItem(ZAWAItems.thick_fur, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityHyena(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.AGGRESSIVE;
	}
}