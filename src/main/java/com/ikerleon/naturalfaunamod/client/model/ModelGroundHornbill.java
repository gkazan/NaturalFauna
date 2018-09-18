package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Calaoterrestre - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelGroundHornbill extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer shape10;
    public BookwormModelRenderer shape11;
    public BookwormModelRenderer shape12;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer shape27;
    public BookwormModelRenderer shape3;
    public BookwormModelRenderer shape4;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape6;
    public BookwormModelRenderer shape7;
    public BookwormModelRenderer shape8;
    public BookwormModelRenderer shape9;
    public BookwormModelRenderer rightleg2;
    public BookwormModelRenderer shape18;
    public BookwormModelRenderer shape19;
    public BookwormModelRenderer shape21;
    public BookwormModelRenderer shape23;
    public BookwormModelRenderer shape26;
    public BookwormModelRenderer leftleg2;
    public BookwormModelRenderer shape19_1;
    public BookwormModelRenderer shape20;
    public BookwormModelRenderer shape22;
    public BookwormModelRenderer shape24;
    public BookwormModelRenderer shape25;

    public ModelGroundHornbill() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape10 = new BookwormModelRenderer(this, 1, 40, "shape10");
        this.shape10.setRotationPoint(-4.0F, 0.7F, 6.0F);
        this.shape10.addBox(0.0F, 0.0F, -5.0F, 1, 9, 5, 0.0F);
        this.setRotateAngle(shape10, 0.06405358354819189F, 0.0F, -0.0F);
        this.shape21 = new BookwormModelRenderer(this, 29, 10, "shape21");
        this.shape21.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.shape21.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape21, 3.3957125926801677F, 0.0F, 0.0F);
        this.shape3 = new BookwormModelRenderer(this, 6, 56, "shape3");
        this.shape3.setRotationPoint(2.5F, 9.9F, 3.2F);
        this.shape3.addBox(-1.5F, 0.4F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(shape3, 3.03163691071415F, 0.0F, 0.0F);
        this.shape19_1 = new BookwormModelRenderer(this, 40, 22, "shape19_1");
        this.shape19_1.setRotationPoint(3.1F, 6.6F, -0.3F);
        this.shape19_1.addBox(-3.1F, -0.1F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape19_1, 2.8132962212896597F, 0.0F, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 53, 1, "shape4");
        this.shape4.setRotationPoint(0.5F, 3.1F, 2.0F);
        this.shape4.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape4, 3.5688492544780046F, 0.0F, 0.0F);
        this.shape18 = new BookwormModelRenderer(this, 13, 0, "shape18");
        this.shape18.setRotationPoint(3.1F, 6.6F, -0.3F);
        this.shape18.addBox(-3.1F, -0.1F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape18, 2.8132962212896597F, 0.0F, 0.0F);
        this.shape20 = new BookwormModelRenderer(this, 32, 16, "shape20");
        this.shape20.setRotationPoint(0.0F, 0.8F, 0.1F);
        this.shape20.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape20, 3.141592653589793F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 20, 55, "neck");
        this.neck.setRotationPoint(-2.6F, 3.1F, 2.7F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(neck, 2.2001620550640517F, 0.0F, 0.0F);
        this.shape6 = new BookwormModelRenderer(this, 44, 9, "shape6");
        this.shape6.setRotationPoint(0.5F, 1.0F, 1.2F);
        this.shape6.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape6, 3.901509009908124F, 0.0F, 0.0F);
        this.shape19 = new BookwormModelRenderer(this, 38, 10, "shape19");
        this.shape19.setRotationPoint(0.0F, 0.8F, 0.1F);
        this.shape19.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape19, 3.141592653589793F, 0.0F, 0.0F);
        this.shape27 = new BookwormModelRenderer(this, 1, 4, "shape27");
        this.shape27.setRotationPoint(1.5F, 6.5F, 6.0F);
        this.shape27.addBox(-3.1F, -8.0F, 0.0F, 3, 8, 2, 0.0F);
        this.setRotateAngle(shape27, 2.5569073541716927F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 40, 50, "body");
        this.body.setRotationPoint(0.0F, 15.0F, -5.7F);
        this.body.addBox(-3.1F, -0.1F, 0.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(body, 1.0873401239924672F, 0.0F, 0.0F);
        this.shape7 = new BookwormModelRenderer(this, 21, 0, "shape7");
        this.shape7.setRotationPoint(0.5F, 0.3F, 3.2F);
        this.shape7.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(shape7, 6.4467226580914545F, 0.0F, 0.0F);
        this.rightleg2 = new BookwormModelRenderer(this, 19, 0, "rightleg2");
        this.rightleg2.setRotationPoint(-2.5F, -1.0F, 1.5F);
        this.rightleg2.addBox(0.0F, -0.1F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg2, 3.175626574003682F, 0.0F, 0.0F);
        this.shape9 = new BookwormModelRenderer(this, 50, 12, "shape9");
        this.shape9.setRotationPoint(0.0F, 0.3F, 2.6F);
        this.shape9.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(shape9, 6.424556976591127F, 0.0F, 0.0F);
        this.shape26 = new BookwormModelRenderer(this, 14, 9, "shape26");
        this.shape26.setRotationPoint(0.8F, 0.4F, 1.3F);
        this.shape26.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape26, 3.3957125926801677F, 0.3420845333908886F, 0.0F);
        this.shape11 = new BookwormModelRenderer(this, 17, 38, "shape11");
        this.shape11.setRotationPoint(2.8F, 0.7F, 6.0F);
        this.shape11.addBox(0.0F, -0.1F, -5.0F, 1, 9, 5, 0.0F);
        this.setRotateAngle(shape11, 0.06405358354819189F, 0.0F, -0.0F);
        this.shape24 = new BookwormModelRenderer(this, 29, 21, "shape24");
        this.shape24.setRotationPoint(-0.8F, 0.4F, 3.0F);
        this.shape24.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape24, 3.3957125926801677F, -0.28728119487826664F, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 36, 0, "shape5");
        this.shape5.setRotationPoint(0.0F, 0.9F, 3.2F);
        this.shape5.addBox(-1.5F, 0.4F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(shape5, 3.1977922555040106F, 0.0F, 0.0F);
        this.shape8 = new BookwormModelRenderer(this, 55, 6, "shape8");
        this.shape8.setRotationPoint(0.0F, 2.0F, 0.1F);
        this.shape8.addBox(-1.5F, 0.4F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(shape8, 6.3571872674641465F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 10, 18, "leftleg");
        this.leftleg.setRotationPoint(0.2F, 6.7F, 1.9F);
        this.leftleg.addBox(0.0F, -3.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftleg, 2.211855761052414F, 0.0F, 0.0F);
        this.shape22 = new BookwormModelRenderer(this, 23, 16, "shape22");
        this.shape22.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.shape22.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape22, 3.3957125926801677F, 0.0F, 0.0F);
        this.leftleg2 = new BookwormModelRenderer(this, 40, 15, "leftleg2");
        this.leftleg2.setRotationPoint(0.5F, -1.0F, 1.5F);
        this.leftleg2.addBox(0.0F, -0.1F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg2, 3.175626574003682F, 0.0F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 0, 17, "rightleg");
        this.rightleg.setRotationPoint(0.5F, 6.7F, 1.9F);
        this.rightleg.addBox(-3.1F, -3.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightleg, 2.211855761052414F, 0.0F, 0.0F);
        this.shape23 = new BookwormModelRenderer(this, 21, 9, "shape23");
        this.shape23.setRotationPoint(-0.8F, 0.4F, 3.0F);
        this.shape23.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape23, 3.3957125926801677F, -0.28728119487826664F, 0.0F);
        this.shape25 = new BookwormModelRenderer(this, 21, 22, "shape25");
        this.shape25.setRotationPoint(0.8F, 0.4F, 1.3F);
        this.shape25.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape25, 3.3957125926801677F, 0.3420845333908886F, 0.0F);
        this.shape12 = new BookwormModelRenderer(this, 0, 29, "shape12");
        this.shape12.setRotationPoint(1.0F, 12.6F, 1.4F);
        this.shape12.addBox(-3.1F, -0.1F, 0.0F, 4, 7, 2, 0.0F);
        this.setRotateAngle(shape12, 2.6162485487395F, 0.0F, 0.0F);
        this.body.addChild(this.shape10);
        this.shape18.addChild(this.shape21);
        this.neck.addChild(this.shape3);
        this.leftleg2.addChild(this.shape19_1);
        this.shape3.addChild(this.shape4);
        this.rightleg2.addChild(this.shape18);
        this.shape19_1.addChild(this.shape20);
        this.body.addChild(this.neck);
        this.shape3.addChild(this.shape6);
        this.shape18.addChild(this.shape19);
        this.body.addChild(this.shape27);
        this.shape5.addChild(this.shape7);
        this.rightleg.addChild(this.rightleg2);
        this.shape7.addChild(this.shape9);
        this.shape18.addChild(this.shape26);
        this.body.addChild(this.shape11);
        this.shape19_1.addChild(this.shape24);
        this.shape3.addChild(this.shape5);
        this.shape7.addChild(this.shape8);
        this.body.addChild(this.leftleg);
        this.shape19_1.addChild(this.shape22);
        this.leftleg.addChild(this.leftleg2);
        this.body.addChild(this.rightleg);
        this.shape18.addChild(this.shape23);
        this.shape19_1.addChild(this.shape25);
        this.body.addChild(this.shape12);
        
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
            float scaleFactor= 0.7F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.body.render(f5);
            GlStateManager.popMatrix();
    	}
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
     	walk(neck, 1f * globalSpeed, 0.1f * globalDegree, false, 0, 0f, f, f1);
     	walk(shape27, 1f * globalSpeed, 0.25f * globalDegree, false, 0, 0f, f, f1);
     	walk(shape12, 1f * globalSpeed, 0.25f * globalDegree, false, 0, 0f, f, f1);
     	
     	walk(neck, 0.15f, 0.05f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(shape27, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);  
     	walk(shape12, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
     	walk(shape11, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(shape10, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
