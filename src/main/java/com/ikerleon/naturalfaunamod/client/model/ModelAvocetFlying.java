package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelAvocet - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelAvocetFlying extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer rightleg;
    public AdvancedModelRenderer rightwing;
    public AdvancedModelRenderer leftleg;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer leftwing;
    public AdvancedModelRenderer body2down;
    public AdvancedModelRenderer rightleg2;
    public AdvancedModelRenderer rightfoot;
    public AdvancedModelRenderer leftleg2;
    public AdvancedModelRenderer leftfoot;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer beak;
    public AdvancedModelRenderer beak2;

    public ModelAvocetFlying() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.leftleg = new AdvancedModelRenderer(this, 57, 5);
        this.leftleg.setRotationPoint(4.8F, 3.8F, 4.5F);
        this.leftleg.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(leftleg, 1.5025539530419183F, 0.0F, 0.0F);
        this.rightleg = new AdvancedModelRenderer(this, 0, 0);
        this.rightleg.setRotationPoint(1.8F, 3.7F, 4.5F);
        this.rightleg.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.5025539530419183F, 0.0F, 0.0F);
        this.rightfoot = new AdvancedModelRenderer(this, 0, 0);
        this.rightfoot.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.rightfoot.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 23, 0);
        this.neck.setRotationPoint(3.1F, 1.7F, 0.2F);
        this.neck.addBox(-1.5F, -1.5F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.091106186954104F, 0.0F, 0.010821041362364843F);
        this.neck2 = new AdvancedModelRenderer(this, 17, 22);
        this.neck2.setRotationPoint(0.5F, 0.4F, -2.4F);
        this.neck2.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(neck2, 1.3658946726107624F, 0.0F, 0.0F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(-3.5F, 8.6F, -4.8F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 6, 9, 0.0F);
        this.beak = new AdvancedModelRenderer(this, 29, 21);
        this.beak.mirror = true;
        this.beak.setRotationPoint(-0.5F, -1.7F, -5.0F);
        this.beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(beak, 0.091106186954104F, 0.0F, 0.0F);
        this.leftfoot = new AdvancedModelRenderer(this, 0, 0);
        this.leftfoot.setRotationPoint(0.0F, 6.7F, 0.0F);
        this.leftfoot.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
        this.body2down = new AdvancedModelRenderer(this, 40, 1);
        this.body2down.setRotationPoint(0.0F, 2.3F, 0.0F);
        this.body2down.addBox(-2.0F, 0.0F, -1.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(body2down, 2.083050462255232F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 34, 8);
        this.head.setRotationPoint(0.0F, -5.2F, -0.1F);
        this.head.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, -0.8196066167365371F, 0.0F, 0.0F);
        this.leftleg2 = new AdvancedModelRenderer(this, 59, 4);
        this.leftleg2.setRotationPoint(-0.1F, 4.9F, 0.1F);
        this.leftleg2.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(leftleg2, -0.136659280431156F, 0.0F, 0.0F);
        this.rightleg2 = new AdvancedModelRenderer(this, 55, 4);
        this.rightleg2.setRotationPoint(0.1F, 4.9F, 0.1F);
        this.rightleg2.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(rightleg2, -0.136659280431156F, 0.0F, 0.0F);
        this.beak2 = new AdvancedModelRenderer(this, 55, 0);
        this.beak2.setRotationPoint(0.0F, -0.6F, -2.4F);
        this.beak2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beak2, -0.22759093446006054F, 0.0F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 0, 15);
        this.body2.setRotationPoint(3.4F, 1.7F, 8.6F);
        this.body2.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 5, 0.0F);
        this.setRotateAngle(body2, -0.2410299697004169F, 0.0F, 0.0F);
        this.rightwing = new AdvancedModelRenderer(this, 24, 8);
        this.rightwing.setRotationPoint(1.9F, 0.5F, 4.6F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(rightwing, -1.2292353921796064F, -0.27314402793711257F, 1.5481070465189704F);
        this.leftwing = new AdvancedModelRenderer(this, 42, 8);
        this.leftwing.setRotationPoint(6.2F, 1.9F, 3.2F);
        this.leftwing.addBox(0.0F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(leftwing, -1.2747884856566583F, 0.31869712141416456F, -1.5481070465189704F);
        this.body.addChild(this.leftleg);
        this.body.addChild(this.rightleg);
        this.rightleg2.addChild(this.rightfoot);
        this.body.addChild(this.neck);
        this.neck.addChild(this.neck2);
        this.head.addChild(this.beak);
        this.leftleg2.addChild(this.leftfoot);
        this.body2.addChild(this.body2down);
        this.neck2.addChild(this.head);
        this.leftleg.addChild(this.leftleg2);
        this.rightleg.addChild(this.rightleg2);
        this.beak.addChild(this.beak2);
        this.body.addChild(this.body2);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.leftwing);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float scaleFactor= 0.7F;
    	
	    GlStateManager.pushMatrix();
	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        this.body .render(f5);
        GlStateManager.popMatrix();
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
    }
}
