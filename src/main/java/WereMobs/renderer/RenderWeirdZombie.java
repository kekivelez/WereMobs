package WereMobs.renderer;

import WereMobs.WereMobs;
import WereMobs.entity.EntityWeirdZombie;
import WereMobs.model.ModelWeirdZombie;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * Created by Elemental on 10/15/2016.
 */
public class RenderWeirdZombie extends RenderLiving<EntityWeirdZombie>{

    private static final ResourceLocation WEIRD_ZOMBIE_TEXTURE = new ResourceLocation(WereMobs.MODID,"textures/entity/weirdZombie.png");
    public static final Factory FACTORY = new Factory();


    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityWeirdZombie entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
    protected ResourceLocation getEntityTexture(EntityWeirdZombie entity) {
        return WEIRD_ZOMBIE_TEXTURE;
    }

    public RenderWeirdZombie(RenderManager renderManagerIn, ModelBase var1 , float var2)

    {

        super(renderManagerIn,var1, var2);

    }

    public static class Factory implements IRenderFactory<EntityWeirdZombie> {



        @Override

        public Render<? super EntityWeirdZombie> createRenderFor(RenderManager manager) {

            return new RenderWeirdZombie(manager, new ModelWeirdZombie(),0.6F);

        }



    }




}
