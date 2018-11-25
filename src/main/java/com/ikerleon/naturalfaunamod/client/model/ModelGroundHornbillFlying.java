package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Calaoterrestre - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelGroundHornbillFlying extends BookwormModelBase {
    public BookwormModelRenderer shape1;
    public BookwormModelRenderer shape2;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer shape12;
    public BookwormModelRenderer shape13;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape27;
    public BookwormModelRenderer shape3;
    public BookwormModelRenderer shape4;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape6;
    public BookwormModelRenderer shape7;
    public BookwormModelRenderer shape8;
    public BookwormModelRenderer shape9;
    public BookwormModelRenderer rightwing2;
    public BookwormModelRenderer leftwing2;
    public BookwormModelRenderer shape17;
    public BookwormModelRenderer shape18;
    public BookwormModelRenderer shape19;
    public BookwormModelRenderer shape21;
    public BookwormModelRenderer shape23;
    public BookwormModelRenderer shape26;
    public BookwormModelRenderer shape16;
    public BookwormModelRenderer shape29;
    public BookwormModelRenderer shape20;
    public BookwormModelRenderer shape22;
    public BookwormModelRenderer shape24;
    public BookwormModelRenderer shape25;

    public ModelGroundHornbillFlying() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape20 = new BookwormModelRenderer(this, 32, 16, "shape20");
        this.shape20.setRotationPoint(0.0F, 0.8F, 0.1F);
        this.shape20.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape20, 3.141592653589793F, 0.0F, 0.0F);
        this.shape12 = new BookwormModelRenderer(this, 0, 29, "shape12");
        this.shape12.setRotationPoint(1.0F, 13.8F, 5.7F);
        this.shape12.addBox(-3.1F, -0.1F, 0.0F, 4, 7, 2, 0.0F);
        this.setRotateAngle(shape12, 3.1951742616260193F, 0.0F, 0.0F);
        this.shape2 = new BookwormModelRenderer(this, 20, 55, "shape2");
        this.shape2.setRotationPoint(-2.6F, 1.3F, 5.1F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(shape2, 3.176011417782682F, 0.0F, 0.0F);
        this.shape21 = new BookwormModelRenderer(this, 29, 10, "shape21");
        this.shape21.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.shape21.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape21, 3.3957125926801677F, 0.0F, 0.0F);
        this.shape27 = new BookwormModelRenderer(this, 1, 4, "shape27");
        this.shape27.setRotationPoint(1.5F, 15.7F, 6.4F);
        this.shape27.addBox(-3.1F, -0.1F, 0.0F, 3, 8, 2, 0.0F);
        this.setRotateAngle(shape27, 3.2381093612250798F, 0.0F, 0.0F);
        this.shape8 = new BookwormModelRenderer(this, 55, 6, "shape8");
        this.shape8.setRotationPoint(0.0F, 2.0F, 0.1F);
        this.shape8.addBox(-1.5F, 0.4F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(shape8, 6.3571872674641465F, 0.0F, 0.0F);
        this.shape26 = new BookwormModelRenderer(this, 14, 9, "shape26");
        this.shape26.setRotationPoint(0.8F, 0.4F, 1.3F);
        this.shape26.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape26, 3.3957125926801677F, 0.3420845333908886F, 0.0F);
        this.shape25 = new BookwormModelRenderer(this, 21, 22, "shape25");
        this.shape25.setRotationPoint(0.8F, 0.4F, 1.3F);
        this.shape25.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape25, 3.3957125926801677F, 0.3420845333908886F, 0.0F);
        this.leftwing2 = new BookwormModelRenderer(this, 17, 38, "leftwing2");
        this.leftwing2.setRotationPoint(0.0F, 8.3F, 0.0F);
        this.leftwing2.addBox(0.0F, -0.1F, 0.0F, 1, 9, 5, 0.0F);
        this.setRotateAngle(leftwing2, 0.22130774915288098F, 0.0F, 0.0F);
        this.shape3 = new BookwormModelRenderer(this, 6, 56, "shape3");
        this.shape3.setRotationPoint(2.5F, 9.9F, 3.2F);
        this.shape3.addBox(-1.5F, 0.4F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(shape3, 3.0973213065357963F, 0.0F, 0.0F);
        this.shape16 = new BookwormModelRenderer(this, 40, 15, "shape16");
        this.shape16.setRotationPoint(0.5F, 1.8F, 1.5F);
        this.shape16.addBox(-3.1F, -0.1F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape16, 3.175626574003682F, 0.0F, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 53, 1, "shape4");
        this.shape4.setRotationPoint(0.5F, 0.9F, 1.3F);
        this.shape4.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape4, 3.5688492544780046F, 0.0F, 0.0F);
        this.shape5 = new BookwormModelRenderer(this, 36, 0, "shape5");
        this.shape5.setRotationPoint(0.0F, 0.9F, -0.3F);
        this.shape5.addBox(-1.5F, 0.4F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(shape5, 1.649510676059841F, 0.0F, 0.0F);
        this.shape14 = new BookwormModelRenderer(this, 10, 18, "shape14");
        this.shape14.setRotationPoint(3.5F, 8.4F, 2.1F);
        this.shape14.addBox(-3.1F, -0.1F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(shape14, 3.0930725003843507F, 0.0F, 0.0F);
        this.shape7 = new BookwormModelRenderer(this, 21, 0, "shape7");
        this.shape7.setRotationPoint(0.5F, 0.3F, 3.2F);
        this.shape7.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(shape7, 6.371654777152426F, 0.0F, 0.0F);
        this.shape23 = new BookwormModelRenderer(this, 21, 9, "shape23");
        this.shape23.setRotationPoint(-0.8F, 0.4F, 3.0F);
        this.shape23.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape23, 3.3957125926801677F, -0.22768461954327388F, 0.0F);
        this.shape1 = new BookwormModelRenderer(this, 40, 50, "shape1");
        this.shape1.setRotationPoint(0.0F, 21.6F, -3.1F);
        this.shape1.addBox(-3.1F, -0.1F, 0.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(shape1, 1.5002850250143256F, 0.0F, 0.0F);
        this.shape19 = new BookwormModelRenderer(this, 38, 10, "shape19");
        this.shape19.setRotationPoint(0.0F, 0.8F, 0.1F);
        this.shape19.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape19, 3.141592653589793F, 0.0F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 17, 38, "leftwing");
        this.leftwing.setRotationPoint(2.9F, -0.7F, 4.8F);
        this.leftwing.addBox(0.0F, -0.1F, 0.0F, 1, 9, 5, 0.0F);
        this.setRotateAngle(leftwing, -1.3067280109681545F, 4.71238898038469F, -0.0F);
        this.shape6 = new BookwormModelRenderer(this, 44, 9, "shape6");
        this.shape6.setRotationPoint(0.5F, -0.2F, 1.6F);
        this.shape6.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape6, 3.901509009908124F, 0.0F, 0.0F);
        this.shape13 = new BookwormModelRenderer(this, 0, 17, "shape13");
        this.shape13.setRotationPoint(0.5F, 8.1F, 2.1F);
        this.shape13.addBox(-3.1F, -0.1F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(shape13, 3.0930680913937176F, 0.0F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 1, 40, "rightwing");
        this.rightwing.setRotationPoint(-3.2F, -0.4F, 4.8F);
        this.rightwing.addBox(-1.0F, -0.1F, 0.0F, 1, 9, 5, 0.0F);
        this.setRotateAngle(rightwing, -1.3151055913777272F, 1.5707963267948966F, -0.0F);
        this.rightwing2 = new BookwormModelRenderer(this, 1, 40, "rightwing2");
        this.rightwing2.setRotationPoint(-1.0F, 8.3F, 0.0F);
        this.rightwing2.addBox(0.0F, -0.1F, 0.0F, 1, 9, 5, 0.0F);
        this.setRotateAngle(rightwing2, 0.22130774915288098F, 0.0F, 0.0F);
        this.shape18 = new BookwormModelRenderer(this, 13, 0, "shape18");
        this.shape18.setRotationPoint(0.0F, 6.6F, 1.0F);
        this.shape18.addBox(-3.1F, -0.1F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape18, 3.155380754680548F, 0.0F, 0.0F);
        this.shape9 = new BookwormModelRenderer(this, 50, 12, "shape9");
        this.shape9.setRotationPoint(0.0F, 0.3F, 2.6F);
        this.shape9.addBox(-1.5F, 0.4F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(shape9, 6.424556976591127F, 0.0F, 0.0F);
        this.shape29 = new BookwormModelRenderer(this, 40, 22, "shape29");
        this.shape29.setRotationPoint(0.0F, 6.6F, 1.0F);
        this.shape29.addBox(-3.1F, -0.1F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape29, 3.155380754680548F, 0.0F, 0.0F);
        this.shape24 = new BookwormModelRenderer(this, 29, 21, "shape24");
        this.shape24.setRotationPoint(-0.8F, 0.4F, 3.0F);
        this.shape24.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape24, 3.3957125926801677F, -0.28728119487826664F, 0.0F);
        this.shape17 = new BookwormModelRenderer(this, 19, 0, "shape17");
        this.shape17.setRotationPoint(0.5F, 1.8F, 1.5F);
        this.shape17.addBox(-3.1F, -0.1F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape17, 3.175626574003682F, 0.0F, 0.0F);
        this.shape22 = new BookwormModelRenderer(this, 23, 16, "shape22");
        this.shape22.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.shape22.addBox(-3.1F, -0.1F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(shape22, 3.3957125926801677F, 0.0F, 0.0F);
        this.shape29.addChild(this.shape20);
        this.shape1.addChild(this.shape12);
        this.shape1.addChild(this.shape2);
        this.shape18.addChild(this.shape21);
        this.shape1.addChild(this.shape27);
        this.shape7.addChild(this.shape8);
        this.shape18.addChild(this.shape26);
        this.shape29.addChild(this.shape25);
        this.leftwing.addChild(this.leftwing2);
        this.shape2.addChild(this.shape3);
        this.shape14.addChild(this.shape16);
        this.shape3.addChild(this.shape4);
        this.shape3.addChild(this.shape5);
        this.shape1.addChild(this.shape14);
        this.shape5.addChild(this.shape7);
        this.shape18.addChild(this.shape23);
        this.shape18.addChild(this.shape19);
        this.shape1.addChild(this.leftwing);
        this.shape3.addChild(this.shape6);
        this.shape1.addChild(this.shape13);
        this.shape1.addChild(this.rightwing);
        this.rightwing.addChild(this.rightwing2);
        this.shape17.addChild(this.shape18);
        this.shape7.addChild(this.shape9);
        this.shape16.addChild(this.shape29);
        this.shape29.addChild(this.shape24);
        this.shape13.addChild(this.shape17);
        this.shape29.addChild(this.shape22);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float scaleFactor= 0.7F;
    	
	    GlStateManager.pushMatrix();
	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        this.shape1 .render(f5);
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

        this.leftwing.rotateAngleX = this.rightwing.rotateAngleX =
                -1F * f1 * (0.2f * globalDegree) * MathHelper.cos(f * (0.2f * globalSpeed) + 0) + -1.3151055913777272F;
        this.leftwing.rotateAngleY = 1F * (MathHelper.cos(f * (0.4f * globalSpeed) + 0) * (0.7f * globalDegree) * f1) + (4.71238898038469F * f1);
        this.rightwing.rotateAngleY = -1F * (MathHelper.cos(f * (0.4f * globalSpeed) + 0) * (0.7f * globalDegree) * f1) + (1.5707963267948966F * f1);
        this.leftwing2.rotateAngleY = 1F * (MathHelper.cos(f * (0.6f * globalSpeed) + 0) * (0.4f * globalDegree) * f1) + (0f * f1);
        this.rightwing2.rotateAngleY = -1F * (MathHelper.cos(f * (0.6f * globalSpeed) + 0) * (0.4f * globalDegree) * f1) + (0f * f1);
    }
}
