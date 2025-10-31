package com.nemonotfound.nemos.backpacks.network.protocol.game;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import commonnetwork.networking.data.PacketContext;
import commonnetwork.networking.data.Side;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;
import static com.nemonotfound.nemos.backpacks.Constants.BACKPACK_SLOT;

public class BackpackSwapPacket {

    public static final ResourceLocation CHANNEL = ResourceLocation.fromNamespaceAndPath(MOD_ID, "backpack_swap");
    public static final StreamCodec<FriendlyByteBuf, BackpackSwapPacket> STREAM_CODEC = StreamCodec.ofMember(BackpackSwapPacket::encode, BackpackSwapPacket::new);

    public BackpackSwapPacket() {
    }

    public static CustomPacketPayload.Type<CustomPacketPayload> type() {
        return new CustomPacketPayload.Type<>(CHANNEL);
    }

    public BackpackSwapPacket(FriendlyByteBuf buf) {
    }

    public void encode(FriendlyByteBuf buf) {

    }

    public static void handle(PacketContext<BackpackSwapPacket> context) {
        if (Side.CLIENT.equals(context.side())) {
            return;
        }

        var player = context.sender();

        if (!player.isSpectator()) {
            var playerInventory = player.getInventory();
            var backpackItemstack = playerInventory.getItem(BACKPACK_SLOT);
            var itemStackInHand = player.getItemInHand(InteractionHand.MAIN_HAND);

            if (!itemStackInHand.isEmpty() && !(itemStackInHand.getItem() instanceof BackpackItem)) {
                return;
            }

            playerInventory.setItem(BACKPACK_SLOT, itemStackInHand);
            player.setItemInHand(InteractionHand.MAIN_HAND, backpackItemstack);
            player.stopUsingItem();
        }
    }
}
