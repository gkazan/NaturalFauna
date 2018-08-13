package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Axolotl - M�rbis
 * Created using Tabula 7.0.0
 */
public class ModelAxolotl extends AdvancedModelBase {
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Foot11;
    public AdvancedModelRenderer Foot21;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Foot31;
    public AdvancedModelRenderer Foot41;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer TailSail4;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer TailSail1;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer TailSail2;
    public AdvancedModelRenderer TailSail3;
    public AdvancedModelRenderer Foot32;
    public AdvancedModelRenderer Foot33;
    public AdvancedModelRenderer Foot34;
    public AdvancedModelRenderer Foot35;
    public AdvancedModelRenderer Foot42;
    public AdvancedModelRenderer Foot43;
    public AdvancedModelRenderer Foot44;
    public AdvancedModelRenderer Foot45;
    public AdvancedModelRenderer HeadMain;
    public AdvancedModelRenderer Mouth;
    public AdvancedModelRenderer Headside1;
    public AdvancedModelRenderer Headside1_1;
    public AdvancedModelRenderer Headthing1;
    public AdvancedModelRenderer Headthing12;
    public AdvancedModelRenderer Headthing3;
    public AdvancedModelRenderer Headthing4;
    public AdvancedModelRenderer Headthing5;
    public AdvancedModelRenderer Headthing6;
    public AdvancedModelRenderer Headside12;
    public AdvancedModelRenderer Headside12_1;
    public AdvancedModelRenderer HeadLeather1;
    public AdvancedModelRenderer HeadLeather2;
    public AdvancedModelRenderer Foot12;
    public AdvancedModelRenderer Foot13;
    public AdvancedModelRenderer Foot14;
    public AdvancedModelRenderer Foot15;
    public AdvancedModelRenderer Foot22;
    public AdvancedModelRenderer Foot23;
    public AdvancedModelRenderer Foot24;
    public AdvancedModelRenderer Foot25;

