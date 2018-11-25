package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * ModelKoriBustard - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelKoriBustardFlying extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer neck2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak2;
    public BookwormModelRenderer beak1;
    public BookwormModelRenderer crest;
    public BookwormModelRenderer rightwing2;
    public BookwormModelRenderer rightleg2;
    public BookwormModelRenderer leftleg2;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer leftwing2;

    public ModelKoriBustardFlying() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body2 = new BookwormModelRenderer(this, 39, 0, "body2");
        this.body2.setRotationPoint(3.4F, 2.5F, 8.6F);
        this.body2.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(body2, -0.10454522219446034F, 0.0F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 42, 10, "leftwing");
        this.leftwing.setRotationPoint(6.6F, 1.5F, 3.7F);
        this.leftwing.addBox(0.0F, -2.5F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(leftwing, -1.5481070465189704F, -3.141592653589793F, -1.2292353921796064F);
        this.leftwing2 = new BookwormModelRenderer(this, 12, 26, "leftwing2");
        this.leftwing2.setRotationPoint(0.0F, -2.5F, 7.8F);
        this.leftwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(leftwing2, -0.091106186954104F, 0.0F, 0.0F);
        this.beak2 = new BookwormModelRenderer(this, 33, 21, "beak2");
        this.beak2.setRotationPoint(-1.0F, -0.5F, -4.8F);
        this.beak2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(beak2, 0.22759093446006054F, 0.0F, 0.0F);
        this.leftleg2 = new BookwormModelRenderer(this, 33, 26, "leftleg2");
        this.leftleg2.setRotationPoint(0.0F, 4.9F, 0.2F);
        this.leftleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftleg2, 0.27314402793711257F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 0, 22, "head");
        this.head.setRotationPoint(0.0F, -5.8F, -1.5F);
        this.head.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, -1.1383037381507017F, 0.0F, 0.0F);
        this.neck2 = new BookwormModelRenderer(this, 21, 21, "neck2");
        this.neck2.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.neck2.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(neck2, 0.9105382707654417F, 0.0F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 0, 14, "rightleg");
        this.rightleg.setRotationPoint(1.4F, 3.7F, 5.5F);
        this.rightleg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightleg, 1.0927506446736497F, 0.0F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 24, 8, "rightwing");
        this.rightwing.setRotationPoint(1.5F, 2.2F, 3.7F);
        this.rightwing.addBox(0.0F, -2.5F, 0.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(rightwing, -1.5481070465189704F, -3.141592653589793F, 1.2292353921796064F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(-3.5F, 8.6F, -4.9F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 5, 9, 0.0F);
        this.neck = new BookwormModelRenderer(this, 23, 0, "neck");
        this.neck.setRotationPoint(3.6F, 2.3F, 0.8F);
        this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, 0.5462880558742251F, 0.0F, 0.010821041362364843F);
        this.rightwing2 = new BookwormModelRenderer(this, 52, 10, "rightwing2");
        this.rightwing2.setRotationPoint(0.0F, -2.5F, 7.8F);
        this.rightwing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(rightwing2, -0.091106186954104F, 0.0F, 0.0F);
        this.crest = new BookwormModelRenderer(this, 0, 34, "crest");
        this.crest.setRotationPoint(0.0F, -5.4F, 0.0F);
        this.crest.addBox(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
        this.rightleg2 = new BookwormModelRenderer(this, 0, 0, "rightleg2");
        this.rightleg2.setRotationPoint(0.0F, 4.9F, 0.2F);
        this.rightleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightleg2, 0.22759093446006054F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 12, 14, "leftleg");
        this.leftleg.setRotationPoint(5.3F, 3.7F, 5.5F);
        this.leftleg.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftleg, 1.0016444577195458F, 0.0F, 0.0F);
        this.beak1 = new BookwormModelRenderer(this, 34, 10, "beak1");
        this.beak1.setRotationPoint(-1.0F, -2.3F, 0.0F);
        this.beak1.addBox(0.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(beak1, 0.091106186954104F, 0.0F, 0.0F);
        this.tail = new BookwormModelRenderer(this, 41, 23, "tail");
        this.tail.setRotationPoint(0.0F, -0.4F, 4.2F);
        this.tail.addBox(-2.0F, -2.0F, -0.1F, 4, 4, 4, 0.0F);
        this.setRotateAngle(tail, -0.25970499269675623F, 0.0F, 0.0F);
        this.body.addChild(this.body2);
        this.body.addChild(this.leftwing);
        this.leftwing.addChild(this.leftwing2);
        this.head.addChild(this.beak2);
        this.leftleg.addChild(this.leftleg2);
        this.neck2.addChild(this.head);
        this.neck.addChild(this.neck2);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.neck);
        this.rightwing.addChild(this.rightwing2);
        this.head.addChild(this.crest);
        this.rightleg.addChild(this.rightleg2);
        this.body.addChild(this.leftleg);
        this.head.addChild(this.beak1);
        this.body2.addChild(this.tail);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
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

        this.leftwing.rotateAngleX = this.rightwing.rotateAngleX =
                -1F * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + -1.5481070465189704F;
        this.leftwing.rotateAngleZ = 1F * (MathHelper.cos(f * (0.4f * globalSpeed) + 0) * (0.7f * globalDegree) * f1) + (-1.2292353921796064F * f1);
        this.rightwing.rotateAngleZ = -1F * (MathHelper.cos(f * (0.4f * globalSpeed) + 0) * (0.7f * globalDegree) * f1) + (1.2292353921796064F * f1);
        this.leftwing2.rotateAngleZ = 1F * (MathHelper.cos(f * (0.6f * globalSpeed) + 0) * (0.4f * globalDegree) * f1) + (0f * f1);
        this.rightwing2.rotateAngleZ = -1F * (MathHelper.cos(f * (0.6f * globalSpeed) + 0) * (0.4f * globalDegree) * f1) + (0f * f1);
    }
}
