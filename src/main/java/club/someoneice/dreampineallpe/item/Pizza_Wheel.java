package club.someoneice.dreampineallpe.item;

import club.someoneice.dreampineallpe.Dreamlet;
import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Pizza_Wheel extends Item {

    public Pizza_Wheel(String name){
        this.setMaxDamage(20);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Dreamlet.pineapple);
        this.setContainerItem(this);

        ItemList.ITEM_LIST.add(this);
    }

    @Override
    public int getMaxDamage(ItemStack itemStack) {
        return 0;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemstack) {
        return 0;
    }

    @Override
    public float getDestroySpeed(ItemStack itemStack, IBlockState blockState) {
        return 1f;
    }
}
