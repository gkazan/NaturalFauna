package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * ModelPuffin - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuffinWater extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer bodyChildChild;
    public BookwormModelRenderer peakbase;
    public BookwormModelRenderer peaktop;
    public BookwormModelRenderer rightfoot;
    public BookwormModelRenderer leftfoot;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer tail2;

    public ModelPuffinWater() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tail1 = new BookwormModelRenderer(this, 50, 5, "tail1");
        this.tail1.setRotationPoint(1.0F, 0.4F, 2.0F);
        this.tail1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail1, -0.35499996985564664F, 0.0F, 0.0F);
        this.peaktop = new BookwormModelRenderer(this, 11, 20, "peaktop");
        this.peaktop.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.peaktop.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peaktop, 0.2792526803190927F, 0.0F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 23, 1, "rightleg");
        this.rightleg.setRotationPoint(-0.3F, 2.5F, 1.3F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.0471975511965976F, 0.0F, 0.0F);
        this.bodyChildChild = new BookwormModelRenderer(this, 1, 25, "bodyChildChild");
        this.bodyChildChild.setRotationPoint(0.0F, -1.6F, -0.3F);
        this.bodyChildChild.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(bodyChildChild, -0.039968039870670144F, 0.0F, 0.0F);
        this.leftfoot = new BookwormModelRenderer(this, 11, 1, "leftfoot");
        this.leftfoot.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.leftfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 14, 9, "rightwing");
        this.rightwing.setRotationPoint(-1.5F, -1.1F, 0.1F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(rightwing, -0.016057029118347832F, 0.0F, 0.0F);
        this.rightfoot = new BookwormModelRenderer(this, 29, 1, "rightfoot");
        this.rightfoot.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.rightfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.body = new BookwormModelRenderer(this, 28, 24, "body");
        this.body.setRotationPoint(0.0F, 18.3F, -1.4F);
        this.body.addBox(-1.5F, -1.1F, -0.9F, 3, 4, 4, 0.0F);
        this.setRotateAngle(body, -0.136659280431156F, 0.0F, -0.0017453292519943296F);
        this.leftwing = new BookwormModelRenderer(this, 31, 9, "leftwing");
        this.leftwing.setRotationPoint(1.5F, -1.0F, 0.1F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
        this.setRotateAngle(leftwing, -0.016057029118347832F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 19, 27, "neck");
        this.neck.setRotationPoint(0.0F, 0.1F, 0.7F);
        this.neck.addBox(-1.0F, -2.4F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, 0.31869712141416456F, 0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 52, 25, "body2");
        this.body2.setRotationPoint(-1.0F, -0.2F, 0.4F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.3042108886226116F, 0.0F, 0.0F);
        this.peakbase = new BookwormModelRenderer(this, 1, 20, "peakbase");
        this.peakbase.setRotationPoint(-0.5F, -1.12F, -0.92F);
        this.peakbase.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peakbase, -0.18203784098300857F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 53, 12, "tail2");
        this.tail2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(tail2, -0.10227629416686772F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 18, 1, "leftleg");
        this.leftleg.setRotationPoint(0.3F, 2.5F, 1.3F);
        this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 1.0471975511965976F, 0.0F, 0.0F);
        this.body2.addChild(this.tail1);
        this.bodyChildChild.addChild(this.peaktop);
        this.body.addChild(this.rightleg);
        this.neck.addChild(this.bodyChildChild);
        this.leftleg.addChild(this.leftfoot);
        this.body.addChild(this.rightwing);
        this.rightleg.addChild(this.rightfoot);
        this.body.addChild(this.leftwing);
        this.body.addChild(this.neck);
        this.body.addChild(this.body2);
        this.bodyChildChild.addChild(this.peakbase);
        this.tail1.addChild(this.tail2);
        this.body.addChild(this.leftleg);
        
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
    	reset();

    	walk(neck, 0.17f, 0.3f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(bodyChildChild, 0.17f, 0.15f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(body2, 0.2f, 0.15f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
    	walk(leftwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(rightwing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    	walk(leftleg, 0.25f, 1.3f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	walk(rightleg, 0.25f, 1.3f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
