package com.ikerleon.naturalfaunamod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelCamel extends ModelBase {
    public ModelRenderer tails;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape2;
    public ModelRenderer shape1;
    public ModelRenderer shape16;
    public ModelRenderer shape17;
    public ModelRenderer shape12;
    public ModelRenderer shape8;
    public ModelRenderer shape15;
    public ModelRenderer shape9;
    public ModelRenderer shape14;
    public ModelRenderer shape10;
    public ModelRenderer shape11;
    public ModelRenderer shape13;

    public ModelCamel() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shape15 = new ModelRenderer(this, 55, 2);
        this.shape15.setRotationPoint(12.0F, 11.0F, 4.0F);
        this.shape15.addBox(-1.5F, 0.0F, -1.5F, 3, 15, 3, 0.0F);
        this.setRotateAngle(shape15, -0.08726646259971647F, 0.0F, 0.0F);
        this.shape9 = new ModelRenderer(this, 51, 24);
        this.shape9.setRotationPoint(10.0F, 8.0F, 4.0F);
        this.shape9.addBox(0.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.shape3 = new ModelRenderer(this, 98, 3);
        this.shape3.setRotationPoint(6.0F, 1.4F, -3.5F);
        this.shape3.addBox(-3.0F, -3.9F, -6.8F, 6, 4, 8, 0.0F);
        this.setRotateAngle(shape3, 0.5759586531581287F, 0.0F, 0.0F);
        this.shape12 = new ModelRenderer(this, 72, 2);
        this.shape12.setRotationPoint(0.0F, 11.0F, 4.0F);
        this.shape12.addBox(-1.5F, 0.0F, -1.5F, 3, 15, 3, 0.0F);
        this.setRotateAngle(shape12, -0.08726646259971647F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 38, 2);
        this.shape14.setRotationPoint(0.0F, 11.0F, 16.0F);
        this.shape14.addBox(-1.5F, 0.0F, -1.5F, 3, 15, 3, 0.0F);
        this.setRotateAngle(shape14, 0.08726646259971647F, 0.0F, 0.0F);
        this.shape10 = new ModelRenderer(this, 33, 24);
        this.shape10.setRotationPoint(2.0F, 8.0F, 16.0F);
        this.shape10.addBox(-4.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.shape11 = new ModelRenderer(this, 15, 25);
        this.shape11.setRotationPoint(10.0F, 8.0F, 16.0F);
        this.shape11.addBox(0.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.tails = new ModelRenderer(this, 80, 80);
        this.tails.setRotationPoint(6.0F, 5.0F, 19.5F);
        this.tails.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tails, -0.4326671215693943F, 0.0F, 0.0F);
        this.shape17 = new ModelRenderer(this, 103, 69);
        this.shape17.setRotationPoint(3.0F, 0.0F, 10.0F);
        this.shape17.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.shape16 = new ModelRenderer(this, 102, 82);
        this.shape16.setRotationPoint(3.0F, 0.0F, 2.0F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.shape5 = new ModelRenderer(this, 90, 12);
        this.shape5.setRotationPoint(7.6F, -2.0F, -5.2F);
        this.shape5.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape5, 0.5759586531581287F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 71, 24);
        this.shape8.setRotationPoint(2.0F, 8.0F, 4.0F);
        this.shape8.addBox(-4.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.shape2 = new ModelRenderer(this, 102, 20);
        this.shape2.setRotationPoint(6.0F, 4.8F, 0.0F);
        this.shape2.addBox(-3.0F, -6.0F, -3.5F, 6, 10, 4, 0.0F);
        this.setRotateAngle(shape2, 0.6373942428283291F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 90, 5);
        this.shape4.setRotationPoint(4.3F, -2.0F, -5.2F);
        this.shape4.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape4, 0.5759586531581287F, 0.0F, 0.0F);
        this.shape13 = new ModelRenderer(this, 20, 2);
        this.shape13.setRotationPoint(12.0F, 11.0F, 16.0F);
        this.shape13.addBox(-1.5F, 0.0F, -1.5F, 3, 15, 3, 0.0F);
        this.setRotateAngle(shape13, 0.08726646259971647F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 58, 95);
        this.shape1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 12, 10, 20, 0.0F);
        this.setRotateAngle(shape1, 0.0F, 0.01658062789394613F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor= 1.5F;
    	
    	GL11.glPushMatrix();
		GL11.glTranslatef(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
        this.shape15.render(f5);
        this.shape9.render(f5);
        this.shape3.render(f5);
        this.shape12.render(f5);
        this.shape14.render(f5);
        this.shape10.render(f5);
        this.shape11.render(f5);
        this.tails.render(f5);
        this.shape17.render(f5);
        this.shape16.render(f5);
        this.shape5.render(f5);
        this.shape8.render(f5);
        this.shape2.render(f5);
        this.shape4.render(f5);
        this.shape13.render(f5);
        this.shape1.render(f5);
        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
