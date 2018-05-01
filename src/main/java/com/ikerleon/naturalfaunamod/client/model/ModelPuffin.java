package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPuffin extends ModelBase {
    public ModelRenderer leftleg;
    public ModelRenderer head;
    public ModelRenderer rightleg;
    public ModelRenderer body;
    public ModelRenderer leftleg2;
    public ModelRenderer peak;
    public ModelRenderer peak2;
    public ModelRenderer rightleg2;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer tail;
    public ModelRenderer tail2;

    public ModelPuffin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tail = new ModelRenderer(this, 50, 5);
        this.tail.setRotationPoint(1.0F, 0.4000000059604645F, 2.0F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail, -0.35495251417160034F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 53, 12);
        this.tail2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(tail2, -0.10224120318889618F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 28, 24);
        this.body.setRotationPoint(0.0F, 18.299999237060547F, -1.399999976158142F);
        this.body.addBox(-1.5F, -1.100000023841858F, -0.8999999761581421F, 3, 4, 4, 5.9604644775390625E-8F);
        this.setRotateAngle(body, -0.4098033010959626F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 23, 1);
        this.leftleg.setRotationPoint(0.30000001192092896F, 21.0F, -1.399999976158142F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.peak2 = new ModelRenderer(this, 11, 20);
        this.peak2.setRotationPoint(0.0F, -1.0F, 0.7066670060157776F);
        this.peak2.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peak2, 0.349065899848938F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 1, 25);
        this.head.setRotationPoint(0.0F, 17.299999237060547F, -3.0999999046325684F);
        this.head.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.body3 = new ModelRenderer(this, 52, 25);
        this.body3.setRotationPoint(-1.0F, -0.20000000298023224F, 0.4000000059604645F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body3, 0.27213919162750244F, 0.0F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 11, 1);
        this.rightleg2.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.rightleg2.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.rightleg = new ModelRenderer(this, 18, 1);
        this.rightleg.setRotationPoint(-0.30000001192092896F, 21.0F, -1.399999976158142F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.peak = new ModelRenderer(this, 1, 20);
        this.peak.setRotationPoint(-0.5F, -1.3200000524520874F, -0.9200000166893005F);
        this.peak.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 29, 1);
        this.leftleg2.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.leftleg2.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.body2 = new ModelRenderer(this, 19, 27);
        this.body2.setRotationPoint(0.0F, 0.800000011920929F, -0.20000000298023224F);
        this.body2.addBox(-1.0F, -2.5F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(body2, 0.7813891172409057F, 0.0F, 0.0F);
        this.body3.addChild(this.tail);
        this.tail.addChild(this.tail2);
        this.peak.addChild(this.peak2);
        this.body.addChild(this.body3);
        this.rightleg.addChild(this.rightleg2);
        this.head.addChild(this.peak);
        this.leftleg.addChild(this.leftleg2);
        this.body.addChild(this.body2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
        this.leftleg.render(f5);
        this.head.render(f5);
        this.rightleg.render(f5);
    }
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
