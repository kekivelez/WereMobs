package WereMobs;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void initCrafting(){
		GameRegistry.addRecipe(new ItemStack(ModBlocks.silverBlock), "iii","iii","iii",'i',ModItems.silverIngotItem);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverIngotItem,9),ModBlocks.silverBlock);

	
	}
	
	public static void initSmelting(){
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngotItem), 12F);
	}
	
	
	
	
	
}
