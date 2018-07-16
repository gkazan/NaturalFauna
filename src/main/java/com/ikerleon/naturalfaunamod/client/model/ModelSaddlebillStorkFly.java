package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.entity.Entity;

/**
 * saddlebilledstork - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelSaddlebillStorkFly extends AdvancedModelBase {
    public AdvancedModelRenderer shape1;
    public AdvancedModelRenderer shape2;
    public AdvancedModelRenderer shape3;
    public AdvancedModelRenderer rightwing;
    public AdvancedModelRenderer leftwing;
    public AdvancedModelRenderer shape27;
    public AdvancedModelRenderer shape28;
    public AdvancedModelRenderer shape4;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape8;
    public AdvancedModelRenderer rightwing2;
    public AdvancedModelRenderer leftwing2;
    public AdvancedModelRenderer shape29;
    public AdvancedModelRenderer shape31;
    public AdvancedModelRenderer shape33;
    public AdvancedModelRenderer shape46;
    public AdvancedModelRenderer shape35;
    public AdvancedModelRenderer shape38;
    public AdvancedModelRenderer shape30;
    public AdvancedModelRenderer shape32;
    public AdvancedModelRenderer shape34;
    public AdvancedModelRenderer shape45;
    public AdvancedModelRenderer shape36;
    public AdvancedModelRenderer shape37;

    public ModelSaddlebillStorkFly() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape38 = new AdvancedModelRenderer(this, 0, 17);
        this.shape38.setRotationPoint(-0.1F, -0.1F, -0.3F);
        this.shape38.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape38, -0.17348572764823636F, -0.3427826650916863F, 0.0F);
        this.rightwing2 = new AdvancedModelRenderer(this, 43, 19);
        this.rightwing2.setRotationPoint(-0.2F, -0.4F, -6.9F);
        this.rightwing2.addBox(-0.1F, -0.8F, -6.9F, 1, 4, 9, 0.0F);
        this.setRotateAngle(rightwing2, -0.40980330836826856F, 0.054279739737023644F, 0.0F);
        this.shape34 = new AdvancedModelRenderer(this, 1, 26);
        this.shape34.setRotationPoint(0.0F, 4.2F, 0.6F);
        this.shape34.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape34, -0.9691574630839948F, 0.0F, 0.0F);
        this.shape27 = new AdvancedModelRenderer(this, 18, 1);
        this.shape27.setRotationPoint(0.3F, 0.6F, -2.9F);
        this.shape27.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape27, -1.7147859900844287F, 0.0F, 0.0F);
        this.shape35 = new AdvancedModelRenderer(this, 1, 21);
        this.shape35.setRotationPoint(0.1F, -0.1F, 0.1F);
        this.shape35.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape35, -0.20821777976292352F, 0.34819318577286873F, 0.0F);
        this.shape37 = new AdvancedModelRenderer(this, 0, 7);
        this.shape37.setRotationPoint(-0.1F, -0.1F, -0.3F);
        this.shape37.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape37, -0.19669860669976091F, -0.3659955441432109F, 0.0F);
        this.leftwing = new AdvancedModelRenderer(this, 44, 5);
        this.leftwing.setRotationPoint(-0.6F, -0.4F, 0.9F);
        this.leftwing.addBox(-0.9F, 0.0F, -8.4F, 1, 4, 9, 0.0F);
        this.setRotateAngle(leftwing, 1.4570008595648662F, 0.07557275661135447F, 1.5121532639278872F);
        this.shape7 = new AdvancedModelRenderer(this, 24, 12);
        this.shape7.setRotationPoint(0.5F, 1.9F, 0.5F);
        this.shape7.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 10, 0.0F);
        this.setRotateAngle(shape7, -0.02530727415391778F, 0.0F, 0.0F);
        this.shape33 = new AdvancedModelRenderer(this, 9, 26);
        this.shape33.setRotationPoint(0.0F, 4.2F, 1.0F);
        this.shape33.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape33, -1.2615239833415013F, 0.0F, 0.0F);
        this.rightwing = new AdvancedModelRenderer(this, 43, 19);
        this.rightwing.setRotationPoint(2.2F, -0.3F, 1.0F);
        this.rightwing.addBox(-0.1F, -0.8F, -6.9F, 1, 4, 9, 0.0F);
        this.setRotateAngle(rightwing, 1.4570008595648662F, 0.07557275661135447F, -1.5566591598537425F);
        this.shape8 = new AdvancedModelRenderer(this, 22, 15);
        this.shape8.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.shape8.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 3, 0.0F);
        this.setRotateAngle(shape8, -0.0609119908946021F, 0.0F, 0.0F);
        this.shape2 = new AdvancedModelRenderer(this, 50, 42);
        this.shape2.setRotationPoint(0.5F, 0.2F, -4.1F);
        this.shape2.addBox(-2.0F, -2.3F, -4.2F, 3, 3, 4, 0.0F);
        this.setRotateAngle(shape2, -0.14119713648634127F, 0.0F, 0.0F);
        this.shape28 = new AdvancedModelRenderer(this, 10, 1);
        this.shape28.setRotationPoint(-1.5F, 0.6F, -2.8F);
        this.shape28.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape28, -1.6763887465405536F, 0.0F, 0.0F);
        this.shape30 = new AdvancedModelRenderer(this, 12, 8);
        this.shape30.setRotationPoint(0.0F, 2.5F, 0.4F);
        this.shape30.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape30, -0.1244419756671957F, 0.0F, 0.0F);
        this.shape32 = new AdvancedModelRenderer(this, 11, 17);
        this.shape32.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.shape32.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape32, 0.13559275808498417F, 0.0F, 0.0F);
        this.shape46 = new AdvancedModelRenderer(this, 24, 26);
        this.shape46.setRotationPoint(0.0F, 4.5F, 0.8F);
        this.shape46.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape46, -1.8123692200658872F, 0.0F, 0.0F);
        this.shape5 = new AdvancedModelRenderer(this, 26, 3);
        this.shape5.setRotationPoint(-0.5F, -5.7F, -2.0F);
        this.shape5.addBox(-2.0F, -2.3F, -4.2F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape5, 1.4055843577501483F, 0.0F, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 23, 28);
        this.shape6.setRotationPoint(0.5F, 1.2F, 0.9F);
        this.shape6.addBox(-2.0F, -2.3F, -4.2F, 2, 1, 10, 0.0F);
        this.setRotateAngle(shape6, -0.12042771838760875F, 0.0F, 0.0F);
        this.leftwing2 = new AdvancedModelRenderer(this, 43, 19);
        this.leftwing2.setRotationPoint(0.1F, 2.5F, -9.5F);
        this.leftwing2.addBox(-0.1F, -0.8F, -6.9F, 1, 4, 9, 0.0F);
        this.setRotateAngle(leftwing2, 0.40980330836826856F, 0.054279739737023644F, -3.141592653589793F);
        this.shape1 = new AdvancedModelRenderer(this, 38, 50);
        this.shape1.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.shape1.addBox(-2.0F, -2.3F, -4.2F, 4, 5, 9, 0.0F);
        this.setRotateAngle(shape1, 0.17191493132144145F, -3.141592653589793F, 0.0F);
        this.shape3 = new AdvancedModelRenderer(this, 52, 34);
        this.shape3.setRotationPoint(0.5F, 2.6F, 5.6F);
        this.shape3.addBox(-2.0F, -2.4F, -4.2F, 3, 4, 3, 0.0F);
        this.setRotateAngle(shape3, -1.7376498032855545F, 0.0F, 0.0F);
        this.shape4 = new AdvancedModelRenderer(this, 41, 3);
        this.shape4.setRotationPoint(0.5F, -5.2F, -0.1F);
        this.shape4.addBox(-2.0F, -2.3F, -4.2F, 2, 6, 2, 0.0F);
        this.setRotateAngle(shape4, 0.15236724369910498F, 0.0F, 0.0F);
        this.shape31 = new AdvancedModelRenderer(this, 16, 17);
        this.shape31.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.shape31.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape31, 0.0971493579410671F, 0.0F, 0.0F);
        this.shape45 = new AdvancedModelRenderer(this, 16, 26);
        this.shape45.setRotationPoint(0.0F, 4.5F, 0.7F);
        this.shape45.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape45, -1.8008307222077495F, 0.0F, 0.0F);
        this.shape36 = new AdvancedModelRenderer(this, 0, 13);
        this.shape36.setRotationPoint(0.1F, -0.1F, 0.1F);
        this.shape36.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape36, -0.20821777976292352F, 0.34819318577286873F, 0.0F);
        this.shape29 = new AdvancedModelRenderer(this, 18, 8);
        this.shape29.setRotationPoint(0.0F, 2.5F, 0.6F);
        this.shape29.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape29, -0.09368725555206224F, 0.0F, 0.0F);
        this.shape33.addChild(this.shape38);
        this.rightwing.addChild(this.rightwing2);
        this.shape32.addChild(this.shape34);
        this.shape1.addChild(this.shape27);
        this.shape33.addChild(this.shape35);
        this.shape34.addChild(this.shape37);
        this.shape1.addChild(this.leftwing);
        this.shape5.addChild(this.shape7);
        this.shape31.addChild(this.shape33);
        this.shape1.addChild(this.rightwing);
        this.shape6.addChild(this.shape8);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape28);
        this.shape28.addChild(this.shape30);
        this.shape30.addChild(this.shape32);
        this.shape31.addChild(this.shape46);
        this.shape4.addChild(this.shape5);
        this.shape5.addChild(this.shape6);
        this.leftwing.addChild(this.leftwing2);
        this.shape1.addChild(this.shape3);
        this.shape3.addChild(this.shape4);
        this.shape29.addChild(this.shape31);
        this.shape32.addChild(this.shape45);
        this.shape34.addChild(this.shape36);
        this.shape27.addChild(this.shape29);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.shape1.render(f5);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	resetToDefaultPose();
    	
    	float globalSpeed = 1.75f;
    	float globalDegree = 1F;
    	
    	walk(leftwing, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(rightwing, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing, 0.2f * globalSpeed, 0.5f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing, 0.2f * globalSpeed, 0.5f * globalDegree, true, 0, 0f, f, f1);
    }
}
