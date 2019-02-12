package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.ai.EntityAIAttackEnts;
import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import com.google.common.base.Predicate;
import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityPuma extends ZAWABaseLand{
	
	public EntityPuma(World worldIn) {		
		super(worldIn);
		this.setSize(1.6F, 1.3F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.28D));
        this.targetTasks.addTask(4, new EntityAIAttackEnts(this, EntityLiving.class, false, new EntityPumaAttack(this)));
	}
	
	public class EntityPumaAttack
	  implements Predicate
	  {
		EntityPumaAttack(EntityPuma this$0) {}
	    
	    public boolean func_180094_a(Entity e)
	    {
	      return ((e instanceof EntityWillowPtarmigan)) || ((e instanceof EntityRoeDeer)) ||  ((e instanceof EntityCow)) || ((e instanceof EntityPig)) || ((e instanceof EntitySheep)) || ((e instanceof EntityChicken)) || ((e instanceof EntityPig));
	    }
	    
	    public boolean apply(Object o) {
	      return func_180094_a((Entity)o);
	    }
	  }
	
	public boolean attackEntityAsMob(Entity e)
	  {
	    this.world.setEntityState(this, (byte)4);
	    onAttack();
	    return e.attackEntityFrom(DamageSource.causeMobDamage(this), 7.0F);
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
	protected SoundEvent getHurtSound(DamageSource s)
	{
	    return SoundHandler.PUMA_HURT;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.CarnivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.BIG_CAT_KIBBLE, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.BIG_CAT_KIBBLE, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(19.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
	}

	@Override
	public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.CARNIVORE_MEAT_COOKED, 1);
		else
			this.dropItem(ZAWAItems.CARNIVORE_MEAT_RAW, 1);
		this.dropItem(ZAWAItems.THICK_FUR, 1);
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
