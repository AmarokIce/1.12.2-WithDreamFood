package club.someoneice.dreampineallpe.recipes;

import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.pasterdream.item.ItemDreamjuice;
import net.pasterdream.item.ItemStarfruit;

import javax.annotation.Nonnull;

public class BrewingHelper implements IBrewingRecipe {

    @Override
    public boolean isInput(@Nonnull ItemStack input) {
        return false;
    }

    @Override
    public boolean isIngredient(@Nonnull ItemStack ingredient) {
        return false;
    }

    @Nonnull
    @Override
    public ItemStack getOutput(@Nonnull ItemStack input, @Nonnull ItemStack ingredient) {
        return null;
    }
}
