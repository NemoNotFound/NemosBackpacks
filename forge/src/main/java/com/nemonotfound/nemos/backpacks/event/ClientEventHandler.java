package com.nemonotfound.nemos.backpacks.event;

import com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void onLottTableLoadEvent(RegisterKeyMappingsEvent event) {
        event.register(BackpackKeyMappings.INTERACT_BACKPACK.get());
        event.register(BackpackKeyMappings.SWAP_BACKPACK.get());
    }
}
