package com.nemonotfound.nemos.backpacks.mixin;

import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackInteractPacket;
import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackSwapPacket;
import commonnetwork.api.Dispatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings.INTERACT_BACKPACK;
import static com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings.SWAP_BACKPACK;

@Mixin(Minecraft.class)
public abstract class MinecraftMixin {

    @Shadow @Nullable public LocalPlayer player;

    @Inject(method = "handleKeybinds", at = @At("TAIL"))
    private void handleBackpackKeybinds(CallbackInfo ci) {
        while (INTERACT_BACKPACK.get().consumeClick()) {
            Dispatcher.sendToServer(new BackpackInteractPacket());
        }

        while (SWAP_BACKPACK.get().consumeClick()) {
            if (!this.player.isSpectator()) {
                Dispatcher.sendToServer(new BackpackSwapPacket());
            }
        }
    }
}
