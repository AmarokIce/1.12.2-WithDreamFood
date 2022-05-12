package club.someoneice.dreampineallpe.recipes;

import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Cooking {
    ItemStack RawDreamPizza = new ItemStack(ItemList.pizzaRawDreamyPizza);
    ItemStack DreamPizza = new ItemStack(ItemList.pizzaDreamyPizza);

    ItemStack RawGalaxyPizza = new ItemStack(ItemList.pizzaRawGalaxyPizza);
    ItemStack GalaxyPizza = new ItemStack(ItemList.pizzaGalaxyPizza);

    ItemStack RawPineapplePizza = new ItemStack(ItemList.pizzaRawPineapplePizza);
    ItemStack PineapplePizza = new ItemStack(ItemList.pizzaPineapplePizza);

    ItemStack RawMeatPizza = new ItemStack(ItemList.pizzaRawMeatPizza);
    ItemStack MeatPizza = new ItemStack(ItemList.pizzaMeatPizza);

    public Cooking() {
        GameRegistry.addSmelting(RawDreamPizza, DreamPizza, 1);
        GameRegistry.addSmelting(RawGalaxyPizza, GalaxyPizza, 1);
        GameRegistry.addSmelting(RawPineapplePizza, PineapplePizza, 1);
        GameRegistry.addSmelting(RawMeatPizza, MeatPizza, 1);

    }
}
