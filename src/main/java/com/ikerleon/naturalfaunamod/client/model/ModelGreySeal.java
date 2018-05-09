package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;

import net.minecraft.entity.Entity;

public class ModelGreySeal extends MowzieModelBase
{
  //fields
    MowzieModelRenderer corp1;
    MowzieModelRenderer tete1;
    MowzieModelRenderer cou1;
    MowzieModelRenderer museau1;
    MowzieModelRenderer brasgauche;
    MowzieModelRenderer brasdroit;
    MowzieModelRenderer pattegauche;
    MowzieModelRenderer pattedroite;
    MowzieModelRenderer bassin1;
    MowzieModelRenderer bassin2;
    MowzieModelRenderer derrier;
    MowzieModelRenderer derrier2;
    MowzieModelRenderer patteargauche;
    MowzieModelRenderer patteardroite;
  
  public ModelGreySeal()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      corp1 = new MowzieModelRenderer(this, 72, 0);
      corp1.addBox(-3F, -3F, -10F, 10, 8, 18);
      corp1.setRotationPoint(-2F, 19F, 0F);
      corp1.setTextureSize(128, 128);
      corp1.mirror = true;
      setRotation(corp1, 0F, 0F, 0F);
      tete1 = new MowzieModelRenderer(this, 89, 29);
      tete1.addBox(-4F, -1F, -3F, 8, 7, 8);
      tete1.setRotationPoint(0F, 14F, -12F);
      tete1.setTextureSize(128, 128);
      tete1.mirror = true;
      setRotation(tete1, 0F, 0F, 0F);
      cou1 = new MowzieModelRenderer(this, 46, 1);
      cou1.addBox(-4F, -2F, 0F, 8, 3, 4);
      cou1.setRotationPoint(0F, 19F, -12F);
      cou1.setTextureSize(128, 128);
      cou1.mirror = true;
      setRotation(cou1, -0.8179294F, 0F, 0F);
      museau1 = new MowzieModelRenderer(this, 51, 11);
      museau1.addBox(-3F, 0F, -1F, 6, 4, 2);
      museau1.setRotationPoint(0F, 16F, -16F);
      museau1.setTextureSize(128, 128);
      museau1.mirror = true;
      setRotation(museau1, 0F, 0F, 0F);
      brasgauche = new MowzieModelRenderer(this, 17, 38);
      brasgauche.addBox(-2F, 0F, -1F, 2, 5, 4);
      brasgauche.setRotationPoint(5F, 19F, -6F);
      brasgauche.setTextureSize(128, 128);
      brasgauche.mirror = true;
      setRotation(brasgauche, 0F, 0F, -0.4461433F);
      brasdroit = new MowzieModelRenderer(this, 2, 38);
      brasdroit.addBox(0F, 0F, 0F, 2, 5, 4);
      brasdroit.setRotationPoint(-5F, 19F, -7F);
      brasdroit.setTextureSize(128, 128);
      brasdroit.mirror = true;
      setRotation(brasdroit, 0F, 0F, 0.4439746F);
      pattegauche = new MowzieModelRenderer(this, 1, 8);
      pattegauche.addBox(0F, 0F, -2F, 6, 1, 4);
      pattegauche.setRotationPoint(6F, 23F, -5F);
      pattegauche.setTextureSize(128, 128);
      pattegauche.mirror = true;
      setRotation(pattegauche, 0F, -0.4089647F, 0.0743572F);
      pattedroite = new MowzieModelRenderer(this, 0, 0);
      pattedroite.addBox(-6F, 0F, -3F, 6, 1, 4);
      pattedroite.setRotationPoint(-6F, 23F, -3.666667F);
      pattedroite.setTextureSize(128, 128);
      pattedroite.mirror = true;
      setRotation(pattedroite, 0F, 0.2974297F, -0.074351F);
      bassin1 = new MowzieModelRenderer(this, 45, 29);
      bassin1.addBox(-5F, -3F, 0F, 9, 5, 12);
      bassin1.setRotationPoint(0.5F, 22F, 8F);
      bassin1.setTextureSize(128, 128);
      bassin1.mirror = true;
      setRotation(bassin1, 0F, 0F, 0F);
      bassin2 = new MowzieModelRenderer(this, 45, 51);
      bassin2.addBox(-4.5F, 0F, -5F, 9, 3, 12);
      bassin2.setRotationPoint(0F, 17F, 13F);
      bassin2.setTextureSize(128, 128);
      bassin2.mirror = true;
      setRotation(bassin2, -0.2217595F, 0F, 0F);
      derrier = new MowzieModelRenderer(this, 27, 0);
      derrier.addBox(-3F, 0F, 1F, 6, 5, 2);
      derrier.setRotationPoint(0F, 21F, 18F);
      derrier.setTextureSize(128, 128);
      derrier.mirror = true;
      setRotation(derrier, 0.7761582F, 0F, 0F);
      derrier2 = new MowzieModelRenderer(this, 27, 10);
      derrier2.addBox(-3F, -2F, -1F, 6, 4, 3);
      derrier2.setRotationPoint(0F, 22F, 20F);
      derrier2.setTextureSize(128, 128);
      derrier2.mirror = true;
      setRotation(derrier2, -1.570796F, 0F, 0F);
      patteargauche = new MowzieModelRenderer(this, 9, 29);
      patteargauche.addBox(0F, 0F, -1F, 7, 1, 4);
      patteargauche.setRotationPoint(2F, 23F, 21F);
      patteargauche.setTextureSize(128, 128);
      patteargauche.mirror = true;
      setRotation(patteargauche, 0F, 0.2932736F, 0.0743572F);
      patteardroite = new MowzieModelRenderer(this, 1, 21);
      patteardroite.addBox(-7F, 0F, 0F, 7, 1, 4);
      patteardroite.setRotationPoint(-2F, 23F, 20F);
      patteardroite.setTextureSize(128, 128);
      patteardroite.mirror = true;
      setRotation(patteardroite, 0F, -0.3695991F, -0.074351F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    corp1.render(f5);
    tete1.render(f5);
    cou1.render(f5);
    museau1.render(f5);
    brasgauche.render(f5);
    brasdroit.render(f5);
    pattegauche.render(f5);
    pattedroite.render(f5);
    bassin1.render(f5);
    bassin2.render(f5);
    derrier.render(f5);
    derrier2.render(f5);
    patteargauche.render(f5);
    patteardroite.render(f5);
  }
  
  private void setRotation(MowzieModelRenderer model, float x, float y, float z)
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
