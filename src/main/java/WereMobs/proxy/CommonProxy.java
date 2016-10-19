package WereMobs.proxy;

import WereMobs.ModBlocks;
import WereMobs.ModEntities;
import WereMobs.ModItems;
import WereMobs.network.PacketHandler;

/**
 * Created by Elemental on 10/15/2016.
 */

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy {


	  public void preInit(FMLPreInitializationEvent e) {
		  PacketHandler.registerMessages("weremobs");

	        // Initialization of blocks and items typically goes here:
		  ModBlocks.init();
		  ModItems.init();
		  ModEntities.init();
	  }
	
	


	public void init(FMLInitializationEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void postInit(FMLPostInitializationEvent e) {
		
	}

}
