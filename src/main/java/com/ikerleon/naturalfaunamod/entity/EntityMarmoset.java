package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.land.EntityBlackSpiderMonkey;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityMarmoset extends EntityBlackSpiderMonkey{
	
	  public int standNum;
	  public int norNum;
	  private int chance = 600;
	  Random random = new Random();
	  Random random2 = new Random();
	  private EntityMarmoset.MarmosetState state;

	public EntityMarmoset(World worldIn) {
		super(worldIn);
		setSize(0.4F, 0.3F);
	}
	
	public int setVariants()
	{
	    return 3;
	}
	
    public enum MarmosetState
    {
      STANDING, NORMAL;
    	  
      private MarmosetState() {}
    }
    
    public void setStatus(EntityMarmoset.MarmosetState state) {
        this.state = state;
    }
    
    public EntityMarmoset.MarmosetState getStatus() {
        return this.state;
    }
    
    @Override
    public void onUpdate() {
    	
        if ((!this.inWater) && (this.onGround)) {
          if ((this.standNum != 2) || (this.norNum != 2)) {
            this.standNum = (this.random.nextInt(this.chance) + 1);
            this.norNum = (this.random.nextInt(this.chance) + 1);
          }
          else
          {
            this.standNum = (this.random.nextInt(this.chance) + 1);
            this.norNum = (this.random.nextInt(this.chance) + 1);
          }
          if ((this.standNum == 2))
          {
            setStatus(EntityMarmoset.MarmosetState.STANDING);
          }
          else if ((this.state == EntityMarmoset.MarmosetState.STANDING) && (this.norNum == 2))
          {
            setStatus(EntityMarmoset.MarmosetState.NORMAL);
          }
        }
        else {
          setStatus(EntityMarmoset.MarmosetState.NORMAL);
        }
        if(this.state==EntityMarmoset.MarmosetState.STANDING ) {
      	  this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
        }     
    	super.onUpdate();
    }
	
	@Override
	protected SoundEvent getAmbientSound() {
		return null;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
		return null;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return null;
	}
	
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(14.0D);
    }

	public ItemStack getPickedResult(RayTraceResult target)
	{
		ResourceLocation name = EntityList.getKey(this);
        if (name != null && EntityList.ENTITY_EGGS.containsKey(name))
        {
            ItemStack stack = new ItemStack(net.minecraft.init.Items.SPAWN_EGG);
            net.minecraft.item.ItemMonsterPlacer.applyEntityIdToItemStack(stack, name);
            return stack;
        }
        return ItemStack.EMPTY;
	}
	
	public EntityAgeable createChild(EntityAgeable ageable)
	{
	    return new EntityMarmoset(this.world);
	}
}
