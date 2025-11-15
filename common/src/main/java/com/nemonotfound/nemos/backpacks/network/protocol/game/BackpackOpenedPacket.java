package com.nemonotfound.nemos.backpacks.network.protocol.game;

import com.nemonotfound.nemos.backpacks.helper.Backpacker;
import commonnetwork.networking.data.PacketContext;
import commonnetwork.networking.data.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class BackpackOpenedPacket {

    public static final ResourceLocation CHANNEL = ResourceLocation.fromNamespaceAndPath(MOD_ID, "backpack_opened");
    public static final StreamCodec<FriendlyByteBuf, BackpackOpenedPacket> STREAM_CODEC = StreamCodec.ofMember(BackpackOpenedPacket::encode, BackpackOpenedPacket::new);
    private final ItemStack itemStack;

    public BackpackOpenedPacket(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public static CustomPacketPayload.Type<CustomPacketPayload> type() {
        return new CustomPacketPayload.Type<>(CHANNEL);
    }

    public BackpackOpenedPacket(FriendlyByteBuf buf) {
        this.itemStack = buf.readJsonWithCodec(ItemStack.CODEC);
    }

    public void encode(FriendlyByteBuf buf) {
        buf.writeJsonWithCodec(ItemStack.CODEC, itemStack);
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public static void handle(PacketContext<BackpackOpenedPacket> context) {
        if (Side.SERVER.equals(context.side())) {
            return;
        }

        var player = Minecraft.getInstance().player;

        if (player == null) {
            return;
        }

        ((Backpacker) Minecraft.getInstance().player).nemosBackpacks$setLastOpenedBackpack(context.message().getItemStack());
    }
}
