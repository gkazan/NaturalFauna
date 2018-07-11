package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCourser - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCourserFlying extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer rightwing;
    public ModelRenderer neck;
    public ModelRenderer body2;
    public ModelRenderer leftwing;
    public ModelRenderer rightwing2;
    public ModelRenderer neck2;
    public ModelRenderer head;
    public ModelRenderer beak;
    public ModelRenderer beak2;
    public ModelRenderer body3;
    public ModelRenderer leftwing2;

    public ModelCourserFlying() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.beak2 = new ModelRenderer(this, 35, 0);
        this.beak2.setRotationPoint(0.5F, 0.6F, -1.6F);
        this.beak2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak2, 0.36425021489121656F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 23, 0);
        this.neck.setRotationPoint(3.6F, 3.4F, 2.2F);
        this.neck.addBox(-2.0F, -2.0F, -3.8F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.045553093477052F, 0.0F, 0.010821041362364843F);
        this.leftwing = new ModelRenderer(this, 42, 10);
        this.leftwing.setRotationPoint(6.2F, 2.3F, 0.9F);
        this.leftwing.addBox(0.0F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(leftwing, -0.9560913642424937F, 0.091106186954104F, -1.6845917940249266F);
        this.head = new ModelRenderer(this, 12, 17);
        this.head.setRotationPoint(0.0F, -3.8F, -0.6F);
        this.head.addBox(-2.0F, -3.0F, -1.5F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, -0.6373942428283291F, 0.0F, 0.0F);
        this.neck2 = new ModelRenderer(this, 0, 15);
        this.neck2.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.neck2.addBox(-1.5F, -5.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(neck2, 0.9426523290021372F, 0.0F, 0.0F);
        this.beak = new ModelRenderer(this, 35, 10);
        this.beak.setRotationPoint(-1.0F, -1.9F, -3.2F);
        this.beak.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(beak, 0.091106186954104F, 0.0F, 0.0F);
        this.rightwing2 = new ModelRenderer(this, 52, 10);
        this.rightwing2.setRotationPoint(0.1F, -1.0F, 6.3F);
        this.rightwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(rightwing2, 0.4553564018453205F, 0.0F, 0.0F);
        this.rightwing = new ModelRenderer(this, 24, 8);
        this.rightwing.setRotationPoint(1.6F, 0.9F, 1.2F);
        this.rightwing.addBox(0.0F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(rightwing, -1.0471975511965976F, -0.045553093477052F, 1.6390387005478748F);
        this.leftwing2 = new ModelRenderer(this, 0, 23);
        this.leftwing2.setRotationPoint(-0.1F, -1.0F, 6.3F);
        this.leftwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(leftwing2, 0.4553564018453205F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 39, 0);
        this.body2.setRotationPoint(3.4F, 0.7F, 6.6F);
        this.body2.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(body2, 0.12322024519079966F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(-3.5F, 7.2F, -0.8F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 6, 9, 0.0F);
        this.body3 = new ModelRenderer(this, 24, 21);
        this.body3.setRotationPoint(0.0F, 0.3F, 2.7F);
        this.body3.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(body3, 0.136659280431156F, 0.0F, 0.0F);
        this.beak.addChild(this.beak2);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftwing);
        this.neck2.addChild(this.head);
        this.neck.addChild(this.neck2);
        this.head.addChild(this.beak);
        this.rightwing.addChild(this.rightwing2);
        this.body.addChild(this.rightwing);
        this.leftwing.addChild(this.leftwing2);
        this.body.addChild(this.body2);
        this.body2.addChild(this.body3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
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
