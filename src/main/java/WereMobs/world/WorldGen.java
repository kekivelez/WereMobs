package WereMobs.world;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGen {

	public static void init() {
        ModWorldGen generator = ModWorldGen.instance;
        GameRegistry.registerWorldGenerator(generator, 6);
        MinecraftForge.EVENT_BUS.register(generator);
    }
}
