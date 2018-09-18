package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Affe - Mürbis
 * Created using Tabula 7.0.0
 */
public class ModelMarmoset extends BookwormModelBase {
    public BookwormModelRenderer Body1;
    public BookwormModelRenderer Body2;
    public BookwormModelRenderer Body3;
    public BookwormModelRenderer Bud;
    public BookwormModelRenderer Foot11;
    public BookwormModelRenderer Foot21;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer Tail2;
    public BookwormModelRenderer Tail3;
    public BookwormModelRenderer Foot12;
    public BookwormModelRenderer Foot13;
    public BookwormModelRenderer Foot22;
    public BookwormModelRenderer Foot23;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer Foot31;
    public BookwormModelRenderer Foot41;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Ear1;
    public BookwormModelRenderer Ear2;
    public BookwormModelRenderer Nose1;
    public BookwormModelRenderer Nose2;
    public BookwormModelRenderer Nose3;
    public BookwormModelRenderer Foot32;
    public BookwormModelRenderer Foot33;
    public BookwormModelRenderer Foot42;
    public BookwormModelRenderer Foot43;

    public ModelMarmoset() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Nose1 = new BookwormModelRenderer(this, 0, 10, "Nose1");
        this.Nose1.setRotationPoint(-1.0F, 2.2F, -3.5F);
        this.Nose1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Tail1 = new BookwormModelRenderer(this, 40, 6, "Tail1");
        this.Tail1.setRotationPoint(-0.3F, 0.0F, 0.5F);
        this.Tail1.addBox(0.0F, -0.7F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail1, -0.136659280431156F, -0.091106186954104F, 0.0F);
        this.Foot41 = new BookwormModelRenderer(this, 45, 19, "Foot41");
        this.Foot41.setRotationPoint(2.0F, 0.1F, 0.0F);
        this.Foot41.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot41, 0.27314402793711257F, 0.0F, 0.0F);
        this.Foot12 = new BookwormModelRenderer(this, 47, 12, "Foot12");
        this.Foot12.setRotationPoint(0.1F, 2.5F, 1.2F);
        this.Foot12.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot12, -0.8196066167365371F, 0.0F, 0.0F);
        this.Tail3 = new BookwormModelRenderer(this, 40, 6, "Tail3");
        this.Tail3.setRotationPoint(-0.1F, 0.2F, 3.8F);
        this.Tail3.addBox(-0.6F, -0.7F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail3, 0.31869712141416456F, -0.40980330836826856F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 0, 0, "Head");
        this.Head.setRotationPoint(0.4F, 0.1F, -1.3F);
        this.Head.addBox(-3.0F, -1.4F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Head, -0.5918411493512771F, 0.0F, 0.0F);
        this.Foot21 = new BookwormModelRenderer(this, 39, 12, "Foot21");
        this.Foot21.setRotationPoint(-1.9F, -0.1F, 0.3F);
        this.Foot21.addBox(-1.2F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Foot21, 0.27314402793711257F, 0.0F, 0.0F);
        this.Foot22 = new BookwormModelRenderer(this, 47, 12, "Foot22");
        this.Foot22.setRotationPoint(-0.9F, 2.5F, 1.2F);
        this.Foot22.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot22, -0.8196066167365371F, 0.0F, 0.0F);
        this.Body2 = new BookwormModelRenderer(this, 18, 20, "Body2");
        this.Body2.setRotationPoint(0.1F, 0.2F, 3.6F);
        this.Body2.addBox(-2.5F, -3.1F, 0.0F, 6, 6, 3, 0.0F);
        this.Foot33 = new BookwormModelRenderer(this, 53, 13, "Foot33");
        this.Foot33.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot33.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot33, -0.8196066167365371F, 0.0F, 0.0F);
        this.Tail2 = new BookwormModelRenderer(this, 40, 6, "Tail2");
        this.Tail2.setRotationPoint(0.7F, -0.2F, 3.7F);
        this.Tail2.addBox(-0.7F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail2, 0.31869712141416456F, 0.22759093446006054F, 0.0F);
        this.Foot13 = new BookwormModelRenderer(this, 53, 3, "Foot13");
        this.Foot13.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot13.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot13, -0.8196066167365371F, 0.0F, 0.0F);
        this.Foot11 = new BookwormModelRenderer(this, 39, 12, "Foot11");
        this.Foot11.setRotationPoint(3.2F, -0.1F, 0.3F);
        this.Foot11.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Foot11, 0.27314402793711257F, 0.0F, 0.0F);
        this.Foot42 = new BookwormModelRenderer(this, 47, 12, "Foot42");
        this.Foot42.setRotationPoint(0.1F, 2.5F, 1.2F);
        this.Foot42.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot42, -0.8196066167365371F, 0.0F, 0.0F);
        this.Ear2 = new BookwormModelRenderer(this, 0, 15, "Ear2");
        this.Ear2.setRotationPoint(-0.6F, -0.8F, -3.5F);
        this.Ear2.addBox(-3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F);
        this.setRotateAngle(Ear2, -0.18203784098300857F, 0.6829473363053812F, 0.0F);
        this.Ear1 = new BookwormModelRenderer(this, 0, 15, "Ear1");
        this.Ear1.setRotationPoint(-0.4F, -0.8F, -3.5F);
        this.Ear1.addBox(0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F);
        this.setRotateAngle(Ear1, -0.18203784098300857F, -0.6829473363053812F, 0.0F);
        this.Foot31 = new BookwormModelRenderer(this, 45, 19, "Foot31");
        this.Foot31.setRotationPoint(-1.9F, 0.0F, 0.1F);
        this.Foot31.addBox(-1.1F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot31, 0.27314402793711257F, 0.0F, 0.0F);
        this.Body1 = new BookwormModelRenderer(this, 19, 9, "Body1");
        this.Body1.setRotationPoint(-0.2F, 19.5F, -1.1F);
        this.Body1.addBox(-1.9F, -2.4F, 0.0F, 5, 5, 4, 0.0F);
        this.Bud = new BookwormModelRenderer(this, 38, 1, "Bud");
        this.Bud.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Bud.addBox(-1.2F, -1.4F, 0.0F, 3, 3, 1, 0.0F);
        this.Nose3 = new BookwormModelRenderer(this, 9, 12, "Nose3");
        this.Nose3.setRotationPoint(0.1F, 0.0F, 1.1F);
        this.Nose3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Nose3, 0.0F, -1.1383037381507017F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 19, "Neck");
        this.Neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck.addBox(-2.0F, -1.2F, -2.4F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.5462880558742251F, 0.0F, 0.0F);
        this.Foot32 = new BookwormModelRenderer(this, 47, 12, "Foot32");
        this.Foot32.setRotationPoint(-0.8F, 2.5F, 1.2F);
        this.Foot32.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot32, -0.8196066167365371F, 0.0F, 0.0F);
        this.Foot23 = new BookwormModelRenderer(this, 53, 7, "Foot23");
        this.Foot23.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot23.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot23, -0.8196066167365371F, 0.0F, 0.0F);
        this.Body3 = new BookwormModelRenderer(this, 20, 0, "Body3");
        this.Body3.setRotationPoint(0.6F, 0.0F, -3.0F);
        this.Body3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 3, 0.0F);
        this.Nose2 = new BookwormModelRenderer(this, 9, 12, "Nose2");
        this.Nose2.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.Nose2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Nose2, 0.0F, 1.1383037381507017F, 0.0F);
        this.Foot43 = new BookwormModelRenderer(this, 53, 17, "Foot43");
        this.Foot43.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot43.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot43, -0.8196066167365371F, 0.0F, 0.0F);
        this.Head.addChild(this.Nose1);
        this.Bud.addChild(this.Tail1);
        this.Body3.addChild(this.Foot41);
        this.Foot11.addChild(this.Foot12);
        this.Tail2.addChild(this.Tail3);
        this.Neck.addChild(this.Head);
        this.Body2.addChild(this.Foot21);
        this.Foot21.addChild(this.Foot22);
        this.Body1.addChild(this.Body2);
        this.Foot32.addChild(this.Foot33);
        this.Tail1.addChild(this.Tail2);
        this.Foot12.addChild(this.Foot13);
        this.Body2.addChild(this.Foot11);
        this.Foot41.addChild(this.Foot42);
        this.Head.addChild(this.Ear2);
        this.Head.addChild(this.Ear1);
        this.Body3.addChild(this.Foot31);
        this.Body2.addChild(this.Bud);
        this.Nose1.addChild(this.Nose3);
        this.Body3.addChild(this.Neck);
        this.Foot31.addChild(this.Foot32);
        this.Foot22.addChild(this.Foot23);
        this.Body1.addChild(this.Body3);
        this.Nose1.addChild(this.Nose2);
        this.Foot42.addChild(this.Foot43);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
     	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.3F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.Body1.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 0.5F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.Body1.render(f5);
            GlStateManager.popMatrix();
    	}
    }

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {   	
    	reset();

    	float globalSpeed = 2f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.5F;
    	
        this.Head.rotateAngleY = (f3 * 0.017453292F);
        this.Head.rotateAngleX = (f4 * 0.017453292F);
    	
    	
    	walk(Foot11, 0.4f * globalSpeed, 0.3f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(Foot21, 0.4f * globalSpeed, 0.3f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(Foot31, 0.4f * globalSpeed, 0.3f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(Foot41, 0.4f * globalSpeed, 0.3f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Foot12, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(Foot22, 0.5f * globalSpeed, 0.2f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(Foot33, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Foot43, 0.5f * globalSpeed, 0.2f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(Foot32, 0.5f * globalSpeed, 0.4f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(Foot42, 0.5f * globalSpeed, 0.4f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Neck, 0.5f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(Neck, 0.1f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F); 
    	
    	walk(Tail1, 0.1f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	walk(Tail2, 0.07f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	walk(Tail3, 0.1f, 0.3f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(Tail1, 0.1f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(Tail2, 0.07f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(Tail3, 0.1f, 0.3f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
