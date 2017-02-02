package WereMobs.blocks;

import WereMobs.WereMobs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SilverBlockBlock extends Block{
	
	public SilverBlockBlock() {
		super(Material.IRON);
		setUnlocalizedName("silverblock");
		setRegistryName("silverblock");
		GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        setCreativeTab(WereMobs.tabweremobs);
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0f);
        setResistance(5.0f);
	}
	
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
	
	
	
	
}
