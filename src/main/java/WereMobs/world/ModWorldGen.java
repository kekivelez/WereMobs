package WereMobs.world;

import java.util.Random;

import WereMobs.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	 public static final String RETRO_NAME = "Weregen";
	 public static ModWorldGen instance = new ModWorldGen();
	
	 
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { // the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			
		}
	}
		
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		addOreSpawn(ModBlocks.silverOre, (byte) 0, Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
				2, 12, 9,2,100);
		
	}
	@SuppressWarnings("deprecation")
	public void addOreSpawn(Block block, byte blockMeta, Block targetBlock, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		WorldGenMinable minable = new WorldGenMinable(block.getStateFromMeta(blockMeta), (minVeinSize - random.nextInt(maxVeinSize - minVeinSize)), BlockMatcher.forBlock(targetBlock));
		for (int i = 0 ; i < chancesToSpawn ; i++) {
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(16);
			minable.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	 
}
