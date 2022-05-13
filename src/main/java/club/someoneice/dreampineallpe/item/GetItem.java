package club.someoneice.dreampineallpe.item;

import club.someoneice.dreampineallpe.Dreamlet;
import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.item.Item;

public class GetItem extends Item {
    public GetItem(String name, int damage, int maxStackSize, Item Item){
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxDamage(damage);
        this.setMaxStackSize(maxStackSize);
        this.setContainerItem(Item);

        this.setCreativeTab(Dreamlet.pineapple);

        ItemList.ITEM_LIST.add(this);
    }

    public GetItem(String name, Item Item){
        this(name, 0, 1, Item);
    }
}