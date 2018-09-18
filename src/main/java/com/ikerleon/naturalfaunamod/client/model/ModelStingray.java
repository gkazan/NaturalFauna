package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * ray - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelStingray extends BookwormModelBase {
    public BookwormModelRenderer shape1;
    public BookwormModelRenderer front;
    public BookwormModelRenderer right;
    public BookwormModelRenderer left;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape6;
    public BookwormModelRenderer shape7;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer shape10;
    public BookwormModelRenderer shape11;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer shape12;

    public ModelStingray() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape5 = new BookwormModelRenderer(this, 26, 0, "shape5");
        this.shape5.setRotationPoint(-5.0F, -1.2F, 0.0F);
        this.shape5.addBox(0.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.shape12 = new BookwormModelRenderer(this, 15, 3, "shape12");
        this.shape12.setRotationPoint(0.4F, 0.1F, 0.0F);
        this.shape12.addBox(0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(shape12, 0.0F, 0.0F, -0.438601241026175F);
        this.shape10 = new BookwormModelRenderer(this, 12, 12, "shape10");
        this.shape10.setRotationPoint(1.3F, 1.1F, 1.1F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape10, 0.0F, -0.5220279792715039F, 0.0F);
        this.front = new BookwormModelRenderer(this, 44, 8, "front");
        this.front.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.front.addBox(-6.0F, 0.0F, -5.5F, 1, 1, 9, 0.0F);
        this.tail = new BookwormModelRenderer(this, 11, 7, "tail");
        this.tail.setRotationPoint(2.9F, 0.6F, 0.0F);
        this.tail.addBox(0.0F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.shape6 = new BookwormModelRenderer(this, 10, 23, "shape6");
        this.shape6.setRotationPoint(-2.1F, -1.5F, 0.0F);
        this.shape6.addBox(0.0F, 0.0F, -2.0F, 6, 2, 4, 0.0F);
        this.left = new BookwormModelRenderer(this, 34, 11, "left");
        this.left.setRotationPoint(-2.0F, 0.0F, -0.5F);
        this.left.addBox(-6.0F, 0.0F, -5.5F, 1, 1, 8, 0.0F);
        this.setRotateAngle(left, 0.0F, -1.5707963267948966F, 0.0F);
        this.right = new BookwormModelRenderer(this, 34, 0, "right");
        this.right.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.right.addBox(-6.0F, 0.0F, -5.5F, 1, 1, 8, 0.0F);
        this.setRotateAngle(right, 0.0F, 1.5707963267948966F, 0.0F);
        this.shape11 = new BookwormModelRenderer(this, 4, 10, "shape11");
        this.shape11.setRotationPoint(1.3F, 1.1F, -1.3F);
        this.shape11.addBox(0.0F, 0.0F, -0.8F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shape11, 0.0F, 0.5220279792715039F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 14, 16, "tail2");
        this.tail2.setRotationPoint(2.9F, 0.0F, 0.5F);
        this.tail2.addBox(0.0F, 0.0F, -1.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, -0.06876597252857658F);
        this.shape7 = new BookwormModelRenderer(this, 20, 8, "shape7");
        this.shape7.setRotationPoint(3.9F, -1.0F, 0.0F);
        this.shape7.addBox(0.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.shape1 = new BookwormModelRenderer(this, 22, 20, "shape1");
        this.shape1.setRotationPoint(0.0F, 23.0F, -0.1F);
        this.shape1.addBox(-5.0F, 0.0F, -5.5F, 10, 1, 11, 0.0F);
        this.setRotateAngle(shape1, 0.0F, -1.5707963267948966F, 0.0F);
        this.shape1.addChild(this.shape5);
        this.tail.addChild(this.shape12);
        this.shape7.addChild(this.shape10);
        this.shape1.addChild(this.front);
        this.shape7.addChild(this.tail);
        this.shape1.addChild(this.shape6);
        this.shape1.addChild(this.left);
        this.shape1.addChild(this.right);
        this.shape7.addChild(this.shape11);
        this.tail.addChild(this.tail2);
        this.shape1.addChild(this.shape7);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.shape1.render(f5);
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
    	float globalDegree = 2.5F;
    	

     	swing(tail, 1f * globalSpeed, 0.2f * globalDegree, false, 0, 0f, f, f1);
     	swing(tail2, 1f * globalSpeed, 0.2f * globalDegree, false, 0, 0f, f, f1);
     	flap(tail, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0, 0f, f, f1);
     	flap(tail2, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0, 0f, f, f1);
     	
     	flap(left, 1f * globalSpeed, 0.1f * globalDegree, false, 0, 0f, f, f1);
     	flap(right, 1f * globalSpeed, 0.1f * globalDegree, true, 0, 0f, f, f1);
     	flap(front, 1f * globalSpeed, 0.1f * globalDegree, false, 0, 0f, f, f1);
    }
}
