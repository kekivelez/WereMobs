package WereMobs;

/**
 * Created by Keki on 10/15/2016.
 */

import WereMobs.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = WereMobs.MODID, name = WereMobs.MODNAME, version = WereMobs.MODVERSION, dependencies = "required-after:Forge@[11.16.0.1865,)", useMetadata = true)

public class WereMobs{


    public static final String MODID = "weremobs";
    public static final String MODNAME = "WereMobs";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "WereMobs.proxy.ClientProxy", serverSide = "WereMobs.proxy.ServerProxy")

    public static CommonProxy proxy;

    @Mod.Instance
    public static WereMobs instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {

    }

}
