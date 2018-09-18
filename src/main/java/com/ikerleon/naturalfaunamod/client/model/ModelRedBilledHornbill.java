package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Red-Billed Hornbill - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelRedBilledHornbill extends BookwormModelBase {
    public BookwormModelRenderer field_192764_a;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape6;
    public BookwormModelRenderer shape7;
    public BookwormModelRenderer shape6_1;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape14_1;
    public BookwormModelRenderer shape16;
    public BookwormModelRenderer shape16_1;
    public BookwormModelRenderer shape9;
    public BookwormModelRenderer shape12;
    public BookwormModelRenderer shape18;
    public BookwormModelRenderer shape18_1;

    public ModelRedBilledHornbill() {
        this.textureWidth = 64;
        this.textureHeight = 30;
        this.shape6 = new BookwormModelRenderer(this, 25, 0, "shape6");
        this.shape6.setRotationPoint(-1.0F, 1.2F, 6.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(shape6, -0.091106186954104F, 0.0F, 0.0F);
        this.shape16 = new BookwormModelRenderer(this, 0, 0, "shape16");
        this.shape16.setRotationPoint(0.5F, 3.5F, 1.0F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape16, 0.136659280431156F, 0.0F, 0.0F);
        this.shape18_1 = new BookwormModelRenderer(this, -2, 1, "shape18_1");
        this.shape18_1.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape7 = new BookwormModelRenderer(this, 32, 0, "shape7");
        this.shape7.setRotationPoint(-0.5F, 0.4F, 5.0F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(shape7, -0.091106186954104F, 0.0F, 0.0F);
        this.shape9 = new BookwormModelRenderer(this, 33, 8, "shape9");
        this.shape9.setRotationPoint(-0.5F, -4.3F, 0.3F);
        this.shape9.addBox(-1.5F, -2.7F, -1.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(shape9, 1.730144887501979F, 0.0F, 0.0F);
        this.field_192764_a = new BookwormModelRenderer(this, 0, 0, "field_192764_a");
        this.field_192764_a.setRotationPoint(0.0F, 17.2F, 0.0F);
        this.field_192764_a.addBox(-1.9F, 0.0F, -2.0F, 4, 4, 8, 0.0F);
        this.setRotateAngle(field_192764_a, -0.136659280431156F, 0.0F, 0.008194036358235573F);
        this.shape12 = new BookwormModelRenderer(this, 54, 0, "shape12");
        this.shape12.setRotationPoint(-1.0F, -6.4F, -1.0F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape12, 0.045553093477052F, 0.0F, 0.0F);
        this.shape6_1 = new BookwormModelRenderer(this, 41, 0, "shape6_1");
        this.shape6_1.setRotationPoint(-0.5F, 1.6F, 5.9F);
        this.shape6_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(shape6_1, -0.091106186954104F, 0.0F, 0.0F);
        this.shape16_1 = new BookwormModelRenderer(this, 25, 0, "shape16_1");
        this.shape16_1.setRotationPoint(-1.5F, 3.5F, 1.0F);
        this.shape16_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape16_1, 0.136659280431156F, 0.0F, 0.0F);
        this.shape14_1 = new BookwormModelRenderer(this, 19, 10, "shape14_1");
        this.shape14_1.setRotationPoint(1.8F, 1.5F, -0.8F);
        this.shape14_1.addBox(0.0F, -1.5F, 0.0F, 1, 3, 7, 0.0F);
        this.setRotateAngle(shape14_1, -0.045553093477052F, 0.091106186954104F, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 3, 12, "shape5");
        this.shape5.setRotationPoint(0.5F, 2.5F, -1.7F);
        this.shape5.addBox(-1.5F, -3.9F, -1.5F, 2, 4, 3, 0.0F);
        this.shape18 = new BookwormModelRenderer(this, -1, 1, "shape18");
        this.shape18.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape14 = new BookwormModelRenderer(this, 48, 9, "shape14");
        this.shape14.setRotationPoint(-2.0F, 1.5F, -0.8F);
        this.shape14.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 7, 0.0F);
        this.setRotateAngle(shape14, -0.045553093477052F, -0.091106186954104F, 0.0F);
        this.field_192764_a.addChild(this.shape6);
        this.field_192764_a.addChild(this.shape16);
        this.shape16_1.addChild(this.shape18_1);
        this.field_192764_a.addChild(this.shape7);
        this.shape5.addChild(this.shape9);
        this.shape9.addChild(this.shape12);
        this.field_192764_a.addChild(this.shape6_1);
        this.field_192764_a.addChild(this.shape16_1);
        this.field_192764_a.addChild(this.shape14_1);
        this.field_192764_a.addChild(this.shape5);
        this.shape16.addChild(this.shape18);
        this.field_192764_a.addChild(this.shape14);
        
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
    	    this.field_192764_a.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            this.field_192764_a.render(f5);
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
    	float globalDegree = 1.5F;
    	
        this.shape9.rotateAngleY = (f3 * 0.017453292F);
        this.shape9.rotateAngleX = (f4 * 0.017453292F)+1.7F;
    	
    	
    	walk(shape16, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape16_1, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape18, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(shape18_1, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape6, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape7, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(shape5, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(shape5, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape9, 0.17f, 0.1f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape7, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	walk(shape6, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape14, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(shape14_1, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
