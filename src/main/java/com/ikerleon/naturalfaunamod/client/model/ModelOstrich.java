package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;


public class ModelOstrich extends AdvancedModelBase {
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape8_1;
    public AdvancedModelRenderer shape13;
    public AdvancedModelRenderer shape19;
    public AdvancedModelRenderer shape20;
    public AdvancedModelRenderer shape21;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape14;
    public AdvancedModelRenderer shape15;
    public AdvancedModelRenderer shape2_1;
    public AdvancedModelRenderer shape14_1;
    public AdvancedModelRenderer shape15_1;

    public ModelOstrich() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.shape8_1 = new AdvancedModelRenderer(this, 44, 14);
        this.shape8_1.setRotationPoint(7.8F, 0.0F, 1.5F);
        this.shape8_1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(shape8_1, -0.091106186954104F, 0.091106186954104F, 0.0F);
        this.shape20 = new AdvancedModelRenderer(this, 38, 5);
        this.shape20.setRotationPoint(0.3F, 7.5F, 3.9F);
        this.shape20.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape20, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape5 = new AdvancedModelRenderer(this, 54, 0);
        this.shape5.setRotationPoint(0.5F, -2.9F, 1.0F);
        this.shape5.addBox(-1.5F, -10.8F, -1.7F, 3, 11, 3, 0.0F);
        this.setRotateAngle(shape5, -1.5025539530419183F, 0.0F, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 56, 4);
        this.shape8.setRotationPoint(-0.8F, 0.0F, 1.4F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(shape8, -0.091106186954104F, -0.091106186954104F, 0.0F);
        this.shape2_1 = new AdvancedModelRenderer(this, 38, 0);
        this.shape2_1.setRotationPoint(0.0F, -2.5F, 0.9F);
        this.shape2_1.addBox(-1.0F, 0.0F, -1.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(shape2_1, -0.136659280431156F, 0.0F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 0, 0);
        this.shape12.setRotationPoint(-0.3F, 0.1F, 0.0F);
        this.shape12.addBox(0.3F, 0.0F, -0.2F, 3, 1, 3, 0.0F);
        this.setRotateAngle(shape12, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape14 = new AdvancedModelRenderer(this, 40, 0);
        this.shape14.setRotationPoint(0.4F, 14.1F, 0.3F);
        this.shape14.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape14, 0.0F, 0.22759093446006054F, 0.0F);
        this.shape14_1 = new AdvancedModelRenderer(this, 40, 0);
        this.shape14_1.setRotationPoint(-0.6F, 13.9F, 0.1F);
        this.shape14_1.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.shape15 = new AdvancedModelRenderer(this, 41, 2);
        this.shape15.setRotationPoint(1.1F, 14.1F, 1.1F);
        this.shape15.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.shape21 = new AdvancedModelRenderer(this, 40, 5);
        this.shape21.setRotationPoint(6.0F, 7.5F, 5.5F);
        this.shape21.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape21, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 34, 17);
        this.shape7.setRotationPoint(0.0F, -9.0F, -0.4F);
        this.shape7.addBox(-2.0F, -2.5F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(shape7, -0.136659280431156F, 0.0F, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 17, 20);
        this.shape11.setRotationPoint(-1.5F, -0.8F, -4.0F);
        this.shape11.addBox(0.5F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(shape11, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape19 = new AdvancedModelRenderer(this, 10, 9);
        this.shape19.setRotationPoint(3.7F, 3.2F, 1.1F);
        this.shape19.addBox(-1.5F, -4.7F, -2.6F, 4, 5, 5, 0.0F);
        this.setRotateAngle(shape19, 1.730144887501979F, 0.0F, 0.0F);
        this.shape1 = new AdvancedModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-4.1F, 4.4F, -5.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 8, 9, 11, 0.0F);
        this.setRotateAngle(shape1, -0.045553093477052F, 0.0F, 0.0F);
        this.shape13 = new AdvancedModelRenderer(this, 0, 20);
        this.shape13.setRotationPoint(4.1F, 2.1F, 9.4F);
        this.shape13.addBox(-2.7F, -2.0F, -0.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(shape13, -0.31869712141416456F, 0.003490658503988659F, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 38, 0);
        this.shape2.setRotationPoint(0.5F, -2.9F, 1.4F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(shape2, -0.136659280431156F, 0.0F, 0.0F);
        this.shape15_1 = new AdvancedModelRenderer(this, 41, 2);
        this.shape15_1.setRotationPoint(0.4F, 13.8F, -0.8F);
        this.shape15_1.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape15_1, 0.0F, -0.31869712141416456F, 0.0F);
        this.shape1.addChild(this.shape8_1);
        this.shape1.addChild(this.shape20);
        this.shape19.addChild(this.shape5);
        this.shape1.addChild(this.shape8);
        this.shape21.addChild(this.shape2_1);
        this.shape11.addChild(this.shape12);
        this.shape2.addChild(this.shape14);
        this.shape2_1.addChild(this.shape14_1);
        this.shape2.addChild(this.shape15);
        this.shape1.addChild(this.shape21);
        this.shape5.addChild(this.shape7);
        this.shape7.addChild(this.shape11);
        this.shape1.addChild(this.shape19);
        this.shape1.addChild(this.shape13);
        this.shape20.addChild(this.shape2);
        this.shape2_1.addChild(this.shape15_1);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.7F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.shape1.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 1.3F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.shape1.render(f5);
            GlStateManager.popMatrix();
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
    	
        this.shape7.rotateAngleY = (f3 * 0.017453292F);
        this.shape7.rotateAngleX = (f4 * 0.017453292F);
    	
    	bob(shape1, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(shape20, 0.2f * globalSpeed, 0.4f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape21, 0.2f * globalSpeed, 0.4f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape2, 0.1f * globalSpeed, 0.3f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape2_1, 0.1f * globalSpeed, 0.3f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape15, 0.3f * globalSpeed, 0.2f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape15_1, 0.3f * globalSpeed, 0.2f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape14, 0.3f * globalSpeed, 0.2f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape14_1, 0.3f * globalSpeed, 0.2f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape13, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape5, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(shape5, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape7, 0.17f, 0.1f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape13, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	walk(shape8, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape8_1, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
