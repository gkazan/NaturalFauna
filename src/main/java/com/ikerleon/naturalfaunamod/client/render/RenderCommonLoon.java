package com.ikerleon.naturalfaunamod.client.render;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCommonLoon;
import com.ikerleon.naturalfaunamod.client.model.ModelCommonLoonFlying;
import com.ikerleon.naturalfaunamod.entity.EntityCommonLoon;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormRenderUtils;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderCommonLoon extends RenderLivingZAWA<EntityCommonLoon> {
    public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/commonloon/texture.png");
    public static final ResourceLocation texture2 = new ResourceLocation(NFReference.MOD_ID, "textures/entity/commonloon/texture2.png");

    public RenderCommonLoon(RenderManager rm) {
        super(rm, new ModelCommonLoon(), 0.4F);
        addLayer(new LayerCommonLoon(this, this));
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCommonLoon entity) {
        if (!entity.onGround)
            return BookwormRenderUtils.none;
        else
            return getTextureOfVar(entity.getAnimalType());
    }

    @Override
    public ResourceLocation getTextureOfVar(int varient) {
        switch (varient) {
            case 0:
            default:
                return texture;
            case 1:
                return texture2;
        }
    }

    public class LayerCommonLoon implements LayerRenderer<EntityCommonLoon> {
        private final RenderCommonLoon render;
        private final ModelCommonLoonFlying modelF = new ModelCommonLoonFlying();

        public LayerCommonLoon(RenderCommonLoon e, RenderCommonLoon re) {
            this.render = re;
        }

        @Override
        public void doRenderLayer(EntityCommonLoon e, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
            if(!e.isInvisible()) {
                if(!e.onGround && !e.isChild()) {
                    this.render.bindTexture(this.render.getTextureOfVar(e.getAnimalType()));
                    this.modelF.setModelAttributes(this.render.getMainModel());
                    this.modelF.render(e, f, f1, f2, f3, f4, f6);
                    this.modelF.setRotationAngles(f, f1, f3, f4, f5, f6, e);
                }
            }
        }

        @Override
        public boolean shouldCombineTextures() {
            return true;
        }
    }

    public static class RenderFactory implements IRenderFactory<EntityCommonLoon> {
        @Override
        public Render<? super EntityCommonLoon> createRenderFor(RenderManager manager) {
            return new RenderCommonLoon(manager);
        }
    }
}
