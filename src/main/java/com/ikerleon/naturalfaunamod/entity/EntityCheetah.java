package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.ai.EntityAIAttackEnts;
import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.land.EntityMeerkat;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import com.google.common.base.Predicate;
import com.ikerleon.naturalfaunamod.handlers.SoundHandler;
import com.ikerleon.naturalfaunamod.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityCheetah extends ZAWABaseLand {
	
	Random random = new Random();
	public int chirpNum;
	
	public EntityCheetah(World worldIn) {		
		super(worldIn, 0.3F);
		this.setSize(1.8F, 1.7F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.28D));
        this.targetTasks.addTask(4, new EntityAIAttackEnts(this, EntityLiving.class, false, new EntityCheetahAttack(this)));
	}
	
	public class EntityCheetahAttack
	  implements Predicate
	  {
		EntityCheetahAttack(EntityCheetah this$0) {}
	    
	    public boolean func_180094_a(Entity e)
	    {
	      return ((e instanceof EntityGrantsGazelle)) || ((e instanceof EntityMeerkat)) ||  ((e instanceof EntityCow)) || ((e instanceof EntityPig)) || ((e instanceof EntitySheep)) || ((e instanceof EntityChicken)) || ((e instanceof EntityPig));
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
		return 7;
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target) {
		ResourceLocation name = EntityList.getKey(this);
		ItemStack stack = new ItemStack(net.minecraft.init.Items.SPAWN_EGG);
        net.minecraft.item.ItemMonsterPlacer.applyEntityIdToItemStack(stack, name);
        return stack;
	}
	
	@Override
	protected SoundEvent getAmbientSound()
	{
		chirpNum=random.nextInt(35);
		
		if(chirpNum==2) {
			return SoundHandler.CHEETAH_CHIRP;
		}
		else {
			return null;
		}
	}
	
	@Override
	public void onLivingUpdate() {
		double distance2 = 15.0D;
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
	    
	    if (isChild()==false)
	    {
	      if (entityFound2 instanceof EntityGrantsGazelle) {
	  		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.37D);
	      }
	    }
		super.onLivingUpdate();
	}
	
	@Override
	public boolean sexualDimorphism()
	{
	  return true;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.CarnivoreItems(stack);
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.big_cat_kibble, 1);
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.bigcat_vial, 1);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.carnivore_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.carnivore_meat_raw, 1);
		this.dropItem(ItemInit.CHEETAH_FUR, 1);
		this.dropItem(ItemInit.CARNIVORE_TOOTH, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityCheetah(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.AGGRESSIVE;
	}
}
