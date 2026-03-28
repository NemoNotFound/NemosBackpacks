package com.nemonotfound.nemos.backpacks.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.network.protocol.game.ServerboundSetCreativeModeSlotPacket;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ServerGamePacketListenerImpl.class)
public class ServerGamePacketListenerImplMixin {

    @Definition(id = "packet", local = @Local(type = ServerboundSetCreativeModeSlotPacket.class, argsOnly = true))
    @Definition(id = "slotNum", method = "Lnet/minecraft/network/protocol/game/ServerboundSetCreativeModeSlotPacket;slotNum()S")
    @Expression("packet.slotNum() <= 45")
    @ModifyExpressionValue(method = "handleSetCreativeModeSlot", at = @At("MIXINEXTRAS:EXPRESSION"))
    private boolean isSlotValid(boolean original, @Local(argsOnly = true) ServerboundSetCreativeModeSlotPacket packet) {
        return packet.slotNum() <= 46;
    }
}
