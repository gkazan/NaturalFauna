package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Turaco - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelTuraco extends ModelBase {
    public ModelRenderer field_192764_a;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape7;
    public ModelRenderer shape6_1;
    public ModelRenderer shape14;
    public ModelRenderer shape14_1;
    public ModelRenderer shape16;
    public ModelRenderer shape16_1;
    public ModelRenderer shape9;
    public ModelRenderer shape10;
    public ModelRenderer shape12;
    public ModelRenderer shape13;
    public ModelRenderer shape18;
    public ModelRenderer shape18_1;

    public ModelTuraco() {
        this.textureWidth = 64;
        this.textureHeight = 30;
        this.shape7 = new ModelRenderer(this, 32, 0);
        this.shape7.setRotationPoint(-0.5F, 0.4F, 3.5F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(shape7, 0.091106186954104F, 0.0F, 0.0F);
        this.shape6_1 = new ModelRenderer(this, 41, 0);
        this.shape6_1.setRotationPoint(-0.5F, 1.6F, 4.9F);
        this.shape6_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.shape18 = new ModelRenderer(this, -1, 1);
        this.shape18.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.field_192764_a = new ModelRenderer(this, 0, 0);
        this.field_192764_a.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.field_192764_a.addBox(-1.9F, 0.0F, -2.0F, 4, 4, 7, 0.0F);
        this.shape6 = new ModelRenderer(this, 25, 0);
        this.shape6.setRotationPoint(-1.0F, 1.2F, 5.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(shape6, 0.091106186954104F, 0.0F, 0.0F);
        this.shape16_1 = new ModelRenderer(this, 25, 0);
        this.shape16_1.setRotationPoint(-1.5F, 3.5F, 1.0F);
        this.shape16_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape14 = new ModelRenderer(this, 48, 0);
        this.shape14.setRotationPoint(-2.0F, 1.5F, -0.8F);
        this.shape14.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(shape14, -0.045553093477052F, -0.091106186954104F, 0.0F);
        this.shape12 = new ModelRenderer(this, 55, 11);
        this.shape12.setRotationPoint(-1.0F, -4.0F, -0.4F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape12, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape10 = new ModelRenderer(this, 45, 9);
        this.shape10.setRotationPoint(-1.0F, -6.5F, 0.2F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(shape10, -0.36425021489121656F, 0.0F, 0.0F);
        this.shape13 = new ModelRenderer(this, 41, 0);
        this.shape13.setRotationPoint(-0.5F, -3.7F, -0.5F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape14_1 = new ModelRenderer(this, 19, 6);
        this.shape14_1.setRotationPoint(1.8F, 1.5F, -0.8F);
        this.shape14_1.addBox(0.0F, -1.5F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(shape14_1, -0.045553093477052F, 0.091106186954104F, 0.0F);
        this.shape5 = new ModelRenderer(this, 15, 0);
        this.shape5.setRotationPoint(0.5F, 2.2F, -1.0F);
        this.shape5.addBox(-1.5F, -3.9F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(shape5, 0.5918411493512771F, 0.0F, 0.0F);
        this.shape16 = new ModelRenderer(this, 0, 0);
        this.shape16.setRotationPoint(0.5F, 3.5F, 1.0F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.shape18_1 = new ModelRenderer(this, -2, 1);
        this.shape18_1.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape9 = new ModelRenderer(this, 33, 8);
        this.shape9.setRotationPoint(-0.5F, -3.0F, 0.5F);
        this.shape9.addBox(-1.5F, -2.7F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape9, 1.0016444577195458F, 0.0F, 0.0F);
        this.field_192764_a.addChild(this.shape7);
        this.field_192764_a.addChild(this.shape6_1);
        this.shape16.addChild(this.shape18);
        this.field_192764_a.addChild(this.shape6);
        this.field_192764_a.addChild(this.shape16_1);
        this.field_192764_a.addChild(this.shape14);
        this.shape9.addChild(this.shape12);
        this.shape5.addChild(this.shape10);
        this.shape9.addChild(this.shape13);
        this.field_192764_a.addChild(this.shape14_1);
        this.field_192764_a.addChild(this.shape5);
        this.field_192764_a.addChild(this.shape16);
        this.shape16_1.addChild(this.shape18_1);
        this.shape5.addChild(this.shape9);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_192764_a.render(f5);
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
