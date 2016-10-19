package WereMobs;

import WereMobs.items.IngotCopperItem;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Keki on 10/15/2016.
 */


public class ModItems {

    public static IngotCopperItem ingotCopperItem;

    public static void init() {
    	
    	ingotCopperItem = new IngotCopperItem();
    	
    }
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	
    	ingotCopperItem.initModel();
    }

}
