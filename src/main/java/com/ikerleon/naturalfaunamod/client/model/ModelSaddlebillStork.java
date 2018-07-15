package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * saddlebilledstork - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelSaddlebillStork extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer body2;
    public ModelRenderer neck;
    public ModelRenderer rightwing;
    public ModelRenderer leftwing;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer neck2;
    public ModelRenderer head;
    public ModelRenderer beak;
    public ModelRenderer beak2;
    public ModelRenderer beak3;
    public ModelRenderer rightleg2;
    public ModelRenderer rightleg3;
    public ModelRenderer rfootfinger;
    public ModelRenderer rfootfingerback;
    public ModelRenderer rfootfinger2;
    public ModelRenderer rfootfinger3;
    public ModelRenderer leftleg2;
    public ModelRenderer leftleg3;
    public ModelRenderer lfootfingermiddle;
    public ModelRenderer lfootfingerback;
    public ModelRenderer lfootfinger2;
    public ModelRenderer lfootfinger3;

    public ModelSaddlebillStork() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rightleg2 = new ModelRenderer(this, 18, 8);
        this.rightleg2.setRotationPoint(0.0F, 2.5F, 0.6F);
        this.rightleg2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(rightleg2, -0.1244419756671957F, 0.0F, 0.0F);
        this.beak2 = new ModelRenderer(this, 23, 28);
        this.beak2.setRotationPoint(0.5F, 1.2F, 0.9F);
        this.beak2.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 10, 0.0F);
        this.setRotateAngle(beak2, -0.12042771838760875F, 0.0F, 0.0F);
        this.rfootfinger3 = new ModelRenderer(this, 0, 17);
        this.rfootfinger3.setRotationPoint(-0.1F, -0.1F, -0.3F);
        this.rfootfinger3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfinger3, -0.17348572764823636F, -0.3427826650916863F, 0.0F);
        this.rightwing = new ModelRenderer(this, 43, 19);
        this.rightwing.setRotationPoint(1.7F, -1.8F, 4.0F);
        this.rightwing.addBox(-0.1F, -0.8F, -9.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(rightwing, 0.08063421144213803F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 38, 50);
        this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.body.addBox(-2.0F, -2.3F, -4.2F, 4, 5, 9, 0.0F);
        this.setRotateAngle(body, 0.17191493132144145F, -3.141592653589793F, 0.0F);
        this.leftwing = new ModelRenderer(this, 44, 5);
        this.leftwing.setRotationPoint(-2.6F, -2.0F, 4.0F);
        this.leftwing.addBox(0.0F, 0.0F, -9.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(leftwing, 0.06632251157578452F, 0.0F, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 16, 17);
        this.rightleg3.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.rightleg3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(rightleg3, 0.2970550386894349F, 0.0F, 0.0F);
        this.lfootfingermiddle = new ModelRenderer(this, 1, 26);
        this.lfootfingermiddle.setRotationPoint(0.0F, 4.2F, 0.6F);
        this.lfootfingermiddle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lfootfingermiddle, -0.20821777976292352F, 0.0F, 0.0F);
        this.neck2 = new ModelRenderer(this, 41, 3);
        this.neck2.setRotationPoint(0.5F, -1.5F, -3.9F);
        this.neck2.addBox(-2.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(neck2, 0.14276793281313613F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 26, 3);
        this.head.setRotationPoint(-0.5F, -4.6F, 4.1F);
        this.head.addBox(-2.0F, -2.3F, -4.2F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -0.1322959573011702F, 0.0F, 0.0F);
        this.lfootfinger2 = new ModelRenderer(this, 0, 13);
        this.lfootfinger2.setRotationPoint(0.1F, -0.1F, 0.1F);
        this.lfootfinger2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lfootfinger2, -0.20821777976292352F, 0.34819318577286873F, 0.0F);
        this.body2 = new ModelRenderer(this, 50, 42);
        this.body2.setRotationPoint(0.5F, -0.5F, -2.3F);
        this.body2.addBox(-2.0F, -2.3F, -4.2F, 3, 3, 4, 0.0F);
        this.setRotateAngle(body2, 0.8660323748395863F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 52, 34);
        this.neck.setRotationPoint(0.5F, 0.5F, 6.5F);
        this.neck.addBox(-2.0F, -2.4F, -4.2F, 3, 4, 3, 0.0F);
        this.setRotateAngle(neck, -0.3508111796508603F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 10, 1);
        this.leftleg.setRotationPoint(-1.5F, 1.3F, -2.8F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(leftleg, -0.136659280431156F, 0.0F, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 11, 17);
        this.leftleg3.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.leftleg3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(leftleg3, 0.2970550386894349F, 0.0F, 0.0F);
        this.rfootfingerback = new ModelRenderer(this, 24, 26);
        this.rfootfingerback.setRotationPoint(0.0F, 4.4F, -1.6F);
        this.rfootfingerback.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfingerback, 0.07138396640656806F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 18, 1);
        this.rightleg.setRotationPoint(0.3F, 1.3F, -2.9F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(rightleg, -0.136659280431156F, 0.0F, 0.0F);
        this.lfootfingerback = new ModelRenderer(this, 16, 26);
        this.lfootfingerback.setRotationPoint(0.0F, 4.4F, -1.6F);
        this.lfootfingerback.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lfootfingerback, 0.07138396640656806F, 0.0F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 12, 8);
        this.leftleg2.setRotationPoint(0.0F, 2.5F, 0.4F);
        this.leftleg2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(leftleg2, -0.1244419756671957F, 0.0F, 0.0F);
        this.rfootfinger2 = new ModelRenderer(this, 1, 21);
        this.rfootfinger2.setRotationPoint(0.1F, -0.1F, 0.1F);
        this.rfootfinger2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfinger2, -0.20821777976292352F, 0.34819318577286873F, 0.0F);
        this.lfootfinger3 = new ModelRenderer(this, 0, 7);
        this.lfootfinger3.setRotationPoint(-0.1F, -0.1F, -0.3F);
        this.lfootfinger3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lfootfinger3, -0.19669860669976091F, -0.3659955441432109F, 0.0F);
        this.beak = new ModelRenderer(this, 24, 12);
        this.beak.setRotationPoint(0.5F, 1.9F, 0.5F);
        this.beak.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 10, 0.0F);
        this.setRotateAngle(beak, -0.02530727415391778F, 0.0F, 0.0F);
        this.beak3 = new ModelRenderer(this, 22, 15);
        this.beak3.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.beak3.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 3, 0.0F);
        this.setRotateAngle(beak3, -0.0609119908946021F, 0.0F, 0.0F);
        this.rfootfinger = new ModelRenderer(this, 9, 26);
        this.rfootfinger.setRotationPoint(0.0F, 4.2F, 0.6F);
        this.rfootfinger.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfinger, -0.20821777976292352F, 0.0F, 0.0F);
        this.rightleg.addChild(this.rightleg2);
        this.head.addChild(this.beak2);
        this.rfootfinger.addChild(this.rfootfinger3);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.leftwing);
        this.rightleg2.addChild(this.rightleg3);
        this.leftleg3.addChild(this.lfootfingermiddle);
        this.neck.addChild(this.neck2);
        this.neck2.addChild(this.head);
        this.lfootfingermiddle.addChild(this.lfootfinger2);
        this.body.addChild(this.body2);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftleg);
        this.leftleg2.addChild(this.leftleg3);
        this.rightleg3.addChild(this.rfootfingerback);
        this.body.addChild(this.rightleg);
        this.leftleg3.addChild(this.lfootfingerback);
        this.leftleg.addChild(this.leftleg2);
        this.rfootfinger.addChild(this.rfootfinger2);
        this.lfootfingermiddle.addChild(this.lfootfinger3);
        this.head.addChild(this.beak);
        this.beak2.addChild(this.beak3);
        this.rightleg3.addChild(this.rfootfinger);
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
