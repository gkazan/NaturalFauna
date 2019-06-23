package com.ikerleon.naturalfaunamod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import org.zawamod.entity.base.ZAWABaseFlying;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

import javax.annotation.Nullable;

public class EntityCommonLoon extends ZAWABaseFlying {
    private World world;
    private int standNum;
    public Biome biome;

    public EntityCommonLoon(World world) {
        super(world);
        this.setSize(0.5F, 0.6F);
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIFollowParent(this, 0.26D));
        this.world=world;
    }

    public float getEyeHeight()
    {
        return this.height * 0.85F;
    }

    @Override
    public boolean sexualDimorphism() {
        return true;
    }

    @Override
    public int setVariants() {
        return 2;
    }

    public int setFlyTicks()
    {
        return 4;
    }

    /*@Override
    protected SoundEvent getAmbientSound()
    {
        return SoundHandler.COMMON_LOON_LIVING;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource s)
    {
        return SoundHandler.COMMON_LOON_HURT;
    }*/

    @Override
    public boolean isFoodItem(ItemStack stack) {
        return BreedItems.PescatarianItems(stack);
    }

    @Override
    public ItemStack setTameItem() {
        return new ItemStack(ZAWAItems.BIRD_KIBBLE, 1);
    }

    @Override
    public ItemStack setVial() {
        return new ItemStack(ZAWAItems.BIRD_VIAL, 1);
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26D);
    }

    @Override
    public void onLivingUpdate() {
        this.biome = world.getBiome(getPosition());
        this.standNum=rand.nextInt(45);

        if(this.inWater && !this.isChild()){
            this.motionY=0;
        }

        super.onLivingUpdate();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
        if(this.isBurning())
            this.dropItem(ZAWAItems.BIRD_MEAT_COOKED, 1);
        else
            this.dropItem(ZAWAItems.BIRD_MEAT, 1);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return new EntityCommonLoon(this.world);
    }

    @Override
    public AnimalData.EnumNature setNature() {
        return AnimalData.EnumNature.PASSIVE;
    }

    @Nullable
    @Override
    public Item getLaidEgg() {
        return null;
    }
}
