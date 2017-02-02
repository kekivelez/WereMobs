package WereMobs.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import WereMobs.WereMobs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;


/**
 * Created by Elemental on 10/15/2016.
 */


public class SilverIngotItem extends Item {


	boolean active =true;
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

    public ItemStack onItemRightClick(ItemStack equipped, World world, EntityPlayer player) {
      if(player.isSneaking()) {
        active=true;
        System.out.println("actuive");
      }
      return equipped;
    }
    
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
    	if(isSelected){
 
    		worldIn.spawnParticle(EnumParticleTypes.DRAGON_BREATH, entityIn.posX+1, entityIn.posY, entityIn.posZ, 0.05D, 0.00D, 0.05D);
    	}
    }
   
}
