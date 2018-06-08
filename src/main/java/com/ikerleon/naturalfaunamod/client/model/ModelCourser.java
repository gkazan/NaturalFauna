package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCourser - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCourser extends ModelBase {
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape9;
    public ModelRenderer shape11;
    public ModelRenderer shape11_1;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape7;
    public ModelRenderer shape10;
    public ModelRenderer shape12;
    public ModelRenderer shape12_1;
    public ModelRenderer shape16;
    public ModelRenderer shape18;
    public ModelRenderer shape16_1;
    public ModelRenderer shape18_1;

    public ModelCourser() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape5 = new ModelRenderer(this, 12, 17);
        this.shape5.setRotationPoint(0.0F, -3.8F, -0.6F);
        this.shape5.addBox(-2.0F, -3.0F, -1.5F, 4, 3, 4, 0.0F);
        this.setRotateAngle(shape5, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape12 = new ModelRenderer(this, 52, 10);
        this.shape12.setRotationPoint(0.1F, 0.0F, 6.3F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(shape12, 0.4553564018453205F, 0.0F, 0.0F);
        this.shape18_1 = new ModelRenderer(this, 13, 29);
        this.shape18_1.setRotationPoint(0.0F, 6.7F, 0.0F);
        this.shape18_1.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
        this.setRotateAngle(shape18_1, 0.045553093477052F, 0.0F, 0.0F);
        this.shape11 = new ModelRenderer(this, 24, 8);
        this.shape11.setRotationPoint(-0.2F, 0.1F, 0.8F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(shape11, -0.045553093477052F, -0.045553093477052F, 0.0F);
        this.shape10 = new ModelRenderer(this, 24, 21);
        this.shape10.setRotationPoint(0.0F, 0.3F, 2.7F);
        this.shape10.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(shape10, 0.136659280431156F, 0.0F, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 0, 0);
        this.shape15_1.setRotationPoint(5.1F, 3.7F, 4.0F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(shape15_1, 0.8651597102135892F, 0.0F, 0.0F);
        this.shape16 = new ModelRenderer(this, 59, 0);
        this.shape16.setRotationPoint(0.5F, 4.7F, 1.2F);
        this.shape16.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape16, -0.136659280431156F, 0.0F, 0.0F);
        this.shape16_1 = new ModelRenderer(this, 59, 22);
        this.shape16_1.setRotationPoint(0.5F, 4.7F, 1.3F);
        this.shape16_1.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(shape16_1, -0.136659280431156F, 0.0F, 0.0F);
        this.shape3 = new ModelRenderer(this, 23, 0);
        this.shape3.setRotationPoint(3.6F, 3.4F, 2.2F);
        this.shape3.addBox(-2.0F, -2.0F, -3.8F, 4, 4, 4, 0.0F);
        this.setRotateAngle(shape3, -0.36425021489121656F, 0.0F, 0.010821041362364843F);
        this.shape12_1 = new ModelRenderer(this, 0, 23);
        this.shape12_1.setRotationPoint(-0.1F, 0.5F, 6.3F);
        this.shape12_1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(shape12_1, 0.4553564018453205F, 0.0F, 0.0F);
        this.shape9 = new ModelRenderer(this, 39, 0);
        this.shape9.setRotationPoint(3.4F, 0.7F, 6.6F);
        this.shape9.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(shape9, 0.091106186954104F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(-3.5F, 7.2F, -0.8F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 7, 6, 9, 0.0F);
        this.setRotateAngle(shape2, -0.7740535232594852F, 0.0F, 0.0F);
        this.shape11_1 = new ModelRenderer(this, 42, 10);
        this.shape11_1.setRotationPoint(6.2F, 0.1F, 0.9F);
        this.shape11_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(shape11_1, -0.045553093477052F, 0.045553093477052F, 0.0F);
        this.shape15 = new ModelRenderer(this, 0, 0);
        this.shape15.setRotationPoint(0.7F, 3.7F, 4.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(shape15, 0.8651597102135892F, 0.0F, 0.0F);
        this.shape18 = new ModelRenderer(this, 13, 29);
        this.shape18.setRotationPoint(0.0F, 6.7F, 0.0F);
        this.shape18.addBox(-1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F);
        this.setRotateAngle(shape18, 0.045553093477052F, 0.0F, 0.0F);
        this.shape6 = new ModelRenderer(this, 35, 10);
        this.shape6.setRotationPoint(-1.0F, -1.9F, -3.2F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(shape6, 0.091106186954104F, 0.0F, 0.0F);
        this.shape7 = new ModelRenderer(this, 35, 0);
        this.shape7.setRotationPoint(0.5F, 0.6F, -1.6F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape7, 0.36425021489121656F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 15);
        this.shape4.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.shape4.addBox(-1.5F, -5.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(shape4, 0.9105382707654417F, 0.0F, 0.0F);
        this.shape4.addChild(this.shape5);
        this.shape11.addChild(this.shape12);
        this.shape16_1.addChild(this.shape18_1);
        this.shape2.addChild(this.shape11);
        this.shape9.addChild(this.shape10);
        this.shape2.addChild(this.shape15_1);
        this.shape15.addChild(this.shape16);
        this.shape15_1.addChild(this.shape16_1);
        this.shape2.addChild(this.shape3);
        this.shape11_1.addChild(this.shape12_1);
        this.shape2.addChild(this.shape9);
        this.shape2.addChild(this.shape11_1);
        this.shape2.addChild(this.shape15);
        this.shape16.addChild(this.shape18);
        this.shape5.addChild(this.shape6);
        this.shape6.addChild(this.shape7);
        this.shape3.addChild(this.shape4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape2.render(f5);
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
