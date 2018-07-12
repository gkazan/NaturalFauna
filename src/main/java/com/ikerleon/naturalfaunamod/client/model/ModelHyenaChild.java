package com.ikerleon.naturalfaunamod.client.model;

import java.util.Random;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelHyenaChild extends AdvancedModelBase {
	
	private int earNum;
	protected Random rand = new Random();
	
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer frontrightleg;
    public AdvancedModelRenderer frontleftleg;
    public AdvancedModelRenderer body2down;
    public AdvancedModelRenderer body3;
    public AdvancedModelRenderer tail;
    public AdvancedModelRenderer backrightleg;
    public AdvancedModelRenderer backleftleg;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer backrightleg2;
    public AdvancedModelRenderer backrightleg3;
    public AdvancedModelRenderer backrightfoot;
    public AdvancedModelRenderer backleftleg2;
    public AdvancedModelRenderer backleftleg3;
    public AdvancedModelRenderer backleftfoot;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer snouttop;
    public AdvancedModelRenderer leftear;
    public AdvancedModelRenderer rightear;
    public AdvancedModelRenderer snout;
    public AdvancedModelRenderer snoutdown;
    public AdvancedModelRenderer frontrightleg2;
    public AdvancedModelRenderer frontrightleg3;
    public AdvancedModelRenderer frontrightfoot;
    public AdvancedModelRenderer frontleftleg2;
    public AdvancedModelRenderer frontleftleg3;
    public AdvancedModelRenderer frontleftfoot;

    public ModelHyenaChild() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.frontleftleg2 = new AdvancedModelRenderer(this, 0, 67);
        this.frontleftleg2.setRotationPoint(1.4F, 7.2F, 2.0F);
        this.frontleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(frontleftleg2, 0.03490658503988659F, -0.0F, 0.0F);
        this.body = new AdvancedModelRenderer(this, 0, 0);
        this.body.setRotationPoint(-2.5F, 13.5F, -4.8F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 11, 8, 0.0F);
        this.backrightleg2 = new AdvancedModelRenderer(this, 64, 17);
        this.backrightleg2.setRotationPoint(1.6F, 7.2F, 2.5F);
        this.backrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(backrightleg2, 0.4553564018453205F, -0.0F, 0.0F);
        this.snoutdown = new AdvancedModelRenderer(this, 45, 63);
        this.snoutdown.setRotationPoint(2.5F, 3.0F, 4.7F);
        this.snoutdown.addBox(-2.0F, 0.0F, -4.5F, 4, 1, 5, 0.0F);
        this.body3 = new AdvancedModelRenderer(this, 56, 31);
        this.body3.setRotationPoint(0.5F, 0.0F, 10.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 6, 10, 4, 0.0F);
        this.setRotateAngle(body3, -0.091106186954104F, 0.0F, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 0, 19);
        this.neck.setRotationPoint(4.0F, 4.9F, 2.0F);
        this.neck.addBox(-3.0F, -3.5F, -5.8F, 6, 8, 6, 0.0F);
        this.setRotateAngle(neck, -0.40980330836826856F, 0.0F, 0.012566370614359173F);
        this.neck2 = new AdvancedModelRenderer(this, 7, 46);
        this.neck2.setRotationPoint(0.0F, -0.5F, -5.1F);
        this.neck2.addBox(-2.5F, -2.5F, -6.5F, 5, 7, 7, 0.0F);
        this.setRotateAngle(neck2, -0.045553093477052F, 0.0F, 0.0F);
        this.frontrightleg3 = new AdvancedModelRenderer(this, 15, 65);
        this.frontrightleg3.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.frontrightleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontrightleg3, -0.17453292519943295F, -0.0F, 0.0F);
        this.frontrightfoot = new AdvancedModelRenderer(this, 24, 47);
        this.frontrightfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.frontrightfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(frontrightfoot, 0.17453292519943295F, -0.017453292519943295F, 0.0F);
        this.backleftleg3 = new AdvancedModelRenderer(this, 0, 33);
        this.backleftleg3.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.backleftleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(backleftleg3, -0.4553564018453205F, -0.0F, 0.0F);
        this.snouttop = new AdvancedModelRenderer(this, 59, 56);
        this.snouttop.setRotationPoint(0.5F, -0.5F, -10.2F);
        this.snouttop.addBox(-2.5F, 0.0F, 0.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(snouttop, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail = new AdvancedModelRenderer(this, 32, 0);
        this.tail.setRotationPoint(3.0F, 1.6F, 4.0F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(tail, 0.18203784098300857F, 0.0F, 0.0F);
        this.snout = new AdvancedModelRenderer(this, 0, 60);
        this.snout.setRotationPoint(-3.0F, -0.1F, -0.4F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(snout, -0.22759093446006054F, 0.0F, 0.0F);
        this.frontrightleg2 = new AdvancedModelRenderer(this, 63, 63);
        this.frontrightleg2.setRotationPoint(1.6F, 7.6F, 2.0F);
        this.frontrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(frontrightleg2, 0.03490658503988659F, -0.0F, 0.0F);
        this.frontleftleg = new AdvancedModelRenderer(this, 42, 21);
        this.frontleftleg.setRotationPoint(5.5F, 3.8F, 0.5F);
        this.frontleftleg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 5, 0.0F);
        this.frontleftleg3 = new AdvancedModelRenderer(this, 25, 68);
        this.frontleftleg3.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.frontleftleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontleftleg3, -0.17453292519943295F, -0.0F, 0.0F);
        this.frontleftfoot = new AdvancedModelRenderer(this, 35, 68);
        this.frontleftfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.frontleftfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(frontleftfoot, 0.17453292519943295F, -0.017453292519943295F, 0.0F);
        this.backleftfoot = new AdvancedModelRenderer(this, 0, 46);
        this.backleftfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.backleftfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(backleftfoot, 0.091106186954104F, -0.017453292519943295F, 0.0F);
        this.frontrightleg = new AdvancedModelRenderer(this, 24, 21);
        this.frontrightleg.setRotationPoint(-0.6F, 3.8F, 0.5F);
        this.frontrightleg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 5, 0.0F);
        this.backrightfoot = new AdvancedModelRenderer(this, 23, 35);
        this.backrightfoot.setRotationPoint(0.5F, 4.5F, 2.6F);
        this.backrightfoot.addBox(-2.0F, 0.0F, -5.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(backrightfoot, 0.091106186954104F, -0.017453292519943295F, 0.0F);
        this.leftear = new AdvancedModelRenderer(this, 68, 9);
        this.leftear.setRotationPoint(-5.0F, -5.0F, -1.3F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(leftear, 0.0F, 0.40980330836826856F, 0.0F);
        this.rightear = new AdvancedModelRenderer(this, 18, 19);
        this.rightear.setRotationPoint(2.4F, -5.0F, -2.5F);
        this.rightear.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(rightear, 0.0F, -0.40980330836826856F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 0, 0);
        this.tail3.setRotationPoint(-0.5F, 4.5F, -1.5F);
        this.tail3.addBox(-0.5F, 0.0F, 0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(tail3, 0.091106186954104F, 0.0F, 0.0F);
        this.body2down = new AdvancedModelRenderer(this, 0, 33);
        this.body2down.setRotationPoint(0.5F, 9.1F, -0.5F);
        this.body2down.addBox(0.0F, 0.0F, 0.0F, 6, 2, 11, 0.0F);
        this.setRotateAngle(body2down, 0.045553093477052F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 24, 54);
        this.head.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.head.addBox(-3.0F, -3.0F, -7.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(head, 0.5462880558742251F, 0.0F, 0.0F);
        this.backleftleg = new AdvancedModelRenderer(this, 46, 45);
        this.backleftleg.setRotationPoint(3.6F, 3.5F, -1.4F);
        this.backleftleg.addBox(0.0F, 0.0F, 0.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(backleftleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backleftleg2 = new AdvancedModelRenderer(this, 64, 45);
        this.backleftleg2.setRotationPoint(1.4F, 7.2F, 2.5F);
        this.backleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(backleftleg2, 0.4553564018453205F, -0.0F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 32, 0);
        this.body2.setRotationPoint(0.5F, 0.0F, 6.0F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 7, 10, 11, 0.0F);
        this.setRotateAngle(body2, -0.045553093477052F, 0.0F, 0.0F);
        this.backrightleg = new AdvancedModelRenderer(this, 34, 35);
        this.backrightleg.setRotationPoint(-0.6F, 3.5F, -1.4F);
        this.backrightleg.addBox(0.0F, 0.0F, 0.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(backrightleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backrightleg3 = new AdvancedModelRenderer(this, 69, 0);
        this.backrightleg3.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.backrightleg3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 3, 0.0F);
        this.setRotateAngle(backrightleg3, -0.4553564018453205F, -0.0F, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 57, 0);
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
        
        updateDefaultPose();
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
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	this.earNum=rand.nextInt(200);
    	
    	resetToDefaultPose();

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1F;
    	
    	bob(body, 0.3F * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(frontrightleg, 0.3f * globalSpeed, 0.4f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(frontleftleg, 0.3f * globalSpeed, 0.4f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(backrightleg, 0.3f * globalSpeed, 0.4f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(backleftleg, 0.3f * globalSpeed, 0.4f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(frontrightleg2, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(frontleftleg2, 0.5f * globalSpeed, 0.2f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(backrightleg3, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(backleftleg3, 0.5f * globalSpeed, 0.2f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(backrightleg2, 0.5f * globalSpeed, 0.4f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(backleftleg2, 0.5f * globalSpeed, 0.4f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(backrightfoot, 2f * globalSpeed, 2f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(backleftfoot, 2f * globalSpeed, 2f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(backrightfoot, 2f * globalSpeed, 2f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(backleftfoot, 2f * globalSpeed, 2f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(neck, 0.2f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(neck, 0.10f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F); 
    	
    	flap(tail, 0.2f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	flap(tail2, 0.15f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	
    	if(earNum==2) {
    	swing(rightear, 0.5f, 0.6f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(leftear, 0.5f, 0.6f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	}
    }
}
