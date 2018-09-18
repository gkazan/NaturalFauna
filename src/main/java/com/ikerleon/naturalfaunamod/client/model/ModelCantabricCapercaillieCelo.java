package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * UrogalloCantabrico - ikerleon02
 * Created using Tabula 7.0.0
 */
public class ModelCantabricCapercaillieCelo extends BookwormModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer RightThigh;
    public BookwormModelRenderer LeftThigh;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer RightWing;
    public BookwormModelRenderer LeftWing;
    public BookwormModelRenderer Body2;
    public BookwormModelRenderer RightLeg;
    public BookwormModelRenderer LeftLeg;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Peak;
    public BookwormModelRenderer PeakBase;
    public BookwormModelRenderer Tail3;
    public BookwormModelRenderer Tail5;
    public BookwormModelRenderer Tail2;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer Tail4;

    public ModelCantabricCapercaillieCelo() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Tail4 = new BookwormModelRenderer(this, 31, 0, "Tail4");
        this.Tail4.setRotationPoint(-0.5F, 1.5F, 1.0F);
        this.Tail4.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail4, 1.0471975511965976F, -0.31869712141416456F, -0.136659280431156F);
        this.RightWing = new BookwormModelRenderer(this, 25, 10, "RightWing");
        this.RightWing.setRotationPoint(-3.0F, -2.5F, -2.5F);
        this.RightWing.addBox(-0.6F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(RightWing, -0.5009094953223726F, -0.05235987755982988F, 0.0F);
        this.RightLeg = new BookwormModelRenderer(this, 4, 23, "RightLeg");
        this.RightLeg.setRotationPoint(0.0F, -1.5F, -0.75F);
        this.RightLeg.addBox(-3.3F, 0.0F, -3.0F, 3, 5, 4, 0.0F);
        this.LeftLeg = new BookwormModelRenderer(this, 4, 23, "LeftLeg");
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(0.0F, -1.5F, -0.75F);
        this.LeftLeg.addBox(0.3F, 0.0F, -3.0F, 3, 5, 4, 0.0F);
        this.LeftWing = new BookwormModelRenderer(this, 25, 10, "LeftWing");
        this.LeftWing.mirror = true;
        this.LeftWing.setRotationPoint(3.0F, -2.5F, -2.5F);
        this.LeftWing.addBox(-0.4F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(LeftWing, -0.5009094953223726F, 0.05235987755982988F, 0.0F);
        this.Peak = new BookwormModelRenderer(this, 0, 10, "Peak");
        this.Peak.setRotationPoint(0.5F, -2.0F, -2.0F);
        this.Peak.addBox(-1.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Peak, 0.31869712141416456F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 0, "Neck");
        this.Neck.setRotationPoint(0.0F, -0.85F, -2.7F);
        this.Neck.addBox(-1.5F, -5.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Neck, 0.22759093446006054F, 0.0F, 0.0F);
        this.Body = new BookwormModelRenderer(this, 38, 19, "Body");
        this.Body.setRotationPoint(0.0F, 18.1F, 0.0F);
        this.Body.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 7, 0.0F);
        this.RightThigh = new BookwormModelRenderer(this, 5, 15, "RightThigh");
        this.RightThigh.setRotationPoint(0.0F, 2.4F, 1.0F);
        this.RightThigh.addBox(-3.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.Head = new BookwormModelRenderer(this, 13, 0, "Head");
        this.Head.setRotationPoint(0.0F, -4.7F, -0.5F);
        this.Head.addBox(-1.5F, -2.8F, -2.2F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Head, -0.36425021489121656F, 0.0F, 0.0F);
        this.Tail2 = new BookwormModelRenderer(this, 31, 0, "Tail2");
        this.Tail2.setRotationPoint(0.5F, 1.5F, 1.0F);
        this.Tail2.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail2, 1.0471975511965976F, 0.18203784098300857F, 0.18203784098300857F);
        this.Body2 = new BookwormModelRenderer(this, 23, 26, "Body2");
        this.Body2.mirror = true;
        this.Body2.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.Body2.addBox(-3.0F, 0.0F, 0.0F, 6, 5, 1, 0.0F);
        this.PeakBase = new BookwormModelRenderer(this, 0, 10, "PeakBase");
        this.PeakBase.setRotationPoint(-2.0F, -1.2F, -1.2F);
        this.PeakBase.addBox(1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(PeakBase, -0.18203784098300857F, 0.0F, 0.0F);
        this.Tail5 = new BookwormModelRenderer(this, 48, 0, "Tail5");
        this.Tail5.setRotationPoint(-1.0F, 1.5F, 1.0F);
        this.Tail5.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail5, 1.1383037381507017F, -0.5009094953223726F, -0.36425021489121656F);
        this.Tail1 = new BookwormModelRenderer(this, 48, 0, "Tail1");
        this.Tail1.setRotationPoint(1.0F, 1.5F, 1.0F);
        this.Tail1.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail1, 1.0471975511965976F, 0.4553564018453205F, 0.22759093446006054F);
        this.Tail3 = new BookwormModelRenderer(this, 48, 0, "Tail3");
        this.Tail3.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.Tail3.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail3, 1.0471975511965976F, 0.0F, 0.0F);
        this.LeftThigh = new BookwormModelRenderer(this, 5, 15, "LeftThigh");
        this.LeftThigh.mirror = true;
        this.LeftThigh.setRotationPoint(0.0F, 2.4F, 1.0F);
        this.LeftThigh.addBox(0.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.Body2.addChild(this.Tail4);
        this.Body.addChild(this.RightWing);
        this.RightThigh.addChild(this.RightLeg);
        this.LeftThigh.addChild(this.LeftLeg);
        this.Body.addChild(this.LeftWing);
        this.Head.addChild(this.Peak);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.RightThigh);
        this.Neck.addChild(this.Head);
        this.Body2.addChild(this.Tail2);
        this.Body.addChild(this.Body2);
        this.Head.addChild(this.PeakBase);
        this.Body2.addChild(this.Tail5);
        this.Body2.addChild(this.Tail1);
        this.Body2.addChild(this.Tail3);
        this.Body.addChild(this.LeftThigh);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	reset();

    	float globalSpeed = 2f;
    	float globalHeight = 0.5f;
    	float globalDegree = 2.5F;
    	
    	
    	walk(LeftLeg, 2f * globalSpeed, 0.5f * globalDegree, false, 0, 0.2f, f, f1);
     	walk(RightLeg, 2f * globalSpeed, 0.5f * globalDegree, true, 0, 0.2f, f, f1);
     	walk(Body2, 1f * globalSpeed, 0.25f * globalDegree, false, 0, 0f, f, f1);
     	walk(Neck, 1f * globalSpeed, 0.25f * globalDegree, false, 0, 0f, f, f1);
     	
    	walk(Head, globalSpeed*0.5F, globalDegree, false, 0.0F, 3F, entity.ticksExisted, 0.1F);
    	walk(Peak, globalSpeed*0.5F, 0.4F* globalDegree, false, 0.0F, 3F, entity.ticksExisted, 0.1F);
    	walk(PeakBase, globalSpeed*0.5F, globalDegree, true, 0.0F, 3F, entity.ticksExisted, 0.1F);
    	walk(Neck, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(Body2, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
     	walk(LeftWing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(RightWing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
