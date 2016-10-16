package WereMobs;


import WereMobs.entity.EntityWeirdZombie;

import WereMobs.entity.EntityWerewolf;
import WereMobs.renderer.RenderWeirdZombie;
import WereMobs.renderer.RenderWerewolf;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Keki on 10/15/2016.
 */
public class ModEntities {


    public static void init() {

        // Every entity in our mod has an ID (local to this mod)

        int id = 1;

        EntityRegistry.registerModEntity(EntityWeirdZombie.class, "WeirdZombie", id++, WereMobs.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(EntityWerewolf.class, "Werewolf", id++, WereMobs.instance, 64, 3, true, 0x996600, 0x00ff00);


        EntityRegistry.addSpawn(EntityWeirdZombie.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);
        EntityRegistry.addSpawn(EntityWerewolf.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);



    }



    @SideOnly(Side.CLIENT)

    public static void initModels() {

        RenderingRegistry.registerEntityRenderingHandler(EntityWeirdZombie.class, RenderWeirdZombie.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityWerewolf.class, RenderWerewolf.FACTORY);

    }




}
