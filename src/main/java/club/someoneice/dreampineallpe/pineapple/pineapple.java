package club.someoneice.dreampineallpe.pineapple;

import club.someoneice.dreampineallpe.init.ItemList;
import club.someoneice.paster_fix.paster_fix;
import net.minecraft.item.Item;

import java.util.List;

public class pineapple extends Item {
    public pineapple(String name){
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(paster_fix.fix_helper);

        ItemList.ITEM_LIST.add(this);
    }
}
