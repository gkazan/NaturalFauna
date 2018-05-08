package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelFrailecillo - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuffinWater extends ModelBase {
    public ModelRenderer piernaizq;
    public ModelRenderer cabeza;
    public ModelRenderer piernader;
    public ModelRenderer cuerpo;
    public ModelRenderer piernaizqChild;
    public ModelRenderer cabezaChild;
    public ModelRenderer cabezaChildChild;
    public ModelRenderer piernaderChild;
    public ModelRenderer cuerpoChild;
    public ModelRenderer cuerpoChild_1;
    public ModelRenderer cuerpoChildChild;
    public ModelRenderer cuerpoChildChildChild;

    public ModelPuffinWater() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.cuerpo = new ModelRenderer(this, 28, 24);
        this.cuerpo.setRotationPoint(0.0F, 22.0F, -1.4F);
        this.cuerpo.addBox(-1.5F, -1.1F, -0.9F, 3, 4, 4, 0.0F);
        this.cuerpoChild = new ModelRenderer(this, 19, 27);
        this.cuerpoChild.setRotationPoint(0.0F, 0.8F, -0.2F);
        this.cuerpoChild.addBox(-1.0F, -2.5F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(cuerpoChild, 0.6373942428283291F, 0.0F, 0.0F);
        this.cuerpoChildChild = new ModelRenderer(this, 50, 5);
        this.cuerpoChildChild.setRotationPoint(1.0F, 0.4000000059604645F, 2.0F);
        this.cuerpoChildChild.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(cuerpoChildChild, -0.35495251417160034F, 0.0F, 0.0F);
        this.piernaizq = new ModelRenderer(this, 23, 1);
        this.piernaizq.setRotationPoint(0.3F, 24.0F, -0.3F);
        this.piernaizq.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(piernaizq, 0.5061454830783556F, 0.0F, 0.0F);
        this.cabeza = new ModelRenderer(this, 1, 25);
        this.cabeza.setRotationPoint(0.0F, 21.8F, -3.1F);
        this.cabeza.addBox(-1.5F, -3.0F, -2.0F, 3, 3, 3, 0.0F);
        this.piernader = new ModelRenderer(this, 18, 1);
        this.piernader.setRotationPoint(-0.3F, 24.0F, -0.3F);
        this.piernader.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(piernader, 0.5061454830783556F, 0.0F, 0.0F);
        this.cuerpoChildChildChild = new ModelRenderer(this, 53, 12);
        this.cuerpoChildChildChild.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.cuerpoChildChildChild.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(cuerpoChildChildChild, -0.10224120318889618F, 0.0F, 0.0F);
        this.cabezaChild = new ModelRenderer(this, 1, 20);
        this.cabezaChild.setRotationPoint(-0.5F, -1.3200000524520874F, -0.9200000166893005F);
        this.cabezaChild.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.piernaderChild = new ModelRenderer(this, 11, 1);
        this.piernaderChild.setRotationPoint(-1.0F, 2.2F, 0.4F);
        this.piernaderChild.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(piernaderChild, 0.6829473363053812F, 0.0F, 0.0F);
        this.cuerpoChild_1 = new ModelRenderer(this, 52, 25);
        this.cuerpoChild_1.setRotationPoint(-1.0F, -0.20000000298023224F, 0.4000000059604645F);
        this.cuerpoChild_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(cuerpoChild_1, 0.27213919162750244F, 0.0F, 0.0F);
        this.piernaizqChild = new ModelRenderer(this, 29, 1);
        this.piernaizqChild.setRotationPoint(0.0F, 2.2F, 0.4F);
        this.piernaizqChild.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(piernaizqChild, 0.6829473363053812F, 0.0F, 0.0F);
        this.cabezaChildChild = new ModelRenderer(this, 11, 20);
        this.cabezaChildChild.setRotationPoint(0.0F, -1.0F, 0.7066670060157776F);
        this.cabezaChildChild.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(cabezaChildChild, 0.349065899848938F, 0.0F, 0.0F);
        this.cuerpo.addChild(this.cuerpoChild);
        this.cuerpoChild_1.addChild(this.cuerpoChildChild);
        this.cuerpoChildChild.addChild(this.cuerpoChildChildChild);
        this.cabeza.addChild(this.cabezaChild);
        this.piernader.addChild(this.piernaderChild);
        this.cuerpo.addChild(this.cuerpoChild_1);
        this.piernaizq.addChild(this.piernaizqChild);
        this.cabezaChild.addChild(this.cabezaChildChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.cuerpo.render(f5);
        this.piernaizq.render(f5);
        this.cabeza.render(f5);
        this.piernader.render(f5);
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
