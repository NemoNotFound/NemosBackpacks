package com.nemonotfound.nemos.backpacks.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.nemonotfound.nemos.upgrade.templates.helper.SmithingTemplateItemHelper;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.ArrayList;
import java.util.List;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

@Mixin(SmithingTemplateItemHelper.class)
public class SmithingTemplateItemHelperMixin {

    @Unique
    private static final Identifier EMPTY_SLOT_BACKPACK = Identifier.fromNamespaceAndPath(MOD_ID, "container/slot/backpack");

    @ModifyReturnValue(method = "createUpgradeIconList", at = @At("RETURN"))
    private static List<Identifier> addBackpackToUpgradeIconList(List<Identifier> original) {
        List<Identifier> emptyIcons = new ArrayList<>(original);
        emptyIcons.add(EMPTY_SLOT_BACKPACK);

        return emptyIcons;
    }
}
