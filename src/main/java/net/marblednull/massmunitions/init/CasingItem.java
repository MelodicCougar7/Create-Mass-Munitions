package net.marblednull.massmunitions.init;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/// Class used to determine whether an item is a casing or not using instanceof
public class CasingItem extends Item {
    public CasingItem() {
        super(new Item.Properties());
    }

}
