package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Cheetah - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelCheetah extends AdvancedModelBase {
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape2_1;
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape2_2;
    public AdvancedModelRenderer shape19;
    public AdvancedModelRenderer shape7_1;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape9_1;
    public AdvancedModelRenderer shape4;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape4_1;
    public AdvancedModelRenderer shape8_1;
    public AdvancedModelRenderer shape4_2;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape4_3;

    public ModelCheetah() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape7_1 = new AdvancedModelRenderer(this, 0, 15);
        this.shape7_1.setRotationPoint(0.0F, -1.5F, -2.3F);
        this.shape7_1.addBox(-3.1F, -2.5F, -5.5F, 6, 5, 5, 0.0F);
        this.shape4_3 = new AdvancedModelRenderer(this, 50, 28);
        this.shape4_3.setRotationPoint(0.1F, 4.7F, 2.7F);
        this.shape4_3.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape4_3, 0.091106186954104F, 0.0F, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 0, 25);
        this.shape11.setRotationPoint(2.9F, 0.8F, 9.3F);
        this.shape11.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape11, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape2_2 = new AdvancedModelRenderer(this, 30, 34);
        this.shape2_2.setRotationPoint(-0.2F, -3.1F, -4.9F);
        this.shape2_2.addBox(0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F);
        this.setRotateAngle(shape2_2, 0.136659280431156F, 0.0F, 0.0F);
        this.shape4_2 = new AdvancedModelRenderer(this, 8, 25);
        this.shape4_2.setRotationPoint(-0.1F, 4.7F, 2.7F);
        this.shape4_2.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape4_2, 0.091106186954104F, 0.0F, 0.0F);
        this.shape8_1 = new AdvancedModelRenderer(this, 0, 32);
        this.shape8_1.setRotationPoint(2.9F, 4.5F, -1.1F);
        this.shape8_1.addBox(0.0F, 0.0F, 0.0F, 0, 3, 8, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 50, 0);
        this.shape2.setRotationPoint(0.7F, 5.7F, 2.1F);
        this.shape2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(shape2, 0.045553093477052F, 0.0F, 0.0F);
        this.shape4_1 = new AdvancedModelRenderer(this, 30, 28);
        this.shape4_1.setRotationPoint(5.2F, 1.8F, 7.6F);
        this.shape4_1.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(shape4_1, -0.136659280431156F, 0.0F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 42, 28);
        this.shape12.setRotationPoint(0.0F, 8.8F, 1.0F);
        this.shape12.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape12, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape19 = new AdvancedModelRenderer(this, 0, 0);
        this.shape19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape19.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape19, 0.4553564018453205F, 0.0F, 0.0F);
        this.shape4 = new AdvancedModelRenderer(this, 18, 24);
        this.shape4.setRotationPoint(0.8F, 1.8F, 7.6F);
        this.shape4.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(shape4, -0.136659280431156F, 0.0F, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 0, 0);
        this.shape7.setRotationPoint(-4.3F, 8.4F, -8.1F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
        this.setRotateAngle(shape7, -0.045553093477052F, 0.0F, 0.0F);
        this.shape9 = new AdvancedModelRenderer(this, 0, 0);
        this.shape9.setRotationPoint(-4.1F, -3.6F, -2.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape1 = new AdvancedModelRenderer(this, 27, 11);
        this.shape1.setRotationPoint(0.7F, 0.0F, 7.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 11, 0.0F);
        this.setRotateAngle(shape1, 0.091106186954104F, 0.0F, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 50, 12);
        this.shape8.setRotationPoint(-1.6F, -0.5F, -7.9F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape8, 0.136659280431156F, 0.0F, 0.0F);
        this.shape9_1 = new AdvancedModelRenderer(this, 22, 0);
        this.shape9_1.setRotationPoint(1.9F, -3.6F, -2.0F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape2_1 = new AdvancedModelRenderer(this, 30, 10);
        this.shape2_1.setRotationPoint(6.1F, 5.7F, 2.0F);
        this.shape2_1.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(shape2_1, 0.045553093477052F, 0.0F, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 30, 0);
        this.shape6.setRotationPoint(3.5F, 1.8F, 1.8F);
        this.shape6.addBox(-2.6F, -2.0F, -4.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape6, -0.40980330836826856F, 0.0F, 0.0F);
        this.shape19.addChild(this.shape7_1);
        this.shape4_1.addChild(this.shape4_3);
        this.shape1.addChild(this.shape11);
        this.shape6.addChild(this.shape2_2);
        this.shape4.addChild(this.shape4_2);
        this.shape1.addChild(this.shape8_1);
        this.shape7.addChild(this.shape2);
        this.shape1.addChild(this.shape4_1);
        this.shape11.addChild(this.shape12);
        this.shape6.addChild(this.shape19);
        this.shape1.addChild(this.shape4);
        this.shape7_1.addChild(this.shape9);
        this.shape7.addChild(this.shape1);
        this.shape7_1.addChild(this.shape8);
        this.shape7_1.addChild(this.shape9_1);
        this.shape7.addChild(this.shape2_1);
        this.shape7.addChild(this.shape6);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
     	
     	if(this.isChild) {
     		float scaleFactor= 0.5F;
	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.shape7.render(f5);
    	    GlStateManager.popMatrix();
     	}
     	else {
            this.shape7.render(f5);
     	}
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	resetToDefaultPose();

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.3F;
    	
        this.shape7_1.rotateAngleY = (f3 * 0.017453292F);
        this.shape7_1.rotateAngleX = (f4 * 0.017453292F);
    	
    	bob(shape7, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(shape2, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape2_1, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape4, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape4_1, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape6, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, 0.5f);

    	walk(shape6, 0.10f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	
    	flap(shape11, 0.2f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	flap(shape12, 0.15f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
