package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * POLYODONSPATHULA - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelPaddlefish extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer shape17;
    public AdvancedModelRenderer shape18;
    public AdvancedModelRenderer shape19;
    public AdvancedModelRenderer shape20;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape11;
    public AdvancedModelRenderer shape16;
    public AdvancedModelRenderer shape21;
    public AdvancedModelRenderer tail;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape10;

    public ModelPaddlefish() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape18 = new AdvancedModelRenderer(this, 25, 3);
        this.shape18.setRotationPoint(5.7F, 5.6F, -4.5F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F);
        this.setRotateAngle(shape18, 0.18884462506578648F, 0.0F, -0.4808382089244378F);
        this.shape9 = new AdvancedModelRenderer(this, 46, 2);
        this.shape9.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(shape9, -3.141767186514992F, 0.0F, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 5, 23);
        this.shape6.setRotationPoint(-1.5F, 0.3F, 7.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 3, 4, 5, 0.0F);
        this.setRotateAngle(shape6, -0.0F, 0.0F, -0.008028514559173916F);
        this.shape19 = new AdvancedModelRenderer(this, 15, 0);
        this.shape19.setRotationPoint(0.6F, 5.6F, 3.0F);
        this.shape19.addBox(0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F);
        this.setRotateAngle(shape19, 0.35482543693044716F, 0.0F, 0.4808382089244378F);
        this.body = new AdvancedModelRenderer(this, 0, 48);
        this.body.setRotationPoint(-3.0F, 15.0F, -5.0F);
        this.body.addBox(0.0F, 0.0F, -4.9F, 6, 6, 10, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 0, 34);
        this.body2.setRotationPoint(3.0F, 0.2F, 4.6F);
        this.body2.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 7, 0.0F);
        this.shape20 = new AdvancedModelRenderer(this, 4, 0);
        this.shape20.setRotationPoint(5.4F, 5.6F, 3.0F);
        this.shape20.addBox(0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F);
        this.setRotateAngle(shape20, 0.33702307856010505F, 0.0F, -0.4808382089244378F);
        this.shape5 = new AdvancedModelRenderer(this, 22, 15);
        this.shape5.setRotationPoint(0.6F, 0.4F, -8.7F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(shape5, 0.012391837689159737F, 0.0F, 0.0F);
        this.shape16 = new AdvancedModelRenderer(this, 0, 17);
        this.shape16.setRotationPoint(1.5F, -3.2F, 1.9F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 0, 4, 4, 0.0F);
        this.setRotateAngle(shape16, -0.44470989340815514F, 0.0F, 0.0F);
        this.shape10 = new AdvancedModelRenderer(this, 37, 35);
        this.shape10.setRotationPoint(3.5F, 1.0F, 8.0F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(shape10, -3.141767186514992F, 1.5707963267948966F, 0.0F);
        this.shape21 = new AdvancedModelRenderer(this, 0, 11);
        this.shape21.setRotationPoint(1.5F, 4.6F, 5.0F);
        this.shape21.addBox(0.0F, 0.0F, 0.0F, 0, 4, 4, 0.0F);
        this.setRotateAngle(shape21, -2.2848105237857768F, 0.0F, 0.0F);
        this.shape11 = new AdvancedModelRenderer(this, 20, 32);
        this.shape11.setRotationPoint(0.5F, 0.2F, 5.0F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 41, 18);
        this.shape7.setRotationPoint(0.5F, 0.5F, -3.2F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(shape7, -0.2950261373274254F, 0.0F, 0.0F);
        this.shape8 = new AdvancedModelRenderer(this, 44, 10);
        this.shape8.setRotationPoint(0.5F, 0.5F, -4.9F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(shape8, 0.0012217304763960308F, 0.0F, 0.0F);
        this.shape17 = new AdvancedModelRenderer(this, 35, 3);
        this.shape17.setRotationPoint(0.6F, 5.6F, -4.4F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F);
        this.setRotateAngle(shape17, 0.18884462506578648F, 0.0F, 0.4808382089244378F);
        this.tail = new AdvancedModelRenderer(this, 24, 15);
        this.tail.setRotationPoint(1.0F, 1.7F, 4.9F);
        this.tail.addBox(0.0F, 0.0F, -4.9F, 0, 5, 11, 0.0F);
        this.setRotateAngle(tail, 1.5280357601210355F, 0.0F, 0.0F);
        this.body.addChild(this.shape18);
        this.shape8.addChild(this.shape9);
        this.body2.addChild(this.shape6);
        this.body.addChild(this.shape19);
        this.body.addChild(this.body2);
        this.body.addChild(this.shape20);
        this.body.addChild(this.shape5);
        this.shape6.addChild(this.shape16);
        this.shape9.addChild(this.shape10);
        this.shape6.addChild(this.shape21);
        this.shape6.addChild(this.shape11);
        this.shape5.addChild(this.shape7);
        this.shape5.addChild(this.shape8);
        this.body.addChild(this.shape17);
        this.shape11.addChild(this.tail);
        
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
    	    this.body.render(f5);
    	    GlStateManager.popMatrix();
     	}
     	else {
            this.body.render(f5);
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

    	swing(body2, 0.3f, 0.5f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);  
    	swing(tail, 0.6f, 0.75f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);  	
    	flap(shape17, 0.6f, 0.75f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);  	
    	flap(shape18, 0.6f, 0.75f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);  	
    	walk(shape17, 0.6f, -0.5f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);  	
    	walk(shape18, 0.6f, -0.5f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   
    }
}
