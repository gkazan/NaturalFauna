package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * dromadaire - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCamel extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer shape18;
    public ModelRenderer shape17;
    public ModelRenderer shape21;
    public ModelRenderer shape22;
    public ModelRenderer shape8;
    public ModelRenderer shape10;
    public ModelRenderer shape9;
    public ModelRenderer shape11;
    public ModelRenderer tails;
    public ModelRenderer shape19;
    public ModelRenderer shape12;
    public ModelRenderer shape14;
    public ModelRenderer shape15;
    public ModelRenderer shape13;
    public ModelRenderer shape2;
    public ModelRenderer head;
    public ModelRenderer head2;
    public ModelRenderer shape5;
    public ModelRenderer shape4;

    public ModelCamel() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shape21 = new ModelRenderer(this, 92, 69);
        this.shape21.setRotationPoint(0.8F, -2.6F, 14.9F);
        this.shape21.addBox(0.0F, 0.0F, 0.0F, 8, 3, 4, 0.0F);
        this.setRotateAngle(shape21, -1.0522590060273813F, 0.0F, 0.0F);
        this.tails = new ModelRenderer(this, 80, 80);
        this.tails.setRotationPoint(5.0F, 2.7F, 17.0F);
        this.tails.addBox(-1.1F, -0.5F, 0.1F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tails, -1.3566444275751923F, 0.0F, 0.0F);
        this.shape12 = new ModelRenderer(this, 72, 2);
        this.shape12.setRotationPoint(-2.3F, 2.4F, 0.0F);
        this.shape12.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape22 = new ModelRenderer(this, 103, 53);
        this.shape22.setRotationPoint(0.9F, -2.0F, 6.7F);
        this.shape22.addBox(0.0F, 0.0F, 0.0F, 8, 2, 2, 0.0F);
        this.shape19 = new ModelRenderer(this, 38, 95);
        this.shape19.setRotationPoint(0.5F, 9.0F, 0.1F);
        this.shape19.addBox(0.0F, 0.0F, 0.0F, 9, 5, 7, 0.0F);
        this.setRotateAngle(shape19, 2.1945770014576698F, 0.01658062789394613F, 0.0F);
        this.shape17 = new ModelRenderer(this, 20, 69);
        this.shape17.setRotationPoint(0.9F, -2.9F, 8.2F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 8, 3, 7, 0.0F);
        this.shape15 = new ModelRenderer(this, 55, 2);
        this.shape15.setRotationPoint(2.3F, 2.4F, 0.0F);
        this.shape15.addBox(-2.0F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape13 = new ModelRenderer(this, 20, 2);
        this.shape13.setRotationPoint(2.9F, 3.9F, 0.0F);
        this.shape13.addBox(-2.3F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape2 = new ModelRenderer(this, 102, 20);
        this.shape2.setRotationPoint(4.7F, 2.4F, 11.2F);
        this.shape2.addBox(-3.0F, -6.0F, -3.5F, 5, 11, 5, 0.0F);
        this.setRotateAngle(shape2, 1.4203489452729852F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 90, 5);
        this.shape4.setRotationPoint(1.4F, 3.0F, -7.7F);
        this.shape4.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape4, -0.6045820528908358F, 0.02565634000431664F, -0.4241150082346221F);
        this.shape9 = new ModelRenderer(this, 51, 24);
        this.shape9.setRotationPoint(7.8F, 5.8F, 3.6F);
        this.shape9.addBox(-0.6F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(shape9, 0.0F, 0.0F, -2.3252456653390877E-17F);
        this.shape14 = new ModelRenderer(this, 38, 2);
        this.shape14.setRotationPoint(-2.3F, 2.4F, 0.0F);
        this.shape14.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.shape10 = new ModelRenderer(this, 33, 24);
        this.shape10.setRotationPoint(3.0F, 5.8F, 14.0F);
        this.shape10.addBox(-4.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.shape11 = new ModelRenderer(this, 15, 25);
        this.shape11.setRotationPoint(7.1F, 4.3F, 14.1F);
        this.shape11.addBox(0.0F, -0.5F, -2.0F, 4, 6, 4, 0.0F);
        this.shape5 = new ModelRenderer(this, 90, 12);
        this.shape5.setRotationPoint(-3.8F, 3.1F, -7.3F);
        this.shape5.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape5, -0.3993313328563026F, 0.0F, 0.5462880558742251F);
        this.head2 = new ModelRenderer(this, 10, 50);
        this.head2.setRotationPoint(-0.1F, -6.7F, 1.7F);
        this.head2.addBox(-3.0F, -3.9F, -6.8F, 4, 3, 5, 0.0F);
        this.setRotateAngle(head2, 1.8994418249454288F, 0.0F, 0.0F);
        this.shape18 = new ModelRenderer(this, 53, 69);
        this.shape18.setRotationPoint(0.9F, -2.8F, 0.8F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 8, 3, 6, 0.0F);
        this.body = new ModelRenderer(this, 58, 95);
        this.body.setRotationPoint(0.7F, 2.9F, 1.3F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 10, 9, 17, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.01658062789394613F, 0.0F);
        this.head = new ModelRenderer(this, 101, 3);
        this.head.setRotationPoint(0.5F, 7.4F, 3.6F);
        this.head.addBox(-3.0F, -3.9F, -6.8F, 4, 5, 7, 0.0F);
        this.setRotateAngle(head, -0.4635594493296939F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 71, 24);
        this.shape8.setRotationPoint(3.1F, 5.6F, 3.2F);
        this.shape8.addBox(-4.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.body.addChild(this.shape21);
        this.body.addChild(this.tails);
        this.shape8.addChild(this.shape12);
        this.body.addChild(this.shape22);
        this.body.addChild(this.shape19);
        this.body.addChild(this.shape17);
        this.shape9.addChild(this.shape15);
        this.shape11.addChild(this.shape13);
        this.shape19.addChild(this.shape2);
        this.head.addChild(this.shape4);
        this.body.addChild(this.shape9);
        this.shape10.addChild(this.shape14);
        this.body.addChild(this.shape10);
        this.body.addChild(this.shape11);
        this.head.addChild(this.shape5);
        this.head.addChild(this.head2);
        this.body.addChild(this.shape18);
        this.shape2.addChild(this.head);
        this.body.addChild(this.shape8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
