package WereMobs.proxy;

/**
 * Created by Elemental on 10/15/2016.
 */

import WereMobs.WereMobs;
import WereMobs.input.InputHandler;
import WereMobs.input.KeyBindings;
import WereMobs.ModEntities;
import WereMobs.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy{

	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);

        OBJLoader.INSTANCE.addDomain(WereMobs.MODID);

        // Typically initialization of models and such goes here:
        ModItems.initModels();
        ModEntities.initModels();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
       // Initialize our input handler so we can listen to keys
        MinecraftForge.EVENT_BUS.register(new InputHandler());
        KeyBindings.init();
    }
}
