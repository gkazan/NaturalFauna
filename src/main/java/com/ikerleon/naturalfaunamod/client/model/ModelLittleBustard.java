package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;

import net.minecraft.entity.Entity;

public class ModelLittleBustard extends MowzieModelBase {
    public MowzieModelRenderer shape1;
    public MowzieModelRenderer shape2;
    public MowzieModelRenderer shape3;
    public MowzieModelRenderer shape16;
    public MowzieModelRenderer shape5;
    public MowzieModelRenderer shape6;
    public MowzieModelRenderer shape8;
    public MowzieModelRenderer shape11;
    public MowzieModelRenderer shape4;
    public MowzieModelRenderer shape7;
    public MowzieModelRenderer shape9;
    public MowzieModelRenderer shape10;
    public MowzieModelRenderer shape13;
    public MowzieModelRenderer shape14;

    public ModelLittleBustard() {
        this.textureWidth = 180;
        this.textureHeight = 180;
        this.shape6 = new MowzieModelRenderer(this, 0, 0);
        this.shape6.setRotationPoint(0.5F, 20.8F, 1.6F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape6, -0.14486232791552936F, 0.0F, 0.0F);
        this.shape14 = new MowzieModelRenderer(this, 0, 0);
        this.shape14.setRotationPoint(0.0F, 7.9F, -0.1F);
        this.shape14.addBox(-0.9F, -2.0F, -2.4F, 2, 2, 3, 0.0F);
        this.shape10 = new MowzieModelRenderer(this, 0, 0);
        this.shape10.setRotationPoint(-1.5F, 23.7F, 1.2F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape8 = new MowzieModelRenderer(this, 0, 0);
        this.shape8.setRotationPoint(0.5F, 24.0F, 0.0F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape4 = new MowzieModelRenderer(this, 0, 0);
        this.shape4.setRotationPoint(-0.5F, 16.5F, 0.5F);
        this.shape4.addBox(-1.0F, -0.1F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape4, 0.20315632493213995F, 0.0F, 0.0F);
        this.shape1 = new MowzieModelRenderer(this, 39, 4);
        this.shape1.setRotationPoint(-1.5F, 10.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 8, 0.0F);
        this.setRotateAngle(shape1, -0.720820981073658F, 0.0F, 0.0F);
        this.shape2 = new MowzieModelRenderer(this, 19, 1);
        this.shape2.setRotationPoint(1.6F, 10.0F, 0.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(shape2, -0.686088928958971F, 0.0757472895365539F, 0.0F);
        this.shape9 = new MowzieModelRenderer(this, 0, 0);
        this.shape9.setRotationPoint(-1.5F, 24.0F, 0.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape5 = new MowzieModelRenderer(this, 0, 0);
        this.shape5.setRotationPoint(0.5F, 16.5F, 0.6F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape5, 0.20315632493213995F, 0.0F, 0.0F);
        this.shape16 = new MowzieModelRenderer(this, 0, 0);
        this.shape16.setRotationPoint(0.4F, 7.8F, -2.5F);
        this.shape16.addBox(-0.8F, -0.8F, -1.0F, 1, 1, 1, 0.0F);
        this.shape13 = new MowzieModelRenderer(this, 0, 0);
        this.shape13.setRotationPoint(0.0F, 7.7F, -0.5F);
        this.shape13.addBox(-1.0F, 0.1F, -1.1F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape13, -0.1107253923213551F, 0.0F, 0.0F);
        this.shape11 = new MowzieModelRenderer(this, 0, 0);
        this.shape11.setRotationPoint(0.5F, 23.7F, 1.1F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape7 = new MowzieModelRenderer(this, 0, 0);
        this.shape7.setRotationPoint(-0.5F, 20.8F, 1.6F);
        this.shape7.addBox(-1.0F, 0.1F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape7, -0.14486232791552936F, 0.0F, 0.0F);
        this.shape3 = new MowzieModelRenderer(this, 3, 2);
        this.shape3.setRotationPoint(-2.7F, 10.0F, 0.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(shape3, -0.686088928958971F, -0.07330382858376185F, -0.031415926535897934F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape6.render(f5);
        this.shape14.render(f5);
        this.shape10.render(f5);
        this.shape8.render(f5);
        this.shape4.render(f5);
        this.shape1.render(f5);
        this.shape2.render(f5);
        this.shape9.render(f5);
        this.shape5.render(f5);
        this.shape16.render(f5);
        this.shape13.render(f5);
        this.shape11.render(f5);
        this.shape7.render(f5);
        this.shape3.render(f5);
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
