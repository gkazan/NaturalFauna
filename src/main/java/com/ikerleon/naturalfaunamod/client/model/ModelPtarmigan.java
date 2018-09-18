package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Ptarmigan - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelPtarmigan extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak2;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer shape20;
    public BookwormModelRenderer shape21;
    public BookwormModelRenderer shape22;
    public BookwormModelRenderer shape23;

    public ModelPtarmigan() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.leftwing = new BookwormModelRenderer(this, 45, 2, "leftwing");
        this.leftwing.setRotationPoint(3.1F, 0.2F, 1.4F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 1, 6, 8, 0.0F);
        this.setRotateAngle(leftwing, 0.07051130178057091F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 33, 16, "head");
        this.head.setRotationPoint(0.4F, 0.8F, -4.3F);
        this.head.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -2.041337093132568F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 2, 26, "leftleg");
        this.leftleg.setRotationPoint(1.3F, 3.1F, 6.6F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftleg, 0.11152653920243764F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 20, 33, "neck");
        this.neck.setRotationPoint(0.0F, 3.4F, 3.8F);
        this.neck.addBox(-0.6F, 0.0F, -6.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(neck, -0.9798278420696166F, 0.0F, 0.0F);
        this.shape20 = new BookwormModelRenderer(this, 19, 11, "shape20");
        this.shape20.setRotationPoint(0.7F, 6.9F, 0.9F);
        this.shape20.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape20, 0.0F, 1.3100441365469437F, 0.0F);
        this.shape22 = new BookwormModelRenderer(this, 12, 22, "shape22");
        this.shape22.setRotationPoint(0.7F, 6.9F, 0.9F);
        this.shape22.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape22, 0.0F, 1.3100441365469437F, 0.0F);
        this.beak = new BookwormModelRenderer(this, 32, 6, "beak");
        this.beak.setRotationPoint(0.5F, 1.5F, 4.1F);
        this.beak.addBox(-0.5F, -0.1F, -0.4F, 1, 2, 1, 0.0F);
        this.setRotateAngle(beak, -1.454906464462473F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 33, 24, "tail2");
        this.tail2.setRotationPoint(0.0F, 3.9F, 9.4F);
        this.tail2.addBox(-1.0F, -0.6F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(tail2, 0.3178244567881674F, 0.0F, 0.0F);
        this.tail1 = new BookwormModelRenderer(this, 41, 34, "tail1");
        this.tail1.setRotationPoint(0.0F, 0.0F, 10.9F);
        this.tail1.addBox(-1.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(tail1, -0.2748893571891069F, 0.0F, 0.0F);
        this.shape23 = new BookwormModelRenderer(this, 12, 11, "shape23");
        this.shape23.setRotationPoint(0.3F, 6.9F, 1.1F);
        this.shape23.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape23, 0.0F, 1.8018779197589456F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 23, 17, "rightleg");
        this.rightleg.setRotationPoint(-1.4F, 3.1F, 6.6F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightleg, 0.11152653920243764F, 0.0F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 8, 47, "rightwing");
        this.rightwing.setRotationPoint(-2.1F, 0.2F, 1.5F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 1, 6, 8, 0.0F);
        this.setRotateAngle(rightwing, 0.07051130178057091F, 0.0F, 0.0F);
        this.beak2 = new BookwormModelRenderer(this, 37, 9, "beak2");
        this.beak2.setRotationPoint(0.5F, 0.4F, 2.1F);
        this.beak2.addBox(-0.5F, -0.1F, -0.4F, 1, 2, 2, 0.0F);
        this.setRotateAngle(beak2, -0.4403465702781693F, 0.0F, 0.0F);
        this.shape21 = new BookwormModelRenderer(this, 5, 11, "shape21");
        this.shape21.setRotationPoint(0.3F, 6.9F, 1.1F);
        this.shape21.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape21, 0.0F, 1.8018779197589456F, 0.0F);
        this.body = new BookwormModelRenderer(this, 32, 45, "body");
        this.body.setRotationPoint(-1.0F, 13.0F, -6.6F);
        this.body.addBox(-1.5F, -0.1F, 1.0F, 5, 7, 10, 0.0F);
        this.setRotateAngle(body, -0.10838494654884787F, 0.0F, 0.0F);
        this.body.addChild(this.leftwing);
        this.neck.addChild(this.head);
        this.body.addChild(this.leftleg);
        this.body.addChild(this.neck);
        this.leftleg.addChild(this.shape20);
        this.rightleg.addChild(this.shape22);
        this.head.addChild(this.beak);
        this.body.addChild(this.tail2);
        this.body.addChild(this.tail1);
        this.rightleg.addChild(this.shape23);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.rightwing);
        this.head.addChild(this.beak2);
        this.leftleg.addChild(this.shape21);
        
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
    
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	reset();
    	
    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 2.5F;
    	
    	
    	walk(leftleg, 1.5f * globalSpeed, 0.25f * globalDegree, false, 0, 0.2f, f, f1);
     	walk(rightleg, 1.5f * globalSpeed, 0.25f * globalDegree, true, 0, 0.2f, f, f1);
     	walk(neck, 1f * globalSpeed, 0.25f * globalDegree, false, 0, 0f, f, f1);
     	walk(tail1, 1f * globalSpeed, 0.35f * globalDegree, false, 0, 0f, f, f1);
     	walk(tail2, 1f * globalSpeed, 0.35f * globalDegree, false, 0, 0f, f, f1);
     	
     	walk(neck, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(tail1, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);  
     	walk(tail2, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
     	walk(leftwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(rightwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
