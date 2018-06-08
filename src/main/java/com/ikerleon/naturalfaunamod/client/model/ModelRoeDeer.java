package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Roe Deer - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelRoeDeer extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape14;
    public ModelRenderer shape14_1;
    public ModelRenderer shape14_2;
    public ModelRenderer shape14_3;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape5_1;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape15_3;
    public ModelRenderer shape5_2;
    public ModelRenderer shape5_3;

    public ModelRoeDeer() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.shape14 = new ModelRenderer(this, 0, 0);
        this.shape14.setRotationPoint(0.9F, 5.1F, 1.3F);
        this.shape14.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape14_3 = new ModelRenderer(this, 53, 28);
        this.shape14_3.setRotationPoint(7.1F, 4.1F, 12.5F);
        this.shape14_3.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-5.0F, 8.0F, -7.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 8, 8, 17, 0.0F);
        this.shape15 = new ModelRenderer(this, 10, 8);
        this.shape15.setRotationPoint(-2.3F, -8.0F, -0.5F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape15, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 10, 8);
        this.shape15_1.setRotationPoint(1.8F, -8.0F, -0.5F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape15_1, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape5_1 = new ModelRenderer(this, 55, 0);
        this.shape5_1.setRotationPoint(3.2F, -3.4F, -0.5F);
        this.shape5_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5_1, -0.36425021489121656F, 1.0927506446736497F, 0.136659280431156F);
        this.shape14_1 = new ModelRenderer(this, 67, 0);
        this.shape14_1.setRotationPoint(7.1F, 5.1F, 1.3F);
        this.shape14_1.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 28);
        this.shape3.setRotationPoint(-0.2F, -1.0F, -6.4F);
        this.shape3.addBox(-2.8F, -2.5F, -5.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(shape3, 0.7618362184955249F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 24, 28);
        this.shape4.setRotationPoint(-1.6F, -0.4F, -8.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(shape4, 0.136659280431156F, 0.0F, 0.0F);
        this.shape5_3 = new ModelRenderer(this, 0, 42);
        this.shape5_3.setRotationPoint(0.0F, 5.0F, 2.7F);
        this.shape5_3.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.shape14_2 = new ModelRenderer(this, 59, 43);
        this.shape14_2.setRotationPoint(0.9F, 4.1F, 12.5F);
        this.shape14_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.shape5 = new ModelRenderer(this, 37, 0);
        this.shape5.setRotationPoint(-3.2F, -3.5F, -1.4F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5, -0.3574434308084387F, -1.0927506446736497F, -0.136659280431156F);
        this.shape5_2 = new ModelRenderer(this, 62, 23);
        this.shape5_2.setRotationPoint(0.1F, 5.0F, 2.7F);
        this.shape5_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.shape15_2 = new ModelRenderer(this, 11, 2);
        this.shape15_2.setRotationPoint(0.5F, 2.2F, -0.5F);
        this.shape15_2.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_2, 0.7285004297824331F, 0.0F, 0.0F);
        this.shape15_3 = new ModelRenderer(this, 11, 2);
        this.shape15_3.setRotationPoint(0.5F, 2.2F, -0.5F);
        this.shape15_3.addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_3, 0.7285004297824331F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 37, 0);
        this.shape2.setRotationPoint(4.0F, 3.0F, 2.1F);
        this.shape2.addBox(-2.5F, -2.5F, -8.0F, 5, 5, 8, 0.0F);
        this.setRotateAngle(shape2, -0.6829473363053812F, 0.0F, 0.0F);
        this.shape1.addChild(this.shape14);
        this.shape1.addChild(this.shape14_3);
        this.shape3.addChild(this.shape15);
        this.shape3.addChild(this.shape15_1);
        this.shape3.addChild(this.shape5_1);
        this.shape1.addChild(this.shape14_1);
        this.shape2.addChild(this.shape3);
        this.shape3.addChild(this.shape4);
        this.shape14_3.addChild(this.shape5_3);
        this.shape1.addChild(this.shape14_2);
        this.shape3.addChild(this.shape5);
        this.shape14_2.addChild(this.shape5_2);
        this.shape15.addChild(this.shape15_2);
        this.shape15_1.addChild(this.shape15_3);
        this.shape1.addChild(this.shape2);
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
