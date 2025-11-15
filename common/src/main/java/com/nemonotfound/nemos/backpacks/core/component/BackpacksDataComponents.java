package com.nemonotfound.nemos.backpacks.core.component;

import com.mojang.serialization.Codec;
import com.nemonotfound.nemos.backpacks.platform.Services;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.codec.ByteBufCodecs;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BackpacksDataComponents {

    public static final Supplier<DataComponentType<Boolean>> IS_BACKPACK_OPEN = register("is_backpack_open", (builder) -> builder.persistent(Codec.BOOL).networkSynchronized(ByteBufCodecs.BOOL));

    public static void init() {}

    private static <T> Supplier<DataComponentType<T>> register(String id, UnaryOperator<DataComponentType.Builder<T>> builder) {
        return Services.REGISTRY_HELPER.registerDataComponent(id, builder.apply(DataComponentType.builder()).build());
    }
}
