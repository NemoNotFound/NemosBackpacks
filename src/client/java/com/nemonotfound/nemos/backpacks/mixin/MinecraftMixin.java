package com.nemonotfound.nemos.backpacks.mixin;

import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackInteractPacketP;
import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackSwapPacketP;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

import static com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings.INTERACT_BACKPACK;
import static com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings.SWAP_BACKPACK;

@Mixin(Minecraft.class)
public abstract class MinecraftMixin {

    @Shadow @Nullable public LocalPlayer player;

    @Inject(method = "handleKeybinds", at = @At("TAIL"))
    private void handleBackpackKeybinds(CallbackInfo ci) {
        while (INTERACT_BACKPACK.consumeClick()) {
            ClientPlayNetworking.send(new BackpackInteractPacketP(""));
        }

        while (SWAP_BACKPACK.consumeClick()) {
            if (!Optional.ofNullable(this.player).map(Player::isSpectator).orElse(true)) {
                ClientPlayNetworking.send(new BackpackSwapPacketP(""));
            }
        }
    }
}
