package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * bearded vulture - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelBeardedVultureFlying extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer neckbase;
    public ModelRenderer tailfeathers2;
    public ModelRenderer Wing1;
    public ModelRenderer wing2;
    public ModelRenderer back;
    public ModelRenderer leg1;
    public ModelRenderer left2;
    public ModelRenderer tailfeathers1a;
    public ModelRenderer neck;
    public ModelRenderer head;
    public ModelRenderer neckup;
    public ModelRenderer neckdown;
    public ModelRenderer beakfeathers;
    public ModelRenderer facefeathers1;
    public ModelRenderer facefeathers2;
    public ModelRenderer beaktop1;
    public ModelRenderer beaktop2;
    public ModelRenderer beakbot;
    public ModelRenderer wingmid1;
    public ModelRenderer wingtip1;
    public ModelRenderer wingmid2;
    public ModelRenderer wingtip2;
    public ModelRenderer leg1a;
    public ModelRenderer foot1;
    public ModelRenderer leg2a;
    public ModelRenderer foot2;
    public ModelRenderer tailfeathers1;
    public ModelRenderer tailfeathers1b;

    public ModelBeardedVultureFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.leg1a = new ModelRenderer(this, 0, 2);
        this.leg1a.setRotationPoint(0.5F, 3.4F, 0.1F);
        this.leg1a.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.beakfeathers = new ModelRenderer(this, 36, 18);
        this.beakfeathers.setRotationPoint(-1.0F, -1.7F, -2.7F);
        this.beakfeathers.addBox(0.0F, -0.1F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(beakfeathers, 0.06422811647339133F, 0.0F, 0.0F);
        this.neckdown = new ModelRenderer(this, 12, 21);
        this.neckdown.setRotationPoint(1.0F, 3.9F, 0.5F);
        this.neckdown.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 2, 0.0F);
        this.setRotateAngle(neckdown, 0.136659280431156F, 0.0F, 0.0F);
        this.wingtip1 = new ModelRenderer(this, 54, 12);
        this.wingtip1.setRotationPoint(-0.1F, 0.1F, 2.4F);
        this.wingtip1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.left2 = new ModelRenderer(this, 12, 20);
        this.left2.setRotationPoint(2.9F, 3.9F, 4.0F);
        this.left2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(left2, 1.5707963267948966F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 8, 9);
        this.head.setRotationPoint(1.0F, -0.5F, -0.4F);
        this.head.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(head, -1.0927506446736497F, 0.0F, 0.0F);
        this.wing2 = new ModelRenderer(this, 13, 6);
        this.wing2.setRotationPoint(4.7F, 0.6F, 0.1F);
        this.wing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(wing2, 1.5707963267948966F, 0.0F, 1.5707963267948966F);
        this.neckbase = new ModelRenderer(this, 14, 0);
        this.neckbase.setRotationPoint(2.5F, 1.0F, 2.6F);
        this.neckbase.addBox(-1.5F, -3.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(neckbase, 1.1838568316277536F, 0.0F, 0.0F);
        this.beaktop1 = new ModelRenderer(this, 35, 8);
        this.beaktop1.setRotationPoint(0.5F, 0.3F, 1.7F);
        this.beaktop1.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beaktop1, -0.136659280431156F, 0.0F, 0.0F);
        this.wingmid2 = new ModelRenderer(this, 5, 13);
        this.wingmid2.setRotationPoint(0.1F, 0.1F, 6.0F);
        this.wingmid2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        this.wingmid1 = new ModelRenderer(this, 34, 12);
        this.wingmid1.setRotationPoint(-0.1F, 0.1F, 6.0F);
        this.wingmid1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        this.beaktop2 = new ModelRenderer(this, 0, 0);
        this.beaktop2.setRotationPoint(0.0F, 0.7F, -3.8F);
        this.beaktop2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(beaktop2, 0.7285004297824331F, 0.0F, 0.0F);
        this.tailfeathers1a = new ModelRenderer(this, 40, 11);
        this.tailfeathers1a.setRotationPoint(1.0F, 0.1F, 4.6F);
        this.tailfeathers1a.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.leg1 = new ModelRenderer(this, 12, 20);
        this.leg1.setRotationPoint(0.1F, 3.9F, 4.0F);
        this.leg1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leg1, 1.5707963267948966F, 0.0F, 0.0F);
        this.beakbot = new ModelRenderer(this, 55, 8);
        this.beakbot.setRotationPoint(0.0F, 0.5F, -1.2F);
        this.beakbot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beakbot, -0.18203784098300857F, 0.0F, 0.0F);
        this.foot1 = new ModelRenderer(this, 0, 25);
        this.foot1.setRotationPoint(0.5F, 1.3F, 0.5F);
        this.foot1.addBox(-1.5F, 0.0F, -2.0F, 3, 0, 4, 0.0F);
        this.setRotateAngle(foot1, 1.5707963267948966F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 9);
        this.neck.setRotationPoint(-1.0F, -4.0F, -2.7F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, -0.045553093477052F, 0.0F, 0.0F);
        this.facefeathers2 = new ModelRenderer(this, 0, 16);
        this.facefeathers2.setRotationPoint(0.1F, 0.3F, 0.0F);
        this.facefeathers2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        this.setRotateAngle(facefeathers2, -0.4553564018453205F, 0.0F, 0.0F);
        this.tailfeathers1b = new ModelRenderer(this, 49, 11);
        this.tailfeathers1b.setRotationPoint(0.8F, 0.1F, 5.0F);
        this.tailfeathers1b.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.tailfeathers1 = new ModelRenderer(this, 26, 0);
        this.tailfeathers1.setRotationPoint(-0.5F, 0.0F, 2.9F);
        this.tailfeathers1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.body = new ModelRenderer(this, 20, 20);
        this.body.setRotationPoint(-2.5F, 15.2F, -4.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 5, 4, 6, 0.0F);
        this.leg2a = new ModelRenderer(this, 26, 3);
        this.leg2a.setRotationPoint(0.5F, 3.4F, 0.1F);
        this.leg2a.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.tailfeathers2 = new ModelRenderer(this, 39, 0);
        this.tailfeathers2.setRotationPoint(1.5F, 1.2F, 5.4F);
        this.tailfeathers2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tailfeathers2, 0.27314402793711257F, 0.0F, 0.0F);
        this.back = new ModelRenderer(this, 51, 0);
        this.back.setRotationPoint(1.5F, -0.6F, 1.0F);
        this.back.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(back, -0.22759093446006054F, 0.0F, 0.0F);
        this.foot2 = new ModelRenderer(this, 0, 20);
        this.foot2.setRotationPoint(0.5F, 1.3F, 0.5F);
        this.foot2.addBox(-1.5F, 0.0F, -2.0F, 3, 0, 4, 0.0F);
        this.setRotateAngle(foot2, 1.5707963267948966F, 0.0F, 0.0F);
        this.neckup = new ModelRenderer(this, 13, 21);
        this.neckup.setRotationPoint(0.5F, 3.0F, 1.3F);
        this.neckup.addBox(0.0F, -4.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(neckup, 0.40980330836826856F, 0.0F, 0.0F);
        this.Wing1 = new ModelRenderer(this, 42, 0);
        this.Wing1.setRotationPoint(0.3F, 1.6F, 0.1F);
        this.Wing1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(Wing1, 1.5707963267948966F, 0.0F, -1.5707963267948966F);
        this.wingtip2 = new ModelRenderer(this, 49, 14);
        this.wingtip2.setRotationPoint(0.1F, 0.0F, 2.4F);
        this.wingtip2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(wingtip2, 0.0F, 0.0F, -0.006806784082777885F);
        this.facefeathers1 = new ModelRenderer(this, 0, 19);
        this.facefeathers1.setRotationPoint(1.9F, 0.3F, 0.0F);
        this.facefeathers1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        this.setRotateAngle(facefeathers1, -0.4553564018453205F, 0.0F, 0.0F);
        this.leg1.addChild(this.leg1a);
        this.head.addChild(this.beakfeathers);
        this.neck.addChild(this.neckdown);
        this.wingmid1.addChild(this.wingtip1);
        this.body.addChild(this.left2);
        this.neck.addChild(this.head);
        this.body.addChild(this.wing2);
        this.body.addChild(this.neckbase);
        this.beakfeathers.addChild(this.beaktop1);
        this.wing2.addChild(this.wingmid2);
        this.Wing1.addChild(this.wingmid1);
        this.beaktop1.addChild(this.beaktop2);
        this.body.addChild(this.tailfeathers1a);
        this.body.addChild(this.leg1);
        this.beaktop1.addChild(this.beakbot);
        this.leg1a.addChild(this.foot1);
        this.neckbase.addChild(this.neck);
        this.beakfeathers.addChild(this.facefeathers2);
        this.tailfeathers1.addChild(this.tailfeathers1b);
        this.tailfeathers1a.addChild(this.tailfeathers1);
        this.left2.addChild(this.leg2a);
        this.body.addChild(this.tailfeathers2);
        this.body.addChild(this.back);
        this.leg2a.addChild(this.foot2);
        this.neck.addChild(this.neckup);
        this.body.addChild(this.Wing1);
        this.wingmid2.addChild(this.wingtip2);
        this.beakfeathers.addChild(this.facefeathers1);
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
