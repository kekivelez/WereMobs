package WereMobs.input;

/**
 * Created by Elemental on 10/15/2016.
 */

import WereMobs.network.PacketHandler;
import WereMobs.network.PacketSendKey;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.fml.common.gameevent.InputEvent;
public class InputHandler {

    @SubscribeEvent

    public void onKeyInput(InputEvent.KeyInputEvent event) {

        if (KeyBindings.weremobsKey.isPressed()) {

            // Someone pressed our tutorialKey. We send a message

            PacketHandler.INSTANCE.sendToServer(new PacketSendKey());

        }

    }

}
