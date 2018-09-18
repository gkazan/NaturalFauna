package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Xenopus - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelXenopus extends BookwormModelBase {
    public BookwormModelRenderer shape1;
    public BookwormModelRenderer shape3;
    public BookwormModelRenderer shape4;
    public BookwormModelRenderer shape2;
    public BookwormModelRenderer shape5;
    public BookwormModelRenderer shape8;
    public BookwormModelRenderer shape6;
    public BookwormModelRenderer shape9;
    public BookwormModelRenderer shape12;
    public BookwormModelRenderer shape13;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape10;
    public BookwormModelRenderer shape11;
    public BookwormModelRenderer shape15;

    public ModelXenopus() {
        this.textureWidth = 125;
        this.textureHeight = 125;
        this.shape9 = new BookwormModelRenderer(this, 6, 30, "shape9");
        this.shape9.setRotationPoint(-1.3F, 23.6F, 0.4F);
        this.shape9.addBox(0.0F, 0.0F, -1.7F, 3, 0, 2, 0.0F);
        this.setRotateAngle(shape9, 0.31869712141416456F, -2.6862362517444724F, -0.136659280431156F);
        this.shape10 = new BookwormModelRenderer(this, 21, 17, "shape10");
        this.shape10.setRotationPoint(0.5F, 23.5F, -0.7F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape10, 1.730144887501979F, 1.2292353921796064F, -0.045553093477052F);
        this.shape6 = new BookwormModelRenderer(this, 8, 17, "shape6");
        this.shape6.mirror = true;
        this.shape6.setRotationPoint(-0.3F, 23.2F, 0.9F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape6, 0.9105382707654417F, 4.086862976469922F, 0.10279989294246601F);
        this.shape14 = new BookwormModelRenderer(this, 29, 32, "shape14");
        this.shape14.setRotationPoint(-2.0F, 23.4F, -1.2F);
        this.shape14.addBox(0.0F, 0.0F, -1.7F, 4, 0, 3, 0.0F);
        this.setRotateAngle(shape14, 0.0F, -3.050486466635689F, -0.136659280431156F);
        this.shape12 = new BookwormModelRenderer(this, 31, 17, "shape12");
        this.shape12.setRotationPoint(-0.7F, 23.5F, -1.1F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape12, 1.730144887501979F, -1.2747884856566583F, -0.045553093477052F);
        this.shape13 = new BookwormModelRenderer(this, 31, 25, "shape13");
        this.shape13.setRotationPoint(-1.3F, 23.3F, -0.7F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape13, 1.3203415791337103F, -2.5497515042385164F, 0.0F);
        this.shape3 = new BookwormModelRenderer(this, 53, 5, "shape3");
        this.shape3.setRotationPoint(0.0F, 23.0F, 1.8F);
        this.shape3.addBox(-1.0F, -0.5F, -1.4F, 2, 1, 2, 0.0F);
        this.setRotateAngle(shape3, -0.091106186954104F, 0.0F, 0.0F);
        this.shape2 = new BookwormModelRenderer(this, 36, 2, "shape2");
        this.shape2.setRotationPoint(0.3F, 22.4F, 1.4F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape2, -0.33562681515850956F, 0.0F, 0.0F);
        this.shape11 = new BookwormModelRenderer(this, 21, 25, "shape11");
        this.shape11.setRotationPoint(1.5F, 23.3F, -0.4F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(shape11, 1.3203415791337103F, 2.504198410761464F, 0.0F);
        this.shape1 = new BookwormModelRenderer(this, 22, 5, "shape1");
        this.shape1.setRotationPoint(0.0F, 23.0F, 0.1F);
        this.shape1.addBox(-1.0F, -0.5F, -1.5F, 2, 1, 3, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 43, 2, "shape4");
        this.shape4.setRotationPoint(-0.7F, 22.4F, 1.4F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape4, -0.33562681515850956F, 0.0F, 0.0F);
        this.shape8 = new BookwormModelRenderer(this, 4, 24, "shape8");
        this.shape8.setRotationPoint(1.2F, 23.6F, 0.3F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
        this.setRotateAngle(shape8, -0.22759093446006054F, -0.31869712141416456F, 0.22759093446006054F);
        this.shape15 = new BookwormModelRenderer(this, 17, 32, "shape15");
        this.shape15.setRotationPoint(2.0F, 23.4F, -1.2F);
        this.shape15.addBox(0.0F, 0.0F, -1.7F, 4, 0, 3, 0.0F);
        this.setRotateAngle(shape15, 0.0F, -3.050486466635689F, -3.050486466635689F);
        this.shape5 = new BookwormModelRenderer(this, 2, 17, "shape5");
        this.shape5.setRotationPoint(0.5F, 23.2F, 1.3F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape5, 0.9105382707654417F, 2.1954496660836673F, -0.10646508437165408F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape9.offsetX, this.shape9.offsetY, this.shape9.offsetZ);
        GlStateManager.translate(this.shape9.rotationPointX * f5, this.shape9.rotationPointY * f5, this.shape9.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape9.offsetX, -this.shape9.offsetY, -this.shape9.offsetZ);
        GlStateManager.translate(-this.shape9.rotationPointX * f5, -this.shape9.rotationPointY * f5, -this.shape9.rotationPointZ * f5);
        this.shape9.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape10.offsetX, this.shape10.offsetY, this.shape10.offsetZ);
        GlStateManager.translate(this.shape10.rotationPointX * f5, this.shape10.rotationPointY * f5, this.shape10.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape10.offsetX, -this.shape10.offsetY, -this.shape10.offsetZ);
        GlStateManager.translate(-this.shape10.rotationPointX * f5, -this.shape10.rotationPointY * f5, -this.shape10.rotationPointZ * f5);
        this.shape10.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape6.offsetX, this.shape6.offsetY, this.shape6.offsetZ);
        GlStateManager.translate(this.shape6.rotationPointX * f5, this.shape6.rotationPointY * f5, this.shape6.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape6.offsetX, -this.shape6.offsetY, -this.shape6.offsetZ);
        GlStateManager.translate(-this.shape6.rotationPointX * f5, -this.shape6.rotationPointY * f5, -this.shape6.rotationPointZ * f5);
        this.shape6.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape14.offsetX, this.shape14.offsetY, this.shape14.offsetZ);
        GlStateManager.translate(this.shape14.rotationPointX * f5, this.shape14.rotationPointY * f5, this.shape14.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape14.offsetX, -this.shape14.offsetY, -this.shape14.offsetZ);
        GlStateManager.translate(-this.shape14.rotationPointX * f5, -this.shape14.rotationPointY * f5, -this.shape14.rotationPointZ * f5);
        this.shape14.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12.offsetX, this.shape12.offsetY, this.shape12.offsetZ);
        GlStateManager.translate(this.shape12.rotationPointX * f5, this.shape12.rotationPointY * f5, this.shape12.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape12.offsetX, -this.shape12.offsetY, -this.shape12.offsetZ);
        GlStateManager.translate(-this.shape12.rotationPointX * f5, -this.shape12.rotationPointY * f5, -this.shape12.rotationPointZ * f5);
        this.shape12.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape13.offsetX, this.shape13.offsetY, this.shape13.offsetZ);
        GlStateManager.translate(this.shape13.rotationPointX * f5, this.shape13.rotationPointY * f5, this.shape13.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape13.offsetX, -this.shape13.offsetY, -this.shape13.offsetZ);
        GlStateManager.translate(-this.shape13.rotationPointX * f5, -this.shape13.rotationPointY * f5, -this.shape13.rotationPointZ * f5);
        this.shape13.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape3.offsetX, this.shape3.offsetY, this.shape3.offsetZ);
        GlStateManager.translate(this.shape3.rotationPointX * f5, this.shape3.rotationPointY * f5, this.shape3.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.8D, 0.6D);
        GlStateManager.translate(-this.shape3.offsetX, -this.shape3.offsetY, -this.shape3.offsetZ);
        GlStateManager.translate(-this.shape3.rotationPointX * f5, -this.shape3.rotationPointY * f5, -this.shape3.rotationPointZ * f5);
        this.shape3.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape2.offsetX, this.shape2.offsetY, this.shape2.offsetZ);
        GlStateManager.translate(this.shape2.rotationPointX * f5, this.shape2.rotationPointY * f5, this.shape2.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape2.offsetX, -this.shape2.offsetY, -this.shape2.offsetZ);
        GlStateManager.translate(-this.shape2.rotationPointX * f5, -this.shape2.rotationPointY * f5, -this.shape2.rotationPointZ * f5);
        this.shape2.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape11.offsetX, this.shape11.offsetY, this.shape11.offsetZ);
        GlStateManager.translate(this.shape11.rotationPointX * f5, this.shape11.rotationPointY * f5, this.shape11.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape11.offsetX, -this.shape11.offsetY, -this.shape11.offsetZ);
        GlStateManager.translate(-this.shape11.rotationPointX * f5, -this.shape11.rotationPointY * f5, -this.shape11.rotationPointZ * f5);
        this.shape11.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape1.offsetX, this.shape1.offsetY, this.shape1.offsetZ);
        GlStateManager.translate(this.shape1.rotationPointX * f5, this.shape1.rotationPointY * f5, this.shape1.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 1.0D, 0.8D);
        GlStateManager.translate(-this.shape1.offsetX, -this.shape1.offsetY, -this.shape1.offsetZ);
        GlStateManager.translate(-this.shape1.rotationPointX * f5, -this.shape1.rotationPointY * f5, -this.shape1.rotationPointZ * f5);
        this.shape1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape4.offsetX, this.shape4.offsetY, this.shape4.offsetZ);
        GlStateManager.translate(this.shape4.rotationPointX * f5, this.shape4.rotationPointY * f5, this.shape4.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape4.offsetX, -this.shape4.offsetY, -this.shape4.offsetZ);
        GlStateManager.translate(-this.shape4.rotationPointX * f5, -this.shape4.rotationPointY * f5, -this.shape4.rotationPointZ * f5);
        this.shape4.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape8.offsetX, this.shape8.offsetY, this.shape8.offsetZ);
        GlStateManager.translate(this.shape8.rotationPointX * f5, this.shape8.rotationPointY * f5, this.shape8.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape8.offsetX, -this.shape8.offsetY, -this.shape8.offsetZ);
        GlStateManager.translate(-this.shape8.rotationPointX * f5, -this.shape8.rotationPointY * f5, -this.shape8.rotationPointZ * f5);
        this.shape8.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape15.offsetX, this.shape15.offsetY, this.shape15.offsetZ);
        GlStateManager.translate(this.shape15.rotationPointX * f5, this.shape15.rotationPointY * f5, this.shape15.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape15.offsetX, -this.shape15.offsetY, -this.shape15.offsetZ);
        GlStateManager.translate(-this.shape15.rotationPointX * f5, -this.shape15.rotationPointY * f5, -this.shape15.rotationPointZ * f5);
        this.shape15.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape5.offsetX, this.shape5.offsetY, this.shape5.offsetZ);
        GlStateManager.translate(this.shape5.rotationPointX * f5, this.shape5.rotationPointY * f5, this.shape5.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.4D);
        GlStateManager.translate(-this.shape5.offsetX, -this.shape5.offsetY, -this.shape5.offsetZ);
        GlStateManager.translate(-this.shape5.rotationPointX * f5, -this.shape5.rotationPointY * f5, -this.shape5.rotationPointZ * f5);
        this.shape5.render(f5);
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
}
