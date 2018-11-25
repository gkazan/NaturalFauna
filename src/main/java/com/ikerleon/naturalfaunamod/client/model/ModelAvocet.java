package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

public class ModelAvocet extends BookwormModelBase {
    public BookwormModelRenderer shape2;
    public BookwormModelRenderer shape3;
    public BookwormModelRenderer shape11;
    public BookwormModelRenderer shape11_1;
    public BookwormModelRenderer shape15;
    public BookwormModelRenderer shape15_1;
    public BookwormModelRenderer shape10;
    public BookwormModelRenderer shape4;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape6;
    public BookwormModelRenderer shape7;
    public BookwormModelRenderer shape16;
    public BookwormModelRenderer shape19;
    public BookwormModelRenderer shape16_1;
    public BookwormModelRenderer shape19_1;
    public BookwormModelRenderer shape9;

    public ModelAvocet() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape19 = new BookwormModelRenderer(this, 0, 0, "shape19");
        this.shape19.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.shape19.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
        this.shape19_1 = new BookwormModelRenderer(this, 0, 0, "shape19_1");
        this.shape19_1.setRotationPoint(0.0F, 6.7F, 0.0F);
        this.shape19_1.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
        this.shape9 = new BookwormModelRenderer(this, 40, 1, "shape9");
        this.shape9.setRotationPoint(0.0F, 2.3F, 0.0F);
        this.shape9.addBox(-2.0F, 0.0F, -1.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(shape9, 2.083050462255232F, 0.0F, 0.0F);
        this.shape16_1 = new BookwormModelRenderer(this, 59, 4, "shape16_1");
        this.shape16_1.setRotationPoint(-0.1F, 4.9F, 0.1F);
        this.shape16_1.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape16_1, -0.136659280431156F, 0.0F, 0.0F);
        this.shape10 = new BookwormModelRenderer(this, 0, 15, "shape10");
        this.shape10.setRotationPoint(3.4F, 1.7F, 8.6F);
        this.shape10.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 5, 0.0F);
        this.setRotateAngle(shape10, -0.27314402793711257F, 0.0F, 0.0F);
        this.shape15 = new BookwormModelRenderer(this, 0, 0, "shape15");
        this.shape15.setRotationPoint(1.8F, 3.7F, 4.5F);
        this.shape15.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(shape15, 0.136659280431156F, 0.0F, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 17, 22, "shape4");
        this.shape4.setRotationPoint(0.5F, 0.4F, -2.4F);
        this.shape4.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(shape4, -0.091106186954104F, 0.0F, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 34, 8, "shape5");
        this.shape5.setRotationPoint(0.0F, -5.2F, -0.1F);
        this.shape5.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(shape5, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape7 = new BookwormModelRenderer(this, 55, 0, "shape7");
        this.shape7.setRotationPoint(0.0F, -0.6F, -2.4F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape7, -0.22759093446006054F, 0.0F, 0.0F);
        this.shape11 = new BookwormModelRenderer(this, 24, 8, "shape11");
        this.shape11.setRotationPoint(-0.2F, -0.3F, 0.8F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(shape11, -0.045553093477052F, -0.091106186954104F, 0.0F);
        this.shape16 = new BookwormModelRenderer(this, 55, 4, "shape16");
        this.shape16.setRotationPoint(0.1F, 4.9F, 0.1F);
        this.shape16.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape16, -0.136659280431156F, 0.0F, 0.0F);
        this.shape6 = new BookwormModelRenderer(this, 29, 21, "shape6");
        this.shape6.mirror = true;
        this.shape6.setRotationPoint(-0.5F, -1.7F, -5.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(shape6, 0.091106186954104F, 0.0F, 0.0F);
        this.shape15_1 = new BookwormModelRenderer(this, 57, 5, "shape15_1");
        this.shape15_1.setRotationPoint(4.8F, 3.8F, 4.5F);
        this.shape15_1.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(shape15_1, 0.136659280431156F, 0.0F, 0.0F);
        this.shape3 = new BookwormModelRenderer(this, 23, 0, "shape3");
        this.shape3.setRotationPoint(3.1F, 1.7F, 0.2F);
        this.shape3.addBox(-1.5F, -1.5F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(shape3, -0.091106186954104F, 0.0F, 0.010821041362364843F);
        this.shape11_1 = new BookwormModelRenderer(this, 42, 8, "shape11_1");
        this.shape11_1.setRotationPoint(6.2F, -0.3F, 0.9F);
        this.shape11_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(shape11_1, -0.045553093477052F, 0.091106186954104F, 0.0F);
        this.shape2 = new BookwormModelRenderer(this, 0, 0, "shape2");
        this.shape2.setRotationPoint(-3.5F, 8.6F, -4.8F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 7, 6, 9, 0.0F);
        this.shape16.addChild(this.shape19);
        this.shape16_1.addChild(this.shape19_1);
        this.shape10.addChild(this.shape9);
        this.shape15_1.addChild(this.shape16_1);
        this.shape2.addChild(this.shape10);
        this.shape2.addChild(this.shape15);
        this.shape3.addChild(this.shape4);
        this.shape4.addChild(this.shape5);
        this.shape6.addChild(this.shape7);
        this.shape2.addChild(this.shape11);
        this.shape15.addChild(this.shape16);
        this.shape5.addChild(this.shape6);
        this.shape2.addChild(this.shape15_1);
        this.shape2.addChild(this.shape3);
        this.shape2.addChild(this.shape11_1);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
     	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.5F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.shape2.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 0.7F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.shape2.render(f5);
            GlStateManager.popMatrix();
    	}
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
    	float globalHeight = 0.5f;
    	float globalDegree = 1.5F;
    	
        this.shape5.rotateAngleY = (f3 * 0.017453292F);
        this.shape5.rotateAngleX = (f4 * 0.017453292F);

    	this.shape15.rotateAngleX = 1F * f1 * (0.8F * globalDegree) * MathHelper.cos(f * (0.5F * globalSpeed) + 0F) + 0.2F;
    	this.shape15_1.rotateAngleX = -1F * f1 * (0.8F * globalDegree) * MathHelper.cos(f * (0.5F * globalSpeed) + 0F) + 0.2F;
    	this.shape19.rotateAngleX = 1F * f1 * (0.5F * globalDegree) * MathHelper.cos(f * (0.5F * globalSpeed) + 2.5F) + 0F;
        this.shape16.rotateAngleX = 1F * f1 * (0.5F * globalDegree) * MathHelper.cos(f * (0.5F * globalSpeed) + 2.5F) + -0.14F;
        this.shape19_1.rotateAngleX = -1F * f1 * (0.5F * globalDegree) * MathHelper.cos(f * (0.5F * globalSpeed) + 2.5F) + 0F;
        this.shape16_1.rotateAngleX = -1F * f1 * (0.5F * globalDegree) * MathHelper.cos(f * (0.5F * globalSpeed) + 2.5F) + -0.14F;
    	this.shape10.rotateAngleX = -1F * f1 * (0.1F * globalDegree) * MathHelper.cos(f * (0.8F * globalSpeed) + 2.5F) + 0.3F;
        this.shape4.rotateAngleX = -1F * f1 * (0.1F * globalDegree) * MathHelper.cos(f * (0.8F * globalSpeed) + 2.5F) + -0.1F;

    	this.shape4.rotateAngleX = 1F * 0.5F * 0.08F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + -0.1F;
    	this.shape5.rotateAngleX = -1F * 0.5F * 0.1F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + 0.2F;
    	this.shape10.rotateAngleX = 1F * 0.5F * 0.08F * MathHelper.cos(entity.ticksExisted * (0.2F * globalSpeed) + 2.5F) + 0.3F;
    	this.shape11.rotateAngleX = this.shape11_1.rotateAngleX =
                -1F * 0.5F * 0.04F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + -0.05F;
    }
}
