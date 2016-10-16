package WereMobs.proxy;

/**
 * Created by Elemental on 10/15/2016.
 */

import WereMobs.WereMobs;
import WereMobs.ModEntities;

import WereMobs.model.ModelWeirdZombie;
import WereMobs.renderer.RenderWeirdZombie;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderManager;

public class ClientProxy extends CommonProxy{



        @Override
    public void registerItemRenderer (Item item, int meta, String id){

        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(WereMobs.MODID + ":" + id,"inventory"));


    }

    @SideOnly(Side.CLIENT)
    public void registerRenderInformation() {



    }


}
