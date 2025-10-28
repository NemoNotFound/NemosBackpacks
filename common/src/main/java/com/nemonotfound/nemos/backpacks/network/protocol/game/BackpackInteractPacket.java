package com.nemonotfound.nemos.backpacks.network.protocol.game;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import commonnetwork.networking.data.PacketContext;
import commonnetwork.networking.data.Side;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;
import static com.nemonotfound.nemos.backpacks.Constants.SLOT_BACKPACK;

public class BackpackInteractPacket {

    public static final ResourceLocation CHANNEL = ResourceLocation.fromNamespaceAndPath(MOD_ID, "backpack_interact");
    public static final StreamCodec<FriendlyByteBuf, BackpackInteractPacket> STREAM_CODEC = StreamCodec.ofMember(BackpackInteractPacket::encode, BackpackInteractPacket::new);

    public BackpackInteractPacket() {
    }

    public static CustomPacketPayload.Type<CustomPacketPayload> type() {
        return new CustomPacketPayload.Type<>(CHANNEL);
    }

    public BackpackInteractPacket(FriendlyByteBuf buf) {
    }

    public void encode(FriendlyByteBuf buf) {

    }

    public static void handle(PacketContext<BackpackInteractPacket> context) {
        if (Side.CLIENT.equals(context.side())) {
            return;
        }

        var player = context.sender();
        var playerInventory = player.getInventory();
        var item = playerInventory.getItem(SLOT_BACKPACK).getItem();

        if (item instanceof BackpackItem) {
            item.use(player.level(), player, null);
        }
    }
}
