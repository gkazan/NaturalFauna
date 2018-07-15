package com.ikerleon.naturalfaunamod.client.model;

import java.util.Random;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelPuma - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuma extends AdvancedModelBase {
	
	private int earNum;
	protected Random rand = new Random();
	
    public AdvancedModelRenderer body;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer frontrightleg;
    public AdvancedModelRenderer body2;
    public AdvancedModelRenderer frontleftleg;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer snout;
    public AdvancedModelRenderer rightear;
    public AdvancedModelRenderer leftear;
    public AdvancedModelRenderer snoutdown;
    public AdvancedModelRenderer frontrightleg2;
    public AdvancedModelRenderer frontrightleg3;
    public AdvancedModelRenderer frontrightfoot;
    public AdvancedModelRenderer body3;
    public AdvancedModelRenderer backrightleg;
    public AdvancedModelRenderer backleftleg;
    public AdvancedModelRenderer tail;
    public AdvancedModelRenderer backrightleg2;
    public AdvancedModelRenderer backrightleg3;
    public AdvancedModelRenderer backrightfoot;
    public AdvancedModelRenderer backleftleg2;
    public AdvancedModelRenderer backleftleg3;
    public AdvancedModelRenderer backleftfoot;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer frontleftleg2;
    public AdvancedModelRenderer frontleftleg3;
    public AdvancedModelRenderer frontleftfoot;

    public ModelPuma() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body3 = new AdvancedModelRenderer(this, 15, 15);
        this.body3.setRotationPoint(0.5F, 0.1F, 9.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(body3, -0.18203784098300857F, 0.0F, 0.0F);
        this.backrightleg2 = new AdvancedModelRenderer(this, 36, 0);
        this.backrightleg2.setRotationPoint(0.1F, 6.0F, 0.2F);
        this.backrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(backrightleg2, 0.5462880558742251F, 0.0F, 0.0F);
        this.backrightleg = new AdvancedModelRenderer(this, 30, 48);
        this.backrightleg.setRotationPoint(0.0F, 2.6F, 1.0F);
        this.backrightleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.frontleftleg2 = new AdvancedModelRenderer(this, 36, 0);
        this.frontleftleg2.setRotationPoint(-0.1F, 5.8F, -0.5F);
        this.frontleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(frontleftleg2, -0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg = new AdvancedModelRenderer(this, 30, 49);
        this.frontrightleg.setRotationPoint(1.0F, 2.6F, 2.4F);
        this.frontrightleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(frontrightleg, 0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg3 = new AdvancedModelRenderer(this, 15, 16);
        this.frontrightleg3.setRotationPoint(0.9F, 4.3F, 0.4F);
        this.frontrightleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.backleftfoot = new AdvancedModelRenderer(this, 15, 16);
        this.backleftfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.backleftfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.backleftleg3 = new AdvancedModelRenderer(this, 15, 16);
        this.backleftleg3.setRotationPoint(0.9F, 4.0F, 0.4F);
        this.backleftleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backleftleg3, -0.40980330836826856F, 0.0F, 0.0F);
        this.frontleftleg = new AdvancedModelRenderer(this, 30, 49);
        this.frontleftleg.setRotationPoint(5.9F, 2.6F, 2.4F);
        this.frontleftleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(frontleftleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backrightfoot = new AdvancedModelRenderer(this, 15, 16);
        this.backrightfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.backrightfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 10, 10);
        this.tail2.setRotationPoint(0.0F, 8.8F, -1.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(tail2, 0.36425021489121656F, 0.0F, 0.0F);
        this.leftear = new AdvancedModelRenderer(this, 42, 0);
        this.leftear.setRotationPoint(-3.8F, -4.0F, -2.3F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.frontrightfoot = new AdvancedModelRenderer(this, 15, 16);
        this.frontrightfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.frontrightfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.head = new AdvancedModelRenderer(this, 20, 27);
        this.head.setRotationPoint(-0.4F, -0.1F, -3.8F);
        this.head.addBox(-2.7F, -3.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(head, 0.36425021489121656F, 0.0F, 0.0F);
        this.frontleftfoot = new AdvancedModelRenderer(this, 15, 16);
        this.frontleftfoot.setRotationPoint(-0.7F, 2.5F, 1.3F);
        this.frontleftfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.snout = new AdvancedModelRenderer(this, 0, 37);
        this.snout.setRotationPoint(-1.7F, -1.0F, -8.9F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(snout, 0.091106186954104F, 0.0F, 0.0F);
        this.backleftleg2 = new AdvancedModelRenderer(this, 36, 0);
        this.backleftleg2.setRotationPoint(0.1F, 6.0F, 0.2F);
        this.backleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(backleftleg2, 0.5462880558742251F, 0.0F, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 0, 27);
        this.neck.setRotationPoint(3.5F, 3.5F, 1.5F);
        this.neck.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(neck, -0.31869712141416456F, 0.0F, 0.0F);
        this.frontleftleg3 = new AdvancedModelRenderer(this, 15, 16);
        this.frontleftleg3.setRotationPoint(1.2F, 4.3F, 0.4F);
        this.frontleftleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.body = new AdvancedModelRenderer(this, 10, 10);
        this.body.setRotationPoint(-3.5F, 7.6F, -7.3F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 8, 9, 0.0F);
        this.backrightleg3 = new AdvancedModelRenderer(this, 15, 16);
        this.backrightleg3.setRotationPoint(0.9F, 4.4F, 0.4F);
        this.backrightleg3.addBox(-2.2F, -1.2F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backrightleg3, -0.40980330836826856F, 0.0F, 0.0F);
        this.tail = new AdvancedModelRenderer(this, 56, 11);
        this.tail.setRotationPoint(2.5F, 0.6F, 4.0F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(tail, 0.22759093446006054F, 0.0F, 0.0F);
        this.frontrightleg2 = new AdvancedModelRenderer(this, 36, 0);
        this.frontrightleg2.setRotationPoint(0.1F, 5.8F, -0.5F);
        this.frontrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(frontrightleg2, -0.091106186954104F, 0.0F, 0.0F);
        this.body2 = new AdvancedModelRenderer(this, 11, 10);
        this.body2.setRotationPoint(0.5F, 0.3F, 8.3F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 6, 7, 9, 0.0F);
        this.setRotateAngle(body2, 0.045553093477052F, 0.0F, 0.0F);
        this.rightear = new AdvancedModelRenderer(this, 9, 0);
        this.rightear.setRotationPoint(2.5F, -4.0F, -2.3F);
        this.rightear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.snoutdown = new AdvancedModelRenderer(this, 0, 49);
        this.snoutdown.setRotationPoint(-1.0F, 1.8F, -8.3F);
        this.snoutdown.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.backleftleg = new AdvancedModelRenderer(this, 30, 48);
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
        
        updateDefaultPose();
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
    	
        this.head.rotateAngleY = (f3 * 0.017453292F);
        this.head.rotateAngleX = (f4 * 0.017453292F)+0.7F;
    	
    	bob(body, 0.3F * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(frontrightleg, 0.4f * globalSpeed, 0.3f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(frontleftleg, 0.4f * globalSpeed, 0.3f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(backrightleg, 0.4f * globalSpeed, 0.3f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(backleftleg, 0.4f * globalSpeed, 0.3f * globalDegree, false, 0f, 0.2f, f, f1);
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
