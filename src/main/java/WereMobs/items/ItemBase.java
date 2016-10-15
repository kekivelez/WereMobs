package WereMobs.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import WereMobs.WereMobs;

/**
 * Created by Elemental on 10/15/2016.
 */


public class ItemBase extends Item{

    protected String name;

    public ItemBase(String name){
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(){

        WereMobs.proxy.registerItemRenderer(this,0,name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }


}
