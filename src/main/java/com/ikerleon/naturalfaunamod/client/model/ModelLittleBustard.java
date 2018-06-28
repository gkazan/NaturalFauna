package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * outarde - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelLittleBustard extends AdvancedModelBase {
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape10;
    public AdvancedModelRenderer shape3;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape4;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape13;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape8;

    public ModelLittleBustard() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape12 = new AdvancedModelRenderer(this, 17, 11);
        this.shape12.setRotationPoint(0.0F, -4.8F, -0.3F);
        this.shape12.addBox(-1.0F, -2.0F, -1.7F, 2, 2, 3, 0.0F);
        this.setRotateAngle(shape12, 0.136659280431156F, 0.0F, 0.0F);
        this.shape9 = new AdvancedModelRenderer(this, 41, 17);
        this.shape9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shape9.addBox(-0.5F, 0.0F, -1.5F, 1, 0, 3, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 34, 17);
        this.shape8.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shape8.addBox(-0.5F, 0.0F, -1.5F, 1, 0, 3, 0.0F);
        this.shape5 = new AdvancedModelRenderer(this, 36, 1);
        this.shape5.setRotationPoint(1.9F, 4.5F, 3.5F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape5, 0.9250245035569946F, 0.0F, 0.0F);
        this.shape3 = new AdvancedModelRenderer(this, 49, 2);
        this.shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape3.addBox(-0.8F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(shape3, -0.03473205211468716F, -0.07330382858376185F, -0.031415926535897934F);
        this.shape4 = new AdvancedModelRenderer(this, 42, 1);
        this.shape4.setRotationPoint(1.1F, 4.5F, 3.5F);
        this.shape4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape4, 0.9250245035569946F, 0.0F, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 49, 14);
        this.shape2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(shape2, -0.03473205211468716F, 0.0757472895365539F, 0.0F);
        this.shape13 = new AdvancedModelRenderer(this, 29, 13);
        this.shape13.setRotationPoint(0.3F, -0.8F, -1.5F);
        this.shape13.addBox(-0.8F, -0.8F, -1.0F, 1, 1, 1, 0.0F);
        this.shape10 = new AdvancedModelRenderer(this, 20, 2);
        this.shape10.setRotationPoint(1.5F, 1.5F, 4.8F);
        this.shape10.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(shape10, -0.045553093477052F, 0.0F, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 36, 8);
        this.shape6.setRotationPoint(0.5F, 4.8F, 0.5F);
        this.shape6.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape6, -0.22689280275926282F, 0.0F, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 22, 18);
        this.shape11.setRotationPoint(1.5F, 2.6F, 0.8F);
        this.shape11.addBox(-1.0F, -5.0F, -1.1F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape11, 0.6101671064972176F, 0.0F, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 42, 8);
        this.shape7.setRotationPoint(-0.5F, 4.8F, 0.5F);
        this.shape7.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape7, -0.22689280275926282F, 0.0F, 0.0F);
        this.shape1 = new AdvancedModelRenderer(this, 33, 23);
        this.shape1.setRotationPoint(-1.5F, 10.5F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 7, 0.0F);
        this.setRotateAngle(shape1, -0.720820981073658F, 0.0F, 0.0F);
        this.shape11.addChild(this.shape12);
        this.shape7.addChild(this.shape9);
        this.shape6.addChild(this.shape8);
        this.shape1.addChild(this.shape5);
        this.shape1.addChild(this.shape3);
        this.shape1.addChild(this.shape4);
        this.shape1.addChild(this.shape2);
        this.shape12.addChild(this.shape13);
        this.shape1.addChild(this.shape10);
        this.shape5.addChild(this.shape6);
        this.shape1.addChild(this.shape11);
        this.shape4.addChild(this.shape7);
        
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
    	    this.shape1.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            this.shape1.render(f5);
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

    	float globalSpeed = 2f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.5F;
    	
        this.shape12.rotateAngleY = (f3 * 0.017453292F);
        this.shape12.rotateAngleX = (f4 * 0.017453292F);
    	
    	bob(shape1, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(shape5, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape4, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape6, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape7, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape8, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape9, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape10, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape11, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(shape11, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape12, 0.17f, 0.1f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape10, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	walk(shape2, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape3, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
