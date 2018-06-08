package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * ModelPuffin - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuffinWater extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer neck;
    public ModelRenderer leftwing;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer rightwing;
    public ModelRenderer body2;
    public ModelRenderer bodyChildChild;
    public ModelRenderer peakbase;
    public ModelRenderer peaktop;
    public ModelRenderer rightfoot;
    public ModelRenderer leftfoot;
    public ModelRenderer tail1;
    public ModelRenderer tail2;

    public ModelPuffinWater() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tail1 = new ModelRenderer(this, 50, 5);
        this.tail1.setRotationPoint(1.0F, 0.4F, 2.0F);
        this.tail1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(tail1, -0.35499996985564664F, 0.0F, 0.0F);
        this.peaktop = new ModelRenderer(this, 11, 20);
        this.peaktop.setRotationPoint(-0.5F, -2.5F, -1.0F);
        this.peaktop.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peaktop, 0.2792526803190927F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 23, 1);
        this.rightleg.setRotationPoint(-0.3F, 2.5F, 1.3F);
        this.rightleg.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 1.0471975511965976F, 0.0F, 0.0F);
        this.bodyChildChild = new ModelRenderer(this, 1, 25);
        this.bodyChildChild.setRotationPoint(0.0F, -1.6F, -0.3F);
        this.bodyChildChild.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(bodyChildChild, -0.039968039870670144F, 0.0F, 0.0F);
        this.leftfoot = new ModelRenderer(this, 11, 1);
        this.leftfoot.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.leftfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.rightwing = new ModelRenderer(this, 14, 9);
        this.rightwing.setRotationPoint(-1.5F, -1.1F, 0.1F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(rightwing, -0.016057029118347832F, 0.0F, 0.0F);
        this.rightfoot = new ModelRenderer(this, 29, 1);
        this.rightfoot.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.rightfoot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.body = new ModelRenderer(this, 28, 24);
        this.body.setRotationPoint(0.0F, 18.3F, -1.4F);
        this.body.addBox(-1.5F, -1.1F, -0.9F, 3, 4, 4, 0.0F);
        this.setRotateAngle(body, -0.136659280431156F, 0.0F, -0.0017453292519943296F);
        this.leftwing = new ModelRenderer(this, 31, 9);
        this.leftwing.setRotationPoint(1.5F, -1.0F, 0.1F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
        this.setRotateAngle(leftwing, -0.016057029118347832F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 19, 27);
        this.neck.setRotationPoint(0.0F, 0.1F, 0.7F);
        this.neck.addBox(-1.0F, -2.4F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, 0.31869712141416456F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 52, 25);
        this.body2.setRotationPoint(-1.0F, -0.2F, 0.4F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.3042108886226116F, 0.0F, 0.0F);
        this.peakbase = new ModelRenderer(this, 1, 20);
        this.peakbase.setRotationPoint(-0.5F, -1.12F, -0.92F);
        this.peakbase.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(peakbase, -0.18203784098300857F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 53, 12);
        this.tail2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(tail2, -0.10227629416686772F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 18, 1);
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
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
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
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
