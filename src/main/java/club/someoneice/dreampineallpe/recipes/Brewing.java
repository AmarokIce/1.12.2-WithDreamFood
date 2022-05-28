package club.someoneice.dreampineallpe.recipes;

import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.AbstractBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.pasterdream.item.ItemDreamjuice;
import net.pasterdream.item.ItemStarfruit;

import javax.annotation.Nonnull;

public class Brewing {
    ItemStack DreamJuice = new ItemStack(ItemDreamjuice.block);
    ItemStack Galaxy = new ItemStack(ItemStarfruit.block);
    ItemStack SweetDreamJuice = new ItemStack(ItemList.foodDreamyMixJuice);

    ItemStack Pineapple = new ItemStack(ItemList.foodDreamyPineapple);
    ItemStack Bottle = new ItemStack(Items.GLASS_BOTTLE);
    ItemStack PineappleJar = new ItemStack(ItemList.foodDreamyPineappleJar);
    public Brewing() {
        BrewingRecipeRegistry.addRecipe(DreamJuice, Galaxy, SweetDreamJuice);
        BrewingRecipeRegistry.addRecipe(Galaxy, DreamJuice, SweetDreamJuice);
        new AbstractBrewingRecipe(Galaxy, DreamJuice, SweetDreamJuice) {
            @Override
            public boolean isIngredient(@Nonnull ItemStack ingredient) {
                return false;
            }
        };
        //BrewingRecipeRegistry.addRecipe(Pineapple, Bottle, PineappleJar);
        BrewingRecipeRegistry.addRecipe(Pineapple, Pineapple , PineappleJar);
        new AbstractBrewingRecipe(Pineapple, Pineapple , PineappleJar) {
            @Override
            public boolean isIngredient(@Nonnull ItemStack ingredient) {
                return false;
            }
        };
    }
}
