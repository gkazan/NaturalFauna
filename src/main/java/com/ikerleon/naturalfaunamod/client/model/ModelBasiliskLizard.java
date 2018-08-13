package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Basilisk Lizard - M�rbis
 * Created using Tabula 7.0.0
 */
public class ModelBasiliskLizard extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer Neck1;
    public ModelRenderer Sail1;
    public ModelRenderer Foot11;
    public ModelRenderer Foot21;
    public ModelRenderer Tail1;
    public ModelRenderer Sail2;
    public ModelRenderer Foot31;
    public ModelRenderer Foot41;
    public ModelRenderer Tail2;
    public ModelRenderer Sail3;
    public ModelRenderer Tail3;
    public ModelRenderer Sail4;
    public ModelRenderer Tail4;
    public ModelRenderer Foot32;
    public ModelRenderer Foot33;
    public ModelRenderer Foot34;
    public ModelRenderer Foot35;
    public ModelRenderer Foot42;
    public ModelRenderer Foot43;
    public ModelRenderer Foot44;
    public ModelRenderer Foot45;
    public ModelRenderer Head;
    public ModelRenderer Mouthup;
    public ModelRenderer Mouthdown;
    public ModelRenderer EyePoint;
    public ModelRenderer HeadHorn1;
    public ModelRenderer HeadHorn2;
    public ModelRenderer Foot12;
    public ModelRenderer Foot13;
    public ModelRenderer Foot14;
    public ModelRenderer Foot15;
    public ModelRenderer Foot22;
    public ModelRenderer Foot23;
    public ModelRenderer Foot24;
    public ModelRenderer Foot25;

    public ModelBasiliskLizard() {
        this.textureWidth = 120;
        this.textureHeight = 70;
        this.Foot42 = new ModelRenderer(this, 50, 58);
        this.Foot42.setRotationPoint(0.0F, 4.4F, 0.0F);
        this.Foot42.addBox(-0.4F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Foot42, 0.0F, 0.0F, -1.5025539530419183F);
        this.Foot41 = new ModelRenderer(this, 50, 50);
        this.Foot41.setRotationPoint(-2.0F, 1.0F, 6.5F);
        this.Foot41.addBox(-0.2F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Foot41, 0.0F, 0.0F, 1.593485607070823F);
        this.Foot15 = new ModelRenderer(this, 40, 55);
        this.Foot15.setRotationPoint(-0.6F, 2.0F, 0.3F);
        this.Foot15.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot15, -1.4114477660878142F, 0.6829473363053812F, 0.0F);
        this.Foot31 = new ModelRenderer(this, 50, 50);
        this.Foot31.setRotationPoint(2.0F, 1.0F, 6.5F);
        this.Foot31.addBox(-0.2F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Foot31, 0.0F, 0.0F, -1.593485607070823F);
        this.Foot33 = new ModelRenderer(this, 40, 55);
        this.Foot33.setRotationPoint(-0.2F, 3.1F, 0.0F);
        this.Foot33.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot33, -1.4570008595648662F, -0.7740535232594852F, 0.0F);
        this.Foot24 = new ModelRenderer(this, 40, 55);
        this.Foot24.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.Foot24.addBox(-0.4F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot24, -1.4114477660878142F, 0.0F, 0.0F);
        this.Foot23 = new ModelRenderer(this, 40, 55);
        this.Foot23.setRotationPoint(-0.2F, 2.0F, -0.4F);
        this.Foot23.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot23, -1.4570008595648662F, -1.0016444577195458F, 0.0F);
        this.Sail1 = new ModelRenderer(this, 0, 37);
        this.Sail1.setRotationPoint(0.4F, -1.2F, 1.0F);
        this.Sail1.addBox(-0.5F, -3.2F, -0.7F, 0, 3, 7, 0.0F);
        this.Tail1 = new ModelRenderer(this, 47, 16);
        this.Tail1.setRotationPoint(-0.6F, 0.2F, 6.6F);
        this.Tail1.addBox(-1.5F, -1.3F, 0.0F, 4, 4, 6, 0.0F);
        this.Foot14 = new ModelRenderer(this, 40, 55);
        this.Foot14.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.Foot14.addBox(-0.4F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot14, -1.4114477660878142F, 0.0F, 0.0F);
        this.HeadHorn1 = new ModelRenderer(this, 38, 3);
        this.HeadHorn1.setRotationPoint(-0.4F, -0.9F, 0.0F);
        this.HeadHorn1.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 2, 0.0F);
        this.setRotateAngle(HeadHorn1, -0.5462880558742251F, 0.0F, 0.0F);
        this.Body1 = new ModelRenderer(this, 31, 29);
        this.Body1.setRotationPoint(0.0F, 19.1F, -5.6F);
        this.Body1.addBox(-2.5F, -1.5F, 0.0F, 5, 5, 7, 0.0F);
        this.Mouthdown = new ModelRenderer(this, 29, 21);
        this.Mouthdown.setRotationPoint(-0.6F, 1.5F, -2.8F);
        this.Mouthdown.addBox(-1.5F, 0.0F, -2.6F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Mouthdown, -0.27314402793711257F, 0.0F, 0.0F);
        this.Foot22 = new ModelRenderer(this, 50, 58);
        this.Foot22.setRotationPoint(0.6F, 1.6F, 0.7F);
        this.Foot22.addBox(-0.6F, 0.0F, -0.7F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot22, 0.045553093477052F, -0.091106186954104F, 0.9105382707654417F);
        this.Foot25 = new ModelRenderer(this, 40, 55);
        this.Foot25.setRotationPoint(-0.6F, 2.0F, 0.3F);
        this.Foot25.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot25, -1.4114477660878142F, 0.6829473363053812F, 0.0F);
        this.Foot13 = new ModelRenderer(this, 40, 55);
        this.Foot13.setRotationPoint(-0.2F, 2.0F, -0.4F);
        this.Foot13.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot13, -1.4570008595648662F, -1.0016444577195458F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 83, 26);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.6F);
        this.Tail3.addBox(-1.0F, -0.6F, 0.0F, 2, 2, 5, 0.0F);
        this.Foot34 = new ModelRenderer(this, 40, 55);
        this.Foot34.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.Foot34.addBox(-0.4F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot34, -1.4114477660878142F, 0.0F, 0.0F);
        this.Foot32 = new ModelRenderer(this, 50, 58);
        this.Foot32.setRotationPoint(0.5F, 4.4F, 0.0F);
        this.Foot32.addBox(-0.4F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Foot32, 0.0F, 0.0F, 1.5025539530419183F);
        this.Sail4 = new ModelRenderer(this, 0, 54);
        this.Sail4.setRotationPoint(0.0F, -1.0F, -0.7F);
        this.Sail4.addBox(0.0F, -3.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(Sail4, -0.36425021489121656F, 0.0F, 0.0F);
        this.Foot11 = new ModelRenderer(this, 50, 50);
        this.Foot11.setRotationPoint(-2.5F, 1.2F, 0.9F);
        this.Foot11.addBox(-0.2F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot11, 0.045553093477052F, 0.0F, 0.9560913642424937F);
        this.Neck1 = new ModelRenderer(this, 8, 26);
        this.Neck1.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Neck1.addBox(-1.5F, -1.0F, -4.3F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Neck1, -0.31869712141416456F, 0.0F, 0.0F);
        this.Tail4 = new ModelRenderer(this, 92, 19);
        this.Tail4.setRotationPoint(0.0F, -0.1F, 4.6F);
        this.Tail4.addBox(-0.5F, -0.3F, 0.0F, 1, 1, 6, 0.0F);
        this.Foot43 = new ModelRenderer(this, 40, 55);
        this.Foot43.setRotationPoint(-0.2F, 3.1F, 0.0F);
        this.Foot43.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot43, -1.4570008595648662F, -0.7740535232594852F, 0.0F);
        this.Foot21 = new ModelRenderer(this, 50, 50);
        this.Foot21.setRotationPoint(2.0F, 1.7F, 0.9F);
        this.Foot21.addBox(-0.2F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot21, 0.045553093477052F, 0.0F, -0.9560913642424937F);
        this.Sail3 = new ModelRenderer(this, 0, 48);
        this.Sail3.setRotationPoint(0.6F, -1.1F, 0.0F);
        this.Sail3.addBox(0.0F, -3.0F, 0.0F, 0, 3, 6, 0.0F);
        this.Mouthup = new ModelRenderer(this, 29, 14);
        this.Mouthup.setRotationPoint(-0.6F, 0.0F, -2.7F);
        this.Mouthup.addBox(-1.5F, -0.3F, -3.0F, 3, 2, 3, 0.0F);
        this.EyePoint = new ModelRenderer(this, 27, 8);
        this.EyePoint.setRotationPoint(-0.6F, 0.1F, -2.4F);
        this.EyePoint.addBox(-1.0F, -1.2F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(EyePoint, 0.12042771838760875F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 10, 15);
        this.Head.setRotationPoint(0.5F, -0.4F, -4.3F);
        this.Head.addBox(-2.5F, -1.2F, -3.0F, 4, 4, 4, 0.0F);
        this.Foot44 = new ModelRenderer(this, 40, 55);
        this.Foot44.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.Foot44.addBox(-0.4F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot44, -1.4114477660878142F, 0.0F, 0.0F);
        this.Foot12 = new ModelRenderer(this, 50, 58);
        this.Foot12.setRotationPoint(0.2F, 1.7F, 0.6F);
        this.Foot12.addBox(-0.6F, 0.0F, -0.7F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot12, 0.045553093477052F, -0.091106186954104F, -0.9105382707654417F);
        this.Body2 = new ModelRenderer(this, 57, 29);
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.7F);
        this.Body2.addBox(-2.5F, -1.5F, 0.0F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Body2, -0.136659280431156F, 0.0F, 0.0F);
        this.Foot45 = new ModelRenderer(this, 40, 55);
        this.Foot45.setRotationPoint(-0.7F, 3.1F, 0.2F);
        this.Foot45.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot45, -1.4114477660878142F, 0.7740535232594852F, 0.0F);
        this.Sail2 = new ModelRenderer(this, 0, 42);
        this.Sail2.setRotationPoint(0.0F, -1.4F, 0.0F);
        this.Sail2.addBox(0.0F, -3.0F, 0.0F, 0, 3, 7, 0.0F);
        this.Foot35 = new ModelRenderer(this, 40, 55);
        this.Foot35.setRotationPoint(-0.7F, 3.1F, 0.2F);
        this.Foot35.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot35, -1.4114477660878142F, 0.7740535232594852F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 71, 18);
        this.Tail2.setRotationPoint(0.4F, 0.0F, 5.5F);
        this.Tail2.addBox(-1.4F, -0.9F, 0.0F, 3, 3, 5, 0.0F);
        this.HeadHorn2 = new ModelRenderer(this, 27, 2);
        this.HeadHorn2.setRotationPoint(-0.4F, -1.0F, -2.0F);
        this.HeadHorn2.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(HeadHorn2, -0.5462880558742251F, 0.0F, 0.0F);
        this.Foot41.addChild(this.Foot42);
        this.Body2.addChild(this.Foot41);
        this.Foot12.addChild(this.Foot15);
        this.Body2.addChild(this.Foot31);
        this.Foot32.addChild(this.Foot33);
        this.Foot22.addChild(this.Foot24);
        this.Foot22.addChild(this.Foot23);
        this.Body1.addChild(this.Sail1);
        this.Body2.addChild(this.Tail1);
        this.Foot12.addChild(this.Foot14);
        this.Head.addChild(this.HeadHorn1);
        this.Head.addChild(this.Mouthdown);
        this.Foot21.addChild(this.Foot22);
        this.Foot22.addChild(this.Foot25);
        this.Foot12.addChild(this.Foot13);
        this.Tail2.addChild(this.Tail3);
        this.Foot32.addChild(this.Foot34);
        this.Foot31.addChild(this.Foot32);
        this.Tail2.addChild(this.Sail4);
        this.Body1.addChild(this.Foot11);
        this.Body1.addChild(this.Neck1);
        this.Tail3.addChild(this.Tail4);
        this.Foot42.addChild(this.Foot43);
        this.Body1.addChild(this.Foot21);
        this.Tail1.addChild(this.Sail3);
        this.Head.addChild(this.Mouthup);
        this.Head.addChild(this.EyePoint);
        this.Neck1.addChild(this.Head);
        this.Foot42.addChild(this.Foot44);
        this.Foot11.addChild(this.Foot12);
        this.Body1.addChild(this.Body2);
        this.Foot42.addChild(this.Foot45);
        this.Body2.addChild(this.Sail2);
        this.Foot32.addChild(this.Foot35);
        this.Tail1.addChild(this.Tail2);
        this.Head.addChild(this.HeadHorn2);
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

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}