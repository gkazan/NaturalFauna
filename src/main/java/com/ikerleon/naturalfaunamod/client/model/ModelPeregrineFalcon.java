package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Peregrine Falcon - Bolcko
 * Created using Tabula 7.0.0
 */
public class ModelPeregrineFalcon extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer leftleg;
    public AdvancedModelRenderer rightleg;
    public AdvancedModelRenderer leftwing;
    public AdvancedModelRenderer rightwing;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer tail;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer leftwing2;
    public AdvancedModelRenderer rightwing2;
    public AdvancedModelRenderer beak;
    public AdvancedModelRenderer beak2;
    public AdvancedModelRenderer beak3;

    public ModelPeregrineFalcon() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tail3 = new AdvancedModelRenderer(this, 15, 7);
        this.tail3.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.tail3.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 5, 0.0F);
        this.head = new AdvancedModelRenderer(this, 32, 0);
        this.head.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.head.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(head, 0.8293804605477054F, 0.0F, 0.0F);
        this.beak2 = new AdvancedModelRenderer(this, 48, 0);
        this.beak2.setRotationPoint(0.0F, -1.2F, -3.0F);
        this.beak2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak2, 0.7853981633974483F, 0.0F, 0.0F);
        this.beak3 = new AdvancedModelRenderer(this, 56, 0);
        this.beak3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.beak3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak3, -0.4623377188532979F, 0.0F, 0.0F);
        this.rightleg = new AdvancedModelRenderer(this, 26, 0);
        this.rightleg.setRotationPoint(-1.0F, 1.8F, 1.5F);
        this.rightleg.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.8206538142877338F, 0.0F, 0.0F);
        this.leftwing = new AdvancedModelRenderer(this, 23, 0);
        this.leftwing.setRotationPoint(2.0F, -1.0F, -2.0F);
        this.leftwing.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 7, 0.0F);
        this.setRotateAngle(leftwing, 0.5235987755982988F, 0.0F, 0.0F);
        this.leftwing2 = new AdvancedModelRenderer(this, 50, 7);
        this.leftwing2.setRotationPoint(-0.01F, 0.5F, 6.0F);
        this.leftwing2.addBox(-0.5F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 0, 10);
        this.tail2.setRotationPoint(0.0F, -1.0F, 2.5F);
        this.tail2.addBox(-1.0F, -0.5F, -0.5F, 2, 1, 5, 0.0F);
        this.setRotateAngle(tail2, 0.08726646259971647F, 0.0F, 0.0F);
        this.rightwing2 = new AdvancedModelRenderer(this, 22, 12);
        this.rightwing2.setRotationPoint(0.01F, 0.5F, 6.0F);
        this.rightwing2.addBox(-0.5F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
        this.beak = new AdvancedModelRenderer(this, 9, 11);
        this.beak.setRotationPoint(0.0F, -1.5F, -2.7F);
        this.beak.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(beak, 0.8726646259971648F, 0.0F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 14, 0);
        this.body2.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.body2.addBox(-1.5F, -2.5F, -0.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.6108652381980153F, 0.0F, 0.0F);
        this.tail = new AdvancedModelRenderer(this, 48, 0);
        this.tail.setRotationPoint(0.0F, -1.5F, 2.5F);
        this.tail.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 6, 0.0F);
        this.setRotateAngle(tail, 0.08726646259971647F, 0.0F, 0.0F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 19.7F, 0.0F);
        this.body.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 6, 0.0F);
        this.setRotateAngle(body, -0.8377580409572781F, 0.0F, 0.0F);
        this.rightwing = new AdvancedModelRenderer(this, 39, 0);
        this.rightwing.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.rightwing.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 7, 0.0F);
        this.setRotateAngle(rightwing, 0.5235987755982988F, 0.0F, 0.0F);
        this.leftleg = new AdvancedModelRenderer(this, 0, 0);
        this.leftleg.setRotationPoint(1.0F, 1.8F, 1.5F);
        this.leftleg.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.8346164483036883F, 0.0F, 0.0F);
        this.body2.addChild(this.tail3);
        this.body.addChild(this.head);
        this.head.addChild(this.beak2);
        this.beak2.addChild(this.beak3);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.leftwing);
        this.leftwing.addChild(this.leftwing2);
        this.body2.addChild(this.tail2);
        this.rightwing.addChild(this.rightwing2);
        this.head.addChild(this.beak);
        this.body.addChild(this.body2);
        this.body2.addChild(this.tail);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.leftleg);
        
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

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.5F;
    	
    	bob(body, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(rightleg, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(leftleg, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(head, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(body2, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(body2, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(head, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	walk(rightwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(leftwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
