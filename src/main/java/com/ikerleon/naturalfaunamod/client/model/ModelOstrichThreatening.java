package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * ModelOstrich - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelOstrichThreatening extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer rightleg2;
    public BookwormModelRenderer right1;
    public BookwormModelRenderer right2;
    public BookwormModelRenderer leftleg2;
    public BookwormModelRenderer left1;
    public BookwormModelRenderer left2;
    public BookwormModelRenderer neck2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer beak2;

    public ModelOstrichThreatening() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.leftleg2 = new BookwormModelRenderer(this, 38, 0, "leftleg2");
        this.leftleg2.setRotationPoint(0.0F, -2.5F, 0.9F);
        this.leftleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(leftleg2, -0.27314402793711257F, 0.0F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 56, 4, "rightwing");
        this.rightwing.setRotationPoint(1.8F, 0.0F, 1.4F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(rightwing, 0.136659280431156F, -1.3658946726107624F, 0.0F);
        this.beak = new BookwormModelRenderer(this, 17, 20, "beak");
        this.beak.setRotationPoint(-1.5F, -0.8F, -4.0F);
        this.beak.addBox(0.5F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(beak, 0.18203784098300857F, 0.0F, 0.0F);
        this.beak2 = new BookwormModelRenderer(this, 0, 0, "beak2");
        this.beak2.setRotationPoint(-0.3F, 0.1F, 0.0F);
        this.beak2.addBox(0.3F, 0.0F, -0.2F, 3, 1, 3, 0.0F);
        this.setRotateAngle(beak2, -0.18203784098300857F, 0.0F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 38, 5, "rightleg");
        this.rightleg.setRotationPoint(0.3F, 7.5F, 3.9F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(rightleg, 0.36425021489121656F, 0.0F, 0.0F);
        this.neck2 = new BookwormModelRenderer(this, 54, 0, "neck2");
        this.neck2.setRotationPoint(0.5F, -2.9F, 1.0F);
        this.neck2.addBox(-1.5F, -10.8F, -1.7F, 3, 11, 3, 0.0F);
        this.setRotateAngle(neck2, -1.0016444577195458F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 10, 9, "neck");
        this.neck.setRotationPoint(3.7F, 3.2F, 1.1F);
        this.neck.addBox(-1.5F, -4.7F, -2.6F, 4, 5, 5, 0.0F);
        this.setRotateAngle(neck, 1.3658946726107624F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 40, 5, "leftleg");
        this.leftleg.setRotationPoint(6.0F, 7.2F, 5.5F);
        this.leftleg.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(leftleg, 0.31869712141416456F, 0.0F, 0.0F);
        this.rightleg2 = new BookwormModelRenderer(this, 38, 0, "rightleg2");
        this.rightleg2.setRotationPoint(0.5F, -2.9F, 1.4F);
        this.rightleg2.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(rightleg2, -0.31869712141416456F, 0.0F, 0.0F);
        this.left1 = new BookwormModelRenderer(this, 40, 0, "left1");
        this.left1.setRotationPoint(-0.6F, 13.9F, 0.1F);
        this.left1.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.right2 = new BookwormModelRenderer(this, 41, 2, "right2");
        this.right2.setRotationPoint(1.1F, 14.1F, 1.1F);
        this.right2.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(-4.1F, 4.4F, -5.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 9, 11, 0.0F);
        this.setRotateAngle(body, -0.045553093477052F, 0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 0, 20, "body2");
        this.body2.setRotationPoint(4.1F, 2.1F, 9.4F);
        this.body2.addBox(-2.7F, -2.0F, -0.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(body2, 0.18203784098300857F, 0.003490658503988659F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 44, 14, "leftwing");
        this.leftwing.setRotationPoint(6.1F, 0.0F, 1.5F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(leftwing, 0.136659280431156F, 1.4570008595648662F, 0.0F);
        this.head = new BookwormModelRenderer(this, 34, 17, "head");
        this.head.setRotationPoint(0.0F, -9.0F, -0.4F);
        this.head.addBox(-2.0F, -2.5F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, -0.22759093446006054F, 0.0F, 0.0F);
        this.right1 = new BookwormModelRenderer(this, 40, 0, "right1");
        this.right1.setRotationPoint(0.4F, 14.1F, 0.3F);
        this.right1.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(right1, 0.0F, 0.22759093446006054F, 0.0F);
        this.left2 = new BookwormModelRenderer(this, 41, 2, "left2");
        this.left2.setRotationPoint(0.4F, 13.8F, -0.8F);
        this.left2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(left2, 0.0F, -0.31869712141416456F, 0.0F);
        this.leftleg.addChild(this.leftleg2);
        this.body.addChild(this.rightwing);
        this.head.addChild(this.beak);
        this.beak.addChild(this.beak2);
        this.body.addChild(this.rightleg);
        this.neck.addChild(this.neck2);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftleg);
        this.rightleg.addChild(this.rightleg2);
        this.leftleg2.addChild(this.left1);
        this.rightleg2.addChild(this.right2);
        this.body.addChild(this.body2);
        this.body.addChild(this.leftwing);
        this.neck2.addChild(this.head);
        this.rightleg2.addChild(this.right1);
        this.leftleg2.addChild(this.left2);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float scaleFactor= 1.3F;
     	
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
    	reset();

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.5F;
    	
    	
    	walk(rightleg, 0.2f * globalSpeed, 0.4f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(leftleg, 0.2f * globalSpeed, 0.4f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(rightleg2, 0.1f * globalSpeed, 0.3f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(leftleg2, 0.1f * globalSpeed, 0.3f * globalDegree, false, 2.5f, 0f, f, f1);
    	walk(neck, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(body2, 0.8f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(body2, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(neck, 0.17f, 0.1f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	swing(rightwing, 0.6f, 0.8f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(leftwing, 0.6f, 0.8f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
