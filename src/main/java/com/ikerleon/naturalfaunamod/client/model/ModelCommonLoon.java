package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

public class ModelCommonLoon extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neckBase;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer leftLeg;
    public BookwormModelRenderer rightLeg;
    public BookwormModelRenderer leftWing;
    public BookwormModelRenderer rightWing;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer leftToes;
    public BookwormModelRenderer leftToes1;
    public BookwormModelRenderer leftToes2;
    public BookwormModelRenderer rightToes;
    public BookwormModelRenderer rightToes1;
    public BookwormModelRenderer rightToes2;

    public ModelCommonLoon() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.rightWing = new BookwormModelRenderer(this, 0, 0, "rightWing");
        this.rightWing.setRotationPoint(-1.9F, 0.2F, 0.5F);
        this.rightWing.addBox(-0.4F, 0.0F, -1.3F, 1, 6, 3, 0.0F);
        this.beak = new BookwormModelRenderer(this, 9, 28, "beak");
        this.beak.setRotationPoint(0.5F, 1.8F, -0.3F);
        this.beak.addBox(-1.0F, 0.0F, -0.7F, 1, 2, 1, 0.0F);
        this.setRotateAngle(beak, 0.1010545636904717F, 0.0F, 0.0F);
        this.leftToes1 = new BookwormModelRenderer(this, 10, 24, "leftToes1");
        this.leftToes1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToes1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftToes1, -0.0F, 0.3050835532486088F, 0.0F);
        this.body = new BookwormModelRenderer(this, 48, 21, "body");
        this.body.setRotationPoint(0.0F, 17.6F, 0.0F);
        this.body.addBox(-2.0F, -0.1F, -1.7F, 4, 7, 4, 0.0F);
        this.setRotateAngle(body, 1.052957137728179F, 0.0F, 0.0F);
        this.leftToes2 = new BookwormModelRenderer(this, 10, 24, "leftToes2");
        this.leftToes2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToes2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftToes2, 0.0F, -0.3405137370640937F, 0.0F);
        this.head = new BookwormModelRenderer(this, 0, 22, "head");
        this.head.setRotationPoint(-1.0F, 2.5F, -0.8F);
        this.head.addBox(-1.0F, -1.0F, -1.7F, 2, 3, 2, 0.0F);
        this.setRotateAngle(head, 1.8259634634364674F, 0.0F, 0.0F);
        this.leftLeg = new BookwormModelRenderer(this, 15, 28, "leftLeg");
        this.leftLeg.setRotationPoint(1.1F, 5.4F, -0.9F);
        this.leftLeg.addBox(-0.5F, -0.5F, -3.1F, 1, 1, 3, 0.0F);
        this.setRotateAngle(leftLeg, 0.5235987755982988F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 27, "neck");
        this.neck.setRotationPoint(0.5F, 2.7F, 0.8F);
        this.neck.addBox(-2.0F, -0.1F, -1.7F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, -0.4612905213021013F, 0.0F, 0.0F);
        this.rightToes1 = new BookwormModelRenderer(this, 10, 24, "rightToes1");
        this.rightToes1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToes1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightToes1, -0.0F, 0.3050835532486088F, 0.0F);
        this.neckBase = new BookwormModelRenderer(this, 52, 15, "neckBase");
        this.neckBase.setRotationPoint(0.5F, 0.8F, -0.5F);
        this.neckBase.addBox(-2.0F, -0.1F, -1.7F, 3, 3, 3, 0.0F);
        this.setRotateAngle(neckBase, 2.509608931442646F, 0.0F, 0.0F);
        this.leftWing = new BookwormModelRenderer(this, 10, 0, "leftWing");
        this.leftWing.setRotationPoint(1.9F, 0.2F, 0.5F);
        this.leftWing.addBox(-0.4F, 0.0F, -1.3F, 1, 6, 3, 0.0F);
        this.rightLeg = new BookwormModelRenderer(this, 15, 28, "rightLeg");
        this.rightLeg.setRotationPoint(-1.1F, 5.4F, -0.9F);
        this.rightLeg.addBox(-0.5F, -0.5F, -3.1F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rightLeg, 0.5235987755982988F, 0.0F, 0.0F);
        this.rightToes = new BookwormModelRenderer(this, 10, 24, "rightToes");
        this.rightToes.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.rightToes.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightToes, -1.5114551322270893F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 38, 19, "tail2");
        this.tail2.setRotationPoint(0.5F, 5.6F, 0.0F);
        this.tail2.addBox(-2.0F, -0.1F, -1.7F, 3, 3, 2, 0.0F);
        this.setRotateAngle(tail2, 0.7548549014875475F, 0.0F, 0.0F);
        this.tail = new BookwormModelRenderer(this, 35, 26, "tail");
        this.tail.setRotationPoint(0.5F, 6.7F, 1.8F);
        this.tail.addBox(-2.0F, -0.1F, -1.7F, 3, 4, 2, 0.0F);
        this.setRotateAngle(tail, 0.24452062820440557F, 0.0F, 0.0F);
        this.rightToes2 = new BookwormModelRenderer(this, 10, 24, "rightToes2");
        this.rightToes2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToes2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightToes2, 0.0F, -0.3405137370640937F, 0.0F);
        this.leftToes = new BookwormModelRenderer(this, 10, 24, "leftToes");
        this.leftToes.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.leftToes.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftToes, -1.5114551322270893F, 0.0F, 0.0F);
        this.body.addChild(this.rightWing);
        this.head.addChild(this.beak);
        this.leftToes.addChild(this.leftToes1);
        this.leftToes.addChild(this.leftToes2);
        this.neck.addChild(this.head);
        this.body.addChild(this.leftLeg);
        this.neckBase.addChild(this.neck);
        this.rightToes.addChild(this.rightToes1);
        this.body.addChild(this.neckBase);
        this.body.addChild(this.leftWing);
        this.body.addChild(this.rightLeg);
        this.rightLeg.addChild(this.rightToes);
        this.body.addChild(this.tail2);
        this.body.addChild(this.tail);
        this.rightToes.addChild(this.rightToes2);
        this.leftLeg.addChild(this.leftToes);
        save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        reset();

        float globalSpeed = 1.75f;
        float globalHeight = 0.5f;
        float globalDegree = 1.5F;

        this.head.rotateAngleY = (netHeadYaw * 0.017453292F);
        this.head.rotateAngleX = (headPitch * 0.017453292F) + 1.8259634634364674F;

        this.rightLeg.rotateAngleX = 1F * limbSwingAmount * (0.8F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 0F) + 0.5235987755982988F;
        this.leftLeg.rotateAngleX = -1F * limbSwingAmount * (0.8F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 0F) + 0.5235987755982988F;
        this.rightToes.rotateAngleX = 1F * limbSwingAmount * (0.5F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 2.5F) + -1.5114551322270893F;
        this.leftToes.rotateAngleX = -1F * limbSwingAmount * (0.5F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 2.5F) + -1.5114551322270893F;
        this.tail.rotateAngleX = -1F * limbSwingAmount * (0.1F * globalDegree) * MathHelper.cos(limbSwing * (0.8F * globalSpeed) + 2.5F) + 0.24452062820440557F;
        this.neck.rotateAngleX = -1F * limbSwingAmount * (0.1F * globalDegree) * MathHelper.cos(limbSwing * (0.8F * globalSpeed) + 2.5F) + -0.4612905213021013F;
        this.head.rotateAngleX = 1F * limbSwingAmount * (0.2F * globalDegree) * MathHelper.cos(limbSwing * (0.8F * globalSpeed) + 2.5F) + 1.8259634634364674F;

        this.neck.rotateAngleX = 1F * 0.5F * 0.08F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + -0.4612905213021013F;
        this.head.rotateAngleX = -1F * 0.5F * 0.1F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + 1.8259634634364674F;
        this.tail.rotateAngleX = 1F * 0.5F * 0.08F * MathHelper.cos(entity.ticksExisted * (0.2F * globalSpeed) + 2.5F) + 0.24452062820440557F;
        this.leftWing.rotateAngleX = this.rightWing.rotateAngleX =
                -1F * 0.5F * 0.04F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + 0F;
    }
}
