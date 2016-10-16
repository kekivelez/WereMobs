package WereMobs.renderer;

import WereMobs.WereMobs;
import WereMobs.entity.EntityWerewolf;
import WereMobs.model.ModelWerewolf;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * Created by Elemental on 10/16/2016.
 */
public class RenderWerewolf extends RenderLiving<EntityWerewolf> {

    private static final ResourceLocation MOB_TEXTURE = new ResourceLocation(WereMobs.MODID,"textures/entity/Werewolf.png");

    public static final Factory FACTORY = new Factory();




    public RenderWerewolf(RenderManager renderManagerIn, ModelBase var1 , float var2)

    {

        super(renderManagerIn,var1, var2);

    }

    protected ResourceLocation getEntityTexture(EntityWerewolf entity) {
        return MOB_TEXTURE;
    }

    public static class Factory implements IRenderFactory<EntityWerewolf> {

        @Override
        public Render<? super EntityWerewolf> createRenderFor(RenderManager manager) {
            return new RenderWerewolf(manager,new ModelWerewolf(), 0.5F);
        }

    }




}
