package com.ikerleon.naturalfaunamod.client.model;

import java.util.Random;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

public class ModelHyenaChild extends BookwormModelBase {
	
	private int earNum;
	protected Random rand = new Random();
	
    public BookwormModelRenderer body;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer frontrightleg;
    public BookwormModelRenderer frontleftleg;
    public BookwormModelRenderer body2down;
    public BookwormModelRenderer body3;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer backrightleg;
    public BookwormModelRenderer backleftleg;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer tail3;
    public BookwormModelRenderer backrightleg2;
    public BookwormModelRenderer backrightleg3;
    public BookwormModelRenderer backrightfoot;
    public BookwormModelRenderer backleftleg2;
    public BookwormModelRenderer backleftleg3;
    public BookwormModelRenderer backleftfoot;
    public BookwormModelRenderer neck2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer snouttop;
    public BookwormModelRenderer leftear;
    public BookwormModelRenderer rightear;
    public BookwormModelRenderer snout;
    public BookwormModelRenderer snoutdown;
    public BookwormModelRenderer frontrightleg2;
    public BookwormModelRenderer frontrightleg3;
    public BookwormModelRenderer frontrightfoot;
    public BookwormModelRenderer frontleftleg2;
    public BookwormModelRenderer frontleftleg3;
    public BookwormModelRenderer frontleftfoot;

