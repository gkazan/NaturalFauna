package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPuma - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPuma extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer neck;
    public ModelRenderer frontrightleg;
    public ModelRenderer body2;
    public ModelRenderer frontleftleg;
    public ModelRenderer head;
    public ModelRenderer snout;
    public ModelRenderer rightear;
    public ModelRenderer leftear;
    public ModelRenderer snoutdown;
    public ModelRenderer frontrightleg2;
    public ModelRenderer frontrightleg3;
    public ModelRenderer frontrightfoot;
    public ModelRenderer body3;
    public ModelRenderer backrightleg;
    public ModelRenderer backleftleg;
    public ModelRenderer tail;
    public ModelRenderer backrightleg2;
    public ModelRenderer backrightleg3;
    public ModelRenderer backrightfoot;
    public ModelRenderer backleftleg2;
    public ModelRenderer backleftleg3;
    public ModelRenderer backleftfoot;
    public ModelRenderer tail2;
    public ModelRenderer frontleftleg2;
    public ModelRenderer frontleftleg3;
    public ModelRenderer frontleftfoot;

    public ModelPuma() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body3 = new ModelRenderer(this, 15, 15);
        this.body3.setRotationPoint(0.5F, 0.1F, 9.0F);
        this.body3.addBox(0.0F, 0.0F, 0.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(body3, -0.18203784098300857F, 0.0F, 0.0F);
        this.backrightleg2 = new ModelRenderer(this, 36, 0);
        this.backrightleg2.setRotationPoint(0.1F, 6.0F, 0.2F);
        this.backrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(backrightleg2, 0.5462880558742251F, 0.0F, 0.0F);
        this.backrightleg = new ModelRenderer(this, 30, 48);
        this.backrightleg.setRotationPoint(0.0F, 2.6F, 1.0F);
        this.backrightleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.frontleftleg2 = new ModelRenderer(this, 36, 0);
        this.frontleftleg2.setRotationPoint(-0.1F, 5.8F, -0.5F);
        this.frontleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(frontleftleg2, -0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg = new ModelRenderer(this, 30, 49);
        this.frontrightleg.setRotationPoint(1.0F, 2.6F, 2.4F);
        this.frontrightleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(frontrightleg, 0.091106186954104F, 0.0F, 0.0F);
        this.frontrightleg3 = new ModelRenderer(this, 15, 16);
        this.frontrightleg3.setRotationPoint(0.9F, 4.3F, 0.4F);
        this.frontrightleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.backleftfoot = new ModelRenderer(this, 15, 16);
        this.backleftfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.backleftfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.backleftleg3 = new ModelRenderer(this, 15, 16);
        this.backleftleg3.setRotationPoint(0.9F, 4.0F, 0.4F);
        this.backleftleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backleftleg3, -0.40980330836826856F, 0.0F, 0.0F);
        this.frontleftleg = new ModelRenderer(this, 30, 49);
        this.frontleftleg.setRotationPoint(5.9F, 2.6F, 2.4F);
        this.frontleftleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(frontleftleg, 0.091106186954104F, 0.0F, 0.0F);
        this.backrightfoot = new ModelRenderer(this, 15, 16);
        this.backrightfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.backrightfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.tail2 = new ModelRenderer(this, 10, 10);
        this.tail2.setRotationPoint(0.0F, 8.8F, -1.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(tail2, 0.36425021489121656F, 0.0F, 0.0F);
        this.leftear = new ModelRenderer(this, 42, 0);
        this.leftear.setRotationPoint(-3.8F, -4.0F, -2.3F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.frontrightfoot = new ModelRenderer(this, 15, 16);
        this.frontrightfoot.setRotationPoint(-0.7F, 2.6F, 1.3F);
        this.frontrightfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.head = new ModelRenderer(this, 20, 27);
        this.head.setRotationPoint(-0.4F, -0.1F, -3.8F);
        this.head.addBox(-2.7F, -3.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(head, 0.36425021489121656F, 0.0F, 0.0F);
        this.frontleftfoot = new ModelRenderer(this, 15, 16);
        this.frontleftfoot.setRotationPoint(-0.7F, 2.5F, 1.3F);
        this.frontleftfoot.addBox(-2.0F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.snout = new ModelRenderer(this, 0, 37);
        this.snout.setRotationPoint(-1.7F, -1.0F, -8.9F);
        this.snout.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(snout, 0.091106186954104F, 0.0F, 0.0F);
        this.backleftleg2 = new ModelRenderer(this, 36, 0);
        this.backleftleg2.setRotationPoint(0.1F, 6.0F, 0.2F);
        this.backleftleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(backleftleg2, 0.5462880558742251F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 27);
        this.neck.setRotationPoint(3.5F, 3.5F, 1.5F);
        this.neck.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(neck, -0.31869712141416456F, 0.0F, 0.0F);
        this.frontleftleg3 = new ModelRenderer(this, 15, 16);
        this.frontleftleg3.setRotationPoint(1.2F, 4.3F, 0.4F);
        this.frontleftleg3.addBox(-2.2F, -0.7F, -1.5F, 2, 4, 3, 0.0F);
        this.body = new ModelRenderer(this, 10, 10);
        this.body.setRotationPoint(-3.5F, 7.6F, -7.3F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 7, 8, 9, 0.0F);
        this.backrightleg3 = new ModelRenderer(this, 15, 16);
        this.backrightleg3.setRotationPoint(0.9F, 4.4F, 0.4F);
        this.backrightleg3.addBox(-2.2F, -1.2F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(backrightleg3, -0.40980330836826856F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 56, 11);
        this.tail.setRotationPoint(2.5F, 0.6F, 4.0F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(tail, 0.22759093446006054F, 0.0F, 0.0F);
        this.frontrightleg2 = new ModelRenderer(this, 36, 0);
        this.frontrightleg2.setRotationPoint(0.1F, 5.8F, -0.5F);
        this.frontrightleg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 4, 0.0F);
        this.setRotateAngle(frontrightleg2, -0.091106186954104F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 11, 10);
        this.body2.setRotationPoint(0.5F, 0.3F, 8.3F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 6, 7, 9, 0.0F);
        this.setRotateAngle(body2, 0.045553093477052F, 0.0F, 0.0F);
        this.rightear = new ModelRenderer(this, 9, 0);
        this.rightear.setRotationPoint(2.5F, -4.0F, -2.3F);
        this.rightear.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.snoutdown = new ModelRenderer(this, 0, 49);
        this.snoutdown.setRotationPoint(-1.0F, 1.8F, -8.3F);
        this.snoutdown.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.backleftleg = new ModelRenderer(this, 30, 48);
        this.backleftleg.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.backleftleg.addBox(-1.5F, 0.0F, -2.5F, 3, 7, 5, 0.0F);
        this.body2.addChild(this.body3);
        this.backrightleg.addChild(this.backrightleg2);
        this.body3.addChild(this.backrightleg);
        this.frontleftleg.addChild(this.frontleftleg2);
        this.body.addChild(this.frontrightleg);
        this.frontrightleg2.addChild(this.frontrightleg3);
        this.backleftleg3.addChild(this.backleftfoot);
        this.backleftleg2.addChild(this.backleftleg3);
        this.body.addChild(this.frontleftleg);
        this.backrightleg3.addChild(this.backrightfoot);
        this.tail.addChild(this.tail2);
        this.head.addChild(this.leftear);
        this.frontrightleg3.addChild(this.frontrightfoot);
        this.neck.addChild(this.head);
        this.frontleftleg3.addChild(this.frontleftfoot);
        this.head.addChild(this.snout);
        this.backleftleg.addChild(this.backleftleg2);
        this.body.addChild(this.neck);
        this.frontleftleg2.addChild(this.frontleftleg3);
        this.backrightleg2.addChild(this.backrightleg3);
        this.body3.addChild(this.tail);
        this.frontrightleg.addChild(this.frontrightleg2);
        this.body.addChild(this.body2);
        this.head.addChild(this.rightear);
        this.head.addChild(this.snoutdown);
        this.body3.addChild(this.backleftleg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
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
