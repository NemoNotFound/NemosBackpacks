package com.nemonotfound.nemos.backpacks.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.SmithingTemplateItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.ArrayList;
import java.util.List;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

@Mixin(SmithingTemplateItem.class)
public class SmithingTemplateItemMixin {

    @Unique
    private static final Identifier EMPTY_SLOT_BACKPACK = Identifier.fromNamespaceAndPath(MOD_ID, "container/slot/backpack");

    @ModifyReturnValue(method = "createNetheriteUpgradeIconList", at = @At("RETURN"))
    private static List<Identifier> addBackpackToNetheriteUpgradeIconList(List<Identifier> original) {
        List<Identifier> emptyIcons = new ArrayList<>(original);
        emptyIcons.add(EMPTY_SLOT_BACKPACK);

        return emptyIcons;
    }
}
