package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.Gender;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityOstrich extends ZAWABaseLand {
	
	  Random random = new Random();
	  public int boomingNum;
	  private boolean isThreatening=false;
	
	public EntityOstrich(World worldIn) {		
		super(worldIn, 0.20D);
		this.setSize(1F, 2F);
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
		return 1;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		long i = world.getWorldTime();
		
		boomingNum=random.nextInt(15) + 1;
		
		if((this.isChild()==false)) {
	    if(i>=3000) {
	    	if(i>=22000) {
	    		if(boomingNum==2) {
		    	    return SoundHandler.OSTRICH_BOOMING;
		    	}
		    	else {
		    		return null;
		    	}
	    	}
	    	else {
	    		return null;
	    	}
	    }
	    else {
	    	if(boomingNum==2) {
	    	    return SoundHandler.OSTRICH_BOOMING;
	    	}
	    	else {
	    		return null;
	    	}
	    }
		}
		else {
			return null;
		}
	}
	
	@Override
	public boolean sexualDimorphism()
	{
	  return true;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.InsectivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.bird_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.bird_vial, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.bird_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.bird_meat, 1);
		this.dropItem(ItemInit.OSTRICH_FEATHER, 1);
	}
	
	public boolean getThreatening() {
		return this.isThreatening;
    }

	
	@Override
	public void onLivingUpdate() {
		double distance2 = 7.0D;
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
	    
	    if (!isChild() && getGender()==Gender.MALE)
	    {
	      if (entityFound2 instanceof EntityPlayer) {
	        this.isThreatening = true;
	      }
	      else {
	        this.isThreatening = false;
	      }
	      if (this.isThreatening) {
	        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26D);
	      } else
	        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.24D);
	    }


		super.onLivingUpdate();
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityOstrich(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PROTECTIVE;
	}
}