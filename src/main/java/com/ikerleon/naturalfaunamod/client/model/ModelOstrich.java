package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Common Ostrich - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelOstrich extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape8;
    public ModelRenderer shape8_1;
    public ModelRenderer shape13;
    public ModelRenderer shape19;
    public ModelRenderer shape20;
    public ModelRenderer shape21;
    public ModelRenderer shape5;
    public ModelRenderer shape7;
    public ModelRenderer shape11;
    public ModelRenderer shape12;
    public ModelRenderer shape2;
    public ModelRenderer shape14;
    public ModelRenderer shape15;
    public ModelRenderer shape2_1;
    public ModelRenderer shape14_1;
    public ModelRenderer shape15_1;

    public ModelOstrich() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.shape8_1 = new ModelRenderer(this, 44, 14);
        this.shape8_1.setRotationPoint(7.8F, 0.0F, 1.5F);
        this.shape8_1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(shape8_1, -0.091106186954104F, 0.091106186954104F, 0.0F);
        this.shape20 = new ModelRenderer(this, 38, 5);
        this.shape20.setRotationPoint(0.3F, 7.5F, 3.9F);
        this.shape20.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape20, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape5 = new ModelRenderer(this, 54, 0);
        this.shape5.setRotationPoint(0.5F, -2.9F, 1.0F);
        this.shape5.addBox(-1.5F, -10.8F, -1.7F, 3, 11, 3, 0.0F);
        this.setRotateAngle(shape5, -1.5025539530419183F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 56, 4);
        this.shape8.setRotationPoint(-0.8F, 0.0F, 1.4F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(shape8, -0.091106186954104F, -0.091106186954104F, 0.0F);
        this.shape2_1 = new ModelRenderer(this, 38, 0);
        this.shape2_1.setRotationPoint(0.0F, -2.5F, 0.9F);
        this.shape2_1.addBox(-1.0F, 0.0F, -1.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(shape2_1, -0.136659280431156F, 0.0F, 0.0F);
        this.shape12 = new ModelRenderer(this, 0, 0);
        this.shape12.setRotationPoint(-0.3F, 0.1F, 0.0F);
        this.shape12.addBox(0.3F, 0.0F, -0.2F, 3, 1, 3, 0.0F);
        this.setRotateAngle(shape12, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 40, 0);
        this.shape14.setRotationPoint(0.4F, 14.1F, 0.3F);
        this.shape14.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape14, 0.0F, 0.22759093446006054F, 0.0F);
        this.shape14_1 = new ModelRenderer(this, 40, 0);
        this.shape14_1.setRotationPoint(-0.6F, 13.9F, 0.1F);
        this.shape14_1.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.shape15 = new ModelRenderer(this, 41, 2);
        this.shape15.setRotationPoint(1.1F, 14.1F, 1.1F);
        this.shape15.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.shape21 = new ModelRenderer(this, 40, 5);
        this.shape21.setRotationPoint(6.0F, 7.5F, 5.5F);
        this.shape21.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape21, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape7 = new ModelRenderer(this, 34, 17);
        this.shape7.setRotationPoint(0.0F, -9.0F, -0.4F);
        this.shape7.addBox(-2.0F, -2.5F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(shape7, -0.136659280431156F, 0.0F, 0.0F);
        this.shape11 = new ModelRenderer(this, 17, 20);
        this.shape11.setRotationPoint(-1.5F, -0.8F, -4.0F);
        this.shape11.addBox(0.5F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(shape11, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape19 = new ModelRenderer(this, 10, 9);
        this.shape19.setRotationPoint(3.7F, 3.2F, 1.1F);
        this.shape19.addBox(-1.5F, -4.7F, -2.6F, 4, 5, 5, 0.0F);
        this.setRotateAngle(shape19, 1.730144887501979F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-4.1F, 4.4F, -5.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 8, 9, 11, 0.0F);
        this.setRotateAngle(shape1, -0.045553093477052F, 0.0F, 0.0F);
        this.shape13 = new ModelRenderer(this, 0, 20);
        this.shape13.setRotationPoint(4.1F, 2.1F, 9.4F);
        this.shape13.addBox(-2.7F, -2.0F, -0.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(shape13, -0.31869712141416456F, 0.003490658503988659F, 0.0F);
        this.shape2 = new ModelRenderer(this, 38, 0);
        this.shape2.setRotationPoint(0.5F, -2.9F, 1.4F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(shape2, -0.136659280431156F, 0.0F, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 41, 2);
        this.shape15_1.setRotationPoint(0.4F, 13.8F, -0.8F);
        this.shape15_1.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape15_1, 0.0F, -0.31869712141416456F, 0.0F);
        this.shape1.addChild(this.shape8_1);
        this.shape1.addChild(this.shape20);
        this.shape19.addChild(this.shape5);
        this.shape1.addChild(this.shape8);
        this.shape21.addChild(this.shape2_1);
        this.shape11.addChild(this.shape12);
        this.shape2.addChild(this.shape14);
        this.shape2_1.addChild(this.shape14_1);
        this.shape2.addChild(this.shape15);
        this.shape1.addChild(this.shape21);
        this.shape5.addChild(this.shape7);
        this.shape7.addChild(this.shape11);
        this.shape1.addChild(this.shape19);
        this.shape1.addChild(this.shape13);
        this.shape20.addChild(this.shape2);
        this.shape2_1.addChild(this.shape15_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1.render(f5);
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
