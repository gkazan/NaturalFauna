package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.MowzieModelBase;
import org.zawamod.client.model.llibrary.MowzieModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCourser extends MowzieModelBase {
    public MowzieModelRenderer cuerpo2;
    public MowzieModelRenderer cuello1;
    public MowzieModelRenderer cuello3;
    public MowzieModelRenderer cuello2;
    public MowzieModelRenderer pata1izq;
    public MowzieModelRenderer cuerpo;
    public MowzieModelRenderer alaizq;
    public MowzieModelRenderer cola;
    public MowzieModelRenderer cabeza;
    public MowzieModelRenderer pata1der;
    public MowzieModelRenderer alader;
    public MowzieModelRenderer pata1izqChild;
    public MowzieModelRenderer pata1izqChildChild;
    public MowzieModelRenderer cabezaChild;
    public MowzieModelRenderer cabezaChild_1;
    public MowzieModelRenderer pata1derChild;
    public MowzieModelRenderer pata1derChildChild;

    public ModelCourser() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.pata1izqChild = new MowzieModelRenderer(this, 17, 22);
        this.pata1izqChild.setRotationPoint(0.0F, 2.299999952316284F, -0.8999999761581421F);
        this.pata1izqChild.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(pata1izqChild, -0.17788837850093842F, 0.0F, 0.0F);
        this.cabeza = new MowzieModelRenderer(this, 55, 1);
        this.cabeza.setRotationPoint(0.5F, 10.0F, -3.700000047683716F);
        this.cabeza.addBox(-1.0F, -2.0F, -1.2999999523162842F, 2, 2, 2, 0.0F);
        this.pata1der = new MowzieModelRenderer(this, 10, 17);
        this.pata1der.setRotationPoint(0.8F, 18.0F, -0.02F);
        this.pata1der.addBox(0.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(pata1der, 0.10471975511965977F, 0.0F, 0.0F);
        this.cuerpo = new MowzieModelRenderer(this, 36, 22);
        this.cuerpo.setRotationPoint(0.5F, 13.833330154418945F, -1.5F);
        this.cuerpo.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 5, 0.0F);
        this.setRotateAngle(cuerpo, -0.7365987896919252F, 0.0F, 0.0F);
        this.cuello1 = new MowzieModelRenderer(this, 53, 17);
        this.cuello1.setRotationPoint(0.5F, 16.600000381469727F, -3.700000047683716F);
        this.cuello1.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(cuello1, 0.4758814871311188F, 0.0F, 0.0F);
        this.cuello2 = new MowzieModelRenderer(this, 55, 11);
        this.cuello2.setRotationPoint(0.5F, 15.300000190734863F, -4.0F);
        this.cuello2.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(cuello2, 0.14871950447559357F, 0.0F, 0.0F);
        this.pata1izq = new MowzieModelRenderer(this, 17, 17);
        this.pata1izq.setRotationPoint(-0.8F, 18.0F, 0.0F);
        this.pata1izq.addBox(0.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(pata1izq, 0.10471975511965977F, 0.0F, 0.0F);
        this.cola = new MowzieModelRenderer(this, 36, 11);
        this.cola.setRotationPoint(0.5F, 19.0F, 4.199999809265137F);
        this.cola.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(cola, -0.8328012824058533F, 0.0F, 0.0F);
        this.alader = new MowzieModelRenderer(this, 23, 12);
        this.alader.setRotationPoint(2.0F, 17.946670532226562F, 4.0F);
        this.alader.addBox(0.0F, 0.0F, -6.0F, 0, 3, 6, 0.0F);
        this.setRotateAngle(alader, -0.5353797078132629F, 0.0F, 0.0F);
        this.pata1derChild = new MowzieModelRenderer(this, 10, 22);
        this.pata1derChild.setRotationPoint(0.0F, 2.299999952316284F, -0.8999999761581421F);
        this.pata1derChild.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(pata1derChild, -0.17788837850093842F, 0.0F, 0.0F);
        this.pata1izqChildChild = new MowzieModelRenderer(this, 16, 27);
        this.pata1izqChildChild.setRotationPoint(0.0F, 2.5F, 1.0F);
        this.pata1izqChildChild.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(pata1izqChildChild, 0.05951572582125664F, 0.0F, 0.0F);
        this.cuerpo2 = new MowzieModelRenderer(this, 36, 15);
        this.cuerpo2.setRotationPoint(0.5F, 17.600000381469727F, 3.0F);
        this.cuerpo2.addBox(-1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(cuerpo2, -0.5985780954360962F, 0.0F, 0.0F);
        this.alaizq = new MowzieModelRenderer(this, 23, 22);
        this.alaizq.setRotationPoint(-1.0F, 17.899999618530273F, 4.0F);
        this.alaizq.addBox(0.0F, 0.0F, -6.0F, 0, 3, 6, 0.0F);
        this.setRotateAngle(alaizq, -0.5353797078132629F, 0.0F, 0.0F);
        this.cabezaChild = new MowzieModelRenderer(this, 50, 3);
        this.cabezaChild.setRotationPoint(-0.5F, -1.2999999523162842F, -3.200000047683716F);
        this.cabezaChild.addBox(0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F);
        this.setRotateAngle(cabezaChild, 0.20821778476238248F, 0.0F, 0.0F);
        this.pata1derChildChild = new MowzieModelRenderer(this, 9, 27);
        this.pata1derChildChild.setRotationPoint(0.0F, 2.5F, 1.0F);
        this.pata1derChildChild.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(pata1derChildChild, 0.05951572582125664F, 0.0F, 0.0F);
        this.cabezaChild_1 = new MowzieModelRenderer(this, 50, 1);
        this.cabezaChild_1.setRotationPoint(0.0F, -1.5F, -2.299999952316284F);
        this.cabezaChild_1.addBox(-0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F);
        this.setRotateAngle(cabezaChild_1, -0.29740411043167114F, 0.0F, 0.0F);
        this.cuello3 = new MowzieModelRenderer(this, 58, 6);
        this.cuello3.setRotationPoint(0.0F, 12.906669616699219F, -4.0F);
        this.cuello3.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(cuello3, 0.052359901368618005F, 0.0F, 0.0F);
        this.pata1izq.addChild(this.pata1izqChild);
        this.pata1der.addChild(this.pata1derChild);
        this.pata1izqChild.addChild(this.pata1izqChildChild);
        this.cabeza.addChild(this.cabezaChild);
        this.pata1derChild.addChild(this.pata1derChildChild);
        this.cabeza.addChild(this.cabezaChild_1);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.cabeza.render(f5);
        this.pata1der.render(f5);
        this.cuerpo.render(f5);
        this.cuello1.render(f5);
        this.cuello2.render(f5);
        this.pata1izq.render(f5);
        this.cola.render(f5);
        this.alader.render(f5);
        this.cuerpo2.render(f5);
        this.alaizq.render(f5);
        this.cuello3.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
