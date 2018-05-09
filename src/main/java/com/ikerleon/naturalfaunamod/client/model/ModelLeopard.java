package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;

import net.minecraft.entity.Entity;

public class ModelLeopard extends 	MowzieModelBase {
    public MowzieModelRenderer shape1;
    public MowzieModelRenderer shape2;
    public MowzieModelRenderer shape2_1;
    public MowzieModelRenderer shape4;
    public MowzieModelRenderer shape4_1;
    public MowzieModelRenderer shape6;
    public MowzieModelRenderer shape11;
    public MowzieModelRenderer shape7;
    public MowzieModelRenderer shape8;
    public MowzieModelRenderer shape9;
    public MowzieModelRenderer shape9_1;
    public MowzieModelRenderer shape12;

    public ModelLeopard() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape2_1 = new MowzieModelRenderer(this, 31, 0);
        this.shape2_1.setRotationPoint(4.2F, 5.7F, 0.3F);
        this.shape2_1.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape7 = new MowzieModelRenderer(this, 20, 25);
        this.shape7.setRotationPoint(-0.4F, 0.7F, -4.6F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(shape7, 0.22759093446006054F, 0.0F, 0.0F);
        this.shape11 = new MowzieModelRenderer(this, 55, 0);
        this.shape11.setRotationPoint(2.4F, 0.8F, 15.1F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape11, 0.31869712141416456F, 0.0F, 0.0F);
        this.shape1 = new MowzieModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-3.5F, 8.3F, -7.3F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 17, 0.0F);
        this.shape9 = new MowzieModelRenderer(this, 9, 0);
        this.shape9.setRotationPoint(-1.2F, -1.1F, 2.9F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape4_1 = new MowzieModelRenderer(this, 48, 13);
        this.shape4_1.setRotationPoint(4.2F, 5.7F, 13.9F);
        this.shape4_1.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape6 = new MowzieModelRenderer(this, 0, 25);
        this.shape6.setRotationPoint(0.9F, -0.3F, -2.3F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape6, -0.22759093446006054F, 0.0F, 0.0F);
        this.shape2 = new MowzieModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(-0.2F, 5.7F, 0.3F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape4 = new MowzieModelRenderer(this, 43, 0);
        this.shape4.setRotationPoint(-0.2F, 5.7F, 13.9F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
        this.shape8 = new MowzieModelRenderer(this, 44, 26);
        this.shape8.setRotationPoint(1.3F, 2.0F, -2.4F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(shape8, 0.136659280431156F, 0.0F, 0.0F);
        this.shape12 = new MowzieModelRenderer(this, 44, 33);
        this.shape12.setRotationPoint(0.0F, 8.8F, 0.0F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape12, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape9_1 = new MowzieModelRenderer(this, 40, 0);
        this.shape9_1.setRotationPoint(5.0F, -1.1F, 2.9F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape1.addChild(this.shape2_1);
        this.shape6.addChild(this.shape7);
        this.shape1.addChild(this.shape11);
        this.shape7.addChild(this.shape9);
        this.shape1.addChild(this.shape4_1);
        this.shape1.addChild(this.shape6);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape4);
        this.shape7.addChild(this.shape8);
        this.shape11.addChild(this.shape12);
        this.shape7.addChild(this.shape9_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(MowzieModelRenderer MowzieModelRenderer, float x, float y, float z) {
        MowzieModelRenderer.rotateAngleX = x;
        MowzieModelRenderer.rotateAngleY = y;
        MowzieModelRenderer.rotateAngleZ = z;
    }
}
