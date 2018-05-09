package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;

import net.minecraft.entity.Entity;

/**
 * papillon - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelButterfly extends MowzieModelBase {
    public MowzieModelRenderer body;
    public MowzieModelRenderer wingright;
    public MowzieModelRenderer wingleft;

    public ModelButterfly() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.wingright = new MowzieModelRenderer(this, 20, 1);
        this.wingright.setRotationPoint(0.1F, 18.4F, 1.8F);
        this.wingright.addBox(0.0F, 0.0F, -2.7F, 4, 0, 6, 0.0F);
        this.setRotateAngle(wingright, 0.0F, 0.0F, -2.6618016422165516F);
        this.body = new MowzieModelRenderer(this, 6, 2);
        this.body.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.wingleft = new MowzieModelRenderer(this, 10, 1);
        this.wingleft.setRotationPoint(0.9F, 18.4F, 1.8F);
        this.wingleft.addBox(0.0F, 0.0F, -2.7F, 4, 0, 6, 0.0F);
        this.setRotateAngle(wingleft, 0.0F, 0.0F, -0.6366961111275314F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.wingright.render(f5);
        this.body.render(f5);
        this.wingleft.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(MowzieModelRenderer MowzieModelRenderer, float x, float y, float z) {
        MowzieModelRenderer.rotateAngleX = x;
        MowzieModelRenderer.rotateAngleY = y;
        MowzieModelRenderer.rotateAngleZ = z;
    }
}
