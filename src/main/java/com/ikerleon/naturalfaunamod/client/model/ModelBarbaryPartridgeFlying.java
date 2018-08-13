package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Barbary Partridge - Mürbis
 * Created using Tabula 7.0.0
 */
public class ModelBarbaryPartridgeFlying extends AdvancedModelBase {
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer Wing11;
    public AdvancedModelRenderer Wing12;
    public AdvancedModelRenderer Foot11;
    public AdvancedModelRenderer Foot21;
    public AdvancedModelRenderer Tailfeather1;
    public AdvancedModelRenderer Tailfeather2;
    public AdvancedModelRenderer Tailfeather3;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Beak1;
    public AdvancedModelRenderer Beak2;
    public AdvancedModelRenderer Wing12_1;
    public AdvancedModelRenderer Wing22;
    public AdvancedModelRenderer Foot12;
    public AdvancedModelRenderer Claw1;
    public AdvancedModelRenderer Claw2;
    public AdvancedModelRenderer Claw3;
    public AdvancedModelRenderer Claw4;
    public AdvancedModelRenderer Foot22;
    public AdvancedModelRenderer Claw5;
    public AdvancedModelRenderer Claw6;
    public AdvancedModelRenderer Claw7;
    public AdvancedModelRenderer Claw8;

    public ModelBarbaryPartridgeFlying() {
        this.textureWidth = 120;
        this.textureHeight = 70;
        this.Wing11 = new AdvancedModelRenderer(this, 50, 50);
        this.Wing11.setRotationPoint(2.7F, 0.6F, 0.7F);
        this.Wing11.addBox(0.2F, -5.7F, -0.4F, 1, 6, 7, 0.0F);
        this.setRotateAngle(Wing11, -1.5481070465189704F, 0.0F, -1.6845917940249266F);
        this.Foot11 = new AdvancedModelRenderer(this, 0, 12);
        this.Foot11.setRotationPoint(-1.8F, 3.6F, 5.7F);
        this.Foot11.addBox(-1.0F, 0.0F, -0.9F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Foot11, 1.5025539530419183F, 0.0F, 0.0F);
        this.Claw8 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw8.setRotationPoint(-0.2F, 3.0F, 0.0F);
        this.Claw8.addBox(-0.5F, -0.3F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw8, 0.0F, -0.22759093446006054F, 0.0F);
        this.Claw6 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw6.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.Claw6.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw6, 0.22759093446006054F, 1.0927506446736497F, 0.0F);
        this.Beak1 = new AdvancedModelRenderer(this, 30, 11);
        this.Beak1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Beak1.addBox(-1.1F, -0.5F, -2.2F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Beak1, 0.27314402793711257F, 0.0F, 0.0F);
        this.Claw4 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw4.setRotationPoint(-0.2F, 3.0F, 0.0F);
        this.Claw4.addBox(-0.5F, -0.3F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw4, 0.0F, -0.22759093446006054F, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 64, 30);
        this.Neck1.setRotationPoint(0.0F, 1.6F, 2.0F);
        this.Neck1.addBox(-2.1F, -0.8F, -5.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Neck1, -0.27314402793711257F, 0.0F, 0.0F);
        this.Body2 = new AdvancedModelRenderer(this, 14, 28);
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.7F);
        this.Body2.addBox(-2.5F, -1.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Body2, 0.091106186954104F, 0.0F, 0.0F);
        this.Tailfeather2 = new AdvancedModelRenderer(this, 0, 58);
        this.Tailfeather2.setRotationPoint(0.8F, 0.0F, 3.6F);
        this.Tailfeather2.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.Claw5 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw5.addBox(-0.4F, -0.4F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw5, 0.22759093446006054F, -1.0927506446736497F, 0.0F);
        this.Claw1 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw1.addBox(-0.4F, -0.4F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw1, 0.22759093446006054F, -1.0927506446736497F, 0.0F);
        this.Claw7 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw7.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Claw7, 0.31869712141416456F, 0.0F, 0.0F);
        this.Foot12 = new AdvancedModelRenderer(this, 0, 20);
        this.Foot12.setRotationPoint(0.3F, 3.5F, 0.3F);
        this.Foot12.addBox(-0.8F, 0.0F, -0.4F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot12, -0.7740535232594852F, 0.0F, 0.0F);
        this.Foot21 = new AdvancedModelRenderer(this, 0, 12);
        this.Foot21.setRotationPoint(1.5F, 3.7F, 5.7F);
        this.Foot21.addBox(-1.0F, 0.0F, -0.9F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Foot21, 1.5481070465189704F, 0.0F, 0.0F);
        this.Beak2 = new AdvancedModelRenderer(this, 30, 5);
        this.Beak2.setRotationPoint(0.1F, 1.1F, -3.4F);
        this.Beak2.addBox(-0.7F, -0.5F, -1.6F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Beak2, -0.22759093446006054F, 0.0F, 0.0F);
        this.Body1 = new AdvancedModelRenderer(this, 36, 23);
        this.Body1.setRotationPoint(0.0F, 12.0F, -3.4F);
        this.Body1.addBox(-3.0F, -1.5F, 0.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(Body1, -0.091106186954104F, 0.0F, 0.0F);
        this.Wing12 = new AdvancedModelRenderer(this, 50, 50);
        this.Wing12.setRotationPoint(-2.6F, 0.6F, 0.7F);
        this.Wing12.addBox(-1.1F, -6.2F, -0.4F, 1, 6, 7, 0.0F);
        this.setRotateAngle(Wing12, -1.5481070465189704F, 0.0F, 1.6845917940249266F);
        this.Tailfeather1 = new AdvancedModelRenderer(this, 3, 39);
        this.Tailfeather1.setRotationPoint(1.0F, -0.2F, 3.1F);
        this.Tailfeather1.addBox(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
        this.Tailfeather3 = new AdvancedModelRenderer(this, 0, 48);
        this.Tailfeather3.setRotationPoint(-0.9F, 0.0F, 3.5F);
        this.Tailfeather3.addBox(-1.6F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.Claw2 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw2.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.Claw2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Claw2, 0.22759093446006054F, 1.0927506446736497F, 0.0F);
        this.Foot22 = new AdvancedModelRenderer(this, 0, 20);
        this.Foot22.setRotationPoint(0.3F, 3.5F, 0.3F);
        this.Foot22.addBox(-0.8F, 0.0F, -0.4F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot22, -0.7740535232594852F, 0.0F, 0.0F);
        this.Claw3 = new AdvancedModelRenderer(this, 0, 0);
        this.Claw3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Claw3.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Claw3, 0.31869712141416456F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 50, 8);
        this.Head.setRotationPoint(-0.6F, -0.3F, -5.8F);
        this.Head.addBox(-2.1F, -1.3F, -3.3F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, 0.40980330836826856F, 0.0F, 0.0F);
        this.Wing22 = new AdvancedModelRenderer(this, 59, 56);
        this.Wing22.setRotationPoint(-0.4F, -0.2F, 6.2F);
        this.Wing22.addBox(-0.6F, -4.0F, 0.0F, 1, 4, 10, 0.0F);
        this.Wing12_1 = new AdvancedModelRenderer(this, 58, 55);
        this.Wing12_1.setRotationPoint(0.0F, 0.2F, 6.6F);
        this.Wing12_1.addBox(0.0F, -4.0F, 0.0F, 1, 4, 10, 0.0F);
        this.Body1.addChild(this.Wing11);
        this.Body1.addChild(this.Foot11);
        this.Foot22.addChild(this.Claw8);
        this.Foot22.addChild(this.Claw6);
        this.Head.addChild(this.Beak1);
        this.Foot12.addChild(this.Claw4);
        this.Body1.addChild(this.Neck1);
        this.Body1.addChild(this.Body2);
        this.Body2.addChild(this.Tailfeather2);
        this.Foot22.addChild(this.Claw5);
        this.Foot12.addChild(this.Claw1);
        this.Foot22.addChild(this.Claw7);
        this.Foot11.addChild(this.Foot12);
        this.Body1.addChild(this.Foot21);
        this.Head.addChild(this.Beak2);
        this.Body1.addChild(this.Wing12);
        this.Body2.addChild(this.Tailfeather1);
        this.Body2.addChild(this.Tailfeather3);
        this.Foot12.addChild(this.Claw2);
        this.Foot21.addChild(this.Foot22);
        this.Foot12.addChild(this.Claw3);
        this.Neck1.addChild(this.Head);
        this.Wing12.addChild(this.Wing22);
        this.Wing11.addChild(this.Wing12_1);
        
        updateDefaultPose();
        
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
            float scaleFactor= 0.6F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.Body1.render(f5);
            GlStateManager.popMatrix();
    	}
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	resetToDefaultPose();
    	
    	float globalSpeed = 1.75f;
    	float globalDegree = 1F;
    	
    	walk(Wing11, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	walk(Wing12, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	flap(Wing11, 0.4f * globalSpeed, 0.7f * globalDegree, true, 0, 0f, f, f1);
    	flap(Wing12, 0.4f * globalSpeed, 0.7f * globalDegree, false, 0, 0f, f, f1);
    	flap(Wing12_1, 0.5f * globalSpeed, 0.35f * globalDegree, false, 0, 0f, f, f1);
    	flap(Wing22, 0.5f * globalSpeed, 0.35f * globalDegree, true, 0, 0f, f, f1);
 
    	walk(Tailfeather1, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    	walk(Tailfeather2, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    	walk(Tailfeather3, 0.2f * globalSpeed, 0.3f * globalDegree, true, 0f, 0f, f, f1);
    }
}
