package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

public class ModelCantabricCapercaillieFlying extends BookwormModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer BodyChildChild;
    public BookwormModelRenderer BodyChildChild_1;
    public BookwormModelRenderer BodyChildChild_2;
    public BookwormModelRenderer BodyChildChild_3;
    public BookwormModelRenderer BodyChildChild_4;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer beak2;

    public ModelCantabricCapercaillieFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.BodyChildChild_2 = new BookwormModelRenderer(this, 48, 0, "BodyChildChild_2");
        this.BodyChildChild_2.mirror = true;
        this.BodyChildChild_2.setRotationPoint(-1.0F, 1.5F, 1.0F);
        this.BodyChildChild_2.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild_2, 0.0F, 0.0F, 0.23387411976724018F);
        this.leftwing = new BookwormModelRenderer(this, 25, 10, "leftwing");
        this.leftwing.mirror = true;
        this.leftwing.setRotationPoint(2.8F, -1.0F, -2.1F);
        this.leftwing.addBox(-0.4F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(leftwing, -1.1383037381507017F, 0.0F, -1.5481070465189704F);
        this.beak2 = new BookwormModelRenderer(this, 0, 10, "beak2");
        this.beak2.setRotationPoint(-2.5F, -1.2F, -2.0F);
        this.beak2.addBox(1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(beak2, -0.18203784098300857F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 13, 0, "head");
        this.head.setRotationPoint(0.0F, -1.6F, -0.5F);
        this.head.addBox(-2.0F, -2.9F, -2.9F, 3, 3, 4, 0.0F);
        this.setRotateAngle(head, -1.2292353921796064F, 0.0F, 0.0F);
        this.BodyChildChild_3 = new BookwormModelRenderer(this, 31, 0, "BodyChildChild_3");
        this.BodyChildChild_3.mirror = true;
        this.BodyChildChild_3.setRotationPoint(-0.5F, 1.5F, 1.0F);
        this.BodyChildChild_3.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild_3, 0.045553093477052F, 0.0F, 0.11379546723003027F);
        this.BodyChildChild = new BookwormModelRenderer(this, 48, 0, "BodyChildChild");
        this.BodyChildChild.mirror = true;
        this.BodyChildChild.setRotationPoint(0.5F, 1.5F, 1.0F);
        this.BodyChildChild.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild, 0.0F, 0.0F, -0.11379546723003027F);
        this.BodyChildChild_1 = new BookwormModelRenderer(this, 31, 0, "BodyChildChild_1");
        this.BodyChildChild_1.mirror = true;
        this.BodyChildChild_1.setRotationPoint(1.0F, 1.5F, 1.0F);
        this.BodyChildChild_1.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(BodyChildChild_1, 0.0F, 0.0F, -0.22759093446006054F);
        this.neck = new BookwormModelRenderer(this, 0, 0, "neck");
        this.neck.setRotationPoint(0.5F, -0.75F, -4.7F);
        this.neck.addBox(-2.0F, -2.0F, -0.6F, 3, 5, 3, 0.0F);
        this.setRotateAngle(neck, 1.3203415791337103F, 0.0F, 0.0F);
        this.Body = new BookwormModelRenderer(this, 38, 19, "Body");
        this.Body.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.Body.addBox(-3.0F, -3.0F, -4.0F, 6, 5, 7, 0.0F);
        this.setRotateAngle(Body, 0.045553093477052F, 0.0F, 0.0F);
        this.BodyChildChild_4 = new BookwormModelRenderer(this, 31, 0, "BodyChildChild_4");
        this.BodyChildChild_4.mirror = true;
        this.BodyChildChild_4.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.BodyChildChild_4.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.beak = new BookwormModelRenderer(this, 0, 10, "beak");
        this.beak.setRotationPoint(0.0F, -2.0F, -2.8F);
        this.beak.addBox(-1.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(beak, 0.31869712141416456F, 0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 23, 26, "body2");
        this.body2.mirror = true;
        this.body2.setRotationPoint(0.0F, -2.5F, 3.0F);
        this.body2.addBox(-3.0F, 0.0F, 0.0F, 6, 4, 1, 0.0F);
        this.setRotateAngle(body2, 0.032114058236695664F, 0.0F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 25, 10, "rightwing");
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
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body.render(f5);
    }

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	reset();
    	
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
