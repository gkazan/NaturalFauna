package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.base.ZAWABaseFlying;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

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

public class EntitySaddlebillStork extends ZAWABaseFlying {
	
	  public int sitNum;
	  public int norNum;
	  private int chance = 10000;
	  private World world;
	  private int standNum;
	  Random random = new Random();
	  Random random2 = new Random();
	  private EntitySaddlebillStork.SaddlebillStorkState state;

	public EntitySaddlebillStork(World worldIn) {		
		super(worldIn);
		this.setSize(0.7F, 1.4F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.world=worldIn;
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.bird_kibble, 1);
	}
	
	@Override
	public boolean sexualDimorphism()
	{
	  return true;
	}

	@Override
	protected SoundEvent getAmbientSound()
	{
		return null;
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.bird_vial, 1);
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
    
	public int setFlyTicks()
	{
	    return 3;
	}

    public enum SaddlebillStorkState
    {
      SIT, NORMAL;
    	  
      private SaddlebillStorkState() {}
    }
    
    public void setStatus(EntitySaddlebillStork.SaddlebillStorkState state) {
        this.state = state;
    }
    
    public EntitySaddlebillStork.SaddlebillStorkState getStatus() {
        return this.state;
    } 
    
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
	}
    
    @Override
    public void onLivingUpdate()
    {
    	long i = world.getWorldTime();
    	
      if ((!this.inWater) && (this.onGround) && (this.isChild()==false) && !(i>=14000 || i<=1000)) {
        if ((this.sitNum != 2) || (this.norNum != 2)) {
          this.sitNum = (this.random.nextInt(this.chance) + 1);
          this.norNum = (this.random.nextInt(this.chance) + 1);
        }
        else
        {
          this.sitNum = (this.random.nextInt(this.chance) + 1);
          this.norNum = (this.random.nextInt(this.chance) + 1);
        }
        if ((this.sitNum == 2))
        {
          setStatus(EntitySaddlebillStork.SaddlebillStorkState.SIT);
        }
        else if ((this.state == EntitySaddlebillStork.SaddlebillStorkState.SIT) && norNum==2)
        {
          setStatus(EntitySaddlebillStork.SaddlebillStorkState.NORMAL);
        }
      }
      else if(i>=14000 || i<=1000){
        setStatus(EntitySaddlebillStork.SaddlebillStorkState.SIT);
      }
      else {
    	  setStatus(EntitySaddlebillStork.SaddlebillStorkState.NORMAL);  
      }
      if(this.state==EntitySaddlebillStork.SaddlebillStorkState.SIT) {
    	  this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
      }
    	  
     this.standNum=rand.nextInt(55);
  		
     if(this.stand && this.standNum==2) {
  		this.stand=false;
     }
     super.onLivingUpdate();
     
     }
    
    @Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.stand=true;
		return super.attackEntityFrom(source, amount);
	}
    
	@Override
	public int setVariants() {
		return 1;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.OmnivoreItems(stack);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.bird_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.bird_meat, 1);
		this.dropItem(ItemInit.SADDLEBILLEDSTORK_FEATHER, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntitySaddlebillStork(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}