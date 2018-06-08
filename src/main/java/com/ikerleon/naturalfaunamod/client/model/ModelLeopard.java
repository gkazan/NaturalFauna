package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Leopard Remodel - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelLeopard extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape2_1;
    public ModelRenderer shape4;
    public ModelRenderer shape4_1;
    public ModelRenderer shape6;
    public ModelRenderer shape11;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    public ModelRenderer shape9_1;
    public ModelRenderer shape12;

    public ModelLeopard() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape9 = new ModelRenderer(this, 9, 0);
        this.shape9.setRotationPoint(-3.8F, -4.0F, -2.3F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape11 = new ModelRenderer(this, 55, 0);
        this.shape11.setRotationPoint(3.6F, 0.8F, 15.1F);
        this.shape11.addBox(-1.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(shape11, 0.31869712141416456F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(1.3F, 5.7F, 1.8F);
        this.shape2.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape12 = new ModelRenderer(this, 44, 33);
        this.shape12.setRotationPoint(0.0F, 8.8F, 1.0F);
        this.shape12.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape12, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 44, 26);
        this.shape8.setRotationPoint(-1.7F, -0.9F, -8.5F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(shape8, 0.136659280431156F, 0.0F, 0.0F);
        this.shape2_1 = new ModelRenderer(this, 31, 0);
        this.shape2_1.setRotationPoint(5.7F, 5.7F, 1.8F);
        this.shape2_1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 25);
        this.shape6.setRotationPoint(3.5F, 3.1F, 1.3F);
        this.shape6.addBox(-2.5F, -2.5F, -4.7F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape6, -0.22759093446006054F, 0.0F, 0.0F);
        this.shape9_1 = new ModelRenderer(this, 40, 0);
        this.shape9_1.setRotationPoint(2.5F, -4.0F, -2.3F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.shape4_1 = new ModelRenderer(this, 48, 13);
        this.shape4_1.setRotationPoint(5.7F, 5.7F, 15.4F);
        this.shape4_1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape4 = new ModelRenderer(this, 43, 0);
        this.shape4.setRotationPoint(1.3F, 5.7F, 15.4F);
        this.shape4.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.shape7 = new ModelRenderer(this, 20, 25);
        this.shape7.setRotationPoint(-0.4F, -0.2F, -2.8F);
        this.shape7.addBox(-2.7F, -3.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(shape7, 0.22759093446006054F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-3.5F, 8.3F, -7.3F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 17, 0.0F);
        this.shape7.addChild(this.shape9);
        this.shape1.addChild(this.shape11);
        this.shape1.addChild(this.shape2);
        this.shape11.addChild(this.shape12);
        this.shape7.addChild(this.shape8);
        this.shape1.addChild(this.shape2_1);
        this.shape1.addChild(this.shape6);
        this.shape7.addChild(this.shape9_1);
        this.shape1.addChild(this.shape4_1);
        this.shape1.addChild(this.shape4);
        this.shape6.addChild(this.shape7);
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
