package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelFrailecillo - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuffin extends MowzieModelBase {
    public MowzieModelRenderer body;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer body2;
    public MowzieModelRenderer head;
    public MowzieModelRenderer rightleg;
    public MowzieModelRenderer leftleg;
    public MowzieModelRenderer rightwing;
    public MowzieModelRenderer leftwing;
    public MowzieModelRenderer tail;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer peak;
    public MowzieModelRenderer peak2;
    public MowzieModelRenderer rightfoot;
    public MowzieModelRenderer leftfoot;

    public ModelPuffin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.peak = new MowzieModelRenderer(this, 1, 20);
        this.peak.setRotationPoint(-0.5F, -1.12F, -0.92F);
        this.peak.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peak, -0.18203784098300857F, 0.0F, 0.0F);
        this.head = new MowzieModelRenderer(this, 1, 25);
        this.head.setRotationPoint(0.0F, -1.6F, -0.3F);
        this.head.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, -0.04834562028F, 0.0F, 0.0F);
        this.neck = new MowzieModelRenderer(this, 19, 27);
        this.neck.setRotationPoint(0.0F, 0.8F, -0.2F);
        this.neck.addBox(-1.0F, -2.5F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, 0.7813839061178613F, 0.0F, 0.0F);
        this.peak2 = new MowzieModelRenderer(this, 11, 20);
        this.peak2.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.peak2.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peak2, 0.2792526803190927F, 0.0F, 0.0F);
        this.leftwing = new MowzieModelRenderer(this, 14, 9);
        this.leftwing.setRotationPoint(1.5F, -1.0F, 0.1F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
        this.tail = new MowzieModelRenderer(this, 50, 5);
        this.tail.setRotationPoint(1.0F, 0.4F, 2.0F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail, -0.35499996985564664F, 0.0F, 0.0F);
        this.rightleg = new MowzieModelRenderer(this, 18, 1);
        this.rightleg.setRotationPoint(-0.3F, 2.5F, 1.3F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.7285004297824331F, 0.0F, 0.0F);
        this.leftleg = new MowzieModelRenderer(this, 23, 1);
        this.leftleg.setRotationPoint(0.3F, 2.5F, 1.3F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.7285004297824331F, 0.0F, 0.0F);
        this.leftfoot = new MowzieModelRenderer(this, 29, 1);
        this.leftfoot.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.leftfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.rightwing = new MowzieModelRenderer(this, 31, 9);
        this.rightwing.setRotationPoint(-1.5F, -1.1F, 0.1F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.body2 = new MowzieModelRenderer(this, 52, 25);
        this.body2.setRotationPoint(-1.0F, -0.2F, 0.4F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.272096830385916F, 0.0F, 0.0F);
        this.rightfoot = new MowzieModelRenderer(this, 11, 1);
        this.rightfoot.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.rightfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.body = new MowzieModelRenderer(this, 28, 24);
        this.body.setRotationPoint(0.0F, 18.3F, -1.4F);
        this.body.addBox(-1.5F, -1.1F, -0.9F, 3, 4, 4, 0.0F);
        this.setRotateAngle(body, -0.7285004297824331F, 0.0F, -0.0017453292519943296F);
        this.tail2 = new MowzieModelRenderer(this, 53, 12);
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
        
        
        updateDefaultPose();
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

     /**
      * This is a helper function from Tabula to set the rotation of model parts
      */
     public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
         ModelRenderer.rotateAngleX = x;
         ModelRenderer.rotateAngleY = y;
         ModelRenderer.rotateAngleZ = z;
     }
     
     public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
     {
     	resetToDefaultPose();

     	float globalSpeed = 2f;
     	float globalHeight = 0.5f;
     	float globalDegree = 2.5F;
   
        this.head.rotateAngleX = (f4 / 57.295776F);
        this.head.rotateAngleY = (f3 / 57.295776F);
     	
     	bob(body, 1 * globalSpeed, 0.5f * globalHeight, false, f, f1);
     	
     	walk(leftleg, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);
     	walk(rightleg, 0.5f * globalSpeed, 0.8f * globalDegree, true, 0, 0.2f, f, f1);
     	walk(leftfoot, 0.5f * globalSpeed, 0.5f * globalDegree, false, 2.5f, 0f, f, f1);
     	walk(rightfoot, 0.5f * globalSpeed, 0.5f * globalDegree, true, 2.5f, 0f, f, f1);
     	walk(body2, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
     	walk(neck, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
     	
     	flap(body, globalSpeed*1f, 0.15f*globalDegree, false, 0f, 0f, f, f1 );

     	walk(neck, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(head, 0.17f, 0.1f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(body2, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
     	walk(leftwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(rightwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     }
}
     