package com.ikerleon.naturalfaunamod.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.Gender;
import org.zawamod.init.ZAWAItems;

import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCantabricCapercaillie extends ZAWABaseLand {
	
	  public int celoNum;
	  public int norNum;
	  public int femalecallNum;
	  public int lekNum=1;
	  private int chance = 700;
	  private World world;
	  Random random = new Random();
	  Random random2 = new Random();
	  private EntityCantabricCapercaillie.CantabricCapercaillieState state;

	public EntityCantabricCapercaillie(World worldIn) {		
		super(worldIn, 0.20F);
		this.setSize(0.7F, 0.7F);
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
		long i = world.getWorldTime();
		
		femalecallNum=random2.nextInt(20) + 1;
		
	    if((i>=14000)&&(this.getGender()==Gender.FEMALE)) {
	    	if(femalecallNum==2) {
	    	    return SoundHandler.CAPERCAILLIE_FEMALE_LIVING;
	    	}
	    	else {
		    	return null;
		    }
	    }
	    else {
	    	return null;
	    }
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.bird_vial, 1);
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }

    public enum CantabricCapercaillieState
    {
      CELO, NORMAL;
    	  
      private CantabricCapercaillieState() {}
    }
    
    public void setStatus(EntityCantabricCapercaillie.CantabricCapercaillieState state) {
        this.state = state;
    }
    
    public EntityCantabricCapercaillie.CantabricCapercaillieState getStatus() {
        return this.state;
      } 
    
    Timer lekTimer = new Timer (8500, new ActionListener () 
    { 
        public void actionPerformed(ActionEvent e) 
        { 
            lekNum=1;
         } 
    });
    
    @Override
    public void onLivingUpdate()
    {
    	long i = world.getWorldTime();
    	
      if ((!this.inWater) && (this.onGround) && (this.getGender()==Gender.MALE) && (this.isChild()==false)) {
        if ((this.celoNum != 2) || (this.norNum != 2)) {
          this.celoNum = (this.random.nextInt(this.chance) + 1);
          this.norNum = (this.random.nextInt(this.chance) + 1);
        }
        else
        {
          this.celoNum = (this.random.nextInt(this.chance) + 1);
          this.norNum = (this.random.nextInt(this.chance) + 1);
        }
        if ((this.celoNum == 2) && (i >= 14000))
        {
          setStatus(EntityCantabricCapercaillie.CantabricCapercaillieState.CELO);
        }
        else if ((this.state == EntityCantabricCapercaillie.CantabricCapercaillieState.CELO) && (this.norNum == 2) || (i < 14000))
        {
          setStatus(EntityCantabricCapercaillie.CantabricCapercaillieState.NORMAL);
        }
      }
      else {
        setStatus(EntityCantabricCapercaillie.CantabricCapercaillieState.NORMAL);
        this.lekNum=1;
      }
      if(this.state==EntityCantabricCapercaillie.CantabricCapercaillieState.CELO ) {
    	  this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.12D);

    	  if(lekNum==1) {
    		  this.playSound(SoundHandler.CAPERCAILLIE_LEKKING, 1.0F, 1.0F);
    		  lekNum=0;
    		  lekTimer.start();
    	  }
      }
      super.onLivingUpdate();;  
     }
    
	@Override
	public int setVariants() {
		return 1;
	}
	
    public boolean avoidShadows() {
    	if(this.state==EntityCantabricCapercaillie.CantabricCapercaillieState.CELO ) {
    		return true;
    	}
    	else {
    		return true;
    	}
    }

	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.LeafEaterItems(stack);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.bird_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.bird_meat, 1);
		if(this.getGender()==Gender.MALE) {
			this.dropItem(ItemInit.MALE_CAPERCAILLIE_FEATHER, 1);
		}
		else {
			this.dropItem(ItemInit.FEMALE_CAPERCAILLIE_FEATHER, 1);
		}
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityCantabricCapercaillie(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}