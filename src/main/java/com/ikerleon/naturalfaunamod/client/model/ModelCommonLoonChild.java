package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

public class ModelCommonLoonChild extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer tail;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer rightLeg;
    public BookwormModelRenderer leftWing;
    public BookwormModelRenderer rightWing;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer leftLeg;
    public BookwormModelRenderer rightToes;
    public BookwormModelRenderer rightToes1;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer leftToes;
    public BookwormModelRenderer leftToes1;

    public ModelCommonLoonChild() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.rightToes = new BookwormModelRenderer(this, 10, 24, "rightToes");
        this.rightToes.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.rightToes.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightToes, -1.5114551322270893F, 0.0F, 0.03473205211468716F);
        this.beak = new BookwormModelRenderer(this, 9, 28, "beak");
        this.beak.setRotationPoint(0.5F, 2.8F, -0.3F);
        this.beak.addBox(-1.0F, 0.0F, -0.7F, 1, 2, 1, 0.0F);
        this.setRotateAngle(beak, 0.1010545636904717F, 0.0F, 0.0F);
        this.leftToes1 = new BookwormModelRenderer(this, 10, 24, "leftToes1");
        this.leftToes1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToes1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftToes1, 0.0F, 0.24713862208239704F, 0.0F);
        this.tail = new BookwormModelRenderer(this, 35, 26, "tail");
        this.tail.setRotationPoint(0.5F, 3.7F, 1.8F);
        this.tail.addBox(-2.0F, -0.1F, -1.7F, 2, 2, 1, 0.0F);
        this.setRotateAngle(tail, 0.24452062820440557F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 0, 22, "head");
        this.head.setRotationPoint(-1.0F, 2.2F, -1.9F);
        this.head.addBox(-1.0F, 0.0F, -1.7F, 2, 3, 2, 0.0F);
        this.setRotateAngle(head, 1.6175711507483448F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 48, 21, "body");
        this.body.setRotationPoint(0.0F, 19.5F, -0.2F);
        this.body.addBox(-2.0F, -0.1F, -1.7F, 3, 4, 3, 0.0F);
        this.setRotateAngle(body, 1.052957137728179F, 0.0F, 0.0F);
        this.rightWing = new BookwormModelRenderer(this, 0, 0, "i");
        this.rightWing.setRotationPoint(-1.9F, 0.2F, 1.6F);
        this.rightWing.addBox(-0.4F, 0.0F, -2.3F, 1, 3, 2, 0.0F);
        this.rightToes1 = new BookwormModelRenderer(this, 10, 24, "");
        this.rightToes1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToes1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightToes1, 0.0F, 0.24713862208239704F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 38, 19, "rightToes1");
        this.tail2.setRotationPoint(0.5F, 2.7F, 0.4F);
        this.tail2.addBox(-2.0F, -0.1F, -1.7F, 2, 2, 1, 0.0F);
        this.setRotateAngle(tail2, 0.7675958050271061F, 0.0F, 0.0F);
        this.leftLeg = new BookwormModelRenderer(this, 15, 28, "tail2");
        this.leftLeg.setRotationPoint(0.2F, 2.5F, -0.3F);
        this.leftLeg.addBox(-0.5F, -0.5F, -3.1F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftLeg, 0.5235987755982988F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 27, "leftLeg");
        this.neck.setRotationPoint(0.5F, 0.2F, -0.6F);
        this.neck.addBox(-2.0F, -0.1F, -1.7F, 2, 2, 2, 0.0F);
        this.setRotateAngle(neck, 2.161066679819379F, 0.0F, 0.0F);
        this.leftWing = new BookwormModelRenderer(this, 10, 0, "neck");
        this.leftWing.setRotationPoint(0.3F, 0.2F, 1.6F);
        this.leftWing.addBox(0.0F, 0.0F, -2.3F, 1, 3, 2, 0.0F);
        this.rightLeg = new BookwormModelRenderer(this, 15, 28, "leftWing");
        this.rightLeg.setRotationPoint(-1.1F, 2.5F, -0.3F);
        this.rightLeg.addBox(-0.5F, -0.5F, -3.1F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightLeg, 0.5235987755982988F, 0.0F, 0.0F);
        this.leftToes = new BookwormModelRenderer(this, 10, 24, "rightLeg");
        this.leftToes.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.leftToes.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftToes, -1.5114551322270893F, -0.02897246558310587F, 0.2893755899806598F);
        this.rightLeg.addChild(this.rightToes);
        this.head.addChild(this.beak);
        this.leftToes.addChild(this.leftToes1);
        this.body.addChild(this.tail);
        this.neck.addChild(this.head);
        this.body.addChild(this.rightWing);
        this.rightToes.addChild(this.rightToes1);
        this.body.addChild(this.tail2);
        this.body.addChild(this.leftLeg);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftWing);
        this.body.addChild(this.rightLeg);
        this.leftLeg.addChild(this.leftToes);
        save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        reset();

        float globalSpeed = 1.75f;
        float globalHeight = 0.5f;
        float globalDegree = 1.5F;

        //this.head.rotateAngleY = (netHeadYaw * 0.017453292F);
        this.head.rotateAngleX = (headPitch * 0.017453292F) + 1.6175711507483448F;

        this.rightLeg.rotateAngleX = 1F * limbSwingAmount * (0.8F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 0F) + 0.5235987755982988F;
        this.leftLeg.rotateAngleX = -1F * limbSwingAmount * (0.8F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 0F) + 0.5235987755982988F;
        this.rightToes.rotateAngleX = 1F * limbSwingAmount * (0.5F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 2.5F) + -1.5114551322270893F;
        this.leftToes.rotateAngleX = -1F * limbSwingAmount * (0.5F * globalDegree) * MathHelper.cos(limbSwing * (0.5F * globalSpeed) + 2.5F) + -1.5114551322270893F;
        this.tail.rotateAngleX = -1F * limbSwingAmount * (0.1F * globalDegree) * MathHelper.cos(limbSwing * (0.8F * globalSpeed) + 2.5F) + 0.24452062820440557F;
        this.neck.rotateAngleX = -1F * limbSwingAmount * (0.1F * globalDegree) * MathHelper.cos(limbSwing * (0.8F * globalSpeed) + 2.5F) + 2.161066679819379F;
        this.head.rotateAngleX = 1F * limbSwingAmount * (0.2F * globalDegree) * MathHelper.cos(limbSwing * (0.8F * globalSpeed) + 2.5F) + 1.6175711507483448F;

        this.neck.rotateAngleX = 1F * 0.5F * 0.08F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + 2.161066679819379F;
        this.head.rotateAngleX = -1F * 0.5F * 0.1F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + 1.6175711507483448F;
        this.tail.rotateAngleX = 1F * 0.5F * 0.08F * MathHelper.cos(entity.ticksExisted * (0.2F * globalSpeed) + 2.5F) + 0.24452062820440557F;
        this.leftWing.rotateAngleX = this.rightWing.rotateAngleX =
                -1F * 0.5F * 0.04F * MathHelper.cos(entity.ticksExisted * (0.17f * globalSpeed) + 2.5F) + 0F;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(BookwormModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
