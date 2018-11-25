package com.ikerleon.naturalfaunamod.client.model;

import java.util.Random;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * ModelPuma - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuma extends BookwormModelBase {
	
	private int earNum;
	protected Random rand = new Random();
	
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer frontrightleg;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer frontleftleg;
    public BookwormModelRenderer head;
    public BookwormModelRenderer snout;
    public BookwormModelRenderer rightear;
    public BookwormModelRenderer leftear;
    public BookwormModelRenderer snoutdown;
    public BookwormModelRenderer frontrightleg2;
    public BookwormModelRenderer frontrightleg3;
    public BookwormModelRenderer frontrightfoot;
    public BookwormModelRenderer body3;
    public BookwormModelRenderer backrightleg;
    public BookwormModelRenderer backleftleg;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer backrightleg2;
    public BookwormModelRenderer backrightleg3;
    public BookwormModelRenderer backrightfoot;
    public BookwormModelRenderer backleftleg2;
    public BookwormModelRenderer backleftleg3;
    public BookwormModelRenderer backleftfoot;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer frontleftleg2;
    public BookwormModelRenderer frontleftleg3;
    public BookwormModelRenderer frontleftfoot;

    public ModelPuma() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body3 = new BookwormModelRenderer(this, 15, 15, "body3");
        this.body3.setRotationPoint(0.5F, 0.1F, 9.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(body3, -0.18203784098300857F, 0.0F, 0.0F);
        this.backrightleg2 = new BookwormModelRenderer(this, 36, 0, "backrightleg2");
        this.backrightleg2.setRotationPoint(0.1F, 6.0F, 0.2F);
        this.backrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(backrightleg2, 0.5462880558742251F, 0.0F, 0.0F);
        this.backrightleg = new BookwormModelRenderer(this, 30, 48, "backrightleg");
        this.backrightleg.setRotationPoint(0.0F, 2.6F, 1.0F);
        this.backrightleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.frontleftleg2 = new BookwormModelRenderer(this, 36, 0, "frontleftleg2");
        this.frontleftleg2.setRotationPoint(-0.1F, 5.8F, -0.5F);
        this.frontleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(frontleftleg2, -0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg = new BookwormModelRenderer(this, 30, 49, "frontrightleg");
        this.frontrightleg.setRotationPoint(1.0F, 2.6F, 2.4F);
        this.frontrightleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(frontrightleg, 0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg3 = new BookwormModelRenderer(this, 15, 16, "frontrightleg3");
        this.frontrightleg3.setRotationPoint(0.9F, 4.3F, 0.4F);
        this.frontrightleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.backleftfoot = new BookwormModelRenderer(this, 15, 16, "backleftfoot");
        this.backleftfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.backleftfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.backleftleg3 = new BookwormModelRenderer(this, 15, 16, "backleftleg3");
        this.backleftleg3.setRotationPoint(0.9F, 4.0F, 0.4F);
        this.backleftleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backleftleg3, -0.40980330836826856F, 0.0F, 0.0F);
        this.frontleftleg = new BookwormModelRenderer(this, 30, 49, "frontleftleg");
        this.frontleftleg.setRotationPoint(5.9F, 2.6F, 2.4F);
        this.frontleftleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(frontleftleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backrightfoot = new BookwormModelRenderer(this, 15, 16, "backrightfoot");
        this.backrightfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.backrightfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 10, 10, "tail2");
        this.tail2.setRotationPoint(0.0F, 8.8F, -1.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(tail2, 0.36425021489121656F, 0.0F, 0.0F);
        this.leftear = new BookwormModelRenderer(this, 42, 0, "leftear");
        this.leftear.setRotationPoint(-3.8F, -4.0F, -2.3F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.frontrightfoot = new BookwormModelRenderer(this, 15, 16, "frontrightfoot");
        this.frontrightfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.frontrightfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.head = new BookwormModelRenderer(this, 20, 27, "head");
        this.head.setRotationPoint(-0.4F, -0.1F, -3.8F);
        this.head.addBox(-2.7F, -3.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(head, 0.36425021489121656F, 0.0F, 0.0F);
        this.frontleftfoot = new BookwormModelRenderer(this, 15, 16, "frontleftfoot");
        this.frontleftfoot.setRotationPoint(-0.7F, 2.5F, 1.3F);
        this.frontleftfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.snout = new BookwormModelRenderer(this, 0, 37, "snout");
        this.snout.setRotationPoint(-1.7F, -1.0F, -8.9F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(snout, 0.091106186954104F, 0.0F, 0.0F);
        this.backleftleg2 = new BookwormModelRenderer(this, 36, 0, "backleftleg2");
        this.backleftleg2.setRotationPoint(0.1F, 6.0F, 0.2F);
        this.backleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(backleftleg2, 0.5462880558742251F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 27, "neck");
        this.neck.setRotationPoint(3.5F, 3.5F, 1.5F);
        this.neck.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(neck, -0.31869712141416456F, 0.0F, 0.0F);
        this.frontleftleg3 = new BookwormModelRenderer(this, 15, 16, "frontleftleg3");
        this.frontleftleg3.setRotationPoint(1.2F, 4.3F, 0.4F);
        this.frontleftleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.body = new BookwormModelRenderer(this, 10, 10, "body");
        this.body.setRotationPoint(-3.5F, 7.6F, -7.3F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 8, 9, 0.0F);
        this.backrightleg3 = new BookwormModelRenderer(this, 15, 16, "backrightleg3");
        this.backrightleg3.setRotationPoint(0.9F, 4.4F, 0.4F);
        this.backrightleg3.addBox(-2.2F, -1.2F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backrightleg3, -0.40980330836826856F, 0.0F, 0.0F);
        this.tail = new BookwormModelRenderer(this, 56, 11, "tail");
        this.tail.setRotationPoint(2.5F, 0.6F, 4.0F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(tail, 0.22759093446006054F, 0.0F, 0.0F);
        this.frontrightleg2 = new BookwormModelRenderer(this, 36, 0, "frontrightleg2");
        this.frontrightleg2.setRotationPoint(0.1F, 5.8F, -0.5F);
        this.frontrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(frontrightleg2, -0.091106186954104F, 0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 11, 10, "body2");
        this.body2.setRotationPoint(0.5F, 0.3F, 8.3F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 6, 7, 9, 0.0F);
        this.setRotateAngle(body2, 0.045553093477052F, 0.0F, 0.0F);
        this.rightear = new BookwormModelRenderer(this, 9, 0, "rightear");
        this.rightear.setRotationPoint(2.5F, -4.0F, -2.3F);
        this.rightear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.snoutdown = new BookwormModelRenderer(this, 0, 49, "snoutdown");
        this.snoutdown.setRotationPoint(-1.0F, 1.8F, -8.3F);
        this.snoutdown.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.backleftleg = new BookwormModelRenderer(this, 30, 48, "backleftleg");
        this.backleftleg.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.backleftleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.body2.addChild(this.body3);
        this.backrightleg.addChild(this.backrightleg2);
        this.body3.addChild(this.backrightleg);
        this.frontleftleg.addChild(this.frontleftleg2);
        this.body.addChild(this.frontrightleg);
        this.frontrightleg2.addChild(this.frontrightleg3);
        this.backleftleg3.addChild(this.backleftfoot);
        this.backleftleg2.addChild(this.backleftleg3);
        this.body.addChild(this.frontleftleg);
        this.backrightleg3.addChild(this.backrightfoot);
        this.tail.addChild(this.tail2);
        this.head.addChild(this.leftear);
        this.frontrightleg3.addChild(this.frontrightfoot);
        this.neck.addChild(this.head);
        this.frontleftleg3.addChild(this.frontleftfoot);
        this.head.addChild(this.snout);
        this.backleftleg.addChild(this.backleftleg2);
        this.body.addChild(this.neck);
        this.frontleftleg2.addChild(this.frontleftleg3);
        this.backrightleg2.addChild(this.backrightleg3);
        this.body3.addChild(this.tail);
        this.frontrightleg.addChild(this.frontrightleg2);
        this.body.addChild(this.body2);
        this.head.addChild(this.rightear);
        this.head.addChild(this.snoutdown);
        this.body3.addChild(this.backleftleg);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.5F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.body.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
        this.body.render(f5);
    	}
    }
    
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
    	
        this.neck.rotateAngleY = (f3 * 0.017453292F) / 2;
        this.head.rotateAngleX = (f4 * 0.017453292F) + 0.7F;

        this.frontrightleg.rotateAngleX = -1F * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0.091106186954104F;
        this.frontleftleg.rotateAngleX = 1F * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0.091106186954104F;
        this.backrightleg.rotateAngleX = -1F * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0F;
        this.backleftleg.rotateAngleX = 1F * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0F;
        this.frontrightleg2.rotateAngleX = 1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + -0.091106186954104F;
        this.backrightleg3.rotateAngleX = 1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + -0.40980330836826856F;
        this.frontleftleg2.rotateAngleX = -1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + -0.091106186954104F;
        this.backleftleg3.rotateAngleX = -1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + -0.40980330836826856F;
        this.backrightleg2.rotateAngleX = -1F * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0.5462880558742251F;
        this.backleftleg2.rotateAngleX = 1F * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0.5462880558742251F;
        this.neck.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.2f * globalSpeed) + 2.5f) + -0.31869712141416456F;

        this.neck.rotateAngleX = 1F * 0.5F * (0.06f) * MathHelper.cos(entity.ticksExisted * (0.10f) + 2.5f) + -0.31869712141416456F;

        this.tail.rotateAngleZ = -1F * (MathHelper.cos(entity.ticksExisted * (0.2f) + 0f) * (0.2f) * 0.5F) + (0f * 0.5F);
        this.tail2.rotateAngleZ = 1F * (MathHelper.cos(entity.ticksExisted * (0.15f) + 0f) * (0.4f) * 0.5F) + (0f * 0.5F);
    	
    	if(earNum==2) {
            this.rightear.rotateAngleY = -1F * (MathHelper.cos(entity.ticksExisted * (0.5f) + 0f) * (0.6f) * 0.5F) + (0f * 0.5F);
            this.leftear.rotateAngleY = 1F * (MathHelper.cos(entity.ticksExisted * (0.5f) + 0f) * (0.6f) * 0.5F) + (0f * 0.5F);
    	}
    }
}
