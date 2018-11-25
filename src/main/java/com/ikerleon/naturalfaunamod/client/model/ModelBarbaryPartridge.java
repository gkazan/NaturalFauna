package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Barbary Partridge - M�rbis
 * Created using Tabula 7.0.0
 */
public class ModelBarbaryPartridge extends BookwormModelBase {
    public BookwormModelRenderer Body1;
    public BookwormModelRenderer Body2;
    public BookwormModelRenderer Neck1;
    public BookwormModelRenderer Wing11;
    public BookwormModelRenderer Wing12;
    public BookwormModelRenderer Foot11;
    public BookwormModelRenderer Foot21;
    public BookwormModelRenderer Tailfeather1;
    public BookwormModelRenderer Tailfeather2;
    public BookwormModelRenderer Tailfeather3;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Beak1;
    public BookwormModelRenderer Beak2;
    public BookwormModelRenderer Wing12_1;
    public BookwormModelRenderer Wing22;
    public BookwormModelRenderer Foot12;
    public BookwormModelRenderer Claw1;
    public BookwormModelRenderer Claw2;
    public BookwormModelRenderer Claw3;
    public BookwormModelRenderer Claw4;
    public BookwormModelRenderer Foot22;
    public BookwormModelRenderer Claw5;
    public BookwormModelRenderer Claw6;
    public BookwormModelRenderer Claw7;
    public BookwormModelRenderer Claw8;

