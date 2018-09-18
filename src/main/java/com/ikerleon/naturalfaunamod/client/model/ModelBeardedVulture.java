package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * bearded vulture - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelBeardedVulture extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neckbase;
    public BookwormModelRenderer tailfeathers1;
    public BookwormModelRenderer tailfeathers2;
    public BookwormModelRenderer Wing1;
    public BookwormModelRenderer wing2;
    public BookwormModelRenderer back;
    public BookwormModelRenderer leg1;
    public BookwormModelRenderer left2;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer head;
    public BookwormModelRenderer neckup;
    public BookwormModelRenderer neckdown;
    public BookwormModelRenderer beakfeathers;
    public BookwormModelRenderer facefeathers1;
    public BookwormModelRenderer facefeathers2;
    public BookwormModelRenderer beaktop1;
    public BookwormModelRenderer beaktop2;
    public BookwormModelRenderer beakbot;
    public BookwormModelRenderer tailfeathers1a;
    public BookwormModelRenderer tailfeathers1b;
    public BookwormModelRenderer wingmid1;
    public BookwormModelRenderer wingtip1;
    public BookwormModelRenderer wingmid2;
    public BookwormModelRenderer wingtip2;
    public BookwormModelRenderer leg1a;
    public BookwormModelRenderer foot1;
    public BookwormModelRenderer leg2a;
    public BookwormModelRenderer foot2;

    public ModelBeardedVulture() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.wing2 = new BookwormModelRenderer(this, 13, 6, "wing2");
        this.wing2.setRotationPoint(4.6F, 0.6F, 0.0F);
        this.wing2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(wing2, -0.091106186954104F, 0.045553093477052F, -0.045553093477052F);
        this.neckbase = new BookwormModelRenderer(this, 14, 0, "neckbase");
        this.neckbase.setRotationPoint(2.5F, 1.5F, 2.6F);
        this.neckbase.addBox(-1.5F, -3.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(neckbase, 0.5009094953223726F, 0.0F, 0.0F);
        this.beaktop1 = new BookwormModelRenderer(this, 35, 8, "beaktop1");
        this.beaktop1.setRotationPoint(0.5F, 0.3F, 1.7F);
        this.beaktop1.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beaktop1, -0.136659280431156F, 0.0F, 0.0F);
        this.tailfeathers1b = new BookwormModelRenderer(this, 49, 11, "tailfeathers1b");
        this.tailfeathers1b.setRotationPoint(0.5F, 0.1F, 2.5F);
        this.tailfeathers1b.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.beaktop2 = new BookwormModelRenderer(this, 0, 0, "beaktop2");
        this.beaktop2.setRotationPoint(0.0F, 0.7F, -3.8F);
        this.beaktop2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(beaktop2, 0.7285004297824331F, 0.0F, 0.0F);
        this.tailfeathers1 = new BookwormModelRenderer(this, 26, 0, "tailfeathers1");
        this.tailfeathers1.setRotationPoint(0.5F, 0.2F, 5.8F);
        this.tailfeathers1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.tailfeathers1a = new BookwormModelRenderer(this, 40, 11, "tailfeathers1a");
        this.tailfeathers1a.setRotationPoint(0.5F, 0.1F, 4.6F);
        this.tailfeathers1a.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.neckdown = new BookwormModelRenderer(this, 12, 21, "neckdown");
        this.neckdown.setRotationPoint(1.0F, 4.6F, 0.5F);
        this.neckdown.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 2, 0.0F);
        this.setRotateAngle(neckdown, 0.18203784098300857F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 9, "neck");
        this.neck.setRotationPoint(-1.0F, -4.0F, -2.7F);
        this.neck.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, -0.045553093477052F, 0.0F, 0.0F);
        this.wingtip1 = new BookwormModelRenderer(this, 54, 12, "wingtip1");
        this.wingtip1.setRotationPoint(0.1F, 0.1F, 2.4F);
        this.wingtip1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.wingtip2 = new BookwormModelRenderer(this, 49, 14, "wingtip2");
        this.wingtip2.setRotationPoint(-0.1F, 0.0F, 2.4F);
        this.wingtip2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(wingtip2, 0.0F, 0.0F, -0.006806784082777885F);
        this.beakfeathers = new BookwormModelRenderer(this, 36, 18, "beakfeathers");
        this.beakfeathers.setRotationPoint(-1.0F, -1.7F, -2.7F);
        this.beakfeathers.addBox(0.0F, -0.1F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(beakfeathers, 0.06422811647339133F, 0.0F, 0.0F);
        this.leg2a = new BookwormModelRenderer(this, 26, 3, "leg2a");
        this.leg2a.setRotationPoint(0.5F, 3.4F, 0.1F);
        this.leg2a.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.head = new BookwormModelRenderer(this, 8, 9, "head");
        this.head.setRotationPoint(1.0F, 0.0F, 0.1F);
        this.head.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(head, -0.045553093477052F, 0.0F, 0.0F);
        this.foot1 = new BookwormModelRenderer(this, 0, 25, "foot1");
        this.foot1.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.foot1.addBox(-1.5F, 0.0F, -2.0F, 3, 0, 4, 0.0F);
        this.foot2 = new BookwormModelRenderer(this, 0, 20, "foot2");
        this.foot2.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.foot2.addBox(-1.5F, 0.0F, -2.0F, 3, 0, 4, 0.0F);
        this.Wing1 = new BookwormModelRenderer(this, 42, 0, "Wing1");
        this.Wing1.setRotationPoint(-0.5F, 0.6F, 0.0F);
        this.Wing1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(Wing1, -0.091106186954104F, -0.045553093477052F, 0.091106186954104F);
        this.tailfeathers2 = new BookwormModelRenderer(this, 39, 0, "tailfeathers2");
        this.tailfeathers2.setRotationPoint(1.5F, 1.2F, 5.4F);
        this.tailfeathers2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tailfeathers2, 0.27314402793711257F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 20, 20, "body");
        this.body.setRotationPoint(-2.5F, 15.2F, -4.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 5, 4, 6, 0.0F);
        this.setRotateAngle(body, -0.40980330836826856F, 0.0F, 0.0F);
        this.beakbot = new BookwormModelRenderer(this, 55, 8, "beakbot");
        this.beakbot.setRotationPoint(0.0F, 0.5F, -1.2F);
        this.beakbot.addBox(0.0F, 0.0F, -2.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(beakbot, -0.18203784098300857F, 0.0F, 0.0F);
        this.facefeathers2 = new BookwormModelRenderer(this, 0, 16, "facefeathers2");
        this.facefeathers2.setRotationPoint(0.1F, 0.3F, 0.0F);
        this.facefeathers2.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        this.setRotateAngle(facefeathers2, -0.4553564018453205F, 0.0F, 0.0F);
        this.leg1 = new BookwormModelRenderer(this, 12, 20, "leg1");
        this.leg1.setRotationPoint(-0.1F, 2.9F, 4.0F);
        this.leg1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leg1, 0.40980330836826856F, 0.0F, 0.0F);
        this.wingmid1 = new BookwormModelRenderer(this, 34, 12, "wingmid1");
        this.wingmid1.setRotationPoint(0.1F, 0.1F, 6.0F);
        this.wingmid1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        this.wingmid2 = new BookwormModelRenderer(this, 5, 13, "wingmid2");
        this.wingmid2.setRotationPoint(-0.1F, 0.1F, 6.0F);
        this.wingmid2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
        this.facefeathers1 = new BookwormModelRenderer(this, 0, 19, "facefeathers1");
        this.facefeathers1.setRotationPoint(1.9F, 0.3F, 0.0F);
        this.facefeathers1.addBox(0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F);
        this.setRotateAngle(facefeathers1, -0.4553564018453205F, 0.0F, 0.0F);
        this.left2 = new BookwormModelRenderer(this, 12, 20, "left2");
        this.left2.setRotationPoint(3.0F, 2.9F, 4.0F);
        this.left2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(left2, 0.40980330836826856F, 0.0F, 0.0F);
        this.back = new BookwormModelRenderer(this, 51, 0, "back");
        this.back.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.back.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(back, -0.36425021489121656F, 0.0F, 0.0F);
        this.leg1a = new BookwormModelRenderer(this, 0, 2, "leg1a");
        this.leg1a.setRotationPoint(0.5F, 3.4F, 0.1F);
        this.leg1a.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.neckup = new BookwormModelRenderer(this, 13, 21, "neckup");
        this.neckup.setRotationPoint(0.5F, 2.7F, 1.3F);
        this.neckup.addBox(0.0F, -4.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(neckup, 0.36425021489121656F, 0.0F, 0.0F);
        this.body.addChild(this.wing2);
        this.body.addChild(this.neckbase);
        this.beakfeathers.addChild(this.beaktop1);
        this.tailfeathers1a.addChild(this.tailfeathers1b);
        this.beaktop1.addChild(this.beaktop2);
        this.body.addChild(this.tailfeathers1);
        this.tailfeathers1.addChild(this.tailfeathers1a);
        this.neck.addChild(this.neckdown);
        this.neckbase.addChild(this.neck);
        this.wingmid1.addChild(this.wingtip1);
        this.wingmid2.addChild(this.wingtip2);
        this.head.addChild(this.beakfeathers);
        this.left2.addChild(this.leg2a);
        this.neck.addChild(this.head);
        this.leg1a.addChild(this.foot1);
        this.leg2a.addChild(this.foot2);
        this.body.addChild(this.Wing1);
        this.body.addChild(this.tailfeathers2);
        this.beaktop1.addChild(this.beakbot);
        this.beakfeathers.addChild(this.facefeathers2);
        this.body.addChild(this.leg1);
        this.Wing1.addChild(this.wingmid1);
        this.wing2.addChild(this.wingmid2);
        this.beakfeathers.addChild(this.facefeathers1);
        this.body.addChild(this.left2);
        this.body.addChild(this.back);
        this.leg1.addChild(this.leg1a);
        this.neck.addChild(this.neckup);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
}
