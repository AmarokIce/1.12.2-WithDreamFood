package club.someoneice.dreampineallpe.item;

import club.someoneice.dreampineallpe.Dreamlet;
import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Pizza_Wheel extends Item {
    public Pizza_Wheel(String name){
        this.setMaxDamage(20);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Dreamlet.pineapple);

        ItemList.ITEM_LIST.add(this);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack Pizza_Wheel = new ItemStack(this);
        Pizza_Wheel.setItemDamage(itemstack.getItemDamage() + 1);
        if (Pizza_Wheel.getItemDamage() >= Pizza_Wheel.getMaxDamage()) {
            return Pizza_Wheel;
        }
        return itemstack.isEmpty() ? new ItemStack(this) : itemstack;
    }
}
