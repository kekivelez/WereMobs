package WereMobs.proxy;

/**
 * Created by Elemental on 10/15/2016.
 */

import WereMobs.ModBlocks;
import WereMobs.ModItems;
import WereMobs.ModEntities;
import WereMobs.WereMobs;
import WereMobs.input.InputHandler;
import WereMobs.input.KeyBindings;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{



    @Override
    public void registerItemRenderer (Item item, int meta, String id){

        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(WereMobs.MODID + ":" + id,"inventory"));


    }
}
