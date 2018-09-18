package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Ptarmigan - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelPtarmiganFlying extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer nec;
    public BookwormModelRenderer shape16;
    public BookwormModelRenderer shape17;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer shape11;
    public BookwormModelRenderer shape12;
    public BookwormModelRenderer shape13;
    public BookwormModelRenderer shape20;
    public BookwormModelRenderer shape21;
    public BookwormModelRenderer shape22;
    public BookwormModelRenderer shape23;

    public ModelPtarmiganFlying() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.leftwing = new BookwormModelRenderer(this, 45, 2, "leftwing");
        this.leftwing.setRotationPoint(3.1F, 2.1F, 8.0F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 1, 6, 8, 0.0F);
        this.setRotateAngle(leftwing, -1.593485607070823F, 0.0F, -1.1383037381507017F);
        this.nec = new BookwormModelRenderer(this, 20, 33, "nec");
        this.nec.setRotationPoint(0.0F, -0.2F, -2.2F);
        this.nec.addBox(-0.6F, 0.0F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(nec, -0.27314402793711257F, 0.0F, 0.0F);
        this.shape20 = new BookwormModelRenderer(this, 19, 11, "shape20");
        this.shape20.setRotationPoint(0.7F, 6.9F, 0.9F);
        this.shape20.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape20, 0.0F, 1.3100441365469437F, 0.0F);
        this.body = new BookwormModelRenderer(this, 32, 45, "body");
        this.body.setRotationPoint(-0.1F, 12.2F, -6.1F);
        this.body.addBox(-1.5F, -0.1F, 1.0F, 5, 7, 10, 0.0F);
        this.setRotateAngle(body, -0.10838494654884787F, 0.0F, 0.0F);
        this.shape23 = new BookwormModelRenderer(this, 12, 11, "shape23");
        this.shape23.setRotationPoint(0.3F, 6.9F, 1.1F);
        this.shape23.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape23, 0.0F, 1.8018779197589456F, 0.0F);
        this.shape17 = new BookwormModelRenderer(this, 23, 17, "shape17");
        this.shape17.setRotationPoint(-1.4F, 4.2F, 6.6F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(shape17, 1.4570008595648662F, 0.0F, 0.0F);
        this.shape16 = new BookwormModelRenderer(this, 2, 26, "shape16");
        this.shape16.setRotationPoint(1.3F, 4.2F, 6.6F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(shape16, 1.2747884856566583F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 33, 24, "tail2");
        this.tail2.setRotationPoint(0.0F, 3.9F, 9.4F);
        this.tail2.addBox(-1.0F, -0.6F, 0.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(tail2, 0.3178244567881674F, 0.0F, 0.0F);
        this.shape11 = new BookwormModelRenderer(this, 33, 16, "shape11");
        this.shape11.setRotationPoint(0.4F, 2.2F, 2.1F);
        this.shape11.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape11, -2.5953045977155678F, 0.0F, 0.0F);
        this.shape12 = new BookwormModelRenderer(this, 37, 9, "shape12");
        this.shape12.setRotationPoint(0.5F, 0.4F, 2.1F);
        this.shape12.addBox(-0.5F, -0.1F, -0.4F, 1, 2, 2, 0.0F);
        this.setRotateAngle(shape12, -0.4403465702781693F, 0.0F, 0.0F);
        this.tail1 = new BookwormModelRenderer(this, 41, 34, "tail1");
        this.tail1.setRotationPoint(0.0F, 0.0F, 10.9F);
        this.tail1.addBox(-1.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(tail1, -0.2748893571891069F, 0.0F, 0.0F);
        this.shape21 = new BookwormModelRenderer(this, 5, 11, "shape21");
        this.shape21.setRotationPoint(0.3F, 6.9F, 1.1F);
        this.shape21.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape21, 0.0F, 1.8018779197589456F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 8, 47, "rightwing");
        this.rightwing.setRotationPoint(-1.4F, 1.3F, 8.0F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 1, 6, 8, 0.0F);
        this.setRotateAngle(rightwing, -1.593485607070823F, 0.0F, 1.1383037381507017F);
        this.shape13 = new BookwormModelRenderer(this, 32, 6, "shape13");
        this.shape13.setRotationPoint(0.5F, 1.5F, 4.1F);
        this.shape13.addBox(-0.5F, -0.1F, -0.4F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape13, -1.454906464462473F, 0.0F, 0.0F);
        this.shape22 = new BookwormModelRenderer(this, 12, 22, "shape22");
        this.shape22.setRotationPoint(0.7F, 6.9F, 0.9F);
        this.shape22.addBox(0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F);
        this.setRotateAngle(shape22, 0.0F, 1.3100441365469437F, 0.0F);
        this.body.addChild(this.leftwing);
        this.body.addChild(this.nec);
        this.shape16.addChild(this.shape20);
        this.shape17.addChild(this.shape23);
        this.body.addChild(this.shape17);
        this.body.addChild(this.shape16);
        this.body.addChild(this.tail2);
        this.nec.addChild(this.shape11);
        this.shape11.addChild(this.shape12);
        this.body.addChild(this.tail1);
        this.shape16.addChild(this.shape21);
        this.body.addChild(this.rightwing);
        this.shape11.addChild(this.shape13);
        this.shape17.addChild(this.shape22);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float scaleFactor= 0.7F;
    	
	    GlStateManager.pushMatrix();
	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        this.body .render(f5);
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
    	float globalDegree = 1F;
    	
    	walk(leftwing, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(rightwing, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	flap(leftwing, 0.6f * globalSpeed, 0.7f * globalDegree, false, 0, 0f, f, f1);
    	flap(rightwing, 0.6f * globalSpeed, 0.7f * globalDegree, true, 0, 0f, f, f1);
 
    	walk(tail1, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    	walk(tail2, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    }
}