    public ModelHyenaChild() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.frontleftleg2 = new BookwormModelRenderer(this, 0, 67, "frontleftleg2");
        this.frontleftleg2.setRotationPoint(1.4F, 7.2F, 2.0F);
        this.frontleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(frontleftleg2, 0.03490658503988659F, -0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(-2.5F, 13.5F, -4.8F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 11, 8, 0.0F);
        this.backrightleg2 = new BookwormModelRenderer(this, 64, 17, "backrightleg2");
        this.backrightleg2.setRotationPoint(1.6F, 7.2F, 2.5F);
        this.backrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(backrightleg2, 0.4553564018453205F, -0.0F, 0.0F);
        this.snoutdown = new BookwormModelRenderer(this, 45, 63, "snoutdown");
        this.snoutdown.setRotationPoint(2.5F, 3.0F, 4.7F);
        this.snoutdown.addBox(-2.0F, 0.0F, -4.5F, 4, 1, 5, 0.0F);
        this.body3 = new BookwormModelRenderer(this, 56, 31, "body3");
        this.body3.setRotationPoint(0.5F, 0.0F, 10.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 6, 10, 4, 0.0F);
        this.setRotateAngle(body3, -0.091106186954104F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 19, "neck");
        this.neck.setRotationPoint(4.0F, 4.9F, 2.0F);
        this.neck.addBox(-3.0F, -3.5F, -5.8F, 6, 8, 6, 0.0F);
        this.setRotateAngle(neck, -0.40980330836826856F, 0.0F, 0.012566370614359173F);
        this.neck2 = new BookwormModelRenderer(this, 7, 46, "neck2");
        this.neck2.setRotationPoint(0.0F, -0.5F, -5.1F);
        this.neck2.addBox(-2.5F, -2.5F, -6.5F, 5, 7, 7, 0.0F);
        this.setRotateAngle(neck2, -0.045553093477052F, 0.0F, 0.0F);
        this.frontrightleg3 = new BookwormModelRenderer(this, 15, 65, "frontrightleg3");
        this.frontrightleg3.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.frontrightleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontrightleg3, -0.17453292519943295F, -0.0F, 0.0F);
        this.frontrightfoot = new BookwormModelRenderer(this, 24, 47, "frontrightfoot");
        this.frontrightfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.frontrightfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(frontrightfoot, 0.17453292519943295F, -0.017453292519943295F, 0.0F);
        this.backleftleg3 = new BookwormModelRenderer(this, 0, 33, "backleftleg3");
        this.backleftleg3.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.backleftleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(backleftleg3, -0.4553564018453205F, -0.0F, 0.0F);
        this.snouttop = new BookwormModelRenderer(this, 59, 56, "snouttop");
        this.snouttop.setRotationPoint(0.5F, -0.5F, -10.2F);
        this.snouttop.addBox(-2.5F, 0.0F, 0.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(snouttop, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail = new BookwormModelRenderer(this, 32, 0, "tail");
        this.tail.setRotationPoint(3.0F, 1.6F, 4.0F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(tail, 0.18203784098300857F, 0.0F, 0.0F);
        this.snout = new BookwormModelRenderer(this, 0, 60, "snout");
        this.snout.setRotationPoint(-3.0F, -0.1F, -0.4F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(snout, -0.22759093446006054F, 0.0F, 0.0F);
        this.frontrightleg2 = new BookwormModelRenderer(this, 63, 63, "frontrightleg2");
        this.frontrightleg2.setRotationPoint(1.6F, 7.6F, 2.0F);
        this.frontrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(frontrightleg2, 0.03490658503988659F, -0.0F, 0.0F);
        this.frontleftleg = new BookwormModelRenderer(this, 42, 21, "frontleftleg");
        this.frontleftleg.setRotationPoint(5.5F, 3.8F, 0.5F);
        this.frontleftleg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 5, 0.0F);
        this.frontleftleg3 = new BookwormModelRenderer(this, 25, 68, "frontleftleg3");
        this.frontleftleg3.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.frontleftleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontleftleg3, -0.17453292519943295F, -0.0F, 0.0F);
        this.frontleftfoot = new BookwormModelRenderer(this, 35, 68, "frontleftfoot");
        this.frontleftfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.frontleftfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(frontleftfoot, 0.17453292519943295F, -0.017453292519943295F, 0.0F);
        this.backleftfoot = new BookwormModelRenderer(this, 0, 46, "backleftfoot");
        this.backleftfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.backleftfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(backleftfoot, 0.091106186954104F, -0.017453292519943295F, 0.0F);
        this.frontrightleg = new BookwormModelRenderer(this, 24, 21, "frontrightleg");
        this.frontrightleg.setRotationPoint(-0.6F, 3.8F, 0.5F);
        this.frontrightleg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 5, 0.0F);
        this.backrightfoot = new BookwormModelRenderer(this, 23, 35, "backrightfoot");
        this.backrightfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.backrightfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(backrightfoot, 0.091106186954104F, -0.017453292519943295F, 0.0F);
        this.leftear = new BookwormModelRenderer(this, 68, 9, "leftear");
        this.leftear.setRotationPoint(-5.0F, -5.0F, -1.3F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(leftear, 0.0F, 0.40980330836826856F, 0.0F);
        this.rightear = new BookwormModelRenderer(this, 18, 19, "rightear");
        this.rightear.setRotationPoint(2.4F, -5.0F, -2.5F);
        this.rightear.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(rightear, 0.0F, -0.40980330836826856F, 0.0F);
        this.tail3 = new BookwormModelRenderer(this, 0, 0, "tail3");
        this.tail3.setRotationPoint(-0.5F, 4.5F, -1.5F);
        this.tail3.addBox(-0.5F, 0.0F, 0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(tail3, 0.091106186954104F, 0.0F, 0.0F);
        this.body2down = new BookwormModelRenderer(this, 0, 33, "body2down");
        this.body2down.setRotationPoint(0.5F, 9.1F, -0.5F);
        this.body2down.addBox(0.0F, 0.0F, 0.0F, 6, 2, 11, 0.0F);
        this.setRotateAngle(body2down, 0.045553093477052F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 24, 54, "head");
        this.head.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.head.addBox(-3.0F, -3.0F, -7.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(head, 0.5462880558742251F, 0.0F, 0.0F);
        this.backleftleg = new BookwormModelRenderer(this, 46, 45, "backleftleg");
        this.backleftleg.setRotationPoint(3.6F, 3.5F, -1.4F);
        this.backleftleg.addBox(0.0F, 0.0F, 0.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(backleftleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backleftleg2 = new BookwormModelRenderer(this, 64, 45, "backleftleg2");
        this.backleftleg2.setRotationPoint(1.4F, 7.2F, 2.5F);
        this.backleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(backleftleg2, 0.4553564018453205F, -0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 32, 0, "body2");
        this.body2.setRotationPoint(0.5F, 0.0F, 6.0F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 7, 10, 11, 0.0F);
        this.setRotateAngle(body2, -0.045553093477052F, 0.0F, 0.0F);
        this.backrightleg = new BookwormModelRenderer(this, 34, 35, "backrightleg");
        this.backrightleg.setRotationPoint(-0.6F, 3.5F, -1.4F);
        this.backrightleg.addBox(0.0F, 0.0F, 0.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(backrightleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backrightleg3 = new BookwormModelRenderer(this, 69, 0, "backrightleg3");
        this.backrightleg3.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.backrightleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(backrightleg3, -0.4553564018453205F, -0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 57, 0, "tail2");
        this.tail2.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.tail2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(tail2, 0.045553093477052F, 0.0F, 0.0F);
        this.frontleftleg.addChild(this.frontleftleg2);
        this.backrightleg.addChild(this.backrightleg2);
        this.snout.addChild(this.snoutdown);
        this.body2.addChild(this.body3);
        this.body.addChild(this.neck);
        this.neck.addChild(this.neck2);
        this.frontrightleg2.addChild(this.frontrightleg3);
        this.frontrightleg3.addChild(this.frontrightfoot);
        this.backleftleg2.addChild(this.backleftleg3);
        this.head.addChild(this.snouttop);
        this.body3.addChild(this.tail);
        this.snouttop.addChild(this.snout);
        this.frontrightleg.addChild(this.frontrightleg2);
        this.body.addChild(this.frontleftleg);
        this.frontleftleg2.addChild(this.frontleftleg3);
        this.frontleftleg3.addChild(this.frontleftfoot);
        this.backleftleg3.addChild(this.backleftfoot);
        this.body.addChild(this.frontrightleg);
        this.backrightleg3.addChild(this.backrightfoot);
        this.head.addChild(this.leftear);
        this.head.addChild(this.rightear);
        this.tail2.addChild(this.tail3);
        this.body2.addChild(this.body2down);
        this.neck2.addChild(this.head);
        this.body3.addChild(this.backleftleg);
        this.backleftleg.addChild(this.backleftleg2);
        this.body.addChild(this.body2);
        this.body3.addChild(this.backrightleg);
        this.backrightleg2.addChild(this.backrightleg3);
        this.tail.addChild(this.tail2);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.body.offsetX, this.body.offsetY, this.body.offsetZ);
        GlStateManager.translate(this.body.rotationPointX * f5, this.body.rotationPointY * f5, this.body.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.5D, 0.5D);
        GlStateManager.translate(-this.body.offsetX, -this.body.offsetY, -this.body.offsetZ);
        GlStateManager.translate(-this.body.rotationPointX * f5, -this.body.rotationPointY * f5, -this.body.rotationPointZ * f5);
        this.body.render(f5);
        GlStateManager.popMatrix();
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
    	this.earNum=rand.nextInt(200);
    	
    	reset();

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1F;


        this.frontrightleg.rotateAngleX = -1F * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.3f * globalSpeed) + 0f) + 0F;
        this.frontleftleg.rotateAngleX = 1F * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.3f * globalSpeed) + 0f) + 0F;
        this.backrightleg.rotateAngleX = -1F * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.3f * globalSpeed) + 0f) + 0.091106186954104F;
        this.backleftleg.rotateAngleX = 1F * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.3f * globalSpeed) + 0f) + 0.091106186954104F;
        this.frontrightleg2.rotateAngleX = 1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0.03490658503988659F;
        this.frontleftleg2.rotateAngleX = -1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0.03490658503988659F;
        this.backrightleg3.rotateAngleX = 1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + -0.4553564018453205F;
        this.backleftleg3.rotateAngleX = -1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + -0.4553564018453205F;
        this.backrightleg2.rotateAngleX = this.backleftleg2.rotateAngleX =
                -1F * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0.4553564018453205F;
        this.neck.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.2f * globalSpeed) + 2.5f) + -0.40980330836826856F;

        this.neck.rotateAngleX = 1F * 0.5F * (0.06f) * MathHelper.cos(entity.ticksExisted * (0.10f) + 2.5f) + -0.40980330836826856F;

        this.tail.rotateAngleZ = -1F * (MathHelper.cos(entity.ticksExisted * (0.2f) + 0f) * (0.2f) * 0.5F) + (0f * 0.5F);
        this.tail2.rotateAngleZ = 1F * (MathHelper.cos(entity.ticksExisted * (0.15f) + 0f) * (0.4f) * 0.5F) + (0f * 0.5F);
    	
    	if(earNum==2) {
            this.rightear.rotateAngleY = -1F * (MathHelper.cos(entity.ticksExisted * (0.5f) + 0f) * (0.6f) * 0.5F) + (-0.40980330836826856F * 0.5F);
            this.leftear.rotateAngleY = 1F * (MathHelper.cos(entity.ticksExisted * (0.5f) + 0f) * (0.6f) * 0.5F) + (0.40980330836826856F * 0.5F);
    	}
    }
}
