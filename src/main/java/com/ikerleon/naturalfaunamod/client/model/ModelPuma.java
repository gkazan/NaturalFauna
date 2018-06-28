package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Puma - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelPuma extends AdvancedModelBase {
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape2_1;
    public AdvancedModelRenderer shape4;
    public AdvancedModelRenderer shape4_1;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape9_1;
    public AdvancedModelRenderer shape12;

    public ModelPuma() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape8 = new AdvancedModelRenderer(this, 0, 37);
        this.shape8.setRotationPoint(-1.7F, -0.9F, -8.9F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(shape8, 0.136659280431156F, 0.0F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 10, 11);
        this.shape12.setRotationPoint(0.0F, 8.8F, 1.0F);
        this.shape12.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape12, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape4_1 = new AdvancedModelRenderer(this, 49, 24);
        this.shape4_1.setRotationPoint(5.7F, 5.7F, 17.4F);
        this.shape4_1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 0, 27);
        this.shape6.setRotationPoint(3.5F, 2.9F, 1.2F);
        this.shape6.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape6, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 20, 27);
        this.shape7.setRotationPoint(-0.4F, -0.1F, -3.8F);
        this.shape7.addBox(-2.7F, -3.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(shape7, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape9_1 = new AdvancedModelRenderer(this, 42, 0);
        this.shape9_1.setRotationPoint(2.5F, -4.0F, -2.3F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 55, 11);
        this.shape11.setRotationPoint(3.6F, 0.8F, 17.2F);
        this.shape11.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape11, 0.4553564018453205F, 0.0F, 0.0F);
        this.shape1 = new AdvancedModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-3.5F, 8.2F, -7.3F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 19, 0.0F);
        this.shape9 = new AdvancedModelRenderer(this, 9, 0);
        this.shape9.setRotationPoint(-3.8F, -4.0F, -2.3F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(1.3F, 5.7F, 1.8F);
        this.shape2.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape2_1 = new AdvancedModelRenderer(this, 33, 0);
        this.shape2_1.setRotationPoint(5.7F, 5.7F, 1.8F);
        this.shape2_1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape4 = new AdvancedModelRenderer(this, 45, 0);
        this.shape4.setRotationPoint(1.3F, 5.7F, 17.4F);
        this.shape4.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape7.addChild(this.shape8);
        this.shape11.addChild(this.shape12);
        this.shape1.addChild(this.shape4_1);
        this.shape1.addChild(this.shape6);
        this.shape6.addChild(this.shape7);
        this.shape7.addChild(this.shape9_1);
        this.shape1.addChild(this.shape11);
        this.shape7.addChild(this.shape9);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape2_1);
        this.shape1.addChild(this.shape4);
        
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
    	float globalDegree = 1.3F;
    	
        this.shape7.rotateAngleY = (f3 * 0.017453292F);
        this.shape7.rotateAngleX = (f4 * 0.017453292F)+0.3F;
    	
    	bob(shape1, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(shape2, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape2_1, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape4, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape4_1, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape6, 0.5f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(shape6, 0.10f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
   	
    	
    	flap(shape11, 0.2f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	flap(shape12, 0.15f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
