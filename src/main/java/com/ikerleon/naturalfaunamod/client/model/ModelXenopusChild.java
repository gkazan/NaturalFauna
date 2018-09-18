package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Xenopus_tadpole - Starcook
 * Created using Tabula 7.0.0
 */
public class ModelXenopusChild extends BookwormModelBase {
    public BookwormModelRenderer shape1;
    public BookwormModelRenderer shape2;
    public BookwormModelRenderer shape3;
    public BookwormModelRenderer shape4;
    public BookwormModelRenderer tail;

    public ModelXenopusChild() {
        this.textureWidth = 10;
        this.textureHeight = 10;
        this.tail = new BookwormModelRenderer(this, 0, 0, "tail");
        this.tail.setRotationPoint(-0.5F, -0.6F, -1.1F);
        this.tail.addBox(0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F);
        this.shape4 = new BookwormModelRenderer(this, 6, 1, "shape4");
        this.shape4.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.shape4.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.shape1 = new BookwormModelRenderer(this, 0, 7, "shape1");
        this.shape1.setRotationPoint(0.0F, 21.5F, -0.8F);
        this.shape1.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F);
        this.shape2 = new BookwormModelRenderer(this, 8, 6, "shape2");
        this.shape2.setRotationPoint(0.4F, 0.0F, -0.6F);
        this.shape2.addBox(-1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F);
        this.setRotateAngle(shape2, -0.01884955592153876F, 0.0F, 0.0F);
        this.shape3 = new BookwormModelRenderer(this, 8, 8, "shape3");
        this.shape3.setRotationPoint(1.6F, 0.0F, -0.6F);
        this.shape3.addBox(-1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F);
        this.setRotateAngle(shape3, -0.01884955592153876F, 0.0F, 0.0F);
        this.shape4.addChild(this.tail);
        this.shape1.addChild(this.shape4);
        this.shape1.addChild(this.shape2);
        this.shape1.addChild(this.shape3);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float scaleFactor= 0.6F;
    	
    	GlStateManager.pushMatrix();
    	GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        this.shape1.render(f5);
        GlStateManager.popMatrix();
    	
    }

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	reset();

    	float globalSpeed = 1.75f;
    	float globalDegree = 1.5F;
    	
    	walk(tail, 0.5f * globalSpeed, 0.8f * globalDegree, false, 0, 0.2f, f, f1);;
    }
}
