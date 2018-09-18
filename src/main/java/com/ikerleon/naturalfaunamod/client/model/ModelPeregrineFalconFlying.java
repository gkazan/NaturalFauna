package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Peregrine Falcon - Bolcko
 * Created using Tabula 7.0.0
 */
public class ModelPeregrineFalconFlying extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer head;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer tail3;
    public BookwormModelRenderer leftwing2;
    public BookwormModelRenderer rightwing2;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer beak2;
    public BookwormModelRenderer beak3;

    public ModelPeregrineFalconFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new BookwormModelRenderer(this, 32, 0, "head");
        this.head.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.head.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(head, 0.13124875974997358F, 0.0F, 0.0F);
        this.tail3 = new BookwormModelRenderer(this, 15, 7, "tail3");
        this.tail3.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.tail3.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 5, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 39, 0, "rightwing");
        this.rightwing.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.rightwing.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 7, 0.0F);
        this.setRotateAngle(rightwing, -1.3962634015954636F, 3.141592653589793F, 1.5707963267948966F);
        this.beak2 = new BookwormModelRenderer(this, 48, 0, "beak2");
        this.beak2.setRotationPoint(0.0F, -1.2F, -3.0F);
        this.beak2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak2, 0.7853981633974483F, 0.0F, 0.0F);
        this.beak = new BookwormModelRenderer(this, 9, 11, "beak");
        this.beak.setRotationPoint(0.0F, -1.5F, -2.7F);
        this.beak.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(beak, 0.8726646259971648F, 0.0F, 0.0F);
        this.leftwing2 = new BookwormModelRenderer(this, 50, 7, "leftwing2");
        this.leftwing2.setRotationPoint(-0.01F, 0.5F, 6.0F);
        this.leftwing2.addBox(-0.5F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(leftwing2, 0.3490658503988659F, 3.141592653589793F, 0.0F);
        this.rightwing2 = new BookwormModelRenderer(this, 22, 12, "rightwing2");
        this.rightwing2.setRotationPoint(0.01F, 0.5F, 6.0F);
        this.rightwing2.addBox(-0.5F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(rightwing2, 0.3490658503988659F, 3.141592653589793F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 26, 0, "rightleg");
        this.rightleg.setRotationPoint(-1.0F, 1.8F, 1.5F);
        this.rightleg.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.3233086388621005F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 0, 10, "tail2");
        this.tail2.setRotationPoint(0.0F, -1.0F, 2.5F);
        this.tail2.addBox(-1.0F, -0.5F, -0.5F, 2, 1, 5, 0.0F);
        this.setRotateAngle(tail2, 0.08726646259971647F, 0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 14, 0, "body2");
        this.body2.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.body2.addBox(-1.5F, -2.5F, -0.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.08726646259971647F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(0.0F, 21.1F, 0.0F);
        this.body.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 6, 0.0F);
        this.setRotateAngle(body, -0.08726646259971647F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 0, 0, "leftleg");
        this.leftleg.setRotationPoint(1.0F, 1.8F, 1.5F);
        this.leftleg.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 1.3233086388621005F, 0.0F, 0.0F);
        this.beak3 = new BookwormModelRenderer(this, 56, 0, "beak3");
        this.beak3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.beak3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak3, -0.4623377188532979F, 0.0F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 23, 0, "leftwing");
        this.leftwing.setRotationPoint(2.0F, -1.0F, -2.0F);
        this.leftwing.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 7, 0.0F);
        this.setRotateAngle(leftwing, -1.3962634015954636F, 3.141592653589793F, -1.5707963267948966F);
        this.tail = new BookwormModelRenderer(this, 48, 0, "tail");
        this.tail.setRotationPoint(0.0F, -1.5F, 2.5F);
        this.tail.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 6, 0.0F);
        this.setRotateAngle(tail, 0.08726646259971647F, 0.0F, 0.0F);
        this.body.addChild(this.head);
        this.body2.addChild(this.tail3);
        this.body.addChild(this.rightwing);
        this.head.addChild(this.beak2);
        this.head.addChild(this.beak);
        this.leftwing.addChild(this.leftwing2);
        this.rightwing.addChild(this.rightwing2);
        this.body.addChild(this.rightleg);
        this.body2.addChild(this.tail2);
        this.body.addChild(this.body2);
        this.body.addChild(this.leftleg);
        this.beak2.addChild(this.beak3);
        this.body.addChild(this.leftwing);
        this.body2.addChild(this.tail);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
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
    	
    	walk(leftwing, 0.2f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(rightwing, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing, 0.2f * globalSpeed, 0.7f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing, 0.2f * globalSpeed, 0.7f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing2, 0.3f * globalSpeed, 0.35f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing2, 0.3f * globalSpeed, 0.35f * globalDegree, true, 0, 0f, f, f1);
 
    	walk(body2, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    }
}
