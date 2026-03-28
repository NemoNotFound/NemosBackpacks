package com.nemonotfound.nemos.backpacks.network.protocol.game;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.world.InteractionHand;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.BACKPACK_SLOT;

public class BackpackPacketsRegistry {

    public static void init() {
        PayloadTypeRegistry.clientboundPlay().register(BackpackOpenedPacket.TYPE, BackpackOpenedPacket.CODEC);
        PayloadTypeRegistry.serverboundPlay().register(BackpackInteractPacketP.TYPE, BackpackInteractPacketP.CODEC);
        PayloadTypeRegistry.serverboundPlay().register(BackpackSwapPacketP.TYPE, BackpackSwapPacketP.CODEC);

        ServerPlayNetworking.registerGlobalReceiver(BackpackInteractPacketP.TYPE, ((ignore, context) -> {
            var player = context.player();
            var playerInventory = player.getInventory();
            var item = playerInventory.getItem(BACKPACK_SLOT).getItem();

            if (item instanceof BackpackItem) {
                item.use(player.level(), player, null);
            }
        }));

        ServerPlayNetworking.registerGlobalReceiver(BackpackSwapPacketP.TYPE, ((ignore, context) -> {
            var player = context.player();

            if (player.isSpectator()) {
                return;
            }

            var playerInventory = player.getInventory();
            var backpackItemstack = playerInventory.getItem(BACKPACK_SLOT);
            var itemStackInHand = player.getItemInHand(InteractionHand.MAIN_HAND);

            if (!itemStackInHand.isEmpty() && !(itemStackInHand.getItem() instanceof BackpackItem)) {
                return;
            }

            playerInventory.setItem(BACKPACK_SLOT, itemStackInHand);
            player.setItemInHand(InteractionHand.MAIN_HAND, backpackItemstack);
            player.stopUsingItem();
        }));
    }
}
