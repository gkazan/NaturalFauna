package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Cheetah - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelCheetah extends ModelBase {
    public ModelRenderer shape7;
    public ModelRenderer shape6;
    public ModelRenderer shape2;
    public ModelRenderer shape2_1;
    public ModelRenderer shape1;
    public ModelRenderer shape7_1;
    public ModelRenderer shape2_2;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    public ModelRenderer shape9_1;
    public ModelRenderer shape4;
    public ModelRenderer shape11;
    public ModelRenderer shape4_1;
    public ModelRenderer shape8_1;
    public ModelRenderer shape4_2;
    public ModelRenderer shape12;
    public ModelRenderer shape4_3;

    public ModelCheetah() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape7 = new ModelRenderer(this, 0, 0);
        this.shape7.setRotationPoint(-4.3F, 8.4F, -8.1F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
        this.setRotateAngle(shape7, -0.045553093477052F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 50, 12);
        this.shape8.setRotationPoint(-1.6F, -0.5F, -7.9F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape8, 0.136659280431156F, 0.0F, 0.0F);
        this.shape6 = new ModelRenderer(this, 30, 0);
        this.shape6.setRotationPoint(3.5F, 1.8F, 1.8F);
        this.shape6.addBox(-2.6F, -2.0F, -4.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape6, -0.40980330836826856F, 0.0F, 0.0F);
        this.shape2_2 = new ModelRenderer(this, 30, 34);
        this.shape2_2.setRotationPoint(-0.2F, -3.1F, -4.9F);
        this.shape2_2.addBox(0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F);
        this.setRotateAngle(shape2_2, 0.136659280431156F, 0.0F, 0.0F);
        this.shape9_1 = new ModelRenderer(this, 22, 0);
        this.shape9_1.setRotationPoint(1.9F, -3.6F, -2.0F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape1 = new ModelRenderer(this, 27, 11);
        this.shape1.setRotationPoint(0.7F, 0.0F, 7.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 11, 0.0F);
        this.setRotateAngle(shape1, 0.091106186954104F, 0.0F, 0.0F);
        this.shape7_1 = new ModelRenderer(this, 0, 15);
        this.shape7_1.setRotationPoint(0.0F, -0.3F, -2.9F);
        this.shape7_1.addBox(-3.1F, -2.5F, -5.5F, 6, 5, 5, 0.0F);
        this.setRotateAngle(shape7_1, 0.4553564018453205F, 0.0F, 0.0F);
        this.shape9 = new ModelRenderer(this, 0, 0);
        this.shape9.setRotationPoint(-4.1F, -3.6F, -2.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape2_1 = new ModelRenderer(this, 30, 10);
        this.shape2_1.setRotationPoint(6.1F, 5.7F, 2.0F);
        this.shape2_1.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(shape2_1, 0.045553093477052F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 18, 24);
        this.shape4.setRotationPoint(0.8F, 1.8F, 7.6F);
        this.shape4.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(shape4, -0.136659280431156F, 0.0F, 0.0F);
        this.shape8_1 = new ModelRenderer(this, 0, 32);
        this.shape8_1.setRotationPoint(2.9F, 4.5F, -1.1F);
        this.shape8_1.addBox(0.0F, 0.0F, 0.0F, 0, 3, 8, 0.0F);
        this.shape2 = new ModelRenderer(this, 50, 0);
        this.shape2.setRotationPoint(0.7F, 5.7F, 2.1F);
        this.shape2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(shape2, 0.045553093477052F, 0.0F, 0.0F);
        this.shape4_2 = new ModelRenderer(this, 8, 25);
        this.shape4_2.setRotationPoint(-0.1F, 4.7F, 2.7F);
        this.shape4_2.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape4_2, 0.091106186954104F, 0.0F, 0.0F);
        this.shape11 = new ModelRenderer(this, 0, 25);
        this.shape11.setRotationPoint(2.9F, 0.8F, 9.3F);
        this.shape11.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape11, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape4_1 = new ModelRenderer(this, 30, 28);
        this.shape4_1.setRotationPoint(5.2F, 1.8F, 7.6F);
        this.shape4_1.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.setRotateAngle(shape4_1, -0.136659280431156F, 0.0F, 0.0F);
        this.shape12 = new ModelRenderer(this, 42, 28);
        this.shape12.setRotationPoint(0.0F, 8.8F, 1.0F);
        this.shape12.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape12, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape4_3 = new ModelRenderer(this, 50, 28);
        this.shape4_3.setRotationPoint(0.1F, 4.7F, 2.7F);
        this.shape4_3.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape4_3, 0.091106186954104F, 0.0F, 0.0F);
        this.shape7_1.addChild(this.shape8);
        this.shape7.addChild(this.shape6);
        this.shape6.addChild(this.shape2_2);
        this.shape7_1.addChild(this.shape9_1);
        this.shape7.addChild(this.shape1);
        this.shape6.addChild(this.shape7_1);
        this.shape7_1.addChild(this.shape9);
        this.shape7.addChild(this.shape2_1);
        this.shape1.addChild(this.shape4);
        this.shape1.addChild(this.shape8_1);
        this.shape7.addChild(this.shape2);
        this.shape4.addChild(this.shape4_2);
        this.shape1.addChild(this.shape11);
        this.shape1.addChild(this.shape4_1);
        this.shape11.addChild(this.shape12);
        this.shape4_1.addChild(this.shape4_3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape7.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
