package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.entity.Entity;

public class ModelCantabricCapercaillieFlying extends AdvancedModelBase {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer rightwing;
    public AdvancedModelRenderer leftwing;
    public AdvancedModelRenderer BodyChildChild;
    public AdvancedModelRenderer BodyChildChild_1;
    public AdvancedModelRenderer BodyChildChild_2;
    public AdvancedModelRenderer BodyChildChild_3;
    public AdvancedModelRenderer BodyChildChild_4;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer beak;
    public AdvancedModelRenderer beak2;

    public ModelCantabricCapercaillieFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.BodyChildChild_2 = new AdvancedModelRenderer(this, 48, 0);
        this.BodyChildChild_2.mirror = true;
        this.BodyChildChild_2.setRotationPoint(-1.0F, 1.5F, 1.0F);
        this.BodyChildChild_2.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild_2, 0.0F, 0.0F, 0.23387411976724018F);
        this.leftwing = new AdvancedModelRenderer(this, 25, 10);
        this.leftwing.mirror = true;
        this.leftwing.setRotationPoint(2.8F, -1.0F, -2.1F);
        this.leftwing.addBox(-0.4F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(leftwing, -1.1383037381507017F, 0.0F, -1.5481070465189704F);
        this.beak2 = new AdvancedModelRenderer(this, 0, 10);
        this.beak2.setRotationPoint(-2.5F, -1.2F, -2.0F);
        this.beak2.addBox(1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(beak2, -0.18203784098300857F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 13, 0);
        this.head.setRotationPoint(0.0F, -1.6F, -0.5F);
        this.head.addBox(-2.0F, -2.9F, -2.9F, 3, 3, 4, 0.0F);
        this.setRotateAngle(head, -1.2292353921796064F, 0.0F, 0.0F);
        this.BodyChildChild_3 = new AdvancedModelRenderer(this, 31, 0);
        this.BodyChildChild_3.mirror = true;
        this.BodyChildChild_3.setRotationPoint(-0.5F, 1.5F, 1.0F);
        this.BodyChildChild_3.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild_3, 0.045553093477052F, 0.0F, 0.11379546723003027F);
        this.BodyChildChild = new AdvancedModelRenderer(this, 48, 0);
        this.BodyChildChild.mirror = true;
        this.BodyChildChild.setRotationPoint(0.5F, 1.5F, 1.0F);
        this.BodyChildChild.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild, 0.0F, 0.0F, -0.11379546723003027F);
        this.BodyChildChild_1 = new AdvancedModelRenderer(this, 31, 0);
        this.BodyChildChild_1.mirror = true;
        this.BodyChildChild_1.setRotationPoint(1.0F, 1.5F, 1.0F);
        this.BodyChildChild_1.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild_1, 0.0F, 0.0F, -0.22759093446006054F);
        this.neck = new AdvancedModelRenderer(this, 0, 0);
        this.neck.setRotationPoint(0.5F, -0.75F, -4.7F);
        this.neck.addBox(-2.0F, -2.0F, -0.6F, 3, 5, 3, 0.0F);
        this.setRotateAngle(neck, 1.3203415791337103F, 0.0F, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 38, 19);
        this.Body.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.Body.addBox(-3.0F, -3.0F, -4.0F, 6, 5, 7, 0.0F);
        this.setRotateAngle(Body, 0.045553093477052F, 0.0F, 0.0F);
        this.BodyChildChild_4 = new AdvancedModelRenderer(this, 31, 0);
        this.BodyChildChild_4.mirror = true;
        this.BodyChildChild_4.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.BodyChildChild_4.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.beak = new AdvancedModelRenderer(this, 0, 10);
        this.beak.setRotationPoint(0.0F, -2.0F, -2.8F);
        this.beak.addBox(-1.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(beak, 0.31869712141416456F, 0.0F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 23, 26);
        this.body2.mirror = true;
        this.body2.setRotationPoint(0.0F, -2.5F, 3.0F);
        this.body2.addBox(-3.0F, 0.0F, 0.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(body2, 0.032114058236695664F, 0.0F, 0.0F);
        this.rightwing = new AdvancedModelRenderer(this, 25, 10);
        this.rightwing.setRotationPoint(-2.6F, -1.2F, -1.8F);
        this.rightwing.addBox(-0.6F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(rightwing, -1.0927506446736497F, 0.0F, 1.593485607070823F);
        this.body2.addChild(this.BodyChildChild_2);
        this.Body.addChild(this.leftwing);
        this.head.addChild(this.beak2);
        this.neck.addChild(this.head);
        this.body2.addChild(this.BodyChildChild_3);
        this.body2.addChild(this.BodyChildChild);
        this.body2.addChild(this.BodyChildChild_1);
        this.Body.addChild(this.neck);
        this.body2.addChild(this.BodyChildChild_4);
        this.head.addChild(this.beak);
        this.Body.addChild(this.body2);
        this.Body.addChild(this.rightwing);
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body.render(f5);
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
    	flap(leftwing, 0.6f * globalSpeed, 0.7f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing, 0.6f * globalSpeed, 0.7f * globalDegree, true, 0, 0f, f, f1);
 
    	walk(BodyChildChild, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    	walk(BodyChildChild_1, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    	walk(BodyChildChild_2, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    	walk(BodyChildChild_3, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    	walk(BodyChildChild_4, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    }
}
