package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityBison extends ZAWABaseLand {
	
	  private int playFightCooldown = 0;
	  private int playFightDuration = 0;
	  private int lastJump = 0;
	  protected EntityBison target = null;
	
	public EntityBison(World worldIn) {		
		super(worldIn, 0.26f);
		this.setSize(2.5F, 2.2F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
    
    protected void initEntityAI()
    {
      super.initEntityAI();
      this.tasks.addTask(0, new EntityAISwimming(this));
    }
    
    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
      onAttack();
      return p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), 10.0F);
    }
	
	@Override
	public int setVariants() {
		return 3;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.HerbivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.UNGULATE_KIBBLE, 1);
	}
	
	public void onLivingUpdate()
	  {
	    if (isChild())
	    {
	      double distance2 = 4.0D;
	      Entity entityFound2 = null;
	      
	      double d4 = -1.0D;
	      for (int i = 0; i < this.world.loadedEntityList.size(); i++)
	      {
	        Entity currE = (Entity)this.world.loadedEntityList.get(i);
	        if (((currE instanceof EntityBison)) && (currE != this))
	        {
	          double d5 = currE.getDistanceSq(this.posX, this.posY, this.posZ);
	          if (((distance2 < 0.0D) || (d5 < distance2 * distance2)) && ((d4 == -1.0D) || (d5 < d4)))
	          {
	            d4 = d5;
	            entityFound2 = currE;
	          }
	        }
	      }
	      if (entityFound2 != null)
	      {
	        EntityBison rhino = (EntityBison)entityFound2;
	        if ((!rhino.isChild()) && (rhino.getLying()) && 
	          (this.lastJump >= 40))
	        {
	          this.motionY *= 3.899999976158142D;
	          jump();
	          for (int i = 0; i < 3; i++) {
	            getLookHelper().setLookPositionWithEntity(rhino, 8.0F, 10.0F);
	          }
	          float f = this.rotationYaw * 0.017453292F;
	          this.motionX -= MathHelper.sin(f) * 0.3F;
	          this.motionZ += MathHelper.cos(f) * 0.3F;
	          this.lastJump = 0;
	        }
	      }
	      this.lastJump += 1;
	    }
	    else
	    {
	      if (this.playFightCooldown >= 150)
	      {
	        double distance2 = 12.0D;
	        Entity entityFound2 = null;
	        if (this.target == null)
	        {
	          double d4 = -1.0D;
	          for (int i = 0; i < this.world.loadedEntityList.size(); i++)
	          {
	            Entity currE = (Entity)this.world.loadedEntityList.get(i);
	            if (((currE instanceof EntityBison)) && (currE != this) && 
	              (!((EntityBison)currE).isTranquilized()))
	            {
	              double d5 = currE.getDistanceSq(this.posX, this.posY, this.posZ);
	              if (((distance2 < 0.0D) || (d5 < distance2 * distance2)) && ((d4 == -1.0D) || (d5 < d4)))
	              {
	                d4 = d5;
	                entityFound2 = currE;
	              }
	            }
	          }
	        }
	        if (entityFound2 != null) {
	          this.target = ((EntityBison)entityFound2);
	        }
	        if ((this.target != null) && 
	          (this.target.target != null) && 
	          (this.target.target == this))
	        {
	          this.playFightDuration += 1;
	          if (this.playFightDuration < 70)
	          {
	            getLookHelper().setLookPositionWithEntity(this.target, 8.0F, 10.0F);
	            this.target.getLookHelper().setLookPositionWithEntity(this, 8.0F, 10.0F);
	            
	            getNavigator().tryMoveToXYZ(this.target.posX, this.target.posY, this.target.posZ, 1.2899999618530273D);
	            this.target.getNavigator().tryMoveToXYZ(this.posX, this.posY, this.posZ, 1.2899999618530273D);
	            
	            double distance3 = 2.0D;
	            Entity entityFound3 = null;
	            
	            double d6 = -1.0D;
	            for (int i = 0; i < this.world.loadedEntityList.size(); i++)
	            {
	              Entity currE = (Entity)this.world.loadedEntityList.get(i);
	              if (((currE instanceof EntityBison)) && (currE != this))
	              {
	                double d8 = currE.getDistanceSq(this.posX, this.posY, this.posZ);
	                if (((distance3 < 0.0D) || (d8 < distance3 * distance3)) && ((d6 == -1.0D) || (d8 < d6)))
	                {
	                  d6 = d8;
	                  entityFound3 = currE;
	                }
	              }
	            }
	            if ((entityFound3 != null) && 
	              (entityFound3 == this.target))
	            {
	              jump();
	              this.motionY *= 0.2999999761581421D;
	              this.motionX += MathHelper.sin(this.rotationYaw) * 0.03F;
	              this.motionZ -= MathHelper.cos(this.rotationYaw) * 0.03F;
	            }
	          }
	        }
	      }
	      if (this.playFightDuration >= 70)
	      {
	        this.playFightDuration = 0;
	        this.target.target = null;
	        this.target = null;
	        this.playFightCooldown = 0;
	      }
	      this.playFightCooldown += 1;
	    }
	    super.onLivingUpdate();
	  }
	
	  public boolean getLying()
	  {
	    return (this.stillTicks >= 60) && (!isChild());
	  }
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.UNGULATE_VIAL, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26D);
	}

	@Override
	public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.LARGE_MEAT_COOKED, 1);
		else
			this.dropItem(ZAWAItems.LARGE_MEAT_RAW, 1);
	}
	
	public boolean attackEntityFrom(DamageSource source, float amount)
	  {
	    if (!getIsZooAnimal())
	    {
	      this.tasks.addTask(2, this.AIFight);
	      this.targetTasks.addTask(3, this.AINearAtt);
	    }
	    if ((source.getTrueSource() instanceof EntityLivingBase)) {
	      setRevengeTarget((EntityLivingBase)source.getTrueSource());
	    }
	    return super.attackEntityFrom(source, amount);
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
	
	  public void onTame(EntityPlayer player)
	  {
	    super.onTame(player);
	    this.tasks.removeTask(this.AIFight);
	    this.targetTasks.removeTask(this.AINearAtt);
	  }
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityBison(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.TERRITORIAL;
	}
}

