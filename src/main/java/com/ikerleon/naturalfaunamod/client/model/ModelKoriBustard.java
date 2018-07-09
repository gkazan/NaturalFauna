package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Kori Bustard - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelKoriBustard extends AdvancedModelBase {
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape3;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape11_1;
    public AdvancedModelRenderer shape15;
    public AdvancedModelRenderer shape15_1;
    public AdvancedModelRenderer shape4;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape10;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape12_1;
    public AdvancedModelRenderer shape16;
    public AdvancedModelRenderer shape16_1;

    public ModelKoriBustard() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape7 = new AdvancedModelRenderer(this, 33, 21);
        this.shape7.setRotationPoint(-1.0F, -1.5F, -4.8F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.shape3 = new AdvancedModelRenderer(this, 23, 0);
        this.shape3.setRotationPoint(3.6F, 2.3F, 0.2F);
        this.shape3.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(shape3, 0.045553093477052F, 0.0F, 0.010821041362364843F);
        this.shape11 = new AdvancedModelRenderer(this, 24, 8);
        this.shape11.setRotationPoint(-0.2F, 2.2F, 0.8F);
        this.shape11.addBox(0.0F, -2.5F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(shape11, -0.045553093477052F, -0.045553093477052F, 0.0F);
        this.shape5 = new AdvancedModelRenderer(this, 0, 22);
        this.shape5.setRotationPoint(0.0F, -5.8F, -0.2F);
        this.shape5.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(-3.5F, 8.6F, -4.9F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 7, 5, 9, 0.0F);
        this.shape12_1 = new AdvancedModelRenderer(this, 12, 26);
        this.shape12_1.setRotationPoint(0.0F, -2.5F, 7.8F);
        this.shape12_1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(shape12_1, -0.091106186954104F, 0.0F, 0.0F);
        this.shape16_1 = new AdvancedModelRenderer(this, 33, 26);
        this.shape16_1.setRotationPoint(0.0F, 4.9F, 0.2F);
        this.shape16_1.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(shape16_1, -0.136659280431156F, 0.0F, 0.0F);
        this.shape15 = new AdvancedModelRenderer(this, 0, 14);
        this.shape15.setRotationPoint(1.4F, 3.7F, 5.5F);
        this.shape15.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(shape15, 0.136659280431156F, 0.0F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 52, 10);
        this.shape12.setRotationPoint(0.0F, -2.5F, 7.8F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(shape12, -0.091106186954104F, 0.0F, 0.0F);
        this.shape16 = new AdvancedModelRenderer(this, 0, 0);
        this.shape16.setRotationPoint(0.0F, 4.9F, 0.2F);
        this.shape16.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(shape16, -0.136659280431156F, 0.0F, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 34, 10);
        this.shape6.setRotationPoint(-1.0F, -2.0F, -5.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(shape6, 0.091106186954104F, 0.0F, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 0, 34);
        this.shape8.setRotationPoint(0.0F, -5.4F, 0.0F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
        this.shape15_1 = new AdvancedModelRenderer(this, 12, 14);
        this.shape15_1.setRotationPoint(5.3F, 3.7F, 5.5F);
        this.shape15_1.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(shape15_1, 0.136659280431156F, 0.0F, 0.0F);
        this.shape9 = new AdvancedModelRenderer(this, 39, 0);
        this.shape9.setRotationPoint(3.4F, 2.5F, 9.0F);
        this.shape9.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape9, -0.136659280431156F, 0.0F, 0.0F);
        this.shape11_1 = new AdvancedModelRenderer(this, 42, 10);
        this.shape11_1.setRotationPoint(6.2F, 2.2F, 0.9F);
        this.shape11_1.addBox(0.0F, -2.5F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(shape11_1, -0.045553093477052F, 0.045553093477052F, 0.0F);
        this.shape4 = new AdvancedModelRenderer(this, 21, 21);
        this.shape4.setRotationPoint(0.0F, 1.3F, -2.5F);
        this.shape4.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(shape4, -0.045553093477052F, 0.0F, 0.0F);
        this.shape10 = new AdvancedModelRenderer(this, 41, 23);
        this.shape10.setRotationPoint(0.0F, -0.4F, 4.2F);
        this.shape10.addBox(-2.0F, -2.0F, -0.1F, 4, 4, 4, 0.0F);
        this.setRotateAngle(shape10, -0.22759093446006054F, 0.0F, 0.0F);
        this.shape5.addChild(this.shape7);
        this.shape2.addChild(this.shape3);
        this.shape2.addChild(this.shape11);
        this.shape4.addChild(this.shape5);
        this.shape11_1.addChild(this.shape12_1);
        this.shape15_1.addChild(this.shape16_1);
        this.shape2.addChild(this.shape15);
        this.shape11.addChild(this.shape12);
        this.shape15.addChild(this.shape16);
        this.shape5.addChild(this.shape6);
        this.shape5.addChild(this.shape8);
        this.shape2.addChild(this.shape15_1);
        this.shape2.addChild(this.shape9);
        this.shape2.addChild(this.shape11_1);
        this.shape3.addChild(this.shape4);
        this.shape9.addChild(this.shape10);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.6F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.shape2.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            this.shape2.render(f5);
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
    	float globalDegree = 1.5F;
    	
        this.shape5.rotateAngleY = (f3 * 0.017453292F);
        this.shape5.rotateAngleX = (f4 * 0.017453292F);
    	
    	bob(shape2, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(shape15, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape15_1, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape16, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape16_1, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape4, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape9, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape10, 0.8f * globalSpeed, 0.1f * globalDegree, false, 2.5f, 0f, f, f1);

    	walk(shape4, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape5, 0.17f, 0.1f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape9, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F); 
    	walk(shape10, 0.2f, 0.08f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape11, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape11_1, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
