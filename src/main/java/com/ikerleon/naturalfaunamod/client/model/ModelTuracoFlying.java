package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.entity.Entity;

/**
 * Turaco Flying - Doctor Hyena
 * Created using Tabula 7.0.0
 */
public class ModelTuracoFlying extends AdvancedModelBase {
    public AdvancedModelRenderer field_192764_a;
    public AdvancedModelRenderer shape5;
    public AdvancedModelRenderer shape6;
    public AdvancedModelRenderer shape7;
    public AdvancedModelRenderer shape6_1;
    public AdvancedModelRenderer shape14;
    public AdvancedModelRenderer shape14_1;
    public AdvancedModelRenderer shape16;
    public AdvancedModelRenderer shape16_1;
    public AdvancedModelRenderer shape9;
    public AdvancedModelRenderer shape10;
    public AdvancedModelRenderer shape12;
    public AdvancedModelRenderer shape13;
    public AdvancedModelRenderer shape14_2;
    public AdvancedModelRenderer shape14_3;
    public AdvancedModelRenderer shape18;
    public AdvancedModelRenderer shape18_1;

    public ModelTuracoFlying() {
        this.textureWidth = 64;
        this.textureHeight = 30;
        this.shape13 = new AdvancedModelRenderer(this, 41, 0);
        this.shape13.setRotationPoint(-0.5F, -3.7F, -0.5F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape18 = new AdvancedModelRenderer(this, -1, 1);
        this.shape18.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape6_1 = new AdvancedModelRenderer(this, 41, 0);
        this.shape6_1.setRotationPoint(-0.5F, 1.6F, 4.9F);
        this.shape6_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.shape6 = new AdvancedModelRenderer(this, 25, 0);
        this.shape6.setRotationPoint(-1.0F, 1.2F, 5.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(shape6, 0.091106186954104F, 0.0F, 0.0F);
        this.shape14_3 = new AdvancedModelRenderer(this, 50, 17);
        this.shape14_3.setRotationPoint(-0.5F, -1.2F, 4.7F);
        this.shape14_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(shape14_3, 0.5009094953223726F, 0.0F, 0.0F);
        this.shape18_1 = new AdvancedModelRenderer(this, -2, 1);
        this.shape18_1.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
        this.shape16 = new AdvancedModelRenderer(this, 0, 0);
        this.shape16.setRotationPoint(0.5F, 3.5F, 1.0F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape16, 1.0471975511965976F, 0.0F, 0.0F);
        this.shape12 = new AdvancedModelRenderer(this, 55, 11);
        this.shape12.setRotationPoint(-1.0F, -4.0F, -0.4F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape12, 0.27314402793711257F, 0.0F, 0.0F);
        this.shape7 = new AdvancedModelRenderer(this, 32, 0);
        this.shape7.setRotationPoint(-0.5F, 0.4F, 3.5F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(shape7, 0.091106186954104F, 0.0F, 0.0F);
        this.shape14_1 = new AdvancedModelRenderer(this, 19, 6);
        this.shape14_1.setRotationPoint(2.0F, 1.7F, 0.0F);
        this.shape14_1.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(shape14_1, -1.6845917940249266F, 0.045553093477052F, -1.7756979809790308F);
        this.shape10 = new AdvancedModelRenderer(this, 45, 9);
        this.shape10.setRotationPoint(-1.0F, -6.2F, 0.9F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(shape10, -0.4553564018453205F, 0.0F, 0.0F);
        this.field_192764_a = new AdvancedModelRenderer(this, 0, 0);
        this.field_192764_a.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.field_192764_a.addBox(-1.9F, 0.0F, -2.0F, 4, 4, 7, 0.0F);
        this.shape16_1 = new AdvancedModelRenderer(this, 25, 0);
        this.shape16_1.setRotationPoint(-1.5F, 3.5F, 1.0F);
        this.shape16_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape16_1, 1.0471975511965976F, 0.0F, 0.0F);
        this.shape14_2 = new AdvancedModelRenderer(this, 50, 17);
        this.shape14_2.setRotationPoint(-0.5F, -1.2F, 4.6F);
        this.shape14_2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(shape14_2, 0.5009094953223726F, 0.0F, 0.0F);
        this.shape5 = new AdvancedModelRenderer(this, 15, 0);
        this.shape5.setRotationPoint(0.5F, 2.2F, -1.0F);
        this.shape5.addBox(-1.5F, -3.9F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(shape5, 1.0471975511965976F, 0.0F, 0.0F);
        this.shape14 = new AdvancedModelRenderer(this, 48, 0);
        this.shape14.setRotationPoint(-1.5F, 1.7F, 0.0F);
        this.shape14.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(shape14, -1.6845917940249266F, -0.091106186954104F, 1.7756979809790308F);
        this.shape9 = new AdvancedModelRenderer(this, 33, 8);
        this.shape9.setRotationPoint(-0.5F, -3.0F, 0.5F);
        this.shape9.addBox(-1.5F, -2.7F, -1.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(shape9, 0.6829473363053812F, 0.0F, 0.0F);
        this.shape9.addChild(this.shape13);
        this.shape16.addChild(this.shape18);
        this.field_192764_a.addChild(this.shape6_1);
        this.field_192764_a.addChild(this.shape6);
        this.shape14_1.addChild(this.shape14_3);
        this.shape16_1.addChild(this.shape18_1);
        this.field_192764_a.addChild(this.shape16);
        this.shape9.addChild(this.shape12);
        this.field_192764_a.addChild(this.shape7);
        this.field_192764_a.addChild(this.shape14_1);
        this.shape5.addChild(this.shape10);
        this.field_192764_a.addChild(this.shape16_1);
        this.shape14.addChild(this.shape14_2);
        this.field_192764_a.addChild(this.shape5);
        this.field_192764_a.addChild(this.shape14);
        this.shape5.addChild(this.shape9);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.field_192764_a.render(f5);
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
    	
    	walk(shape14, 0.5f * globalSpeed, 0.3f * globalDegree, true, 0, 0f, f, f1);
    	walk(shape14_1, 0.5f * globalSpeed, 0.3f * globalDegree, false, 0, 0f, f, f1);
    	flap(shape14, 0.4f * globalSpeed, 0.5f * globalDegree, false, 0, 0f, f, f1);
    	flap(shape14_1, 0.4f * globalSpeed, 0.5f * globalDegree, true, 0, 0f, f, f1);
    }
}
