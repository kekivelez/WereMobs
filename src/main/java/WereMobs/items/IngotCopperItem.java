package WereMobs.items;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import WereMobs.WereMobs;

/**
 * Created by Elemental on 10/15/2016.
 */


public class IngotCopperItem extends Item{



    public IngotCopperItem(){
        
        setUnlocalizedName("ingotcopper");
        setRegistryName("ingotcopper");
        setCreativeTab(CreativeTabs.MATERIALS);
        GameRegistry.register(this);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
