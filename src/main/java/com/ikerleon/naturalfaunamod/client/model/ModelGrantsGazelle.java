package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Grant's Gazelle - Doctor Hyena & Lukamas
 * Created using Tabula 7.0.0
 */
public class ModelGrantsGazelle extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Leg1;
    public ModelRenderer Leg2;
    public ModelRenderer Leg3;
    public ModelRenderer Leg4;
    public ModelRenderer Tail1;
    public ModelRenderer Neck;
    public ModelRenderer Tail2;
    public ModelRenderer head;
    public ModelRenderer shape14;
    public ModelRenderer shape16;
    public ModelRenderer shape16_1;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape15_3;
    public ModelRenderer shape15_4;
    public ModelRenderer shape15_5;

    public ModelGrantsGazelle() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.head = new ModelRenderer(this, 41, 18);
        this.head.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.head.addBox(-2.0F, 0.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head, -0.6108652381980153F, 0.0F, 0.0F);
        this.shape15 = new ModelRenderer(this, 8, 23);
        this.shape15.setRotationPoint(-2.0F, 1.0F, -2.6F);
        this.shape15.addBox(0.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape15, -0.4363323129985824F, 0.0F, -0.17453292519943295F);
        this.shape15_2 = new ModelRenderer(this, 59, 21);
        this.shape15_2.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.shape15_2.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_2, 0.08726646259971647F, 0.0F, -0.08726646259971647F);
        this.Leg4 = new ModelRenderer(this, 38, 0);
        this.Leg4.setRotationPoint(-2.6F, 5.0F, 6.5F);
        this.Leg4.addBox(-1.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F);
        this.Tail1 = new ModelRenderer(this, 46, 0);
        this.Tail1.setRotationPoint(0.0F, 0.1F, 8.6F);
        this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Tail1, 0.285012266850674F, 0.0F, 0.0F);
        this.Leg1 = new ModelRenderer(this, 0, 0);
        this.Leg1.setRotationPoint(2.6F, 5.0F, -5.7F);
        this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Leg3 = new ModelRenderer(this, 30, 0);
        this.Leg3.setRotationPoint(2.6F, 5.0F, 6.5F);
        this.Leg3.addBox(-1.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F);
        this.Neck = new ModelRenderer(this, 46, 1);
        this.Neck.setRotationPoint(0.1F, 0.5F, -3.0F);
        this.Neck.addBox(-1.5F, -8.0F, -5.0F, 3, 10, 5, 0.0F);
        this.setRotateAngle(Neck, 0.6108652381980153F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 57, 0);
        this.Tail2.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.Tail2.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Tail2, 0.17453292519943295F, 0.0F, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 16, 23);
        this.shape15_1.setRotationPoint(2.0F, 1.0F, -2.6F);
        this.shape15_1.addBox(-2.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape15_1, -0.4363323129985824F, 0.0F, 0.17453292519943295F);
        this.shape16_1 = new ModelRenderer(this, 54, 19);
        this.shape16_1.setRotationPoint(-0.5F, 0.2F, -1.2F);
        this.shape16_1.addBox(0.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape16_1, 0.0F, -0.2617993877991494F, -2.231054382824351F);
        this.shape15_4 = new ModelRenderer(this, 0, 23);
        this.shape15_4.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.shape15_4.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_4, 0.08726646259971647F, 0.0F, 0.08726646259971647F);
        this.shape16 = new ModelRenderer(this, 54, 16);
        this.shape16.setRotationPoint(0.5F, 0.2F, -1.2F);
        this.shape16.addBox(0.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape16, 0.045553093477052F, -0.2617993877991494F, -0.9105382707654417F);
        this.shape15_5 = new ModelRenderer(this, 34, 23);
        this.shape15_5.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.shape15_5.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(shape15_5, -0.9075712110370513F, 0.0F, 0.0F);
        this.shape15_3 = new ModelRenderer(this, 30, 23);
        this.shape15_3.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.shape15_3.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(shape15_3, -0.9075712110370513F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 0, 23);
        this.shape14.setRotationPoint(0.0F, 1.7F, -4.5F);
        this.shape14.addBox(-1.0F, 0.0F, -3.5F, 2, 2, 4, 0.0F);
        this.Leg2 = new ModelRenderer(this, 8, 0);
        this.Leg2.setRotationPoint(-2.6F, 5.0F, -5.7F);
        this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(-0.2F, 7.0F, -0.1F);
        this.Body.addBox(-3.5F, 0.0F, -7.0F, 7, 7, 16, 0.0F);
        this.Neck.addChild(this.head);
        this.head.addChild(this.shape15);
        this.shape15.addChild(this.shape15_2);
        this.Body.addChild(this.Leg4);
        this.Body.addChild(this.Tail1);
        this.Body.addChild(this.Leg1);
        this.Body.addChild(this.Leg3);
        this.Body.addChild(this.Neck);
        this.Tail1.addChild(this.Tail2);
        this.head.addChild(this.shape15_1);
        this.head.addChild(this.shape16_1);
        this.shape15_1.addChild(this.shape15_4);
        this.head.addChild(this.shape16);
        this.shape15_4.addChild(this.shape15_5);
        this.shape15_2.addChild(this.shape15_3);
        this.head.addChild(this.shape14);
        this.Body.addChild(this.Leg2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
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
