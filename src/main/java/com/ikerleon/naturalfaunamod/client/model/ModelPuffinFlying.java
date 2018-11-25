package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * ModelPuffin - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuffinFlying extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer beaktop;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer tail2;

    public ModelPuffinFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body2 = new BookwormModelRenderer(this, 52, 25, "body2");
        this.body2.setRotationPoint(-1.0F, -0.2F, 0.4F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.3042108886226116F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 1, 25, "head");
        this.head.setRotationPoint(0.0F, -1.9F, -1.4F);
        this.head.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -1.0016444577195458F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 28, 24, "body");
        this.body.setRotationPoint(0.0F, 18.3F, -1.4F);
        this.body.addBox(-1.5F, -1.1F, -0.9F, 3, 4, 4, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.0017453292519943296F);
        this.tail = new BookwormModelRenderer(this, 50, 5, "tail");
        this.tail.setRotationPoint(1.0F, 0.4F, 2.0F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail, -0.35499996985564664F, 0.0F, 0.0F);
        this.beaktop = new BookwormModelRenderer(this, 11, 20, "beaktop");
        this.beaktop.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.beaktop.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beaktop, 0.2792526803190927F, 0.0F, 0.0F);
        this.beak = new BookwormModelRenderer(this, 1, 20, "beak");
        this.beak.setRotationPoint(-0.5F, -1.12F, -0.92F);
        this.beak.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beak, -0.18203784098300857F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 18, 1, "leftleg");
        this.leftleg.setRotationPoint(0.3F, 2.5F, 1.3F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 1.3203415791337103F, 0.0F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 23, 1, "rightleg");
        this.rightleg.setRotationPoint(-0.3F, 2.5F, 1.3F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.3203415791337103F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 19, 27, "neck");
        this.neck.mirror = true;
        this.neck.setRotationPoint(0.0F, 0.8F, -0.2F);
        this.neck.addBox(-1.0F, -2.5F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, 1.2292353921796064F, 0.0F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 31, 9, "leftwing");
        this.leftwing.setRotationPoint(0.8F, -0.3F, -0.7F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
        this.setRotateAngle(leftwing, -1.6390387005478748F, -3.141592653589793F, -1.5481070465189704F);
        this.rightwing = new BookwormModelRenderer(this, 14, 9, "rightwing");
        this.rightwing.setRotationPoint(-0.8F, -0.3F, -0.7F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(rightwing, -1.6390387005478748F, -3.141592653589793F, 1.5481070465189704F);
        this.tail2 = new BookwormModelRenderer(this, 53, 12, "tail2");
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
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
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

        this.leftwing.rotateAngleX = this.rightwing.rotateAngleX =
                -1F * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + -1.6390387005478748F;
        this.leftwing.rotateAngleZ = 1F * (MathHelper.cos(f * (0.4f * globalSpeed) + 0) * (0.7f * globalDegree) * f1) + (-1.5481070465189704F * f1);
        this.rightwing.rotateAngleZ = -1F * (MathHelper.cos(f * (0.4f * globalSpeed) + 0) * (0.7f * globalDegree) * f1) + (1.5481070465189704F * f1);
    }
}
