package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Grant's Gazelle - Doctor Hyena & Lukamas
 * Created using Tabula 7.0.0
 */
public class ModelGrantsGazelle extends BookwormModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Leg1;
    public BookwormModelRenderer Leg2;
    public BookwormModelRenderer Leg3;
    public BookwormModelRenderer Leg4;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer Tail2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape16;
    public BookwormModelRenderer shape16_1;
    public BookwormModelRenderer shape15;
    public BookwormModelRenderer shape15_1;
    public BookwormModelRenderer shape15_2;
    public BookwormModelRenderer shape15_3;
    public BookwormModelRenderer shape15_4;
    public BookwormModelRenderer shape15_5;
    public BookwormModelRenderer shape17;

    public ModelGrantsGazelle() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape16_1 = new BookwormModelRenderer(this, 54, 19, "shape16_1");
        this.shape16_1.setRotationPoint(-0.5F, -1.8F, -1.2F);
        this.shape16_1.addBox(0.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape16_1, 0.0F, -0.2617993877991494F, -2.231054382824351F);
        this.shape16 = new BookwormModelRenderer(this, 0, 0, "shape16");
        this.shape16.setRotationPoint(0.4F, -2.0F, -1.3F);
        this.shape16.addBox(0.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape16, -0.40980330836826856F, 0.0F, 0.7740535232594852F);
        this.shape15_2 = new BookwormModelRenderer(this, 59, 21, "shape15_2");
        this.shape15_2.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.shape15_2.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_2, 0.08726646259971647F, 0.0F, -0.08726646259971647F);
        this.Leg3 = new BookwormModelRenderer(this, 30, 0, "Leg3");
        this.Leg3.setRotationPoint(2.6F, 5.0F, 7.5F);
        this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Leg2 = new BookwormModelRenderer(this, 8, 0, "Leg2");
        this.Leg2.setRotationPoint(-2.6F, 5.0F, -5.7F);
        this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Tail1 = new BookwormModelRenderer(this, 46, 0, "Tail1");
        this.Tail1.setRotationPoint(0.0F, 0.1F, 8.6F);
        this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Tail1, 0.285012266850674F, 0.0F, 0.0F);
        this.shape15 = new BookwormModelRenderer(this, 8, 23, "shape15");
        this.shape15.setRotationPoint(-2.0F, -1.0F, -2.6F);
        this.shape15.addBox(0.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape15, -0.4363323129985824F, 0.0F, -0.17453292519943295F);
        this.shape15_3 = new BookwormModelRenderer(this, 30, 23, "shape15_3");
        this.shape15_3.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.shape15_3.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(shape15_3, -0.9075712110370513F, 0.0F, 0.0F);
        this.shape15_4 = new BookwormModelRenderer(this, 0, 23, "shape15_4");
        this.shape15_4.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.shape15_4.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_4, 0.08726646259971647F, 0.0F, 0.08726646259971647F);
        this.Tail2 = new BookwormModelRenderer(this, 57, 0, "Tail2");
        this.Tail2.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.Tail2.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Tail2, 0.17453292519943295F, 0.0F, 0.0F);
        this.shape15_1 = new BookwormModelRenderer(this, 16, 23, "shape15_1");
        this.shape15_1.setRotationPoint(2.0F, -1.0F, -2.6F);
        this.shape15_1.addBox(-2.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape15_1, -0.4363323129985824F, 0.0F, 0.17453292519943295F);
        this.shape15_5 = new BookwormModelRenderer(this, 34, 23, "shape15_5");
        this.shape15_5.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.shape15_5.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(shape15_5, -0.9075712110370513F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 46, 1, "Neck");
        this.Neck.setRotationPoint(0.1F, 0.5F, -3.0F);
        this.Neck.addBox(-1.5F, -8.0F, -5.0F, 3, 10, 5, 0.0F);
        this.setRotateAngle(Neck, 0.6108652381980153F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 41, 18, "head");
        this.head.setRotationPoint(0.0F, -6.3F, -1.2F);
        this.head.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head, 0F, 0.0F, 0.0F);
        this.shape14 = new BookwormModelRenderer(this, 0, 23, "shape14");
        this.shape14.setRotationPoint(0.0F, -0.7F, -4.5F);
        this.shape14.addBox(-1.0F, 0.0F, -3.5F, 2, 2, 4, 0.0F);
        this.Leg1 = new BookwormModelRenderer(this, 0, 0, "Leg1");
        this.Leg1.setRotationPoint(2.6F, 5.0F, -5.7F);
        this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(-0.2F, 7.0F, -0.1F);
        this.Body.addBox(-3.5F, 0.0F, -7.0F, 7, 7, 16, 0.0F);
        this.Leg4 = new BookwormModelRenderer(this, 38, 0, "Leg4");
        this.Leg4.setRotationPoint(-2.6F, 5.0F, 7.5F);
        this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.shape17 = new BookwormModelRenderer(this, 0, 0, "shape17");
        this.shape17.setRotationPoint(0F, 0F, 0F);
        this.shape17.addBox(0.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape16, -0.6108652381980153F, 0.0F, 0.0F);
        this.head.addChild(this.shape16_1);
        this.head.addChild(this.shape16);
        this.shape15.addChild(this.shape15_2);
        this.Body.addChild(this.Leg3);
        this.Body.addChild(this.Leg2);
        this.Body.addChild(this.Tail1);
        this.head.addChild(this.shape15);
        this.shape15_2.addChild(this.shape15_3);
        this.shape15_1.addChild(this.shape15_4);
        this.Tail1.addChild(this.Tail2);
        this.head.addChild(this.shape15_1);
        this.shape15_4.addChild(this.shape15_5);
        this.Body.addChild(this.Neck);
        this.head.addChild(this.shape14);
        this.Body.addChild(this.Leg1);
        this.Body.addChild(this.Leg4);
        this.Neck.addChild(this.shape17);
        this.shape17.addChild(this.head);
        
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
	    this.Body.render(f5);
	    GlStateManager.popMatrix();
 	   }
 	   else {
        this.Body.render(f5);
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
    	
        this.Neck.rotateAngleY = (f3 * 0.017453292F) / 2F;
        this.head.rotateAngleX = (f4 * 0.017453292F) - 0.4F;

        this.Leg1.rotateAngleX = 1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0F;
        this.Leg2.rotateAngleX = -1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0F;
        this.Leg3.rotateAngleX = 1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
        this.Leg4.rotateAngleX = -1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
        this.Neck.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 2.5f) + 0.6108652381980153F;

        this.Neck.rotateAngleX = 1F * 0.5F * (0.06f) * MathHelper.cos(entity.ticksExisted * (0.10f) + 2.5f) + 0.6108652381980153F;

        this.Tail1.rotateAngleZ = -1F * (MathHelper.cos(entity.ticksExisted * (0.2f) + 0f) * (0.2f) * 0.5F) + (0f * 0.5F);
        this.Tail2.rotateAngleZ = 1F * (MathHelper.cos(entity.ticksExisted * (0.15f) + 0f) * (0.4f) * 0.5F) + (0f * 0.5F);
    }
}
