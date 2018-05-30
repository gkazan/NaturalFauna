package com.ikerleon.naturalfaunamod.entity;

import java.util.Random;

import org.zawamod.entity.ai.EntityAIAttackEnts;
import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.data.AnimalData.EnumNature;
import org.zawamod.entity.data.BreedItems;
import org.zawamod.entity.land.EntityAfricanLion;
import org.zawamod.entity.land.EntityBlackRhinoceros;
import org.zawamod.entity.land.EntityGrevysZebra;
import org.zawamod.entity.land.EntityMeerkat;
import org.zawamod.entity.land.EntityNileHippo;
import org.zawamod.entity.land.EntityReticulatedGiraffe;
import org.zawamod.init.ZAWAItems;

import com.google.common.base.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityLeopard extends ZAWABaseLand {
	
	Random random = new Random();
	public final int melanicTexture=random.nextInt(1000) + 1;
	
	public EntityLeopard(World worldIn) {
		super(worldIn, 0.28D);
		this.setSize(1F, 1.2F);
		this.targetTasks.addTask(4, new EntityAIAttackEnts(this, EntityLiving.class, false, new EntityLeopardAttack(this)));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.28D));
	}
	
	public class EntityLeopardAttack
	  implements Predicate
	  {
		EntityLeopardAttack(EntityLeopard this$0) {}
	    
	    public boolean func_180094_a(Entity e)
	    {
	      return ((e instanceof EntityVillager)) || ((e instanceof EntityGrantsGazelle)) || ((e instanceof EntityMeerkat)) || ((e instanceof EntityBlackRhinoceros)) || ((e instanceof EntityCow)) || ((e instanceof EntityPig)) || ((e instanceof EntitySheep)) || ((e instanceof EntityChicken)) || ((e instanceof EntityWolf)) || ((e instanceof EntityPig)) || ((e instanceof EntityHorse)) || ((e instanceof EntityReticulatedGiraffe)) || ((e instanceof EntityNileHippo)) || ((e instanceof EntityGrevysZebra));
	    }
	    
	    public boolean apply(Object o) {
	      return func_180094_a((Entity)o);
	    }
	  }

    
    public float getEyeHeight()
    {
        return this.height * 0.85F - 0.1F;
    }
	
	@Override
	public int setVariants() {
		return 3;
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if(this.isBurning())
			this.dropItem(ZAWAItems.carnivore_meat_cooked, 1);
		else
			this.dropItem(ZAWAItems.carnivore_meat_raw, 1);
		this.dropItem(ZAWAItems.amur_leopard_hide, 1);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityLeopard(this.world);
	}

	@Override
	public EnumNature setNature() {
		return EnumNature.AGGRESSIVE;
	}
}