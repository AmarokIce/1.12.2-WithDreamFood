package club.someoneice.dreampineallpe.item;

import club.someoneice.dreampineallpe.Dreamlet;
import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.item.Item;

public class ItemItems extends Item {
    public ItemItems(String name){
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Dreamlet.pineapple);

        ItemList.ITEM_LIST.add(this);
    }
}
