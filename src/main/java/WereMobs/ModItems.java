package WereMobs;

import WereMobs.items.SilverIngotItem;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Keki on 10/15/2016.
 */


public class ModItems {

    public static SilverIngotItem silverIngotItem;

    public static void init() {
    	
    	silverIngotItem = new SilverIngotItem();
    	
    	
    	
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	
    	silverIngotItem.initModel();
    }

}
