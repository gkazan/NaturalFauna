package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * American Bison - Mürbis
 * Created using Tabula 7.0.0
 */
public class ModelBison extends AdvancedModelBase {
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Back2;
    public AdvancedModelRenderer Back1;
    public AdvancedModelRenderer Foot11;
    public AdvancedModelRenderer Foot11_1;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Bud;
    public AdvancedModelRenderer Foot11_2;
    public AdvancedModelRenderer Foot11_3;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Foot12;
    public AdvancedModelRenderer Foot12_1;
    public AdvancedModelRenderer Foot12_2;
    public AdvancedModelRenderer Foot12_3;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Head2;
    public AdvancedModelRenderer Head3;
    public AdvancedModelRenderer Horn1;
    public AdvancedModelRenderer Horn2;
    public AdvancedModelRenderer Ear1;
    public AdvancedModelRenderer Ear2;
    public AdvancedModelRenderer Beart;
    public AdvancedModelRenderer Mouth;

    public ModelBison() {
        this.textureWidth = 120;
        this.textureHeight = 100;
        this.Ear2 = new AdvancedModelRenderer(this, 0, 10);
        this.Ear2.setRotationPoint(3.8F, 1.7F, -2.3F);
        this.Ear2.addBox(-2.2F, -1.2F, -0.6F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Ear2, 1.3658946726107624F, 0.0F, -2.6862362517444724F);
        this.Foot12 = new AdvancedModelRenderer(this, 54, 84);
        this.Foot12.setRotationPoint(0.0F, 5.8F, 2.3F);
        this.Foot12.addBox(-1.0F, 0.0F, -1.3F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Foot12, -0.31869712141416456F, 0.0F, 0.015009831567151233F);
        this.Tail3 = new AdvancedModelRenderer(this, 59, 55);
        this.Tail3.setRotationPoint(0.0F, -0.3F, 3.4F);
        this.Tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Tail3, -0.31869712141416456F, 0.0F, 0.0F);
        this.Horn1 = new AdvancedModelRenderer(this, 0, 0);
        this.Horn1.setRotationPoint(-3.5F, 0.5F, -4.0F);
        this.Horn1.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Horn1, 1.1383037381507017F, -0.4553564018453205F, -0.7740535232594852F);
        this.Bud = new AdvancedModelRenderer(this, 0, 55);
        this.Bud.setRotationPoint(0.0F, 0.0F, 8.8F);
        this.Bud.addBox(-3.1F, -2.9F, 0.0F, 6, 7, 2, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 50, 58);
        this.Tail1.setRotationPoint(0.0F, -1.0F, 1.2F);
        this.Tail1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail1, -0.5918411493512771F, 0.0F, 0.0F);
        this.Foot11 = new AdvancedModelRenderer(this, 0, 84);
        this.Foot11.setRotationPoint(4.2F, 4.0F, 1.1F);
        this.Foot11.addBox(-1.6F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Foot11, 0.27314402793711257F, 0.0F, 0.0F);
        this.Body2 = new AdvancedModelRenderer(this, 62, 59);
        this.Body2.setRotationPoint(0.8F, 0.4F, 15.0F);
        this.Body2.addBox(-5.8F, -4.8F, 0.0F, 10, 12, 9, 0.0F);
        this.setRotateAngle(Body2, -0.045553093477052F, 0.0F, 0.0F);
        this.Foot12_3 = new AdvancedModelRenderer(this, 19, 84);
        this.Foot12_3.setRotationPoint(-2.1F, 5.8F, 2.2F);
        this.Foot12_3.addBox(-1.0F, 0.0F, -1.3F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Foot12_3, -0.31869712141416456F, 0.0F, 0.015009831567151233F);
        this.Horn2 = new AdvancedModelRenderer(this, 0, 0);
        this.Horn2.setRotationPoint(3.7F, 0.5F, -4.5F);
        this.Horn2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Horn2, 1.1383037381507017F, 0.4553564018453205F, 0.7740535232594852F);
        this.Head3 = new AdvancedModelRenderer(this, 32, 4);
        this.Head3.setRotationPoint(0.0F, 0.7F, -6.0F);
        this.Head3.addBox(-3.8F, -1.0F, -1.6F, 8, 6, 4, 0.0F);
        this.setRotateAngle(Head3, -0.5462880558742251F, 0.0F, 0.0F);
        this.Head1 = new AdvancedModelRenderer(this, 0, 24);
        this.Head1.setRotationPoint(-0.1F, -0.6F, -1.7F);
        this.Head1.addBox(-4.3F, -2.1F, -7.0F, 9, 11, 7, 0.0F);
        this.setRotateAngle(Head1, -0.045553093477052F, 0.0F, 0.0F);
        this.Foot11_2 = new AdvancedModelRenderer(this, 35, 84);
        this.Foot11_2.setRotationPoint(3.1F, 3.2F, 1.1F);
        this.Foot11_2.addBox(-1.6F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Foot11_2, 0.27314402793711257F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 86, 2);
        this.Neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck.addBox(-3.6F, -3.6F, -3.0F, 7, 11, 3, 0.0F);
        this.Head2 = new AdvancedModelRenderer(this, 0, 10);
        this.Head2.setRotationPoint(0.3F, -0.3F, -4.0F);
        this.Head2.addBox(-5.1F, -4.0F, -3.6F, 10, 4, 7, 0.0F);
        this.Beart = new AdvancedModelRenderer(this, 9, 26);
        this.Beart.setRotationPoint(0.0F, 5.5F, -3.9F);
        this.Beart.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Beart, -0.8651597102135892F, 0.0F, 0.0F);
        this.Foot11_3 = new AdvancedModelRenderer(this, 35, 84);
        this.Foot11_3.setRotationPoint(-4.2F, 3.4F, 1.1F);
        this.Foot11_3.addBox(-2.4F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Foot11_3, 0.27314402793711257F, 0.0F, 0.0F);
        this.Foot12_2 = new AdvancedModelRenderer(this, 19, 84);
        this.Foot12_2.setRotationPoint(0.0F, 5.8F, 2.3F);
        this.Foot12_2.addBox(-1.0F, 0.0F, -1.3F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Foot12_2, -0.31869712141416456F, 0.0F, 0.015009831567151233F);
        this.Body1 = new AdvancedModelRenderer(this, 0, 53);
        this.Body1.setRotationPoint(0.0F, 7.1F, -11.7F);
        this.Body1.addBox(-6.0F, -5.3F, 0.0F, 12, 14, 15, 0.0F);
        this.Mouth = new AdvancedModelRenderer(this, 59, 4);
        this.Mouth.setRotationPoint(0.0F, 4.1F, -0.4F);
        this.Mouth.addBox(-3.8F, 0.0F, -1.5F, 8, 3, 3, 0.0F);
        this.setRotateAngle(Mouth, 0.6373942428283291F, 0.0F, 0.0F);
        this.Back2 = new AdvancedModelRenderer(this, 74, 38);
        this.Back2.setRotationPoint(0.0F, -4.4F, 0.7F);
        this.Back2.addBox(-5.4F, -0.7F, -0.1F, 11, 6, 10, 0.0F);
        this.setRotateAngle(Back2, 0.5462880558742251F, 0.0F, 0.0F);
        this.Foot11_1 = new AdvancedModelRenderer(this, 0, 84);
        this.Foot11_1.setRotationPoint(-3.1F, 4.0F, 1.1F);
        this.Foot11_1.addBox(-3.7F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Foot11_1, 0.27314402793711257F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 50, 58);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 3.5F);
        this.Tail2.addBox(-0.5F, -0.8F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail2, -0.7740535232594852F, 0.0F, 0.0F);
        this.Back1 = new AdvancedModelRenderer(this, 49, 25);
        this.Back1.setRotationPoint(0.0F, -3.8F, 17.5F);
        this.Back1.addBox(-4.9F, -10.2F, -5.3F, 10, 8, 5, 0.0F);
        this.setRotateAngle(Back1, 0.9560913642424937F, 0.0F, 0.0F);
        this.Ear1 = new AdvancedModelRenderer(this, 0, 10);
        this.Ear1.setRotationPoint(-3.8F, 0.8F, -2.7F);
        this.Ear1.addBox(-2.2F, -1.2F, -0.6F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Ear1, 1.9577358219620393F, 0.091106186954104F, -0.36425021489121656F);
        this.Foot12_1 = new AdvancedModelRenderer(this, 54, 84);
        this.Foot12_1.setRotationPoint(-0.9F, 5.8F, 2.3F);
        this.Foot12_1.addBox(-1.0F, 0.0F, -1.3F, 3, 8, 4, 0.0F);
        this.setRotateAngle(Foot12_1, -0.31869712141416456F, 0.0F, 0.015009831567151233F);
        this.Head1.addChild(this.Ear2);
        this.Foot11_2.addChild(this.Foot12);
        this.Tail2.addChild(this.Tail3);
        this.Head1.addChild(this.Horn1);
        this.Body2.addChild(this.Bud);
        this.Bud.addChild(this.Tail1);
        this.Body1.addChild(this.Foot11);
        this.Body1.addChild(this.Body2);
        this.Foot11_1.addChild(this.Foot12_3);
        this.Head1.addChild(this.Horn2);
        this.Head1.addChild(this.Head3);
        this.Neck.addChild(this.Head1);
        this.Body2.addChild(this.Foot11_2);
        this.Body1.addChild(this.Neck);
        this.Head1.addChild(this.Head2);
        this.Head1.addChild(this.Beart);
        this.Body2.addChild(this.Foot11_3);
        this.Foot11.addChild(this.Foot12_2);
        this.Head3.addChild(this.Mouth);
        this.Body1.addChild(this.Back2);
        this.Body1.addChild(this.Foot11_1);
        this.Tail1.addChild(this.Tail2);
        this.Body1.addChild(this.Back1);
        this.Head1.addChild(this.Ear1);
        this.Foot11_3.addChild(this.Foot12_1);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.8F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.Body1.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 1.5F;
    	
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

    	float globalSpeed = 1f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.25F;
    	
        this.Head1.rotateAngleY = (f3 * 0.017453292F);
        this.Head1.rotateAngleX = (f4 * 0.017453292F);
    	
    	bob(Body1, 0.3F * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(Foot11, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(Foot11_1, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(Foot11_2, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Foot11_3, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(Foot12, 0.3f * globalSpeed, 0.1f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Foot12_1, 0.3f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(Foot12_2, 0.3f * globalSpeed, 0.1f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(Foot12_3, 0.3f * globalSpeed, 0.1f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(Neck, 0.5f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	
    	walk(Neck, 0.1f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F); 
    	walk(Back1, 0.1f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F); 
    	
    	swing(Tail1, 0.1f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(Tail2, 0.07f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(Tail3, 0.1f, 0.3f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}
