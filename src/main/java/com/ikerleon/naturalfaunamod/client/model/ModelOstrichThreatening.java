package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelOstrich - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelOstrichThreatening extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer leftwing;
    public ModelRenderer rightleg;
    public ModelRenderer rightwing;
    public ModelRenderer leftleg;
    public ModelRenderer neck;
    public ModelRenderer body2;
    public ModelRenderer rightleg2;
    public ModelRenderer right1;
    public ModelRenderer right2;
    public ModelRenderer leftleg2;
    public ModelRenderer left1;
    public ModelRenderer left2;
    public ModelRenderer neck2;
    public ModelRenderer head;
    public ModelRenderer beak;
    public ModelRenderer beak2;

    public ModelOstrichThreatening() {
        this.textureWidth = 80;
        this.textureHeight = 80;
        this.leftleg2 = new ModelRenderer(this, 38, 0);
        this.leftleg2.setRotationPoint(0.0F, -2.5F, 0.9F);
        this.leftleg2.addBox(-1.0F, 0.0F, -1.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(leftleg2, -0.27314402793711257F, 0.0F, 0.0F);
        this.rightwing = new ModelRenderer(this, 56, 4);
        this.rightwing.setRotationPoint(1.8F, 0.0F, 1.4F);
        this.rightwing.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(rightwing, 0.136659280431156F, -1.3658946726107624F, 0.0F);
        this.beak = new ModelRenderer(this, 17, 20);
        this.beak.setRotationPoint(-1.5F, -0.8F, -4.0F);
        this.beak.addBox(0.5F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(beak, 0.18203784098300857F, 0.0F, 0.0F);
        this.beak2 = new ModelRenderer(this, 0, 0);
        this.beak2.setRotationPoint(-0.3F, 0.1F, 0.0F);
        this.beak2.addBox(0.3F, 0.0F, -0.2F, 3, 1, 3, 0.0F);
        this.setRotateAngle(beak2, -0.18203784098300857F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 38, 5);
        this.rightleg.setRotationPoint(0.3F, 7.5F, 3.9F);
        this.rightleg.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(rightleg, 0.36425021489121656F, 0.0F, 0.0F);
        this.neck2 = new ModelRenderer(this, 54, 0);
        this.neck2.setRotationPoint(0.5F, -2.9F, 1.0F);
        this.neck2.addBox(-1.5F, -10.8F, -1.7F, 3, 11, 3, 0.0F);
        this.setRotateAngle(neck2, -1.0016444577195458F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 10, 9);
        this.neck.setRotationPoint(3.7F, 3.2F, 1.1F);
        this.neck.addBox(-1.5F, -4.7F, -2.6F, 4, 5, 5, 0.0F);
        this.setRotateAngle(neck, 1.3658946726107624F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 40, 5);
        this.leftleg.setRotationPoint(6.0F, 7.2F, 5.5F);
        this.leftleg.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(leftleg, 0.31869712141416456F, 0.0F, 0.0F);
        this.rightleg2 = new ModelRenderer(this, 38, 0);
        this.rightleg2.setRotationPoint(0.5F, -2.9F, 1.4F);
        this.rightleg2.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(rightleg2, -0.31869712141416456F, 0.0F, 0.0F);
        this.left1 = new ModelRenderer(this, 40, 0);
        this.left1.setRotationPoint(-0.6F, 13.9F, 0.1F);
        this.left1.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.right2 = new ModelRenderer(this, 41, 2);
        this.right2.setRotationPoint(1.1F, 14.1F, 1.1F);
        this.right2.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(-4.1F, 4.4F, -5.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 8, 9, 11, 0.0F);
        this.setRotateAngle(body, -0.045553093477052F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 0, 20);
        this.body2.setRotationPoint(4.1F, 2.1F, 9.4F);
        this.body2.addBox(-2.7F, -2.0F, -0.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(body2, 0.18203784098300857F, 0.003490658503988659F, 0.0F);
        this.leftwing = new ModelRenderer(this, 44, 14);
        this.leftwing.setRotationPoint(6.1F, 0.0F, 1.5F);
        this.leftwing.addBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F);
        this.setRotateAngle(leftwing, 0.136659280431156F, 1.4570008595648662F, 0.0F);
        this.head = new ModelRenderer(this, 34, 17);
        this.head.setRotationPoint(0.0F, -9.0F, -0.4F);
        this.head.addBox(-2.0F, -2.5F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, -0.22759093446006054F, 0.0F, 0.0F);
        this.right1 = new ModelRenderer(this, 40, 0);
        this.right1.setRotationPoint(0.4F, 14.1F, 0.3F);
        this.right1.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(right1, 0.0F, 0.22759093446006054F, 0.0F);
        this.left2 = new ModelRenderer(this, 41, 2);
        this.left2.setRotationPoint(0.4F, 13.8F, -0.8F);
        this.left2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(left2, 0.0F, -0.31869712141416456F, 0.0F);
        this.leftleg.addChild(this.leftleg2);
        this.body.addChild(this.rightwing);
        this.head.addChild(this.beak);
        this.beak.addChild(this.beak2);
        this.body.addChild(this.rightleg);
        this.neck.addChild(this.neck2);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftleg);
        this.rightleg.addChild(this.rightleg2);
        this.leftleg2.addChild(this.left1);
        this.rightleg2.addChild(this.right2);
        this.body.addChild(this.body2);
        this.body.addChild(this.leftwing);
        this.neck2.addChild(this.head);
        this.rightleg2.addChild(this.right1);
        this.leftleg2.addChild(this.left2);
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
