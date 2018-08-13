package com.ikerleon.naturalfaunamod.entity;

import org.zawamod.entity.land.EntityJapaneseGiantSalamander;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityAxolotl extends EntityJapaneseGiantSalamander{

	public EntityAxolotl(World worldIn) {
		super(worldIn);
		setSize(0.4F, 0.2F);
	}
	
    public float getEyeHeight()
    {
        return this.height;
    }
	
	public int setVariants()
	{
	    return 3;
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
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.18D);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
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
	    return new EntityAxolotl(this.world);
	}

}
