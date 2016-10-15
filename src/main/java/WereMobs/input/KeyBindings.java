package WereMobs.input;

/**
 * Created by Elemental on 10/15/2016.
 */
import net.minecraft.client.settings.KeyBinding;

import net.minecraftforge.fml.client.registry.ClientRegistry;

import net.minecraftforge.fml.relauncher.Side;

import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public class KeyBindings {
    public static KeyBinding weremobsKey;

    public static void init() {

        weremobsKey = new KeyBinding("key.weremobs", Keyboard.KEY_T, "key.categories.weremobs");

        ClientRegistry.registerKeyBinding(weremobsKey);

    }
}
