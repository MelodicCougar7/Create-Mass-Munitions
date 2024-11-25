package net.marblednull.massmunitions.item;


import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.marblednull.massmunitions.init.ModFluids;

public class WhiskedGunpowderItem extends BucketItem {
    public WhiskedGunpowderItem() {
        super(ModFluids.WHISKEDGUNPOWDER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
    }
}