    public ModelBarbaryPartridge() {
        this.textureWidth = 120;
        this.textureHeight = 70;
        this.Foot11 = new BookwormModelRenderer(this, 0, 12, "Foot11");
        this.Foot11.setRotationPoint(-2.0F, 3.7F, 5.7F);
        this.Foot11.addBox(-1.0F, 0.0F, -0.9F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Foot11, 1.0471975511965976F, 0.0F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 50, 8, "Head");
        this.Head.setRotationPoint(-0.6F, -0.3F, -5.8F);
        this.Head.addBox(-2.1F, -1.3F, -3.3F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, 1.0927506446736497F, 0.0F, 0.0F);
        this.Tailfeather2 = new BookwormModelRenderer(this, 0, 58, "Tailfeather2");
        this.Tailfeather2.setRotationPoint(0.8F, 0.0F, 3.6F);
        this.Tailfeather2.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.Claw1 = new BookwormModelRenderer(this, 0, 0, "Claw1");
        this.Claw1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw1.addBox(-0.4F, -0.4F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw1, 0.22759093446006054F, -1.0927506446736497F, 0.0F);
        this.Beak2 = new BookwormModelRenderer(this, 30, 5, "Beak2");
        this.Beak2.setRotationPoint(0.1F, 1.1F, -3.4F);
        this.Beak2.addBox(-0.7F, -0.5F, -1.6F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Beak2, -0.22759093446006054F, 0.0F, 0.0F);
        this.Wing22 = new BookwormModelRenderer(this, 59, 56, "Wing22");
        this.Wing22.setRotationPoint(-0.4F, -0.2F, 6.2F);
        this.Wing22.addBox(-0.6F, -4.0F, 0.0F, 1, 4, 10, 0.0F);
        this.setRotateAngle(Wing22, 1.5481070465189704F, 0.0F, 0.0F);
        this.Foot22 = new BookwormModelRenderer(this, 0, 20, "Foot22");
        this.Foot22.setRotationPoint(0.3F, 3.5F, 0.3F);
        this.Foot22.addBox(-0.8F, 0.0F, -0.4F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot22, -0.7740535232594852F, 0.0F, 0.0F);
        this.Claw6 = new BookwormModelRenderer(this, 0, 0, "Claw6");
        this.Claw6.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.Claw6.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw6, 0.22759093446006054F, 1.0927506446736497F, 0.0F);
        this.Body2 = new BookwormModelRenderer(this, 14, 28, "Body2");
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.7F);
        this.Body2.addBox(-2.5F, -1.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Body2, 0.091106186954104F, 0.0F, 0.0F);
        this.Claw5 = new BookwormModelRenderer(this, 0, 0, "Claw5");
        this.Claw5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw5.addBox(-0.4F, -0.4F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw5, 0.22759093446006054F, -1.0927506446736497F, 0.0F);
        this.Claw7 = new BookwormModelRenderer(this, 0, 0, "Claw7");
        this.Claw7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw7.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Claw7, 0.31869712141416456F, 0.0F, 0.0F);
        this.Tailfeather1 = new BookwormModelRenderer(this, 3, 39, "Tailfeather1");
        this.Tailfeather1.setRotationPoint(1.0F, -0.2F, 3.1F);
        this.Tailfeather1.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
        this.Wing11 = new BookwormModelRenderer(this, 50, 50, "Wing11");
        this.Wing11.setRotationPoint(2.7F, 0.6F, 0.7F);
        this.Wing11.addBox(0.2F, -5.7F, -0.4F, 1, 6, 7, 0.0F);
        this.setRotateAngle(Wing11, -1.1838568316277536F, 0.0F, 0.0F);
        this.Tailfeather3 = new BookwormModelRenderer(this, 0, 48, "Tailfeather3");
        this.Tailfeather3.setRotationPoint(-0.9F, 0.0F, 3.5F);
        this.Tailfeather3.addBox(-1.6F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.Claw4 = new BookwormModelRenderer(this, 0, 0, "Claw4");
        this.Claw4.setRotationPoint(-0.2F, 3.0F, 0.0F);
        this.Claw4.addBox(-0.5F, -0.3F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw4, 0.0F, -0.22759093446006054F, 0.0F);
        this.Wing12 = new BookwormModelRenderer(this, 50, 50, "Wing12");
        this.Wing12.setRotationPoint(-2.6F, 0.6F, 0.7F);
        this.Wing12.addBox(-1.1F, -6.2F, -0.4F, 1, 6, 7, 0.0F);
        this.setRotateAngle(Wing12, -1.1838568316277536F, 0.0F, 0.0F);
        this.Neck1 = new BookwormModelRenderer(this, 64, 30, "Neck1");
        this.Neck1.setRotationPoint(0.0F, 1.6F, 2.0F);
        this.Neck1.addBox(-2.1F, -0.8F, -5.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Neck1, -0.5918411493512771F, 0.0F, 0.0F);
        this.Claw3 = new BookwormModelRenderer(this, 0, 0, "Claw3");
        this.Claw3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw3.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Claw3, 0.31869712141416456F, 0.0F, 0.0F);
        this.Claw8 = new BookwormModelRenderer(this, 0, 0, "Claw8");
        this.Claw8.setRotationPoint(-0.2F, 3.0F, 0.0F);
        this.Claw8.addBox(-0.5F, -0.3F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw8, 0.0F, -0.22759093446006054F, 0.0F);
        this.Beak1 = new BookwormModelRenderer(this, 30, 11, "Beak1");
        this.Beak1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Beak1.addBox(-1.1F, -0.5F, -2.2F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Beak1, 0.27314402793711257F, 0.0F, 0.0F);
        this.Wing12_1 = new BookwormModelRenderer(this, 58, 55, "Wing12_1");
        this.Wing12_1.setRotationPoint(0.0F, 0.2F, 6.6F);
        this.Wing12_1.addBox(0.0F, -4.0F, 0.0F, 1, 4, 10, 0.0F);
        this.setRotateAngle(Wing12_1, 1.593485607070823F, 0.0F, 0.0F);
        this.Body1 = new BookwormModelRenderer(this, 36, 23, "Body1");
        this.Body1.setRotationPoint(0.0F, 12.0F, -3.4F);
        this.Body1.addBox(-3.0F, -1.5F, 0.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(Body1, -0.40980330836826856F, 0.0F, 0.0F);
        this.Foot12 = new BookwormModelRenderer(this, 0, 20, "Foot12");
        this.Foot12.setRotationPoint(0.3F, 3.5F, 0.3F);
        this.Foot12.addBox(-0.8F, 0.0F, -0.4F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot12, -0.7740535232594852F, 0.0F, 0.0F);
        this.Foot21 = new BookwormModelRenderer(this, 0, 12, "Foot21");
        this.Foot21.setRotationPoint(1.5F, 3.7F, 5.7F);
        this.Foot21.addBox(-1.0F, 0.0F, -0.9F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Foot21, 1.0471975511965976F, 0.0F, 0.0F);
        this.Claw2 = new BookwormModelRenderer(this, 0, 0, "Claw2");
        this.Claw2.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.Claw2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw2, 0.22759093446006054F, 1.0927506446736497F, 0.0F);
        this.Body1.addChild(this.Foot11);
        this.Neck1.addChild(this.Head);
        this.Body2.addChild(this.Tailfeather2);
        this.Foot12.addChild(this.Claw1);
        this.Head.addChild(this.Beak2);
        this.Wing12.addChild(this.Wing22);
        this.Foot21.addChild(this.Foot22);
        this.Foot22.addChild(this.Claw6);
        this.Body1.addChild(this.Body2);
        this.Foot22.addChild(this.Claw5);
        this.Foot22.addChild(this.Claw7);
        this.Body2.addChild(this.Tailfeather1);
        this.Body1.addChild(this.Wing11);
        this.Body2.addChild(this.Tailfeather3);
        this.Foot12.addChild(this.Claw4);
        this.Body1.addChild(this.Wing12);
        this.Body1.addChild(this.Neck1);
        this.Foot12.addChild(this.Claw3);
        this.Foot22.addChild(this.Claw8);
        this.Head.addChild(this.Beak1);
        this.Wing11.addChild(this.Wing12_1);
        this.Foot11.addChild(this.Foot12);
        this.Body1.addChild(this.Foot21);
        this.Foot12.addChild(this.Claw2);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.3F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.Body1.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 0.6F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.Body1.render(f5);
            GlStateManager.popMatrix();
    	}
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

    	this.Foot11.rotateAngleX = 1f * f1 * (0.25f * globalDegree) * MathHelper.cos(f * (1.5f * globalSpeed) + 0f) + 0.2f + 1.0471975511965976F;
     	this.Foot21.rotateAngleX = -1f * f1 * (0.25f * globalDegree) * MathHelper.cos(f * (1.5f * globalSpeed) + 0f) + 0.2f + 1.0471975511965976F;
     	this.Neck1.rotateAngleX = 1f * f1 * (0.25f * globalDegree) * MathHelper.cos(f * (1f * globalSpeed) + 0f) + 0f - 0.5918411493512771F;
     	this.Tailfeather1.rotateAngleX = this.Tailfeather2.rotateAngleX = this.Tailfeather3.rotateAngleX =
                1f * f1 * (0.35f * globalDegree) * MathHelper.cos(f * (1f * globalSpeed) + 0f) + 0f;

     	this.Neck1.rotateAngleX = 1f * 0.5F * (0.08f * globalDegree) * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5f) + 0f - 0.5918411493512771F;
     	this.Tailfeather1.rotateAngleX = this.Tailfeather2.rotateAngleX = this.Tailfeather3.rotateAngleX =
                1f * 0.5F * (0.08f * globalDegree) * MathHelper.cos(entity.ticksExisted * (0.2f * globalSpeed) + 2.5f) + 0f;
     	this.Wing11.rotateAngleX = this.Wing12.rotateAngleX =
                -1f * 0.5F * (0.04f * globalDegree) * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5f) + 0f - 1.1838568316277536F;
    }
}
