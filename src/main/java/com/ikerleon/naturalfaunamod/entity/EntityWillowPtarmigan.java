package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.base.ZAWABaseFlying;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class EntityWillowPtarmigan extends ZAWABaseFlying {
	  private World world;
	  private int standNum;
	  Random random = new Random();
	  public Biome biome;

	public EntityWillowPtarmigan(World worldIn) {		
		super(worldIn);
		this.setSize(0.5F, 0.5F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.world=worldIn;
	}
	
	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ZAWAItems.BIRD_KIBBLE, 1);
	}
	
	@Override
	public boolean sexualDimorphism()
	{
	  return true;
	}

	@Override
	protected SoundEvent getAmbientSound()
	{
        long i= world.getWorldTime();
		
        if(((i>=0 && i<=4000) || (i>=12000 && i<=16000))&&(this.isChild()==false)&&(this.getGender()==Gender.MALE)) {
        	return SoundHandler.PTARMIGAN_SONG;
        }
        else {
        	return null;
        }
	}
	
	@Override
	public ItemStack setVial() {
		return new ItemStack(ZAWAItems.BIRD_VIAL, 1);
	}
    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
    
	public int setFlyTicks()
	{
	    return 4;
	}
    
    @Override
    public void onLivingUpdate()
    {
     this.biome=world.getBiome(getPosition());
    	  
     this.standNum=rand.nextInt(75);

     super.onLivingUpdate();
     
     }
    
    @Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if(!this.isChild()) {
			this.playSound(SoundHandler.PTARMIGAN_HURT, 1, 1);
		}
		return super.attackEntityFrom(source, amount);
	}
    
	@Override
	public int setVariants() {
		return 1;
	}
	
	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.LeafEaterItems(stack);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.16D);
	}

	@Override
	public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.BIRD_MEAT_COOKED, 1);
		else
			this.dropItem(ZAWAItems.BIRD_MEAT, 1);
		this.dropItem(ItemInit.PTARMIGAN_FEATHER, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityWillowPtarmigan(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.PASSIVE;
	}
}