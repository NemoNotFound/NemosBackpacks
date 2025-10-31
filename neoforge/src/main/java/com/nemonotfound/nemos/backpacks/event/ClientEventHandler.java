package com.nemonotfound.nemos.backpacks.event;

import com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

@EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void onLottTableLoadEvent(RegisterKeyMappingsEvent event) {
        event.register(BackpackKeyMappings.INTERACT_BACKPACK.get());
        event.register(BackpackKeyMappings.SWAP_BACKPACK.get());
    }
}
