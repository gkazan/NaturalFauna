package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAvocet extends ModelBase {
    public ModelRenderer neck;
    public ModelRenderer neck2;
    public ModelRenderer neck3;
    public ModelRenderer leftleg;
    public ModelRenderer Atail2;
    public ModelRenderer body;
    public ModelRenderer Btail;
    public ModelRenderer Atail;
    public ModelRenderer head;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg2;
    public ModelRenderer leftleg3;
    public ModelRenderer Btail2;
    public ModelRenderer Btail3;
    public ModelRenderer peak;
    public ModelRenderer peak2;
    public ModelRenderer rightleg2;
    public ModelRenderer rightleg3;

    public ModelAvocet() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 37, 1);
        this.head.setRotationPoint(-0.5F, 12.0F, -4.0F);
        this.head.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 58, 10);
        this.leftleg3.setRotationPoint(-0.5F, 2.5F, 1.0F);
        this.leftleg3.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.peak2 = new ModelRenderer(this, 20, 1);
        this.peak2.setRotationPoint(-0.5F, -0.5F, -4.0F);
        this.peak2.addBox(0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F);
        this.setRotateAngle(peak2, -0.6543436050415039F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 38, 15);
        this.neck.setRotationPoint(-0.5F, 18.0F, -2.0F);
        this.neck.addBox(-1.0F, -3.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(neck, 0.3569146990776062F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 58, 0);
        this.rightleg.setRotationPoint(-1.0F, 17.8F, -1.3F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.3141592653589793F, 0.0F, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 58, 10);
        this.rightleg3.setRotationPoint(0.5F, 2.5F, 1.0F);
        this.rightleg3.addBox(-1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightleg3, 0.0017453292519943296F, 0.0F, 0.0F);
        this.neck3 = new ModelRenderer(this, 40, 10);
        this.neck3.setRotationPoint(0.0F, 15.899999618530273F, -3.4000000953674316F);
        this.neck3.addBox(-1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(neck3, 0.38665759563446045F, 0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 58, 5);
        this.leftleg2.setRotationPoint(0.5F, 2.700000047683716F, 0.0F);
        this.leftleg2.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg2, -0.3271717131137848F, 0.0F, 0.0F);
        this.neck2 = new ModelRenderer(this, 40, 6);
        this.neck2.setRotationPoint(0.0F, 13.0F, -4.599999904632568F);
        this.neck2.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(neck2, -0.32717180252075195F, 0.0F, 0.0F);
        this.Btail = new ModelRenderer(this, 13, 26);
        this.Btail.setRotationPoint(-0.5F, 16.600000381469727F, 3.0F);
        this.Btail.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Btail, -0.475886195898056F, 0.0F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 58, 5);
        this.rightleg2.setRotationPoint(-0.5F, 2.700000047683716F, 0.0F);
        this.rightleg2.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg2, -0.3271717131137848F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 58, 0);
        this.leftleg.setRotationPoint(0.0F, 17.8F, -1.3F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.3141592653589793F, 0.0F, 0.0F);
        this.peak = new ModelRenderer(this, 27, 1);
        this.peak.setRotationPoint(-0.5F, -0.5F, -1.0F);
        this.peak.addBox(0.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F);
        this.body = new ModelRenderer(this, 34, 21);
        this.body.setRotationPoint(-0.5F, 15.0F, -3.0F);
        this.body.addBox(-2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(body, -0.2082002013921738F, 0.0F, 0.0F);
        this.Btail2 = new ModelRenderer(this, 5, 24);
        this.Btail2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Btail2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Btail2, 4.699999863078119E-6F, 0.0F, 0.0F);
        this.Atail = new ModelRenderer(this, 22, 25);
        this.Atail.setRotationPoint(0.0F, 17.0F, 1.5F);
        this.Atail.addBox(-2.0F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Atail, -0.38665759563446045F, 0.0F, 0.0F);
        this.Atail2 = new ModelRenderer(this, 22, 20);
        this.Atail2.setRotationPoint(0.0F, 17.899999618530273F, 1.0F);
        this.Atail2.addBox(-2.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Atail2, 0.11897160112857819F, 0.0F, 0.0F);
        this.Btail3 = new ModelRenderer(this, 13, 21);
        this.Btail3.setRotationPoint(0.0F, 1.100000023841858F, 0.0F);
        this.Btail3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Btail3, 0.5948653221130371F, 0.0F, 0.0F);
        this.leftleg2.addChild(this.leftleg3);
        this.head.addChild(this.peak2);
        this.rightleg2.addChild(this.rightleg3);
        this.leftleg.addChild(this.leftleg2);
        this.rightleg.addChild(this.rightleg2);
        this.head.addChild(this.peak);
        this.Btail.addChild(this.Btail2);
        this.Btail.addChild(this.Btail3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.head.render(f5);
        this.neck.render(f5);
        this.rightleg.render(f5);
        this.neck3.render(f5);
        this.neck2.render(f5);
        this.Btail.render(f5);
        this.leftleg.render(f5);
        this.body.render(f5);
        this.Atail.render(f5);
        this.Atail2.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
