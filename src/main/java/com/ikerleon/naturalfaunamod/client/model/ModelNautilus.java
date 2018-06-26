package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelNautilus extends AdvancedModelBase
{
  //fields
    AdvancedModelRenderer coquille;
    AdvancedModelRenderer clapet;
    AdvancedModelRenderer dessous;
    AdvancedModelRenderer corp;
    AdvancedModelRenderer Shape2;
    AdvancedModelRenderer Shape3;
    AdvancedModelRenderer Shape1;
    AdvancedModelRenderer Shape4;
    AdvancedModelRenderer Shape5;
  
  public ModelNautilus()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      coquille = new AdvancedModelRenderer(this, 47, 1);
      coquille.addBox(-1.5F, -2.5F, -2.5F, 3, 5, 5);
      coquille.setRotationPoint(0F, 17F, 0F);
      coquille.setTextureSize(64, 32);
      coquille.mirror = true;
      setRotation(coquille, 0.0743572F, 0F, 0F);
      clapet = new AdvancedModelRenderer(this, 34, 1);
      clapet.addBox(-1.5F, 0F, -3F, 3, 1, 3);
      clapet.setRotationPoint(0F, 17F, -2F);
      clapet.setTextureSize(64, 32);
      clapet.mirror = true;
      setRotation(clapet, 0.2974289F, 0F, 0F);
      dessous = new AdvancedModelRenderer(this, 47, 12);
      dessous.addBox(-1.5F, 0F, -4F, 3, 1, 5);
      dessous.setRotationPoint(0F, 19F, -1F);
      dessous.setTextureSize(64, 32);
      dessous.mirror = true;
      setRotation(dessous, 0.4461433F, 0F, 0F);
      corp = new AdvancedModelRenderer(this, 34, 6);
      corp.addBox(-1F, 0F, -4F, 2, 2, 4);
      corp.setRotationPoint(0F, 17F, -1F);
      corp.setTextureSize(64, 32);
      corp.mirror = true;
      setRotation(corp, 0.4833219F, 0F, 0F);
      Shape2 = new AdvancedModelRenderer(this, 22, 1);
      Shape2.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape2.setRotationPoint(0F, 19F, -4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0.0371786F, 1.524323F, 0.5948578F);
      Shape3 = new AdvancedModelRenderer(this, 22, 5);
      Shape3.addBox(0F, 0F, -1F, 4, 1, 1);
      Shape3.setRotationPoint(0F, 19F, -4F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, -0.1684398F, 2.007645F, 0.3717861F);
      Shape1 = new AdvancedModelRenderer(this, 10, 1);
      Shape1.addBox(0F, 0F, -2F, 1, 1, 2);
      Shape1.setRotationPoint(-1F, 19F, -4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, -0.2602503F, 0F);
      Shape4 = new AdvancedModelRenderer(this, 10, 5);
      Shape4.addBox(0F, 0F, -2F, 1, 1, 2);
      Shape4.setRotationPoint(0F, 19F, -4F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, -0.9666439F, 0F);
      Shape5 = new AdvancedModelRenderer(this, 10, 9);
      Shape5.addBox(-1F, 0F, -2F, 1, 1, 2);
      Shape5.setRotationPoint(0F, 19F, -4F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, -0.1115358F, 1.041001F, 0F);
  }
  @Override
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
  	GlStateManager.pushMatrix();
  	GlStateManager.translate(0F, 0.2F, 0F); 
    coquille.render(f5);
    clapet.render(f5);
    dessous.render(f5);
    corp.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape1.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    GlStateManager.popMatrix();
  }
  
  private void setRotation(AdvancedModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }


}
