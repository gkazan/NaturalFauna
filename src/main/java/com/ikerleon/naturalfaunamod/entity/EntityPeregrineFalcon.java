package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.ai.EntityAIAttackEnts;
import org.zawamod.entity.base.ZAWABaseFlying;
import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.base.ZAWABaseLand.AIFight;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import com.google.common.base.Predicate;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityPeregrineFalcon extends ZAWABaseFlying{
	
	protected ZAWABaseLand.AIFight FightAI = new ZAWABaseLand.AIFight();
	
	public EntityPeregrineFalcon(World worldIn) {		
		super(worldIn);
		this.targetTasks.addTask(4, new EntityAIAttackEnts(this, EntityLiving.class, false, new EntityPeregrineFalconAttack(this)));
	    this.tasks.addTask(1, this.FightAI);
	}
	
	public class EntityPeregrineFalconAttack
	  implements Predicate
	  {
		EntityPeregrineFalconAttack(EntityPeregrineFalcon this$0) {}
	    
	    public boolean func_180094_a(Entity e)
	    {
	      return ((e instanceof EntityWillowPtarmigan)) || ((e instanceof EntityRedBilledTropicbird)) ||  ((e instanceof EntityTuraco));
	    }
	    
	    public boolean apply(Object o) {
	      return func_180094_a((Entity)o);
	    }
	  }
	
	@Override
	public boolean attackEntityAsMob(Entity p_70652_1_)
	{
	    this.world.setEntityState(this, (byte)4);
	    return p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), 7.0F);
	}
	
	@Override
	public int setVariants() {
		return 3;
	}
	
	public int setFlyTicks()
	{
	    return 200;
	}

	@Override
	protected SoundEvent getAmbientSound()
	{
	    if(!this.onGround && !this.isInWater()) {
	    	return SoundHandler.FALCON_FLYING;
	    }
	    else {
	    	return null;
	    }
	}
	
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
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.stand=true;
		if(!this.isChild()) {
			this.playSound(SoundHandler.FALCON_HURT, 1, 1);
		}
		return super.attackEntityFrom(source, amount);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(14.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.15D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning()) {
			this.dropItem(ZAWAItems.bird_meat_cooked, 1);
		}
		else {
			this.dropItem(ZAWAItems.bird_meat, 1);
			this.dropItem(ItemInit.FALCON_FEATHER, 1);
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

