package com.nemonotfound.nemos.backpacks.network.protocol.game;

import com.nemonotfound.nemos.backpacks.helper.Backpacker;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class BackpackClientPacketsRegistry {

    public static void init() {
        //Network.registerPacket(BackpackOpenedServerPacket.type(), BackpackOpenedServerPacket.class, BackpackOpenedServerPacket.STREAM_CODEC, BackpackOpenedPacket::handle);
        ClientPlayNetworking.registerGlobalReceiver(BackpackOpenedPacket.TYPE, (payload, context) -> {
            var minecraft = context.client();
            var player = minecraft.player;

            if (player == null) {
                return;
            }

            ((Backpacker) player).nemosBackpacks$setLastOpenedBackpack(payload.itemStack());
        });
    }
}
