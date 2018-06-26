package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.entity.Entity;

public class ModelJackFish extends AdvancedModelBase
{
  //fields
    AdvancedModelRenderer corp1;
    AdvancedModelRenderer tete1;
    AdvancedModelRenderer tete2;
    AdvancedModelRenderer nageoiredorsale;
    AdvancedModelRenderer queue1;
    AdvancedModelRenderer Shape1;
    AdvancedModelRenderer Shape2;
    AdvancedModelRenderer Shape3;
    AdvancedModelRenderer Shape4;
    AdvancedModelRenderer Shape5;
    AdvancedModelRenderer Shape6;
    AdvancedModelRenderer Shape7;
  
  public ModelJackFish()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      corp1 = new AdvancedModelRenderer(this, 0, 0);
      corp1.addBox(-5F, -2F, -1.5F, 9, 5, 3);
      corp1.setRotationPoint(1F, 15F, 0F);
      corp1.setTextureSize(128, 128);
      corp1.mirror = true;
      setRotation(corp1, 0F, 0F, 0F);
      tete1 = new AdvancedModelRenderer(this, 0, 0);
      tete1.addBox(-2F, -1F, -1.5F, 3, 4, 3);
      tete1.setRotationPoint(-3F, 15F, 0F);
      tete1.setTextureSize(128, 128);
      tete1.mirror = true;
      setRotation(tete1, 0F, 0F, 0.6320364F);
      tete2 = new AdvancedModelRenderer(this, 0, 0);
      tete2.addBox(-3F, -2F, -1.5F, 2, 1, 3);
      tete2.setRotationPoint(-3F, 19F, 0F);
      tete2.setTextureSize(128, 128);
      tete2.mirror = true;
      setRotation(tete2, 0F, 0F, 0.1858931F);
      nageoiredorsale = new AdvancedModelRenderer(this, 0, 0);
      nageoiredorsale.addBox(0F, -2F, 0F, 5, 2, 0);
      nageoiredorsale.setRotationPoint(-1F, 13F, 0F);
      nageoiredorsale.setTextureSize(128, 128);
      nageoiredorsale.mirror = true;
      setRotation(nageoiredorsale, 0F, 0F, 0.0743572F);
      queue1 = new AdvancedModelRenderer(this, 0, 0);
      queue1.addBox(0F, -1F, -1.5F, 3, 2, 3);
      queue1.setRotationPoint(5F, 15.5F, 0F);
      queue1.setTextureSize(128, 128);
      queue1.mirror = true;
      setRotation(queue1, 0F, 0F, 0F);
      Shape1 = new AdvancedModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, -1.5F, 1, 3, 3);
      Shape1.setRotationPoint(4F, 14F, 0F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, -1.041001F);
      Shape2 = new AdvancedModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, -1.5F, 2, 3, 3);
      Shape2.setRotationPoint(5F, 18F, 0F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, -2.267895F);
      Shape3 = new AdvancedModelRenderer(this, 0, 0);
      Shape3.addBox(0F, -3.5F, 0F, 4, 7, 0);
      Shape3.setRotationPoint(7F, 15.5F, 0F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0.1487144F);
      Shape4 = new AdvancedModelRenderer(this, 0, 0);
      Shape4.addBox(0F, -2F, 0F, 4, 2, 0);
      Shape4.setRotationPoint(-2F, 17F, 1.266667F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, -0.2974289F, -0.4833219F, -0.2974289F);
      Shape5 = new AdvancedModelRenderer(this, 0, 0);
      Shape5.addBox(0F, -2F, 0F, 4, 2, 0);
      Shape5.setRotationPoint(-2F, 17F, -1F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0.2974216F, 0.5576792F, -0.2602503F);
      Shape6 = new AdvancedModelRenderer(this, 0, 0);
      Shape6.addBox(-1F, 0F, 0F, 2, 4, 0);
      Shape6.setRotationPoint(2F, 18F, 0F);
      Shape6.setTextureSize(128, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, -1.524323F);
      Shape7 = new AdvancedModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 2, 2, 0);
      Shape7.setRotationPoint(-2F, 18F, 0F);
      Shape7.setTextureSize(128, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, -0.4833219F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    corp1.render(f5);
    tete1.render(f5);
    tete2.render(f5);
    nageoiredorsale.render(f5);
    queue1.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
  }
  
  private void setRotation(AdvancedModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
