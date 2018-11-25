package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Turaco - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelTuraco extends BookwormModelBase {
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
    public BookwormModelRenderer shape10;
    public BookwormModelRenderer shape12;
    public BookwormModelRenderer shape13;
    public BookwormModelRenderer shape18;
    public BookwormModelRenderer shape18_1;

    public ModelTuraco() {
        this.textureWidth = 64;
        this.textureHeight = 30;
        this.shape7 = new BookwormModelRenderer(this, 32, 0, "shape7");
        this.shape7.setRotationPoint(-0.5F, 0.4F, 3.5F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(shape7, 0.091106186954104F, 0.0F, 0.0F);
        this.shape6_1 = new BookwormModelRenderer(this, 41, 0, "shape6_1");
        this.shape6_1.setRotationPoint(-0.5F, 1.6F, 4.9F);
        this.shape6_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.shape18 = new BookwormModelRenderer(this, -1, 1, "shape18");
        this.shape18.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.field_192764_a = new BookwormModelRenderer(this, 0, 0, "field_192764_a");
        this.field_192764_a.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.field_192764_a.addBox(-1.9F, 0.0F, -2.0F, 4, 4, 7, 0.0F);
        this.shape6 = new BookwormModelRenderer(this, 25, 0, "shape6");
        this.shape6.setRotationPoint(-1.0F, 1.2F, 5.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(shape6, 0.091106186954104F, 0.0F, 0.0F);
        this.shape16_1 = new BookwormModelRenderer(this, 25, 0, "shape16_1");
        this.shape16_1.setRotationPoint(-1.5F, 3.5F, 1.0F);
        this.shape16_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape14 = new BookwormModelRenderer(this, 48, 0, "shape14");
        this.shape14.setRotationPoint(-2.0F, 1.5F, -0.8F);
        this.shape14.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(shape14, -0.045553093477052F, -0.091106186954104F, 0.0F);
        this.shape12 = new BookwormModelRenderer(this, 55, 11, "shape12");
        this.shape12.setRotationPoint(-1.0F, -4.0F, -0.4F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape12, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape10 = new BookwormModelRenderer(this, 45, 9, "shape10");
        this.shape10.setRotationPoint(-1.0F, -6.5F, 0.2F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(shape10, -0.36425021489121656F, 0.0F, 0.0F);
        this.shape13 = new BookwormModelRenderer(this, 41, 0, "shape13");
        this.shape13.setRotationPoint(-0.5F, -3.7F, -0.5F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape14_1 = new BookwormModelRenderer(this, 19, 6, "shape14_1");
        this.shape14_1.setRotationPoint(1.8F, 1.5F, -0.8F);
        this.shape14_1.addBox(0.0F, -1.5F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(shape14_1, -0.045553093477052F, 0.091106186954104F, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 15, 0, "shape5");
        this.shape5.setRotationPoint(0.5F, 2.2F, -1.0F);
        this.shape5.addBox(-1.5F, -3.9F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(shape5, 0.5918411493512771F, 0.0F, 0.0F);
        this.shape16 = new BookwormModelRenderer(this, 0, 0, "shape16");
        this.shape16.setRotationPoint(0.5F, 3.5F, 1.0F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape18_1 = new BookwormModelRenderer(this, -2, 1, "shape18_1");
        this.shape18_1.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape9 = new BookwormModelRenderer(this, 33, 8, "shape9");
        this.shape9.setRotationPoint(-0.5F, -3.0F, 0.5F);
        this.shape9.addBox(-1.5F, -2.7F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape9, 1.0016444577195458F, 0.0F, 0.0F);
        this.field_192764_a.addChild(this.shape7);
        this.field_192764_a.addChild(this.shape6_1);
        this.shape16.addChild(this.shape18);
        this.field_192764_a.addChild(this.shape6);
        this.field_192764_a.addChild(this.shape16_1);
        this.field_192764_a.addChild(this.shape14);
        this.shape9.addChild(this.shape12);
        this.shape5.addChild(this.shape10);
        this.shape9.addChild(this.shape13);
        this.field_192764_a.addChild(this.shape14_1);
        this.field_192764_a.addChild(this.shape5);
        this.field_192764_a.addChild(this.shape16);
        this.shape16_1.addChild(this.shape18_1);
        this.shape5.addChild(this.shape9);
        
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
        this.shape9.rotateAngleX = (f4 * 0.017453292F)+1.2F;

        this.shape16.rotateAngleX = 1F * f1 * (0.8f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0F;
        this.shape16_1.rotateAngleX = -1F * f1 * (0.8f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0F;
        this.shape18.rotateAngleX = 1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 2.5f) + 0F;
        this.shape18_1.rotateAngleX = -1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 2.5f) + 0F;
        this.shape6.rotateAngleX = this.shape7.rotateAngleX =
                -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.8f * globalSpeed) + 2.5f) + 0.091106186954104F;
        this.shape5.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.8f * globalSpeed) + 2.5f) + 0.5918411493512771F;

        this.shape5.rotateAngleX = 1F * 0.5F * (0.08f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 0.5918411493512771F;
        this.shape9.rotateAngleX = -1F * 0.5F * (0.1f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 1.0016444577195458F;
        this.shape7.rotateAngleX = this.shape6.rotateAngleX =
                1F * 0.5F * (0.08f) * MathHelper.cos(entity.ticksExisted * (0.2f) + 2.5f) + 0.091106186954104F;
        this.shape14.rotateAngleX = this.shape14_1.rotateAngleX =
                -1F * 0.5F * (0.04f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + -0.045553093477052F;
    }
}
