package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.entity.Entity;

/**
 * ModelKoriBustard - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelKoriBustardFlying extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer rightwing;
    public AdvancedModelRenderer rightleg;
    public AdvancedModelRenderer leftleg;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer leftwing;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer beak2;
    public AdvancedModelRenderer beak1;
    public AdvancedModelRenderer crest;
    public AdvancedModelRenderer rightwing2;
    public AdvancedModelRenderer rightleg2;
    public AdvancedModelRenderer leftleg2;
    public AdvancedModelRenderer tail;
    public AdvancedModelRenderer leftwing2;

    public ModelKoriBustardFlying() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body2 = new AdvancedModelRenderer(this, 39, 0);
        this.body2.setRotationPoint(3.4F, 2.5F, 8.6F);
        this.body2.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(body2, -0.10454522219446034F, 0.0F, 0.0F);
        this.leftwing = new AdvancedModelRenderer(this, 42, 10);
        this.leftwing.setRotationPoint(6.6F, 1.5F, 3.7F);
        this.leftwing.addBox(0.0F, -2.5F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(leftwing, -1.5481070465189704F, -3.141592653589793F, -1.2292353921796064F);
        this.leftwing2 = new AdvancedModelRenderer(this, 12, 26);
        this.leftwing2.setRotationPoint(0.0F, -2.5F, 7.8F);
        this.leftwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(leftwing2, -0.091106186954104F, 0.0F, 0.0F);
        this.beak2 = new AdvancedModelRenderer(this, 33, 21);
        this.beak2.setRotationPoint(-1.0F, -0.5F, -4.8F);
        this.beak2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(beak2, 0.22759093446006054F, 0.0F, 0.0F);
        this.leftleg2 = new AdvancedModelRenderer(this, 33, 26);
        this.leftleg2.setRotationPoint(0.0F, 4.9F, 0.2F);
        this.leftleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftleg2, 0.27314402793711257F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 0, 22);
        this.head.setRotationPoint(0.0F, -5.8F, -1.5F);
        this.head.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, -1.1383037381507017F, 0.0F, 0.0F);
        this.neck2 = new AdvancedModelRenderer(this, 21, 21);
        this.neck2.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.neck2.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(neck2, 0.9105382707654417F, 0.0F, 0.0F);
        this.rightleg = new AdvancedModelRenderer(this, 0, 14);
        this.rightleg.setRotationPoint(1.4F, 3.7F, 5.5F);
        this.rightleg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightleg, 1.0927506446736497F, 0.0F, 0.0F);
        this.rightwing = new AdvancedModelRenderer(this, 24, 8);
        this.rightwing.setRotationPoint(1.5F, 2.2F, 3.7F);
        this.rightwing.addBox(0.0F, -2.5F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(rightwing, -1.5481070465189704F, -3.141592653589793F, 1.2292353921796064F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(-3.5F, 8.6F, -4.9F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 5, 9, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 23, 0);
        this.neck.setRotationPoint(3.6F, 2.3F, 0.8F);
        this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, 0.5462880558742251F, 0.0F, 0.010821041362364843F);
        this.rightwing2 = new AdvancedModelRenderer(this, 52, 10);
        this.rightwing2.setRotationPoint(0.0F, -2.5F, 7.8F);
        this.rightwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(rightwing2, -0.091106186954104F, 0.0F, 0.0F);
        this.crest = new AdvancedModelRenderer(this, 0, 34);
        this.crest.setRotationPoint(0.0F, -5.4F, 0.0F);
        this.crest.addBox(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
        this.rightleg2 = new AdvancedModelRenderer(this, 0, 0);
        this.rightleg2.setRotationPoint(0.0F, 4.9F, 0.2F);
        this.rightleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightleg2, 0.22759093446006054F, 0.0F, 0.0F);
        this.leftleg = new AdvancedModelRenderer(this, 12, 14);
        this.leftleg.setRotationPoint(5.3F, 3.7F, 5.5F);
        this.leftleg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftleg, 1.0016444577195458F, 0.0F, 0.0F);
        this.beak1 = new AdvancedModelRenderer(this, 34, 10);
        this.beak1.setRotationPoint(-1.0F, -2.3F, 0.0F);
        this.beak1.addBox(0.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(beak1, 0.091106186954104F, 0.0F, 0.0F);
        this.tail = new AdvancedModelRenderer(this, 41, 23);
        this.tail.setRotationPoint(0.0F, -0.4F, 4.2F);
        this.tail.addBox(-2.0F, -2.0F, -0.1F, 4, 4, 4, 0.0F);
        this.setRotateAngle(tail, -0.25970499269675623F, 0.0F, 0.0F);
        this.body.addChild(this.body2);
        this.body.addChild(this.leftwing);
        this.leftwing.addChild(this.leftwing2);
        this.head.addChild(this.beak2);
        this.leftleg.addChild(this.leftleg2);
        this.neck2.addChild(this.head);
        this.neck.addChild(this.neck2);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.neck);
        this.rightwing.addChild(this.rightwing2);
        this.head.addChild(this.crest);
        this.rightleg.addChild(this.rightleg2);
        this.body.addChild(this.leftleg);
        this.head.addChild(this.beak1);
        this.body2.addChild(this.tail);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
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
    	float globalDegree = 1F;
    	
    	walk(leftwing, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(rightwing, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing, 0.4f * globalSpeed, 0.7f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing, 0.4f * globalSpeed, 0.7f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing2, 0.6f * globalSpeed, 0.4f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing2, 0.6f * globalSpeed, 0.4f * globalDegree, true, 0, 0f, f, f1);

    	walk(leftleg, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(leftleg2, 0.5f * globalSpeed, 0.1f * globalDegree, false, 0, 0f, f, f1);
    	walk(rightleg, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	walk(rightleg2, 0.5f * globalSpeed, 0.1f * globalDegree, false, 0, 0f, f, f1);
    }
}
