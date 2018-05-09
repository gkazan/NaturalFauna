package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;

import net.minecraft.entity.Entity;

/**
 * WL Hyena - Doctor Hyena
 * Created using Tabula 6.0.0
 */
public class ModelHyena extends MowzieModelBase {
    public MowzieModelRenderer shape1;
    public MowzieModelRenderer shape2;
    public MowzieModelRenderer shape2_1;
    public MowzieModelRenderer shape2_2;
    public MowzieModelRenderer shape2_3;
    public MowzieModelRenderer shape7;
    public MowzieModelRenderer shape12;
    public MowzieModelRenderer shape8;
    public MowzieModelRenderer shape13;
    public MowzieModelRenderer shape9;
    public MowzieModelRenderer shape9_1;
    public MowzieModelRenderer shape11;

    public ModelHyena() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape2_1 = new MowzieModelRenderer(this, 28, 0);
        this.shape2_1.setRotationPoint(4.8F, 5.8F, 0.8F);
        this.shape2_1.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2_1, 0.045553093477052F, 0.0F, 0.0F);
        this.shape1 = new MowzieModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-3.4F, 8.9F, -6.8F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 7, 14, 0.0F);
        this.setRotateAngle(shape1, -0.045553093477052F, 0.0F, 0.0F);
        this.shape9_1 = new MowzieModelRenderer(this, 52, 14);
        this.shape9_1.setRotationPoint(4.1F, -1.9F, 2.6F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(shape9_1, 0.0F, 0.136659280431156F, 0.0F);
        this.shape8 = new MowzieModelRenderer(this, 0, 21);
        this.shape8.setRotationPoint(-0.5F, 1.7F, -3.6F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(shape8, 0.5462880558742251F, 0.0F, 0.0F);
        this.shape2_2 = new MowzieModelRenderer(this, 36, 0);
        this.shape2_2.setRotationPoint(0.1F, 5.5F, 11.8F);
        this.shape2_2.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2_2, 0.045553093477052F, 0.0F, 0.0F);
        this.shape12 = new MowzieModelRenderer(this, 52, 0);
        this.shape12.setRotationPoint(2.6F, 1.1F, 12.2F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(shape12, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape11 = new MowzieModelRenderer(this, 22, 21);
        this.shape11.setRotationPoint(1.6F, 1.8F, -2.7F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape11, 0.045553093477052F, 0.0F, 0.0F);
        this.shape9 = new MowzieModelRenderer(this, 52, 10);
        this.shape9.setRotationPoint(-1.4F, -2.0F, 2.6F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(shape9, 0.0F, -0.136659280431156F, 0.0F);
        this.shape2 = new MowzieModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(0.1F, 6.0F, 0.8F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2, 0.045553093477052F, 0.0F, 0.0F);
        this.shape7 = new MowzieModelRenderer(this, 34, 13);
        this.shape7.setRotationPoint(0.9F, -1.9F, -3.3F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 5, 5, 8, 0.0F);
        this.setRotateAngle(shape7, -0.40980330836826856F, 0.0F, 0.0F);
        this.shape2_3 = new MowzieModelRenderer(this, 44, 0);
        this.shape2_3.setRotationPoint(4.8F, 5.5F, 11.8F);
        this.shape2_3.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape2_3, 0.045553093477052F, 0.0F, 0.0F);
        this.shape13 = new MowzieModelRenderer(this, 6, 22);
        this.shape13.setRotationPoint(2.6F, -1.5F, -0.8F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 0, 3, 11, 0.0F);
        this.setRotateAngle(shape13, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape1.addChild(this.shape2_1);
        this.shape8.addChild(this.shape9_1);
        this.shape7.addChild(this.shape8);
        this.shape1.addChild(this.shape2_2);
        this.shape1.addChild(this.shape12);
        this.shape8.addChild(this.shape11);
        this.shape8.addChild(this.shape9);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape7);
        this.shape1.addChild(this.shape2_3);
        this.shape7.addChild(this.shape13);
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
