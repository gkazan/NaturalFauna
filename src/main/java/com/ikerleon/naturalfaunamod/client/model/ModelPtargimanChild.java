package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Ptargiman chick - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelPtargimanChild extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer head;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer leftfoot;
    public BookwormModelRenderer rightfoot;

    public ModelPtargimanChild() {
        this.textureWidth = 30;
        this.textureHeight = 30;
        this.rightwing = new BookwormModelRenderer(this, 0, 10, "rightwing");
        this.rightwing.setRotationPoint(-2.0F, 1.9F, -0.8F);
        this.rightwing.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(rightwing, -0.045553093477052F, -0.091106186954104F, 0.0F);
        this.head = new BookwormModelRenderer(this, 17, 7, "head");
        this.head.setRotationPoint(0.0F, 1.8F, -1.5F);
        this.head.addBox(-1.5F, -3.9F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(head, 0.40980330836826856F, 0.0F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 10, 11, "leftwing");
        this.leftwing.setRotationPoint(1.8F, 1.9F, -0.8F);
        this.leftwing.addBox(0.0F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(leftwing, -0.045553093477052F, 0.091106186954104F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 0, 0, "leftleg");
        this.leftleg.setRotationPoint(0.5F, 3.5F, 0.0F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.31869712141416456F, 0.0F, 0.0F);
        this.leftfoot = new BookwormModelRenderer(this, 24, 1, "leftfoot");
        this.leftfoot.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.leftfoot.addBox(0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 0, 0, "rightleg");
        this.rightleg.setRotationPoint(-1.5F, 3.6F, 0.0F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.31869712141416456F, 0.0F, 0.0F);
        this.beak = new BookwormModelRenderer(this, 18, 0, "beak");
        this.beak.setRotationPoint(-0.5F, -2.7F, -2.5F);
        this.beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak, 0.045553093477052F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.body.addBox(-1.9F, 0.0F, -2.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(body, -0.36425021489121656F, 0.0F, 0.0F);
        this.rightfoot = new BookwormModelRenderer(this, 24, 1, "rightfoot");
        this.rightfoot.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.rightfoot.addBox(0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.head);
        this.body.addChild(this.leftwing);
        this.body.addChild(this.leftleg);
        this.leftleg.addChild(this.leftfoot);
        this.body.addChild(this.rightleg);
        this.head.addChild(this.beak);
        this.rightleg.addChild(this.rightfoot);
        
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
    
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	reset();
    	
    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 2.5F;
    	
    	
    	walk(leftleg, 1.5f * globalSpeed, 0.25f * globalDegree, false, 0, 0.2f, f, f1);
     	walk(rightleg, 1.5f * globalSpeed, 0.25f * globalDegree, true, 0, 0.2f, f, f1);
     	walk(head, 1f * globalSpeed, 0.25f * globalDegree, false, 0, 0f, f, f1);
     	
     	walk(head, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F); 	
     	walk(leftwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(rightwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
