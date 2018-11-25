package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * ModelFrailecillo - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuffin extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer peak;
    public BookwormModelRenderer peak2;
    public BookwormModelRenderer rightfoot;
    public BookwormModelRenderer leftfoot;

    public ModelPuffin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.peak = new BookwormModelRenderer(this, 1, 20, "peak");
        this.peak.setRotationPoint(-0.5F, -1.12F, -0.92F);
        this.peak.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peak, -0.18203784098300857F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 1, 25, "head");
        this.head.setRotationPoint(0.0F, -1.6F, -0.3F);
        this.head.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -0.04834562028F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 19, 27, "neck");
        this.neck.setRotationPoint(0.0F, 0.8F, -0.2F);
        this.neck.addBox(-1.0F, -2.5F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, 0.7813839061178613F, 0.0F, 0.0F);
        this.peak2 = new BookwormModelRenderer(this, 11, 20, "peak2");
        this.peak2.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.peak2.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peak2, 0.2792526803190927F, 0.0F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 14, 9, "leftwing");
        this.leftwing.setRotationPoint(1.5F, -1.0F, 0.1F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
        this.tail = new BookwormModelRenderer(this, 50, 5, "tail");
        this.tail.setRotationPoint(1.0F, 0.4F, 2.0F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail, -0.35499996985564664F, 0.0F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 18, 1, "rightleg");
        this.rightleg.setRotationPoint(-0.3F, 2.5F, 1.3F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.7285004297824331F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 23, 1, "leftleg");
        this.leftleg.setRotationPoint(0.3F, 2.5F, 1.3F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.7285004297824331F, 0.0F, 0.0F);
        this.leftfoot = new BookwormModelRenderer(this, 29, 1, "leftfoot");
        this.leftfoot.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.leftfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 31, 9, "rightwing");
        this.rightwing.setRotationPoint(-1.5F, -1.1F, 0.1F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 52, 25, "body2");
        this.body2.setRotationPoint(-1.0F, -0.2F, 0.4F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.272096830385916F, 0.0F, 0.0F);
        this.rightfoot = new BookwormModelRenderer(this, 11, 1, "rightfoot");
        this.rightfoot.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.rightfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.body = new BookwormModelRenderer(this, 28, 24, "body");
        this.body.setRotationPoint(0.0F, 18.3F, -1.4F);
        this.body.addBox(-1.5F, -1.1F, -0.9F, 3, 4, 4, 0.0F);
        this.setRotateAngle(body, -0.7285004297824331F, 0.0F, -0.0017453292519943296F);
        this.tail2 = new BookwormModelRenderer(this, 53, 12, "tail2");
        this.tail2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(tail2, -0.10227629416686772F, 0.0F, 0.0F);
        this.head.addChild(this.peak);
        this.body.addChild(this.neck);
        this.head.addChild(this.peak2);
        this.body.addChild(this.leftwing);
        this.body2.addChild(this.tail);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.leftleg);
        this.leftleg.addChild(this.leftfoot);
        this.body.addChild(this.rightwing);
        this.body.addChild(this.body2);
        this.rightleg.addChild(this.rightfoot);
        this.tail.addChild(this.tail2);
        this.neck.addChild(this.head);
        
        
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
            float scaleFactor= 1.2F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.body.render(f5);
            GlStateManager.popMatrix();
    	}
     }

     public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
         ModelRenderer.rotateAngleX = x;
         ModelRenderer.rotateAngleY = y;
         ModelRenderer.rotateAngleZ = z;
     }
     
     public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
     {
        reset();
        float globalSpeed = 1.75f;
        float globalHeight = 0.5f;
        float globalDegree = 2.5F;

        this.head.rotateAngleX = (f4 / 57.295776F) - 0.04834562028F;
        this.head.rotateAngleY = (f3 / 57.295776F);

        this.leftleg.rotateAngleX = 1F * f1 * (0.8f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0.7285004297824331F;
        this.rightleg.rotateAngleX = -1F * f1 * (0.8f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0.7285004297824331F;
        this.leftfoot.rotateAngleX = 1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 2.5f) + 0f;
        this.rightfoot.rotateAngleX = -1F * f1 * (0.5f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 2.5f) + 0f;
        this.body2.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.8f * globalSpeed) + 2.5f) + 0.272096830385916F;
        this.neck.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.8f * globalSpeed) + 2.5f) + 0.7813839061178613F;

        this.body.rotateAngleZ = 1F * (MathHelper.cos(f * (globalSpeed*1f) + 0f) * (0.15f*globalDegree) * f1) + (-0.0017453292519943296F * f1);

        this.neck.rotateAngleX = 1F * 0.5F * (0.08f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 0.7813839061178613F;
        this.head.rotateAngleX = -1F * 0.5F * (0.1f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + -0.04834562028F;
        this.body2.rotateAngleX = 1F * 0.5F * (0.08f) * MathHelper.cos(entity.ticksExisted * (0.2f) + 2.5f) + 0.272096830385916F;
        this.leftwing.rotateAngleX = -1F * 0.5F * (0.04f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 0f;
        this.rightwing.rotateAngleX = -1F * 0.5F * (0.04f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 0f;
     }
}
