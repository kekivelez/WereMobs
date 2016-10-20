package WereMobs.items;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import WereMobs.WereMobs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;


/**
 * Created by Elemental on 10/15/2016.
 */


public class SilverIngotItem extends Item {



    public SilverIngotItem(){
        
        setUnlocalizedName("silveringot");
        setRegistryName("silveringot");
        setCreativeTab(WereMobs.tabweremobs);
        GameRegistry.register(this);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
