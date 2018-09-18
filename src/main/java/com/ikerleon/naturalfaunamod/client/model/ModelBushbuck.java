package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;


public class ModelBushbuck extends BookwormModelBase {
    public BookwormModelRenderer shape1;
    public BookwormModelRenderer shape2;
    public BookwormModelRenderer shape13;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape14_1;
    public BookwormModelRenderer shape14_2;
    public BookwormModelRenderer shape14_3;
    public BookwormModelRenderer shape18;
    public BookwormModelRenderer shape3;
    public BookwormModelRenderer shape13_1;
    public BookwormModelRenderer shape4;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape5_1;
    public BookwormModelRenderer shape15;
    public BookwormModelRenderer shape15_1;
    public BookwormModelRenderer shape15_2;
    public BookwormModelRenderer shape15_3;
    public BookwormModelRenderer shape15_4;
    public BookwormModelRenderer shape15_5;

    public ModelBushbuck() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.shape13_1 = new BookwormModelRenderer(this, 37, 34, "shape13_1");
        this.shape13_1.setRotationPoint(0.2F, -4.0F, -9.2F);
        this.shape13_1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F);
        this.setRotateAngle(shape13_1, 0.136659280431156F, 0.0F, 0.0F);
        this.shape1 = new BookwormModelRenderer(this, 0, 0, "shape1");
        this.shape1.setRotationPoint(-5.0F, 4.6F, -9.5F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 9, 10, 19, 0.0F);
        this.setRotateAngle(shape1, 0.045553093477052F, 0.0F, 0.0F);
        this.shape13 = new BookwormModelRenderer(this, 0, 26, "shape13");
        this.shape13.setRotationPoint(4.5F, -1.8F, 0.9F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 0, 2, 18, 0.0F);
        this.shape18 = new BookwormModelRenderer(this, 0, 29, "shape18");
        this.shape18.setRotationPoint(4.6F, 1.0F, 17.5F);
        this.shape18.addBox(-1.0F, 0.0F, 0.0F, 2, 8, 3, 0.0F);
        this.setRotateAngle(shape18, 0.091106186954104F, 0.0F, 0.0F);
        this.shape15 = new BookwormModelRenderer(this, 37, 5, "shape15");
        this.shape15.setRotationPoint(-3.2F, -5.4F, -3.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape15, -0.045553093477052F, 0.0F, -0.18203784098300857F);
        this.shape15_2 = new BookwormModelRenderer(this, 65, 31, "shape15_2");
        this.shape15_2.setRotationPoint(1.1F, -3.0F, 1.5F);
        this.shape15_2.addBox(-0.5F, -1.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape15_2, -0.27314402793711257F, 0.0F, 0.18203784098300857F);
        this.shape15_4 = new BookwormModelRenderer(this, 65, 31, "shape15_4");
        this.shape15_4.setRotationPoint(0.0F, -2.9F, 1.5F);
        this.shape15_4.addBox(-0.5F, -1.5F, -0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape15_4, -0.27314402793711257F, 0.0F, -0.18203784098300857F);
        this.shape14_1 = new BookwormModelRenderer(this, 67, 0, "shape14_1");
        this.shape14_1.setRotationPoint(7.6F, 7.5F, 1.8F);
        this.shape14_1.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(shape14_1, -0.045553093477052F, 0.0F, 0.0F);
        this.shape5_1 = new BookwormModelRenderer(this, 12, 0, "shape5_1");
        this.shape5_1.setRotationPoint(5.1F, -3.3F, -0.5F);
        this.shape5_1.addBox(0.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5_1, -0.36425021489121656F, 1.3658946726107624F, 0.136659280431156F);
        this.shape15_1 = new BookwormModelRenderer(this, 37, 5, "shape15_1");
        this.shape15_1.setRotationPoint(1.2F, -5.6F, -3.0F);
        this.shape15_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(shape15_1, -0.045553093477052F, 0.0F, 0.18203784098300857F);
        this.shape3 = new BookwormModelRenderer(this, 10, 29, "shape3");
        this.shape3.setRotationPoint(0.1F, -1.3F, -7.6F);
        this.shape3.addBox(-3.0F, -3.0F, -5.8F, 6, 6, 6, 0.0F);
        this.setRotateAngle(shape3, 0.7618362184955249F, 0.0F, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 34, 29, "shape4");
        this.shape4.setRotationPoint(-2.0F, -0.4F, -9.2F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(shape4, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape14_2 = new BookwormModelRenderer(this, 64, 15, "shape14_2");
        this.shape14_2.setRotationPoint(1.4F, 7.0F, 17.4F);
        this.shape14_2.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(shape14_2, -0.045553093477052F, 0.0F, 0.0F);
        this.shape2 = new BookwormModelRenderer(this, 37, 0, "shape2");
        this.shape2.setRotationPoint(4.3F, 4.2F, 2.0F);
        this.shape2.addBox(-2.4F, -3.0F, -9.7F, 5, 6, 10, 0.0F);
        this.setRotateAngle(shape2, -0.6829473363053812F, 0.0F, 0.0F);
        this.shape14 = new BookwormModelRenderer(this, 0, 0, "shape14");
        this.shape14.setRotationPoint(1.4F, 7.5F, 1.8F);
        this.shape14.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(shape14, -0.045553093477052F, 0.0F, 0.0F);
        this.shape14_3 = new BookwormModelRenderer(this, 53, 28, "shape14_3");
        this.shape14_3.setRotationPoint(7.6F, 7.0F, 17.4F);
        this.shape14_3.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(shape14_3, -0.045553093477052F, 0.0F, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 37, 0, "shape5");
        this.shape5.setRotationPoint(-3.6F, -4.3F, -1.4F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape5, -0.36425021489121656F, -1.3658946726107624F, -0.136659280431156F);
        this.shape15_5 = new BookwormModelRenderer(this, 12, 5, "shape15_5");
        this.shape15_5.setRotationPoint(0.0F, -3.3F, -0.4F);
        this.shape15_5.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_5, 0.22759093446006054F, 0.0F, 0.0F);
        this.shape15_3 = new BookwormModelRenderer(this, 12, 5, "shape15_3");
        this.shape15_3.setRotationPoint(0.0F, -3.3F, -0.4F);
        this.shape15_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape15_3, 0.22759093446006054F, 0.0F, 0.0F);
        this.shape2.addChild(this.shape13_1);
        this.shape1.addChild(this.shape13);
        this.shape1.addChild(this.shape18);
        this.shape3.addChild(this.shape15);
        this.shape15.addChild(this.shape15_2);
        this.shape15_1.addChild(this.shape15_4);
        this.shape1.addChild(this.shape14_1);
        this.shape3.addChild(this.shape5_1);
        this.shape3.addChild(this.shape15_1);
        this.shape2.addChild(this.shape3);
        this.shape3.addChild(this.shape4);
        this.shape1.addChild(this.shape14_2);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape14);
        this.shape1.addChild(this.shape14_3);
        this.shape3.addChild(this.shape5);
        this.shape15_4.addChild(this.shape15_5);
        this.shape15_2.addChild(this.shape15_3);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
     	if(this.isChild) {
     		float scaleFactor= 0.4F;
	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.shape1.render(f5);
    	    GlStateManager.popMatrix();
     	}
     	else {
     		float scaleFactor= 0.7F;
	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.shape1.render(f5);
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

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1F;
    	
        this.shape3.rotateAngleY = (f3 * 0.017453292F);
        this.shape3.rotateAngleX = (f4 * 0.017453292F)+0.7F;
    	
    	walk(shape14, 0.5f * globalSpeed, 0.5f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(shape14_1, 0.5f * globalSpeed, 0.5f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(shape14_2, 0.5f * globalSpeed, 0.5f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(shape14_3, 0.5f * globalSpeed, 0.5f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(shape2, 0.4f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(shape2, 0.10f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);  	
    	
    	flap(shape18, 0.2f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
