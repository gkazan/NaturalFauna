package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * outarde - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelLittleBustard extends ModelBase {
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape8;
    public ModelRenderer shape11;
    public ModelRenderer shape4;
    public ModelRenderer shape7;
    public ModelRenderer shape9;
    public ModelRenderer shape10;
    public ModelRenderer shape13;
    public ModelRenderer shape14;
    public ModelRenderer shape16;
    public ModelRenderer shape1;
    public ModelRenderer shape17;
    public ModelRenderer shape2;
    public ModelRenderer shape3;

    public ModelLittleBustard() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape3 = new ModelRenderer(this, 49, 2);
        this.shape3.setRotationPoint(-2.7F, 10.0F, 0.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(shape3, -0.686088928958971F, -0.07330382858376185F, -0.031415926535897934F);
        this.shape13 = new ModelRenderer(this, 22, 18);
        this.shape13.setRotationPoint(0.0F, 7.7F, -0.5F);
        this.shape13.addBox(-1.0F, 0.1F, -1.1F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape13, -0.11065387457644049F, 0.0F, 0.0F);
        this.shape11 = new ModelRenderer(this, 36, 14);
        this.shape11.setRotationPoint(0.5F, 23.7F, 1.1F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape10 = new ModelRenderer(this, 43, 14);
        this.shape10.setRotationPoint(-1.5F, 23.7F, 1.2F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape9 = new ModelRenderer(this, 41, 17);
        this.shape9.setRotationPoint(-1.5F, 24.0F, 0.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape5 = new ModelRenderer(this, 36, 1);
        this.shape5.setRotationPoint(0.5F, 16.5F, 0.6F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape5, 0.20315632493213995F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 49, 14);
        this.shape2.setRotationPoint(1.6F, 10.0F, 0.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(shape2, -0.686088928958971F, 0.0757472895365539F, 0.0F);
        this.shape16 = new ModelRenderer(this, 29, 13);
        this.shape16.setRotationPoint(0.4F, 7.8F, -2.5F);
        this.shape16.addBox(-0.8F, -0.8F, -1.0F, 1, 1, 1, 0.0F);
        this.shape7 = new ModelRenderer(this, 42, 8);
        this.shape7.setRotationPoint(-0.5F, 20.8F, 1.6F);
        this.shape7.addBox(-1.0F, 0.1F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape7, -0.14486232791552936F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 34, 17);
        this.shape8.setRotationPoint(0.5F, 24.0F, 0.0F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape6 = new ModelRenderer(this, 36, 8);
        this.shape6.setRotationPoint(0.5F, 20.8F, 1.6F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape6, -0.14486232791552936F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 33, 23);
        this.shape1.setRotationPoint(-1.5F, 10.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 7, 0.0F);
        this.setRotateAngle(shape1, -0.720820981073658F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 42, 1);
        this.shape4.setRotationPoint(-0.5F, 16.5F, 0.5F);
        this.shape4.addBox(-1.0F, -0.1F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape4, 0.20315632493213995F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 17, 11);
        this.shape14.setRotationPoint(0.0F, 7.9F, -0.1F);
        this.shape14.addBox(-0.9F, -2.0F, -2.4F, 2, 2, 3, 0.0F);
        this.shape17 = new ModelRenderer(this, 20, 2);
        this.shape17.setRotationPoint(-1.5F, 14.2F, 4.8F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(shape17, -1.2292353921796064F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape3.render(f5);
        this.shape13.render(f5);
        this.shape11.render(f5);
        this.shape10.render(f5);
        this.shape9.render(f5);
        this.shape5.render(f5);
        this.shape2.render(f5);
        this.shape16.render(f5);
        this.shape7.render(f5);
        this.shape8.render(f5);
        this.shape6.render(f5);
        this.shape1.render(f5);
        this.shape4.render(f5);
        this.shape14.render(f5);
        this.shape17.render(f5);
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