    public ModelAxolotl() {
        this.textureWidth = 150;
        this.textureHeight = 70;
        this.HeadLeather2 = new AdvancedModelRenderer(this, 2, 11);
        this.HeadLeather2.setRotationPoint(0.5F, 3.3F, 0.4F);
        this.HeadLeather2.addBox(0.0F, -6.8F, 0.0F, 8, 8, 0, 0.0F);
        this.setRotateAngle(HeadLeather2, 0.0F, 0.0F, -1.5481070465189704F);
        this.Foot22 = new AdvancedModelRenderer(this, 50, 58);
        this.Foot22.setRotationPoint(0.6F, 3.3F, 0.0F);
        this.Foot22.addBox(-1.2F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Foot22, 0.18203784098300857F, 0.0F, 0.9105382707654417F);
        this.Tail1 = new AdvancedModelRenderer(this, 84, 21);
        this.Tail1.setRotationPoint(-0.1F, 0.6F, 5.2F);
        this.Tail1.addBox(-2.0F, -1.1F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Tail1, 0.091106186954104F, 0.0F, 0.0F);
        this.TailSail4 = new AdvancedModelRenderer(this, 32, 37);
        this.TailSail4.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.TailSail4.addBox(0.0F, -1.5F, 0.0F, 0, 2, 5, 0.0F);
        this.setRotateAngle(TailSail4, 0.045553093477052F, 0.0F, 0.0F);
        this.Foot14 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot14.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Foot14.addBox(-0.4F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot14, -1.4570008595648662F, 0.0F, 0.0F);
        this.Foot31 = new AdvancedModelRenderer(this, 50, 50);
        this.Foot31.setRotationPoint(-1.1F, 1.7F, 4.2F);
        this.Foot31.addBox(-2.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Foot31, 0.27314402793711257F, 0.0F, 0.8196066167365371F);
        this.Foot45 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot45.setRotationPoint(-1.3F, 2.0F, 0.3F);
        this.Foot45.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot45, -1.4570008595648662F, 0.6829473363053812F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 105, 20);
        this.Tail2.setRotationPoint(-0.1F, 0.4F, 4.6F);
        this.Tail2.addBox(-1.4F, -1.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Tail2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Body2 = new AdvancedModelRenderer(this, 60, 20);
        this.Body2.setRotationPoint(-0.5F, -0.3F, 7.0F);
        this.Body2.addBox(-2.5F, -0.9F, -0.1F, 5, 5, 6, 0.0F);
        this.setRotateAngle(Body2, -0.045553093477052F, 0.0F, 0.0F);
        this.Foot24 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot24.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Foot24.addBox(-0.4F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot24, -1.4114477660878142F, 0.0F, 0.0F);
        this.Foot35 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot35.setRotationPoint(-1.3F, 2.0F, 0.3F);
        this.Foot35.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot35, -1.6845917940249266F, 0.6829473363053812F, 0.0F);
        this.TailSail1 = new AdvancedModelRenderer(this, 20, 41);
        this.TailSail1.setRotationPoint(0.0F, -0.2F, 0.2F);
        this.TailSail1.addBox(0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(TailSail1, -0.091106186954104F, 0.0F, 0.0F);
        this.TailSail2 = new AdvancedModelRenderer(this, 21, 33);
        this.TailSail2.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.TailSail2.addBox(0.0F, -2.0F, 0.0F, 0, 4, 4, 0.0F);
        this.setRotateAngle(TailSail2, 0.045553093477052F, 0.0F, 0.0F);
        this.Foot42 = new AdvancedModelRenderer(this, 50, 58);
        this.Foot42.setRotationPoint(0.3F, 3.3F, 0.0F);
        this.Foot42.addBox(-1.2F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Foot42, -0.36425021489121656F, 0.0F, 0.8196066167365371F);
        this.Headthing6 = new AdvancedModelRenderer(this, 0, 0);
        this.Headthing6.setRotationPoint(-4.2F, 1.3F, -0.8F);
        this.Headthing6.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Headthing6, 0.0F, 0.0F, -0.9560913642424937F);
        this.Neck = new AdvancedModelRenderer(this, 10, 23);
        this.Neck.setRotationPoint(0.0F, 0.1F, 0.5F);
        this.Neck.addBox(-3.0F, -1.3F, -3.0F, 5, 5, 3, 0.0F);
        this.Foot44 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot44.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Foot44.addBox(-0.4F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot44, -1.6390387005478748F, 0.0F, 0.0F);
        this.Headthing3 = new AdvancedModelRenderer(this, 0, 0);
        this.Headthing3.setRotationPoint(3.4F, 0.1F, -0.8F);
        this.Headthing3.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Headthing3, 0.0F, 0.0F, 0.9560913642424937F);
        this.HeadMain = new AdvancedModelRenderer(this, 55, 0);
        this.HeadMain.setRotationPoint(-0.4F, 0.0F, -2.6F);
        this.HeadMain.addBox(-3.0F, -1.6F, -4.0F, 6, 4, 4, 0.0F);
        this.Foot33 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot33.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Foot33.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot33, -1.5481070465189704F, -1.0016444577195458F, 0.0F);
        this.Headside1 = new AdvancedModelRenderer(this, 40, 0);
        this.Headside1.setRotationPoint(0.1F, 0.7F, -1.6F);
        this.Headside1.addBox(-4.0F, -2.1F, 0.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(Headside1, 0.0F, -0.6829473363053812F, 0.0F);
        this.Foot32 = new AdvancedModelRenderer(this, 50, 58);
        this.Foot32.setRotationPoint(-1.4F, 3.3F, 0.0F);
        this.Foot32.addBox(-1.2F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Foot32, 0.045553093477052F, 0.0F, -0.9560913642424937F);
        this.Foot34 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot34.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Foot34.addBox(-0.4F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot34, -1.593485607070823F, 0.0F, 0.0F);
        this.Foot13 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot13.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Foot13.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot13, -1.5481070465189704F, -1.0016444577195458F, 0.0F);
        this.Headside1_1 = new AdvancedModelRenderer(this, 80, 0);
        this.Headside1_1.setRotationPoint(-1.0F, 0.6F, -2.3F);
        this.Headside1_1.addBox(-4.1F, -2.0F, 1.2F, 3, 4, 2, 0.0F);
        this.setRotateAngle(Headside1_1, 0.0F, -0.6829473363053812F, 3.141592653589793F);
        this.Headside12_1 = new AdvancedModelRenderer(this, 97, 0);
        this.Headside12_1.setRotationPoint(-1.7F, -0.9F, 1.3F);
        this.Headside12_1.addBox(-3.0F, -1.1F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Headside12_1, 0.0F, 0.6373942428283291F, 0.0F);
        this.Headthing4 = new AdvancedModelRenderer(this, 0, 0);
        this.Headthing4.setRotationPoint(-2.8F, -1.1F, -0.6F);
        this.Headthing4.addBox(0.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Headthing4, 0.0F, 0.0F, 0.18203784098300857F);
        this.Foot15 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot15.setRotationPoint(-1.3F, 2.0F, 0.3F);
        this.Foot15.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot15, -1.5481070465189704F, 0.6829473363053812F, 0.0F);
        this.Headthing12 = new AdvancedModelRenderer(this, 0, 0);
        this.Headthing12.setRotationPoint(3.0F, -1.6F, -1.1F);
        this.Headthing12.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Headthing12, 0.0F, 0.0F, 0.5009094953223726F);
        this.Headthing1 = new AdvancedModelRenderer(this, 0, 0);
        this.Headthing1.setRotationPoint(1.7F, -1.1F, -0.6F);
        this.Headthing1.addBox(0.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Headthing1, 0.0F, 0.0F, -0.18203784098300857F);
        this.HeadLeather1 = new AdvancedModelRenderer(this, 20, 12);
        this.HeadLeather1.setRotationPoint(-0.7F, 2.2F, 0.4F);
        this.HeadLeather1.addBox(-0.3F, -6.8F, 0.0F, 7, 8, 0, 0.0F);
        this.setRotateAngle(HeadLeather1, 0.0F, 0.045553093477052F, 0.0F);
        this.Foot41 = new AdvancedModelRenderer(this, 50, 50);
        this.Foot41.setRotationPoint(2.3F, 1.7F, 4.4F);
        this.Foot41.addBox(-0.2F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Foot41, 0.36425021489121656F, 0.0F, -0.8651597102135892F);
        this.Headside12 = new AdvancedModelRenderer(this, 28, 0);
        this.Headside12.setRotationPoint(-1.5F, -1.0F, 0.3F);
        this.Headside12.addBox(-3.0F, -1.1F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Headside12, 0.0F, 0.6373942428283291F, 0.0F);
        this.Foot21 = new AdvancedModelRenderer(this, 50, 50);
        this.Foot21.setRotationPoint(2.0F, 1.7F, 0.0F);
        this.Foot21.addBox(-0.2F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Foot21, 0.045553093477052F, -0.40980330836826856F, -0.9560913642424937F);
        this.Foot23 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot23.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Foot23.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot23, -1.4570008595648662F, -1.0016444577195458F, 0.0F);
        this.Mouth = new AdvancedModelRenderer(this, 48, 12);
        this.Mouth.setRotationPoint(0.5F, 2.2F, -3.2F);
        this.Mouth.addBox(-3.9F, 0.0F, -3.4F, 6, 1, 4, 0.0F);
        this.setRotateAngle(Mouth, -0.18203784098300857F, 0.0F, 0.0F);
        this.Foot25 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot25.setRotationPoint(-1.3F, 2.0F, 0.3F);
        this.Foot25.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot25, -1.4114477660878142F, 0.6829473363053812F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 122, 20);
        this.Tail3.setRotationPoint(0.0F, 0.4F, 4.0F);
        this.Tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.Headthing5 = new AdvancedModelRenderer(this, 0, 0);
        this.Headthing5.setRotationPoint(-4.2F, -0.7F, -1.1F);
        this.Headthing5.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Headthing5, 0.0F, 0.0F, -0.5009094953223726F);
        this.Tail4 = new AdvancedModelRenderer(this, 133, 24);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.Tail4.addBox(-0.5F, -0.7F, 0.0F, 1, 1, 6, 0.0F);
        this.Foot11 = new AdvancedModelRenderer(this, 50, 50);
        this.Foot11.setRotationPoint(-2.3F, 1.7F, 0.0F);
        this.Foot11.addBox(-2.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Foot11, 0.045553093477052F, 0.40980330836826856F, 0.9560913642424937F);
        this.TailSail3 = new AdvancedModelRenderer(this, 4, 33);
        this.TailSail3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailSail3.addBox(0.0F, -2.4F, 0.0F, 0, 4, 7, 0.0F);
        this.Foot43 = new AdvancedModelRenderer(this, 40, 55);
        this.Foot43.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Foot43.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot43, -1.3658946726107624F, -1.0016444577195458F, 0.0F);
        this.Body1 = new AdvancedModelRenderer(this, 31, 19);
        this.Body1.setRotationPoint(0.1F, 18.0F, -6.2F);
        this.Body1.addBox(-3.5F, -1.7F, 0.0F, 6, 6, 7, 0.0F);
        this.Foot12 = new AdvancedModelRenderer(this, 50, 58);
        this.Foot12.setRotationPoint(-1.4F, 3.3F, 0.0F);
        this.Foot12.addBox(-1.2F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Foot12, 0.31869712141416456F, -0.045553093477052F, -1.0927506446736497F);
        this.Headthing4.addChild(this.HeadLeather2);
        this.Foot21.addChild(this.Foot22);
        this.Body2.addChild(this.Tail1);
        this.Tail1.addChild(this.TailSail4);
        this.Foot12.addChild(this.Foot14);
        this.Body2.addChild(this.Foot31);
        this.Foot42.addChild(this.Foot45);
        this.Tail1.addChild(this.Tail2);
        this.Body1.addChild(this.Body2);
        this.Foot22.addChild(this.Foot24);
        this.Foot32.addChild(this.Foot35);
        this.Tail2.addChild(this.TailSail1);
        this.Tail3.addChild(this.TailSail2);
        this.Foot41.addChild(this.Foot42);
        this.HeadMain.addChild(this.Headthing6);
        this.Body1.addChild(this.Neck);
        this.Foot42.addChild(this.Foot44);
        this.HeadMain.addChild(this.Headthing3);
        this.Neck.addChild(this.HeadMain);
        this.Foot32.addChild(this.Foot33);
        this.HeadMain.addChild(this.Headside1);
        this.Foot31.addChild(this.Foot32);
        this.Foot32.addChild(this.Foot34);
        this.Foot12.addChild(this.Foot13);
        this.HeadMain.addChild(this.Headside1_1);
        this.Headside1_1.addChild(this.Headside12_1);
        this.HeadMain.addChild(this.Headthing4);
        this.Foot12.addChild(this.Foot15);
        this.HeadMain.addChild(this.Headthing12);
        this.HeadMain.addChild(this.Headthing1);
        this.Headthing1.addChild(this.HeadLeather1);
        this.Body2.addChild(this.Foot41);
        this.Headside1.addChild(this.Headside12);
        this.Body1.addChild(this.Foot21);
        this.Foot22.addChild(this.Foot23);
        this.Neck.addChild(this.Mouth);
        this.Foot22.addChild(this.Foot25);
        this.Tail2.addChild(this.Tail3);
        this.HeadMain.addChild(this.Headthing5);
        this.Tail3.addChild(this.Tail4);
        this.Body1.addChild(this.Foot11);
        this.Tail4.addChild(this.TailSail3);
        this.Foot42.addChild(this.Foot43);
        this.Foot11.addChild(this.Foot12);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.25F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.Body1.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 0.4F;
    	
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

    	float globalSpeed = 3f;
    	float globalHeight = 0.5f;
    	float globalDegree = 2F;
    	
        this.HeadMain.rotateAngleY = (f3 * 0.017453292F);
        this.HeadMain.rotateAngleX = (f4 * 0.017453292F);
        this.Mouth.rotateAngleY = (f3 * 0.017453292F);
        this.Mouth.rotateAngleX = (f4 * 0.017453292F);
    	
    	bob(Body1, 0.3F * globalSpeed, 0.5f * globalHeight, false, f, f1);
    	
    	walk(Foot11, 0.5f * globalSpeed, 0.5f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(Foot21, 0.5f * globalSpeed, 0.5f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(Foot31, 0.5f * globalSpeed, 0.5f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Foot41, 0.5f * globalSpeed, 0.5f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(Foot11, 0.4f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);
    	walk(Foot12, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0, 0.2f, f, f1);
    	walk(Foot22, 0.5f * globalSpeed, 0.2f * globalDegree, true, 0, 0.2f, f, f1);
    	walk(Foot33, 0.5f * globalSpeed, 0.2f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Foot43, 0.5f * globalSpeed, 0.2f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(Foot32, 0.5f * globalSpeed, 0.4f * globalDegree, true, 0f, 0.2f, f, f1);
    	walk(Foot42, 0.5f * globalSpeed, 0.4f * globalDegree, false, 0f, 0.2f, f, f1);
    	walk(Neck, 0.5f * globalSpeed, 0.1f * globalDegree, true, 2.5f, 0f, f, f1);

    	walk(Neck, 0.1f, 0.06f, false, 2.5f, 0f, entity.ticksExisted, 0.5F); 
    	
    	swing(Tail1, 0.1f, 0.2f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(Tail2, 0.07f, 0.4f, false, 0f, 0f, entity.ticksExisted, 0.5F);
    	swing(Tail3, 0.1f, 0.3f, true, 0f, 0f, entity.ticksExisted, 0.5F);
    }
}