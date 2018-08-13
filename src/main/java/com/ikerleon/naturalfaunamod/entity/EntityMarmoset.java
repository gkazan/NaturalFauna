package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.land.EntityBlackSpiderMonkey;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityMarmoset extends EntityBlackSpiderMonkey{
	
	  public int standNum;
	  public int norNum;
	  private int chance = 1000;
	  Random random = new Random();
	  Random random2 = new Random();
	  private EntityMarmoset.MarmosetState state;
	  private boolean isStanding=false;

	public EntityMarmoset(World worldIn) {
		super(worldIn);
		setSize(0.4F, 0.3F);
	}
	
    public float getEyeHeight()
    {
        return this.height;
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
    
	public boolean getStanding() {
		return this.isStanding;
    }
    
	@Override
	public void onLivingUpdate() {
		double distance2 = 1.7D;
	    Entity entityFound2 = null;
	    
	    double d4 = -1.0D;
	    for (int i = 0; i < this.world.loadedEntityList.size(); i++)
	    {
	      Entity CuEnt = (Entity)this.world.loadedEntityList.get(i);
	        
	      if (((CuEnt instanceof Entity)) && (CuEnt != this)) {
	        double d5 = CuEnt.getDistanceSq(this.posX, this.posY, this.posZ);
	          
	        if (((distance2 < 0.0D) || (d5 < distance2 * distance2)) && ((d4 == -1.0D) || (d5 < d4)))
	        {
	          d4 = d5;
	          entityFound2 = CuEnt;
	        }
	      }
	    }
	    if (entityFound2 instanceof EntityPlayer) {
	      this.setStatus(EntityMarmoset.MarmosetState.STANDING);
	    }
	    else {
	    	this.setStatus(EntityMarmoset.MarmosetState.NORMAL);
	    }
	      
		super.onLivingUpdate();
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
