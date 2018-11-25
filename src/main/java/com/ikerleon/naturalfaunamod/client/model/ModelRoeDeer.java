package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Roe Deer - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelRoeDeer extends BookwormModelBase {
    public BookwormModelRenderer shape1;
    public BookwormModelRenderer shape2;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape14_1;
    public BookwormModelRenderer shape14_2;
    public BookwormModelRenderer shape14_3;
    public BookwormModelRenderer shape3;
    public BookwormModelRenderer shape4;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape5_1;
    public BookwormModelRenderer shape15;
    public BookwormModelRenderer shape15_1;
    public BookwormModelRenderer shape15_2;
    public BookwormModelRenderer shape15_3;
    public BookwormModelRenderer shape5_2;
    public BookwormModelRenderer shape5_3;

    public ModelRoeDeer() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.shape14 = new BookwormModelRenderer(this, 0, 0, "shape14");
        this.shape14.setRotationPoint(0.9F, 5.1F, 1.3F);
        this.shape14.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape14_3 = new BookwormModelRenderer(this, 53, 28, "shape14_3");
        this.shape14_3.setRotationPoint(7.1F, 4.1F, 12.5F);
        this.shape14_3.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.shape1 = new BookwormModelRenderer(this, 0, 0, "shape1");
        this.shape1.setRotationPoint(-5.0F, 8.0F, -7.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 8, 8, 17, 0.0F);
        this.shape15 = new BookwormModelRenderer(this, 10, 8, "shape15");
        this.shape15.setRotationPoint(-2.3F, -8.0F, -0.5F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape15, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape15_1 = new BookwormModelRenderer(this, 10, 8, "shape15_1");
        this.shape15_1.setRotationPoint(1.8F, -8.0F, -0.5F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape15_1, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape5_1 = new BookwormModelRenderer(this, 55, 0, "shape5_1");
        this.shape5_1.setRotationPoint(3.2F, -3.4F, -0.5F);
        this.shape5_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5_1, -0.36425021489121656F, 1.0927506446736497F, 0.136659280431156F);
        this.shape14_1 = new BookwormModelRenderer(this, 67, 0, "shape14_1");
        this.shape14_1.setRotationPoint(7.1F, 5.1F, 1.3F);
        this.shape14_1.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape3 = new BookwormModelRenderer(this, 0, 28, "shape3");
        this.shape3.setRotationPoint(-0.2F, -1.0F, -6.4F);
        this.shape3.addBox(-2.8F, -2.5F, -5.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(shape3, 0.7618362184955249F, 0.0F, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 24, 28, "shape4");
        this.shape4.setRotationPoint(-1.6F, -0.4F, -8.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(shape4, 0.136659280431156F, 0.0F, 0.0F);
        this.shape5_3 = new BookwormModelRenderer(this, 0, 42, "shape5_3");
        this.shape5_3.setRotationPoint(0.0F, 5.0F, 2.7F);
        this.shape5_3.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.shape14_2 = new BookwormModelRenderer(this, 59, 43, "shape14_2");
        this.shape14_2.setRotationPoint(0.9F, 4.1F, 12.5F);
        this.shape14_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 37, 0, "shape5");
        this.shape5.setRotationPoint(-3.2F, -3.5F, -1.4F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5, -0.3574434308084387F, -1.0927506446736497F, -0.136659280431156F);
        this.shape5_2 = new BookwormModelRenderer(this, 62, 23, "shape5_2");
        this.shape5_2.setRotationPoint(0.1F, 5.0F, 2.7F);
        this.shape5_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.shape15_2 = new BookwormModelRenderer(this, 11, 2, "shape15_2");
        this.shape15_2.setRotationPoint(0.5F, 2.2F, -0.5F);
        this.shape15_2.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_2, 0.7285004297824331F, 0.0F, 0.0F);
        this.shape15_3 = new BookwormModelRenderer(this, 11, 2, "shape15_3");
        this.shape15_3.setRotationPoint(0.5F, 2.2F, -0.5F);
        this.shape15_3.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_3, 0.7285004297824331F, 0.0F, 0.0F);
        this.shape2 = new BookwormModelRenderer(this, 37, 0, "shape2");
        this.shape2.setRotationPoint(4.0F, 3.0F, 2.1F);
        this.shape2.addBox(-2.5F, -2.5F, -8.0F, 5, 5, 8, 0.0F);
        this.setRotateAngle(shape2, -0.6829473363053812F, 0.0F, 0.0F);
        this.shape1.addChild(this.shape14);
        this.shape1.addChild(this.shape14_3);
        this.shape3.addChild(this.shape15);
        this.shape3.addChild(this.shape15_1);
        this.shape3.addChild(this.shape5_1);
        this.shape1.addChild(this.shape14_1);
        this.shape2.addChild(this.shape3);
        this.shape3.addChild(this.shape4);
        this.shape14_3.addChild(this.shape5_3);
        this.shape1.addChild(this.shape14_2);
        this.shape3.addChild(this.shape5);
        this.shape14_2.addChild(this.shape5_2);
        this.shape15.addChild(this.shape15_2);
        this.shape15_1.addChild(this.shape15_3);
        this.shape1.addChild(this.shape2);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
     	if(this.isChild) {
     		float scaleFactor= 0.6F;
	    	
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

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	reset();

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1F;
    	
        this.shape2.rotateAngleY = (f3 * 0.017453292F) / 2F;
        this.shape3.rotateAngleX = (f4 * 0.017453292F) + 0.7F;

        this.shape14.rotateAngleX = this.shape14_2.rotateAngleX =
                1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
        this.shape14_1.rotateAngleX = this.shape14_3.rotateAngleX =
                -1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
        this.shape2.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 2.5f) + -0.6829473363053812F;

        this.shape2.rotateAngleX = 1F * 0.5F * (0.06f) * MathHelper.cos(entity.ticksExisted * (0.10f) + 2.5f) + -0.6829473363053812F;
    }
}
