package com.coldspell.bunkers.items.items;

import com.coldspell.bunkers.BunkersMod;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class FracturedBlockItem extends BlockItem {

    public FracturedBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> componentList, @NotNull TooltipFlag tooltipFlag) {
        componentList.add(Component.translatable("block_descriptions."+ BunkersMod.MOD_ID + ".fractured").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(itemStack, level, componentList, tooltipFlag);
    }
}
