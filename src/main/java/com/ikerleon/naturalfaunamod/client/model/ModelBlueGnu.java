package com.ikerleon.naturalfaunamod.client.model;

import java.util.Random;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

public class ModelBlueGnu extends BookwormModelBase {
	
	private int earNum;
	protected Random rand = new Random();
	
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer frontrightleg;
    public BookwormModelRenderer frontleftleg;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer crest;
    public BookwormModelRenderer crestdown;
    public BookwormModelRenderer righthorn;
    public BookwormModelRenderer leftear;
    public BookwormModelRenderer rightear;
    public BookwormModelRenderer snout;
    public BookwormModelRenderer lefthorn;
    public BookwormModelRenderer righthorn2;
    public BookwormModelRenderer righthorn3;
    public BookwormModelRenderer lefthorn2;
    public BookwormModelRenderer lefthorn3;
    public BookwormModelRenderer frontrightleg2;
    public BookwormModelRenderer frontleftleg2;
    public BookwormModelRenderer backrightleg;
    public BookwormModelRenderer body3;
    public BookwormModelRenderer backleftleg;
    public BookwormModelRenderer backrightleg2;
    public BookwormModelRenderer backrightleg3;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer backleftleg2;
    public BookwormModelRenderer backleftleg3;

    public ModelBlueGnu() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.frontleftleg2 = new BookwormModelRenderer(this, 0, 6, "frontleftleg2");
        this.frontleftleg2.setRotationPoint(-0.5F, 6.7F, -0.5F);
        this.frontleftleg2.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.snout = new BookwormModelRenderer(this, 0, 42, "snout");
        this.snout.setRotationPoint(-1.2F, -1.6F, -4.5F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(snout, -0.136659280431156F, 0.0F, 0.0F);
        this.backleftleg = new BookwormModelRenderer(this, 25, 0, "backleftleg");
        this.backleftleg.setRotationPoint(3.5F, 4.0F, 6.9F);
        this.backleftleg.addBox(1.0F, 0.0F, -1.5F, 3, 7, 4, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 11, 9, "body2");
        this.body2.setRotationPoint(0.5F, 0.1F, 7.0F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 7, 9, 8, 0.0F);
        this.setRotateAngle(body2, 0.045553093477052F, 0.0F, 0.0F);
        this.frontrightleg2 = new BookwormModelRenderer(this, 0, 6, "frontrightleg2");
        this.frontrightleg2.setRotationPoint(0.5F, 6.6F, 0.5F);
        this.frontrightleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.tail = new BookwormModelRenderer(this, 0, 0, "tail");
        this.tail.setRotationPoint(3.0F, 1.3F, 2.7F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(tail, 0.31869712141416456F, 0.0F, 0.0F);
        this.frontleftleg = new BookwormModelRenderer(this, 0, 2, "frontleftleg");
        this.frontleftleg.setRotationPoint(6.5F, 4.3F, 2.0F);
        this.frontleftleg.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(frontleftleg, 0.045553093477052F, 0.0F, 0.0F);
        this.backleftleg2 = new BookwormModelRenderer(this, 0, 4, "backleftleg2");
        this.backleftleg2.setRotationPoint(1.5F, 6.0F, -1.5F);
        this.backleftleg2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backleftleg2, 0.8196066167365371F, 0.0F, 0.0F);
        this.righthorn = new BookwormModelRenderer(this, 49, 6, "righthorn");
        this.righthorn.setRotationPoint(-3.3F, -1.3F, 1.2F);
        this.righthorn.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(righthorn, 0.0F, 1.8657569703819383F, -1.6845917940249266F);
        this.lefthorn2 = new BookwormModelRenderer(this, 0, 26, "lefthorn2");
        this.lefthorn2.setRotationPoint(1.3F, -2.7F, 1.9F);
        this.lefthorn2.addBox(-0.5F, -1.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(lefthorn2, -0.18203784098300857F, 0.0F, 0.27314402793711257F);
        this.frontrightleg = new BookwormModelRenderer(this, 0, 2, "frontrightleg");
        this.frontrightleg.setRotationPoint(0.5F, 4.3F, 2.0F);
        this.frontrightleg.addBox(-1.0F, 0.0F, -1.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(frontrightleg, 0.045553093477052F, 0.0F, 0.0F);
        this.rightear = new BookwormModelRenderer(this, 34, 3, "rightear");
        this.rightear.setRotationPoint(-2.7F, 1.4F, -0.8F);
        this.rightear.addBox(-3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(rightear, 0.0F, 0.22759093446006054F, 0.22759093446006054F);
        this.body = new BookwormModelRenderer(this, 9, 8, "body");
        this.body.setRotationPoint(-4.1F, 6.3F, -6.6F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.setRotateAngle(body, -0.045553093477052F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 28, 26, "head");
        this.head.setRotationPoint(-0.3F, 0.1F, -7.0F);
        this.head.addBox(-2.7F, -3.0F, -4.0F, 6, 7, 4, 0.0F);
        this.backrightleg = new BookwormModelRenderer(this, 27, 0, "backrightleg");
        this.backrightleg.setRotationPoint(0.4F, 4.0F, 6.9F);
        this.backrightleg.addBox(-1.0F, 0.0F, -1.5F, 3, 7, 4, 0.0F);
        this.backleftleg3 = new BookwormModelRenderer(this, 0, 6, "backleftleg3");
        this.backleftleg3.setRotationPoint(0.1F, 2.5F, 1.6F);
        this.backleftleg3.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(backleftleg3, -0.8196066167365371F, 0.0F, 0.0F);
        this.body3 = new BookwormModelRenderer(this, 27, 2, "body3");
        this.body3.setRotationPoint(0.5F, 0.0F, 7.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 6, 8, 4, 0.0F);
        this.setRotateAngle(body3, -0.136659280431156F, 0.0F, 0.0F);
        this.lefthorn3 = new BookwormModelRenderer(this, 4, 28, "lefthorn3");
        this.lefthorn3.setRotationPoint(-1.1F, -1.6F, -3.7F);
        this.lefthorn3.addBox(-0.5F, -8.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lefthorn3, -1.593485607070823F, 0.36425021489121656F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 39, 42, "tail2");
        this.tail2.setRotationPoint(0.0F, 2.7F, 1.0F);
        this.tail2.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(tail2, -0.136659280431156F, 0.0F, 0.0F);
        this.crestdown = new BookwormModelRenderer(this, 19, 37, "crestdown");
        this.crestdown.setRotationPoint(-0.5F, 2.4F, -8.5F);
        this.crestdown.addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
        this.setRotateAngle(crestdown, -0.045553093477052F, 0.0F, 0.0F);
        this.leftear = new BookwormModelRenderer(this, 0, 2, "leftear");
        this.leftear.setRotationPoint(2.7F, -0.5F, -1.0F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(leftear, 0.0F, -0.22759093446006054F, -0.22759093446006054F);
        this.lefthorn = new BookwormModelRenderer(this, 49, 6, "lefthorn");
        this.lefthorn.setRotationPoint(4.1F, -0.3F, -1.8F);
        this.lefthorn.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(lefthorn, 0.0F, -1.8668041679331349F, 1.6845917940249266F);
        this.neck = new BookwormModelRenderer(this, 0, 26, "neck");
        this.neck.setRotationPoint(4.2F, 3.2F, 2.1F);
        this.neck.addBox(-2.6F, -3.0F, -9.5F, 5, 7, 9, 0.0F);
        this.setRotateAngle(neck, 0.091106186954104F, 0.0F, 0.0F);
        this.crest = new BookwormModelRenderer(this, 37, 26, "crest");
        this.crest.setRotationPoint(-0.3F, -6.4F, -8.8F);
        this.crest.addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
        this.righthorn3 = new BookwormModelRenderer(this, 0, 29, "righthorn3");
        this.righthorn3.setRotationPoint(2.0F, -1.9F, -3.7F);
        this.righthorn3.addBox(-0.5F, -8.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(righthorn3, -1.6390387005478748F, -0.27314402793711257F, 0.0F);
        this.backrightleg2 = new BookwormModelRenderer(this, 0, 4, "backrightleg2");
        this.backrightleg2.setRotationPoint(-0.5F, 6.0F, -1.5F);
        this.backrightleg2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backrightleg2, 0.8196066167365371F, 0.0F, 0.0F);
        this.backrightleg3 = new BookwormModelRenderer(this, 0, 6, "backrightleg3");
        this.backrightleg3.setRotationPoint(0.1F, 2.5F, 1.6F);
        this.backrightleg3.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(backrightleg3, -0.8196066167365371F, 0.0F, 0.0F);
        this.righthorn2 = new BookwormModelRenderer(this, 50, 24, "righthorn2");
        this.righthorn2.setRotationPoint(0.7F, -1.7F, 2.0F);
        this.righthorn2.addBox(-0.5F, -1.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(righthorn2, -0.18203784098300857F, 0.0F, -0.27314402793711257F);
        this.frontleftleg.addChild(this.frontleftleg2);
        this.head.addChild(this.snout);
        this.body2.addChild(this.backleftleg);
        this.body.addChild(this.body2);
        this.frontrightleg.addChild(this.frontrightleg2);
        this.body3.addChild(this.tail);
        this.body.addChild(this.frontleftleg);
        this.backleftleg.addChild(this.backleftleg2);
        this.head.addChild(this.righthorn);
        this.lefthorn.addChild(this.lefthorn2);
        this.body.addChild(this.frontrightleg);
        this.head.addChild(this.rightear);
        this.neck.addChild(this.head);
        this.body2.addChild(this.backrightleg);
        this.backleftleg2.addChild(this.backleftleg3);
        this.body2.addChild(this.body3);
        this.lefthorn2.addChild(this.lefthorn3);
        this.tail.addChild(this.tail2);
        this.neck.addChild(this.crestdown);
        this.head.addChild(this.leftear);
        this.head.addChild(this.lefthorn);
        this.body.addChild(this.neck);
        this.neck.addChild(this.crest);
        this.righthorn2.addChild(this.righthorn3);
        this.backrightleg.addChild(this.backrightleg2);
        this.backrightleg2.addChild(this.backrightleg3);
        this.righthorn.addChild(this.righthorn2);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float scaleFactor= 1.2F;
    	
	    GlStateManager.pushMatrix();
	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        this.body.render(f5);
        GlStateManager.popMatrix();
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

        this.head.rotateAngleY = (f3 * 0.017453292F);
        this.head.rotateAngleX = (f4 * 0.017453292F);

    	this.frontrightleg.rotateAngleX = -1f * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0.045553093477052F;
    	this.frontleftleg.rotateAngleX = 1f * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0.045553093477052F;
        this.backrightleg.rotateAngleX = -1f * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0F;
    	this.backleftleg.rotateAngleX = 1f * f1 * (0.3f * globalDegree) * MathHelper.cos(f * (0.4f * globalSpeed) + 0f) + 0F;
    	this.frontrightleg2.rotateAngleX = 1f * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
    	this.frontleftleg2.rotateAngleX = -1f * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0F;
        this.backrightleg3.rotateAngleX = 1f * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) - 0.8196066167365371F;
    	this.backleftleg3.rotateAngleX = -1f * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) - 0.8196066167365371F;
    	this.backrightleg2.rotateAngleX = -1f * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0.8196066167365371F;
    	this.backleftleg2.rotateAngleX = 1f * f1 * (0.4f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0f) + 0.8196066167365371F;
    	this.neck.rotateAngleX = -1f * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.2f * globalSpeed) + 2.5f) + 0.091106186954104F;

    	this.neck.rotateAngleX = 1f * 0.5F * (0.06f * globalDegree) * MathHelper.cos(entity.ticksExisted * (0.1f * globalSpeed) + 2.5f) + 0.091106186954104F;

    	this.tail.rotateAngleZ = -1f * (MathHelper.cos(entity.ticksExisted * (0.2f * globalSpeed) + 0f) * (0.2f * globalDegree) * 0.5F) + (0f * 0.5F);
    	this.tail2.rotateAngleZ = 1f * (MathHelper.cos(entity.ticksExisted * (0.15f * globalSpeed) + 0f) * (0.4f * globalDegree) * 0.5F) + (0f * 0.5F);
    	
    	if(earNum==2) {
    	    this.rightear.rotateAngleY = -1f * (MathHelper.cos(f * (0.5f * globalSpeed) + 0f) * (0.6f * globalDegree) * f1) + (0.22759093446006054F * f1);
    	    this.leftear.rotateAngleY = 1f * (MathHelper.cos(f * (0.5f * globalSpeed) + 0f) * (0.6f * globalDegree) * f1) + (-0.22759093446006054F * f1);
    	}
    }
}
