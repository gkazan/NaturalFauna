package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Blue Gnu - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelBlueGnu extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape2_1;
    public ModelRenderer shape2_2;
    public ModelRenderer shape2_3;
    public ModelRenderer shape8;
    public ModelRenderer shape13;
    public ModelRenderer shape9;
    public ModelRenderer shape11;
    public ModelRenderer shape11_1;
    public ModelRenderer shape10;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape15_3;
    public ModelRenderer shape15_4;
    public ModelRenderer shape15_5;
    public ModelRenderer shape15_6;
    public ModelRenderer shape15_7;
    public ModelRenderer shape14;

    public ModelBlueGnu() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape15_4 = new ModelRenderer(this, 50, 24);
        this.shape15_4.setRotationPoint(0.7F, -1.7F, 2.0F);
        this.shape15_4.addBox(-0.5F, -1.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape15_4, -0.18203784098300857F, 0.0F, -0.27314402793711257F);
        this.shape15_7 = new ModelRenderer(this, 58, 4);
        this.shape15_7.setRotationPoint(-1.1F, -1.6F, -3.7F);
        this.shape15_7.addBox(-0.5F, -8.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_7, -1.593485607070823F, 0.36425021489121656F, 0.0F);
        this.shape15_2 = new ModelRenderer(this, 50, 18);
        this.shape15_2.setRotationPoint(-3.3F, -1.3F, 1.2F);
        this.shape15_2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape15_2, 0.0F, 1.8657569703819383F, -1.6845917940249266F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(-4.1F, 6.5F, -6.6F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 8, 9, 17, 0.0F);
        this.shape15_5 = new ModelRenderer(this, 57, 0);
        this.shape15_5.setRotationPoint(2.0F, -1.9F, -3.7F);
        this.shape15_5.addBox(-0.5F, -8.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_5, -1.6390387005478748F, -0.27314402793711257F, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 50, 15);
        this.shape15_1.setRotationPoint(2.7F, -0.5F, -1.0F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(shape15_1, 0.0F, -0.22759093446006054F, -0.22759093446006054F);
        this.shape9 = new ModelRenderer(this, 28, 26);
        this.shape9.setRotationPoint(-0.3F, 0.1F, -6.4F);
        this.shape9.addBox(-2.7F, -3.0F, -4.0F, 6, 7, 4, 0.0F);
        this.shape2_2 = new ModelRenderer(this, 33, 0);
        this.shape2_2.setRotationPoint(0.8F, 4.5F, 15.8F);
        this.shape2_2.addBox(-1.0F, 0.0F, -1.0F, 2, 13, 2, 0.0F);
        this.shape15 = new ModelRenderer(this, 49, 12);
        this.shape15.setRotationPoint(-2.7F, 1.4F, -0.8F);
        this.shape15.addBox(-3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(shape15, 0.0F, 0.22759093446006054F, 0.22759093446006054F);
        this.shape8 = new ModelRenderer(this, 0, 26);
        this.shape8.setRotationPoint(4.2F, 3.2F, 2.1F);
        this.shape8.addBox(-2.6F, -3.0F, -9.5F, 5, 7, 9, 0.0F);
        this.setRotateAngle(shape8, 0.045553093477052F, 0.0F, 0.0F);
        this.shape11 = new ModelRenderer(this, 37, 26);
        this.shape11.setRotationPoint(-0.3F, -6.4F, -8.8F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
        this.shape13 = new ModelRenderer(this, 49, 0);
        this.shape13.setRotationPoint(4.2F, 1.3F, 15.6F);
        this.shape13.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(shape13, 0.18203784098300857F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(0.9F, 4.5F, 1.6F);
        this.shape2.addBox(-1.0F, 0.0F, -1.0F, 2, 13, 2, 0.0F);
        this.shape2_1 = new ModelRenderer(this, 8, 0);
        this.shape2_1.setRotationPoint(7.1F, 4.5F, 1.5F);
        this.shape2_1.addBox(-1.0F, 0.0F, -1.0F, 2, 13, 2, 0.0F);
        this.shape10 = new ModelRenderer(this, 0, 42);
        this.shape10.setRotationPoint(-1.2F, -2.6F, -4.5F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(shape10, -0.18203784098300857F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 39, 42);
        this.shape14.setRotationPoint(0.0F, 2.2F, 1.0F);
        this.shape14.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(shape14, -0.091106186954104F, 0.0F, 0.0F);
        this.shape15_6 = new ModelRenderer(this, 0, 26);
        this.shape15_6.setRotationPoint(1.3F, -2.7F, 1.9F);
        this.shape15_6.addBox(-0.5F, -1.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape15_6, -0.18203784098300857F, 0.0F, 0.27314402793711257F);
        this.shape2_3 = new ModelRenderer(this, 41, 0);
        this.shape2_3.setRotationPoint(7.1F, 4.5F, 15.8F);
        this.shape2_3.addBox(-1.0F, 0.0F, -1.0F, 2, 13, 2, 0.0F);
        this.shape11_1 = new ModelRenderer(this, 19, 37);
        this.shape11_1.setRotationPoint(-0.5F, 2.4F, -7.8F);
        this.shape11_1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(shape11_1, -0.045553093477052F, 0.0F, 0.0F);
        this.shape15_3 = new ModelRenderer(this, 49, 6);
        this.shape15_3.setRotationPoint(4.1F, -0.3F, -1.8F);
        this.shape15_3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape15_3, 0.0F, -1.8668041679331349F, 1.6845917940249266F);
        this.shape15_2.addChild(this.shape15_4);
        this.shape15_6.addChild(this.shape15_7);
        this.shape9.addChild(this.shape15_2);
        this.shape15_4.addChild(this.shape15_5);
        this.shape9.addChild(this.shape15_1);
        this.shape8.addChild(this.shape9);
        this.shape1.addChild(this.shape2_2);
        this.shape9.addChild(this.shape15);
        this.shape1.addChild(this.shape8);
        this.shape8.addChild(this.shape11);
        this.shape1.addChild(this.shape13);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape2_1);
        this.shape9.addChild(this.shape10);
        this.shape13.addChild(this.shape14);
        this.shape15_3.addChild(this.shape15_6);
        this.shape1.addChild(this.shape2_3);
        this.shape8.addChild(this.shape11_1);
        this.shape9.addChild(this.shape15_3);
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
