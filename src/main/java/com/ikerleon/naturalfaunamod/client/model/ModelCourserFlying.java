package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

public class ModelCourserFlying extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer rightwing2;
    public BookwormModelRenderer neck2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer beak2;
    public BookwormModelRenderer body3;
    public BookwormModelRenderer leftwing2;

    public ModelCourserFlying() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.beak2 = new BookwormModelRenderer(this, 35, 0, "beak2");
        this.beak2.setRotationPoint(0.5F, 0.6F, -1.6F);
        this.beak2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak2, 0.36425021489121656F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 23, 0, "neck");
        this.neck.setRotationPoint(3.6F, 3.4F, 2.2F);
        this.neck.addBox(-2.0F, -2.0F, -3.8F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.045553093477052F, 0.0F, 0.010821041362364843F);
        this.leftwing = new BookwormModelRenderer(this, 42, 10, "leftwing");
        this.leftwing.setRotationPoint(6.2F, 2.3F, 0.9F);
        this.leftwing.addBox(0.0F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(leftwing, -0.9560913642424937F, 0.091106186954104F, -1.6845917940249266F);
        this.head = new BookwormModelRenderer(this, 12, 17, "head");
        this.head.setRotationPoint(0.0F, -3.8F, -0.6F);
        this.head.addBox(-2.0F, -3.0F, -1.5F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, -0.6373942428283291F, 0.0F, 0.0F);
        this.neck2 = new BookwormModelRenderer(this, 0, 15, "neck2");
        this.neck2.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.neck2.addBox(-1.5F, -5.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(neck2, 0.9426523290021372F, 0.0F, 0.0F);
        this.beak = new BookwormModelRenderer(this, 35, 10, "beak");
        this.beak.setRotationPoint(-1.0F, -1.9F, -3.2F);
        this.beak.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(beak, 0.091106186954104F, 0.0F, 0.0F);
        this.rightwing2 = new BookwormModelRenderer(this, 52, 10, "rightwing2");
        this.rightwing2.setRotationPoint(0.1F, -1.0F, 6.3F);
        this.rightwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(rightwing2, 0.4553564018453205F, 0.0F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 24, 8, "rightwing");
        this.rightwing.setRotationPoint(1.6F, 0.9F, 1.2F);
        this.rightwing.addBox(0.0F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(rightwing, -1.0471975511965976F, -0.045553093477052F, 1.6390387005478748F);
        this.leftwing2 = new BookwormModelRenderer(this, 0, 23, "leftwing2");
        this.leftwing2.setRotationPoint(-0.1F, -1.0F, 6.3F);
        this.leftwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(leftwing2, 0.4553564018453205F, 0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 39, 0, "body2");
        this.body2.setRotationPoint(3.4F, 0.7F, 6.6F);
        this.body2.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(body2, 0.12322024519079966F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(-3.5F, 7.2F, -0.8F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 6, 9, 0.0F);
        this.body3 = new BookwormModelRenderer(this, 24, 21, "body3");
        this.body3.setRotationPoint(0.0F, 0.3F, 2.7F);
        this.body3.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(body3, 0.136659280431156F, 0.0F, 0.0F);
        this.beak.addChild(this.beak2);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftwing);
        this.neck2.addChild(this.head);
        this.neck.addChild(this.neck2);
        this.head.addChild(this.beak);
        this.rightwing.addChild(this.rightwing2);
        this.body.addChild(this.rightwing);
        this.leftwing.addChild(this.leftwing2);
        this.body.addChild(this.body2);
        this.body2.addChild(this.body3);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float scaleFactor= 0.7F;
    	
	    GlStateManager.pushMatrix();
	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        this.body.render(f5);
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	reset();
    	
    	float globalSpeed = 1.75f;
    	float globalDegree = 1F;
    	
    	walk(leftwing, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(rightwing, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing, 0.4f * globalSpeed, 0.7f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing, 0.4f * globalSpeed, 0.7f * globalDegree, true, 0, 0f, f, f1);
    }
}
