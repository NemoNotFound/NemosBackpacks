package com.nemonotfound.nemos.backpacks.network.protocol.game;

import commonnetwork.api.Network;

public class BackpackPackets {

    public static void init() {
        Network.registerPacket(BackpackSwapPacket.type(), BackpackSwapPacket.class, BackpackSwapPacket.STREAM_CODEC, BackpackSwapPacket::handle);
        Network.registerPacket(BackpackInteractPacket.type(), BackpackInteractPacket.class, BackpackInteractPacket.STREAM_CODEC, BackpackInteractPacket::handle);
    }
}
