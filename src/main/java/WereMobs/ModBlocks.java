package WereMobs;

import WereMobs.blocks.SilverBlockBlock;
import WereMobs.blocks.SilverOreBlock;

/**
 * Created by Keki on 10/15/2016.
 */
public class ModBlocks {

	public static SilverBlockBlock silverBlock;
	public static SilverOreBlock silverOre;

    public static void init() {

    	silverBlock = new SilverBlockBlock();
    	silverOre = new SilverOreBlock();

    }
    public static void initModels(){
    	silverBlock.initModel();
    	silverOre.initModel();

    }

}
