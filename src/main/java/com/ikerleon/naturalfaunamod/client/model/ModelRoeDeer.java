package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelRoeDeer extends MowzieModelBase
{
  //fields
    MowzieModelRenderer ventre;
    MowzieModelRenderer patte_avant_gauche;
    MowzieModelRenderer patte_avant_droite;
    MowzieModelRenderer patte_arriere_gauche;
    MowzieModelRenderer patte_arriere_droite;
    MowzieModelRenderer coup;
    MowzieModelRenderer tete;
    MowzieModelRenderer Museau;
    MowzieModelRenderer front;
    MowzieModelRenderer oreille_gauche;
    MowzieModelRenderer oreille_droite;
    MowzieModelRenderer corne_droite;
    MowzieModelRenderer corne_gauche;
  
  public ModelRoeDeer()
  {
    textureWidth = 128;
    textureHeight = 256;
    
      ventre = new MowzieModelRenderer(this, 55, 117);
      ventre.addBox(0F, 0F, 0F, 10, 10, 26);
      ventre.setRotationPoint(-8F, 0F, 0F);
      ventre.setTextureSize(128, 256);
      ventre.mirror = true;
      setRotation(ventre, 0F, 0F, 0F);
      patte_avant_gauche = new MowzieModelRenderer(this, 106, 1);
      patte_avant_gauche.addBox(-2F, 0F, -3F, 5, 21, 5);
      patte_avant_gauche.setRotationPoint(0F, 3F, 4F);
      patte_avant_gauche.setTextureSize(128, 256);
      patte_avant_gauche.mirror = true;
      setRotation(patte_avant_gauche, 0F, 0F, 0F);
      patte_avant_droite = new MowzieModelRenderer(this, 24, 0);
      patte_avant_droite.addBox(-3F, 0F, -3F, 5, 20, 5);
      patte_avant_droite.setRotationPoint(-6F, 4F, 4F);
      patte_avant_droite.setTextureSize(128, 256);
      patte_avant_droite.mirror = true;
      setRotation(patte_avant_droite, 0F, 0F, 0F);
      patte_arriere_gauche = new MowzieModelRenderer(this, 82, 0);
      patte_arriere_gauche.addBox(-2F, 0F, -2F, 5, 21, 5);
      patte_arriere_gauche.setRotationPoint(0F, 3F, 22F);
      patte_arriere_gauche.setTextureSize(128, 256);
      patte_arriere_gauche.mirror = true;
      setRotation(patte_arriere_gauche, 0F, 0F, 0F);
      patte_arriere_droite = new MowzieModelRenderer(this, 53, 0);
      patte_arriere_droite.addBox(-3F, 0F, -3F, 5, 21, 5);
      patte_arriere_droite.setRotationPoint(-6F, 4F, 23F);
      patte_arriere_droite.setTextureSize(128, 256);
      patte_arriere_droite.mirror = true;
      setRotation(patte_arriere_droite, 0F, 0F, 0F);
      coup = new MowzieModelRenderer(this, 85, 34);
      coup.addBox(-3F, -2F, -12F, 6, 5, 12);
      coup.setRotationPoint(-3F, 4F, 3F);
      coup.setTextureSize(128, 256);
      coup.mirror = true;
      setRotation(coup, -0.669215F, 0F, 0F);
      tete = new MowzieModelRenderer(this, 47, 33);
      tete.addBox(-4F, -2F, -9F, 6, 5, 9);
      tete.setRotationPoint(-2F, -3F, -5F);
      tete.setTextureSize(128, 256);
      tete.mirror = true;
      setRotation(tete, 0.0743572F, 0F, 0F);
      Museau = new MowzieModelRenderer(this, 24, 33);
      Museau.addBox(-2F, -2F, -6F, 4, 4, 6);
      Museau.setRotationPoint(-3F, -2F, -12F);
      Museau.setTextureSize(128, 256);
      Museau.mirror = true;
      setRotation(Museau, 0.0743572F, 0F, 0F);
      front = new MowzieModelRenderer(this, 0, 107);
      front.addBox(-3F, -2F, -3F, 5, 5, 6);
      front.setRotationPoint(-2.333333F, -4F, -9F);
      front.setTextureSize(128, 256);
      front.mirror = true;
      setRotation(front, 0.1115358F, 0F, 0F);
      oreille_gauche = new MowzieModelRenderer(this, 0, 85);
      oreille_gauche.addBox(0F, -4F, 0F, 2, 4, 1);
      oreille_gauche.setRotationPoint(-2F, -5F, -6F);
      oreille_gauche.setTextureSize(128, 256);
      oreille_gauche.mirror = true;
      setRotation(oreille_gauche, 0F, 0F, 0F);
      oreille_droite = new MowzieModelRenderer(this, 0, 76);
      oreille_droite.addBox(0F, 0F, 0F, 2, 4, 1);
      oreille_droite.setRotationPoint(-6F, -9F, -6F);
      oreille_droite.setTextureSize(128, 256);
      oreille_droite.mirror = true;
      setRotation(oreille_droite, 0F, 0F, 0F);
      corne_droite = new MowzieModelRenderer(this, 0, 61);
      corne_droite.addBox(0F, -5F, 0F, 1, 6, 1);
      corne_droite.setRotationPoint(-5F, -5F, -10F);
      corne_droite.setTextureSize(128, 256);
      corne_droite.mirror = true;
      setRotation(corne_droite, 0.3717861F, 0F, 0F);
      corne_gauche = new MowzieModelRenderer(this, 0, 47);
      corne_gauche.addBox(0F, 0F, 0F, 1, 6, 1);
      corne_gauche.setRotationPoint(-2F, -10F, -12F);
      corne_gauche.setTextureSize(128, 256);
      corne_gauche.mirror = true;
      setRotation(corne_gauche, 0.3717861F, 0F, 0F);
  }
  
  @Override
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    float scaleFactor= 0.6F;
	
	GlStateManager.pushMatrix();
	GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor); 
	GlStateManager.translate(0F, 1F, 0F); 
    ventre.render(f5);
    patte_avant_gauche.render(f5);
    patte_avant_droite.render(f5);
    patte_arriere_gauche.render(f5);
    patte_arriere_droite.render(f5);
    coup.render(f5);
    tete.render(f5);
    Museau.render(f5);
    front.render(f5);
    oreille_gauche.render(f5);
    oreille_droite.render(f5);
    corne_droite.render(f5);
    corne_gauche.render(f5);
	GlStateManager.popMatrix();
    
  }
  
  private void setRotation(MowzieModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
