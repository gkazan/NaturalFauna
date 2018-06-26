package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * WL Hyena - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelHyena extends AdvancedModelBase {
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape2_1;
    public AdvancedModelRenderer shape2_2;
    public AdvancedModelRenderer shape2_3;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape13;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape9_1;
    public AdvancedModelRenderer shape11;

    public ModelHyena() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape1 = new AdvancedModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-3.4F, 8.9F, -6.8F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 7, 14, 0.0F);
        this.setRotateAngle(shape1, -0.045553093477052F, 0.0F, 0.0F);
        this.shape2_2 = new AdvancedModelRenderer(this, 36, 0);
        this.shape2_2.setRotationPoint(1.1F, 5.5F, 12.8F);
        this.shape2_2.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2_2, 0.045553093477052F, 0.0F, 0.0F);
        this.shape9_1 = new AdvancedModelRenderer(this, 52, 14);
        this.shape9_1.setRotationPoint(1.1F, -4.5F, -1.8F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(shape9_1, 0.0F, 0.136659280431156F, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 22, 21);
        this.shape11.setRotationPoint(-1.5F, -0.7F, -7.9F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape11, 0.045553093477052F, 0.0F, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(1.1F, 6.0F, 1.8F);
        this.shape2.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2, 0.045553093477052F, 0.0F, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 34, 13);
        this.shape7.setRotationPoint(3.3F, 3.4F, 2.9F);
        this.shape7.addBox(-2.5F, -2.5F, -8.0F, 5, 5, 8, 0.0F);
        this.setRotateAngle(shape7, -0.40980330836826856F, 0.0F, 0.0F);
        this.shape9 = new AdvancedModelRenderer(this, 52, 10);
        this.shape9.setRotationPoint(-4.4F, -4.5F, -2.3F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(shape9, 0.0F, -0.136659280431156F, 0.0F);
        this.shape2_3 = new AdvancedModelRenderer(this, 44, 0);
        this.shape2_3.setRotationPoint(5.8F, 5.5F, 12.8F);
        this.shape2_3.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2_3, 0.045553093477052F, 0.0F, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 0, 21);
        this.shape8.setRotationPoint(0.0F, -0.5F, -6.5F);
        this.shape8.addBox(-3.0F, -2.5F, -5.1F, 6, 5, 5, 0.0F);
        this.setRotateAngle(shape8, 0.5462880558742251F, 0.0F, 0.0F);
        this.shape13 = new AdvancedModelRenderer(this, 6, 22);
        this.shape13.setRotationPoint(0.1F, -4.1F, -7.8F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 0, 3, 11, 0.0F);
        this.setRotateAngle(shape13, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape2_1 = new AdvancedModelRenderer(this, 28, 0);
        this.shape2_1.setRotationPoint(4.8F, 5.8F, 0.8F);
        this.shape2_1.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2_1, 0.045553093477052F, 0.0F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 52, 0);
        this.shape12.setRotationPoint(2.6F, 1.1F, 12.2F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(shape12, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape1.addChild(this.shape2_2);
        this.shape8.addChild(this.shape9_1);
        this.shape8.addChild(this.shape11);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape7);
        this.shape8.addChild(this.shape9);
        this.shape1.addChild(this.shape2_3);
        this.shape7.addChild(this.shape8);
        this.shape7.addChild(this.shape13);
        this.shape1.addChild(this.shape2_1);
        this.shape1.addChild(this.shape12);
        
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
    	float globalDegree = 1.3F;
    	
        this.shape8.rotateAngleY = (f3 * 0.017453292F);
        this.shape8.rotateAngleX = (f4 * 0.017453292F)+0.5F;
    	
    	bob(shape1, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(shape2, 0.5f * globalSpeed, 0.4f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape2_1, 0.5f * globalSpeed, 0.4f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape2_2, 0.5f * globalSpeed, 0.4f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape2_3, 0.5f * globalSpeed, 0.4f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape7, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(shape7, 0.10f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	
    	flap(shape12, 0.2f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
