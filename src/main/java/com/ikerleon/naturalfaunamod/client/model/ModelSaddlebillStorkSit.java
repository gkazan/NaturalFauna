package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.entity.Entity;

/**
 * saddlebilledstork - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelSaddlebillStorkSit extends AdvancedModelBase {
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer rightwing;
    public AdvancedModelRenderer leftwing;
    public AdvancedModelRenderer rightleg;
    public AdvancedModelRenderer leftleg;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer beak;
    public AdvancedModelRenderer beak2;
    public AdvancedModelRenderer beak3;
    public AdvancedModelRenderer rightleg2;
    public AdvancedModelRenderer rightleg3;
    public AdvancedModelRenderer rfootfingermiddle;
    public AdvancedModelRenderer rfootfingerback;
    public AdvancedModelRenderer rfootfinger2;
    public AdvancedModelRenderer rfootfinger3;
    public AdvancedModelRenderer leftleg2;
    public AdvancedModelRenderer leftleg3;
    public AdvancedModelRenderer lfootfingermiddle;
    public AdvancedModelRenderer lffotfingerback;
    public AdvancedModelRenderer lfootfinger2;
    public AdvancedModelRenderer lfootfinger3;

    public ModelSaddlebillStorkSit() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rightleg2 = new AdvancedModelRenderer(this, 18, 8);
        this.rightleg2.setRotationPoint(0.0F, 1.9F, 0.6F);
        this.rightleg2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(rightleg2, -0.7464773210779748F, 0.0F, 0.0F);
        this.beak = new AdvancedModelRenderer(this, 24, 12);
        this.beak.setRotationPoint(0.5F, 1.9F, 0.5F);
        this.beak.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 10, 0.0F);
        this.setRotateAngle(beak, -0.02530727415391778F, 0.0F, 0.0F);
        this.rfootfinger3 = new AdvancedModelRenderer(this, 0, 17);
        this.rfootfinger3.setRotationPoint(-0.1F, -0.1F, -0.3F);
        this.rfootfinger3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfinger3, -0.17348572764823636F, -0.3427826650916863F, 0.0F);
        this.leftleg3 = new AdvancedModelRenderer(this, 11, 17);
        this.leftleg3.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.leftleg3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(leftleg3, 0.2970550386894349F, 0.0F, 0.0F);
        this.lfootfinger3 = new AdvancedModelRenderer(this, 0, 7);
        this.lfootfinger3.setRotationPoint(-0.1F, -0.1F, -0.3F);
        this.lfootfinger3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lfootfinger3, -0.19669860669976091F, -0.3659955441432109F, 0.0F);
        this.lfootfinger2 = new AdvancedModelRenderer(this, 0, 13);
        this.lfootfinger2.setRotationPoint(0.1F, -0.1F, 0.1F);
        this.lfootfinger2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lfootfinger2, -0.20821777976292352F, 0.34819318577286873F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 50, 42);
        this.body2.setRotationPoint(0.5F, -0.5F, -2.3F);
        this.body2.addBox(-2.0F, -2.3F, -4.2F, 3, 3, 4, 0.0F);
        this.setRotateAngle(body2, 0.8660323748395863F, 0.0F, 0.0F);
        this.rfootfingerback = new AdvancedModelRenderer(this, 24, 26);
        this.rfootfingerback.setRotationPoint(0.0F, 5.2F, -1.2F);
        this.rfootfingerback.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfingerback, 0.839328837284073F, 0.0F, 0.0F);
        this.rightleg3 = new AdvancedModelRenderer(this, 16, 17);
        this.rightleg3.setRotationPoint(0.0F, 5.3F, 0.3F);
        this.rightleg3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(rightleg3, 1.894380370114645F, 0.0F, 0.0F);
        this.rightwing = new AdvancedModelRenderer(this, 43, 19);
        this.rightwing.setRotationPoint(1.7F, -1.8F, 4.0F);
        this.rightwing.addBox(-0.1F, -0.8F, -9.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(rightwing, 0.08063421144213803F, 0.0F, 0.0F);
        this.beak2 = new AdvancedModelRenderer(this, 23, 28);
        this.beak2.setRotationPoint(0.5F, 1.2F, 0.9F);
        this.beak2.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 10, 0.0F);
        this.setRotateAngle(beak2, -0.12042771838760875F, 0.0F, 0.0F);
        this.body = new AdvancedModelRenderer(this, 38, 50);
        this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.body.addBox(-2.0F, -2.3F, -4.2F, 4, 5, 9, 0.0F);
        this.setRotateAngle(body, 0.17191493132144145F, -3.141592653589793F, 0.0F);
        this.lfootfingermiddle = new AdvancedModelRenderer(this, 1, 26);
        this.lfootfingermiddle.setRotationPoint(0.0F, 4.2F, 0.6F);
        this.lfootfingermiddle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lfootfingermiddle, -0.20821777976292352F, 0.0F, 0.0F);
        this.beak3 = new AdvancedModelRenderer(this, 22, 15);
        this.beak3.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.beak3.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 3, 0.0F);
        this.setRotateAngle(beak3, -0.0609119908946021F, 0.0F, 0.0F);
        this.neck2 = new AdvancedModelRenderer(this, 41, 3);
        this.neck2.setRotationPoint(0.5F, -1.5F, -3.9F);
        this.neck2.addBox(-2.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(neck2, 0.14276793281313613F, 0.0F, 0.0F);
        this.leftleg2 = new AdvancedModelRenderer(this, 12, 8);
        this.leftleg2.setRotationPoint(0.0F, 2.5F, 0.4F);
        this.leftleg2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(leftleg2, -0.1244419756671957F, 0.0F, 0.0F);
        this.rightleg = new AdvancedModelRenderer(this, 18, 1);
        this.rightleg.setRotationPoint(0.3F, 1.3F, -2.9F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(rightleg, -0.4459316238845512F, 0.0F, 0.0F);
        this.rfootfingermiddle = new AdvancedModelRenderer(this, 9, 26);
        this.rfootfingermiddle.setRotationPoint(0.0F, 4.3F, 1.1F);
        this.rfootfingermiddle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfingermiddle, -1.674992483138958F, 0.0F, 0.0F);
        this.rfootfinger2 = new AdvancedModelRenderer(this, 1, 21);
        this.rfootfinger2.setRotationPoint(0.1F, -0.1F, 0.1F);
        this.rfootfinger2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rfootfinger2, -0.20821777976292352F, 0.34819318577286873F, 0.0F);
        this.lffotfingerback = new AdvancedModelRenderer(this, 16, 26);
        this.lffotfingerback.setRotationPoint(0.0F, 4.4F, -1.6F);
        this.lffotfingerback.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lffotfingerback, 0.07138396640656806F, 0.0F, 0.0F);
        this.leftleg = new AdvancedModelRenderer(this, 10, 1);
        this.leftleg.setRotationPoint(-1.5F, 1.3F, -2.8F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(leftleg, -0.136659280431156F, 0.0F, 0.0F);
        this.leftwing = new AdvancedModelRenderer(this, 44, 5);
        this.leftwing.setRotationPoint(-2.6F, -2.0F, 4.0F);
        this.leftwing.addBox(0.0F, 0.0F, -9.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(leftwing, 0.06632251157578452F, 0.0F, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 52, 34);
        this.neck.setRotationPoint(0.5F, 0.5F, 6.5F);
        this.neck.addBox(-2.0F, -2.4F, -4.2F, 3, 4, 3, 0.0F);
        this.setRotateAngle(neck, -0.3508111796508603F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 26, 3);
        this.head.setRotationPoint(-0.5F, -4.6F, 4.1F);
        this.head.addBox(-2.0F, -2.3F, -4.2F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -0.1322959573011702F, 0.0F, 0.0F);
        this.rightleg.addChild(this.rightleg2);
        this.head.addChild(this.beak);
        this.rfootfingermiddle.addChild(this.rfootfinger3);
        this.leftleg2.addChild(this.leftleg3);
        this.lfootfingermiddle.addChild(this.lfootfinger3);
        this.lfootfingermiddle.addChild(this.lfootfinger2);
        this.body.addChild(this.body2);
        this.rightleg3.addChild(this.rfootfingerback);
        this.rightleg2.addChild(this.rightleg3);
        this.body.addChild(this.rightwing);
        this.head.addChild(this.beak2);
        this.leftleg3.addChild(this.lfootfingermiddle);
        this.beak2.addChild(this.beak3);
        this.neck.addChild(this.neck2);
        this.leftleg.addChild(this.leftleg2);
        this.body.addChild(this.rightleg);
        this.rightleg3.addChild(this.rfootfingermiddle);
        this.rfootfingermiddle.addChild(this.rfootfinger2);
        this.leftleg3.addChild(this.lffotfingerback);
        this.body.addChild(this.leftleg);
        this.body.addChild(this.leftwing);
        this.body.addChild(this.neck);
        this.neck2.addChild(this.head);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	resetToDefaultPose();
    	
    	walk(body2, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(neck2, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	walk(rightwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(leftwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
