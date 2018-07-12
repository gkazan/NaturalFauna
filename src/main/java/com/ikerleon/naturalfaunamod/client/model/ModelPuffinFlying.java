package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPuffin - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuffinFlying extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer neck;
    public ModelRenderer leftwing;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer rightwing;
    public ModelRenderer body2;
    public ModelRenderer head;
    public ModelRenderer beak;
    public ModelRenderer beaktop;
    public ModelRenderer tail;
    public ModelRenderer tail2;

    public ModelPuffinFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body2 = new ModelRenderer(this, 52, 25);
        this.body2.setRotationPoint(-1.0F, -0.2F, 0.4F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.3042108886226116F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 1, 25);
        this.head.setRotationPoint(0.0F, -1.9F, -1.4F);
        this.head.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -1.0016444577195458F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 28, 24);
        this.body.setRotationPoint(0.0F, 18.3F, -1.4F);
        this.body.addBox(-1.5F, -1.1F, -0.9F, 3, 4, 4, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.0017453292519943296F);
        this.tail = new ModelRenderer(this, 50, 5);
        this.tail.setRotationPoint(1.0F, 0.4F, 2.0F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail, -0.35499996985564664F, 0.0F, 0.0F);
        this.beaktop = new ModelRenderer(this, 11, 20);
        this.beaktop.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.beaktop.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beaktop, 0.2792526803190927F, 0.0F, 0.0F);
        this.beak = new ModelRenderer(this, 1, 20);
        this.beak.setRotationPoint(-0.5F, -1.12F, -0.92F);
        this.beak.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beak, -0.18203784098300857F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 18, 1);
        this.leftleg.setRotationPoint(0.3F, 2.5F, 1.3F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 1.3203415791337103F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 23, 1);
        this.rightleg.setRotationPoint(-0.3F, 2.5F, 1.3F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.3203415791337103F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 19, 27);
        this.neck.mirror = true;
        this.neck.setRotationPoint(0.0F, 0.8F, -0.2F);
        this.neck.addBox(-1.0F, -2.5F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, 1.2292353921796064F, 0.0F, 0.0F);
        this.leftwing = new ModelRenderer(this, 31, 9);
        this.leftwing.setRotationPoint(0.8F, -0.3F, -0.7F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
        this.setRotateAngle(leftwing, -1.6390387005478748F, -3.141592653589793F, -1.5481070465189704F);
        this.rightwing = new ModelRenderer(this, 14, 9);
        this.rightwing.setRotationPoint(-0.8F, -0.3F, -0.7F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(rightwing, -1.6390387005478748F, -3.141592653589793F, 1.5481070465189704F);
        this.tail2 = new ModelRenderer(this, 53, 12);
        this.tail2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(tail2, -0.10227629416686772F, 0.0F, 0.0F);
        this.body.addChild(this.body2);
        this.neck.addChild(this.head);
        this.body2.addChild(this.tail);
        this.head.addChild(this.beaktop);
        this.head.addChild(this.beak);
        this.body.addChild(this.leftleg);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftwing);
        this.body.addChild(this.rightwing);
        this.tail.addChild(this.tail2);
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
