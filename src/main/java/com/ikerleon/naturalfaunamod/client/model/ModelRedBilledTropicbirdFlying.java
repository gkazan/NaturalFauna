package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Red-Billed Hornbill Flying - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelRedBilledTropicbirdFlying extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer rightwing;
    public ModelRenderer leftwing;
    public ModelRenderer leftleg;
    public ModelRenderer rightleg;
    public ModelRenderer neck;
    public ModelRenderer body2;
    public ModelRenderer rightwing2;
    public ModelRenderer rightwing3;
    public ModelRenderer leftwing2;
    public ModelRenderer leftwing3;
    public ModelRenderer neck2;
    public ModelRenderer head;
    public ModelRenderer beak;
    public ModelRenderer beak2;
    public ModelRenderer righttail;
    public ModelRenderer lefttail;
    public ModelRenderer middletail1;
    public ModelRenderer middletail2;
    public ModelRenderer middletail12;
    public ModelRenderer middletail22;

    public ModelRedBilledTropicbirdFlying() {
        this.textureWidth = 64;
        this.textureHeight = 30;
        this.rightwing3 = new ModelRenderer(this, 53, 19);
        this.rightwing3.setRotationPoint(0.0F, 0.1F, 2.6F);
        this.rightwing3.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(rightwing3, 0.27314402793711257F, 0.045553093477052F, 0.0F);
        this.beak2 = new ModelRenderer(this, 45, 24);
        this.beak2.setRotationPoint(-0.2F, -3.9F, 0.0F);
        this.beak2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(beak2, -0.136659280431156F, 0.0F, 0.0F);
        this.middletail1 = new ModelRenderer(this, -8, 2);
        this.middletail1.setRotationPoint(-0.5F, 0.5F, 2.4F);
        this.middletail1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
        this.leftwing2 = new ModelRenderer(this, 41, 11);
        this.leftwing2.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.leftwing2.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leftwing2, -0.23736477827122882F, 0.045553093477052F, 0.0F);
        this.middletail22 = new ModelRenderer(this, 3, 6);
        this.middletail22.setRotationPoint(0.0F, 0.0F, 9.9F);
        this.middletail22.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F);
        this.setRotateAngle(middletail22, -0.136659280431156F, -0.27314402793711257F, 0.0F);
        this.body = new ModelRenderer(this, 1, 20);
        this.body.setRotationPoint(0.0F, 17.2F, 0.0F);
        this.body.addBox(-1.9F, 0.0F, -2.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.008203047484373348F);
        this.neck2 = new ModelRenderer(this, 22, 23);
        this.neck2.setRotationPoint(0.5F, -0.4F, -2.1F);
        this.neck2.addBox(-1.5F, -2.0F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck2, 1.2747884856566583F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 1, 13);
        this.body2.setRotationPoint(0.0F, 0.1F, 3.2F);
        this.body2.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(body2, -0.18203784098300857F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 31, 23);
        this.head.setRotationPoint(-0.8F, -0.6F, -0.9F);
        this.head.addBox(-1.2F, -2.7F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, 0.36425021489121656F, 0.0F, 0.0F);
        this.leftwing = new ModelRenderer(this, 35, 1);
        this.leftwing.setRotationPoint(1.8F, 0.7F, -0.3F);
        this.leftwing.addBox(0.0F, -1.5F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(leftwing, 1.3658946726107624F, 0.045553093477052F, 1.5481070465189704F);
        this.rightwing = new ModelRenderer(this, 50, 1);
        this.rightwing.setRotationPoint(-1.4F, 1.2F, 0.7F);
        this.rightwing.addBox(-0.5F, -1.5F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(rightwing, -1.3658946726107624F, 0.091106186954104F, 1.593485607070823F);
        this.leftwing3 = new ModelRenderer(this, 31, 14);
        this.leftwing3.setRotationPoint(0.0F, 0.1F, 2.6F);
        this.leftwing3.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(leftwing3, -0.27314402793711257F, 0.045553093477052F, 0.0F);
        this.neck = new ModelRenderer(this, 19, 17);
        this.neck.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.neck.addBox(-1.5F, -0.9F, -2.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(neck, 0.091106186954104F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 24, 4);
        this.rightleg.setRotationPoint(-1.5F, 2.6F, 1.5F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.0471975511965976F, 0.0F, 0.0F);
        this.rightwing2 = new ModelRenderer(this, 53, 11);
        this.rightwing2.setRotationPoint(-0.5F, 1.0F, 4.5F);
        this.rightwing2.addBox(0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F);
        this.setRotateAngle(rightwing2, 0.22759093446006054F, 0.045553093477052F, 0.0F);
        this.middletail2 = new ModelRenderer(this, -8, 2);
        this.middletail2.setRotationPoint(-0.5F, 0.4F, 2.4F);
        this.middletail2.addBox(0.0F, 0.0F, 0.0F, 1, 0, 10, 0.0F);
        this.middletail12 = new ModelRenderer(this, 3, 6);
        this.middletail12.setRotationPoint(1.0F, 0.0F, 9.9F);
        this.middletail12.addBox(-1.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F);
        this.setRotateAngle(middletail12, -0.136659280431156F, 0.27314402793711257F, 0.0F);
        this.leftleg = new ModelRenderer(this, 24, 4);
        this.leftleg.setRotationPoint(0.5F, 2.5F, 1.7F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.9560913642424937F, 0.0F, 0.0F);
        this.righttail = new ModelRenderer(this, 13, 9);
        this.righttail.setRotationPoint(-1.0F, 0.6F, 1.6F);
        this.righttail.addBox(0.0F, 0.0F, 0.1F, 1, 1, 4, 0.0F);
        this.setRotateAngle(righttail, 0.0F, -0.27314402793711257F, 0.0F);
        this.beak = new ModelRenderer(this, 45, 24);
        this.beak.setRotationPoint(-0.2F, -5.0F, -0.3F);
        this.beak.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(beak, 0.18203784098300857F, 0.0F, 0.0F);
        this.lefttail = new ModelRenderer(this, 13, 9);
        this.lefttail.setRotationPoint(1.0F, 0.6F, 1.6F);
        this.lefttail.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(lefttail, 0.0F, 0.27314402793711257F, 0.0F);
        this.rightwing2.addChild(this.rightwing3);
        this.head.addChild(this.beak2);
        this.body2.addChild(this.middletail1);
        this.leftwing.addChild(this.leftwing2);
        this.middletail2.addChild(this.middletail22);
        this.neck.addChild(this.neck2);
        this.body.addChild(this.body2);
        this.neck2.addChild(this.head);
        this.body.addChild(this.leftwing);
        this.body.addChild(this.rightwing);
        this.leftwing2.addChild(this.leftwing3);
        this.body.addChild(this.neck);
        this.body.addChild(this.rightleg);
        this.rightwing.addChild(this.rightwing2);
        this.body2.addChild(this.middletail2);
        this.middletail1.addChild(this.middletail12);
        this.body.addChild(this.leftleg);
        this.body2.addChild(this.righttail);
        this.head.addChild(this.beak);
        this.body2.addChild(this.lefttail);
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
