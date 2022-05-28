package club.someoneice.dreampineallpe.init;

import club.someoneice.dreampineallpe.item.FoodItem;
import club.someoneice.dreampineallpe.item.ItemItems;
import club.someoneice.dreampineallpe.item.Pizza_Wheel;
import club.someoneice.paster_fix.paster_fix;
import club.someoneice.paster_fix.tool.ItemItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    public static final List<Item> ITEM_LIST = new ArrayList<>();

    // Start Register Some New Item in
    public static Item Meteorite;
    public static Item DragonJar;

    public static Item foodCream;
    public static Item foodSweetCream;
    public static Item foodDreamyJelly;
    public static Item foodNastyAppleCake;
    public static Item foodDreamyPineapple;
    public static Item foodDreamyPineappleJar;
    public static Item foodSmallCake;
    public static Item foodDreamySmallCake;
    public static Item foodMushroomSoup;
    public static Item foodDreamParty;
    public static Item foodVegetarian;

    public static Item foodDreamyPineappleCake;
    public static Item foodDreamyPineappleCake2;
    public static Item foodDreamyPineappleCake3;
    public static Item foodDreamyPineappleCake4;
    public static Item foodDreamyPineappleCake5;
    public static Item foodDreamyPineappleCake6;
    public static Item foodDreamyPineappleCake7;

    public static Item foodDreamyCake;
    public static Item foodDreamyCake2;
    public static Item foodDreamyCake3;
    public static Item foodDreamyCake4;
    public static Item foodDreamyCake5;
    public static Item foodDreamyCake6;
    public static Item foodDreamyCake7;

    public static Item pizzaRawPizza;
    public static Item pizzaRawDreamyPizza;
    public static Item pizzaRawGalaxyPizza;
    public static Item pizzaRawPineapplePizza;
    public static Item pizzaRawMeatPizza;
    public static Item pizzaDreamyPizza;
    public static Item pizzaGalaxyPizza;
    public static Item pizzaPineapplePizza;
    public static Item pizzaMeatPizza;

    public static Item foodDreamyPizzaSide;
    public static Item foodGalaxyPizzaSide;
    public static Item foodPineapplePizzaSide;
    public static Item foodMeatPizzaSide;
    public static Item foodSandwich;

    public static Item foodCheeseCream;
    public static Item foodDreamyPie;
    public static Item foodGalaxyPie;
    public static Item foodDreamyMixJuice;

    public static Item toolPizzaWheel;

    public static Item seedPineappleSeed;
    public static Item foodPineappleFlout;

    // Make The New Item in Game?¿
    public static void init() {
        // For Return Item.
        ItemStack air = new ItemStack(Items.AIR);
        ItemStack bowl = new ItemStack(Items.BOWL);
        ItemStack glass = new ItemStack(Items.GLASS_BOTTLE);

        Meteorite = new ItemItems("meteorite");
        DragonJar = new ItemItems("dragon_jar");

        foodCream = new FoodItem("cream", 1, 2.0F, false, true,16, EnumAction.EAT);
        foodSweetCream = new FoodItem("sweet_cream", 2, 1.0f, false, true,16, EnumAction.EAT);
        foodDreamyJelly = new FoodItem("dreamy_jelly", 5, 0.8f, false, true, new PotionEffect[] { new PotionEffect(MobEffects.NIGHT_VISION, 20, 3)}, air,32, 8, EnumAction.EAT);
        foodNastyAppleCake = new FoodItem("nasty_apple_cake", -6, 0.2f, false, true, EnumAction.EAT);
        foodDreamyPineapple = new FoodItem("dreamy_pineapple", 8, 0.4f, true, true, EnumAction.EAT);
        foodDreamyPineappleJar = new FoodItem("pineapple_jar", 6, 0.5f, true, true, new PotionEffect[] { new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 3)}, 2, glass, 32, 8, EnumAction.DRINK);
        foodSmallCake = new FoodItem("small_cake", 3, 1.0F, false, true, 16, EnumAction.EAT);
        foodDreamySmallCake = new FoodItem("dreamy_small_cake", 6, 0.2f, false, true, new PotionEffect[] { new PotionEffect(MobEffects.NIGHT_VISION, 20, 120), new PotionEffect(MobEffects.SPEED, 20, 30)}, air, 16, 64, EnumAction.EAT);
        foodMushroomSoup = new FoodItem("mushroom_soup", -2, 1.5f, false, true, new PotionEffect[] { new PotionEffect(MobEffects.NAUSEA, 20, 10)}, bowl, 64, 1, EnumAction.EAT);
        foodDreamParty = new FoodItem("dream_party", 16, 0.9f, false, true, air, 64, 8, EnumAction.DRINK);
        foodVegetarian = new FoodItem("vegetarian", 9, 1.6f, false, true, bowl, 32, 1, EnumAction.EAT);

        foodDreamyPineappleCake = new FoodItem("dreamy_pineapple_cake", 5, 1.5f, false, true, EnumAction.EAT);
        foodDreamyPineappleCake2 = new FoodItem("dreamy_pineapple_cake2", 5, 1.5f, false, true, new ItemStack(ItemList.foodDreamyPineappleCake), 32,1, EnumAction.EAT);
        foodDreamyPineappleCake3 = new FoodItem("dreamy_pineapple_cake3", 5, 1.5f, false, true, new ItemStack(ItemList.foodDreamyPineappleCake2), 32,1, EnumAction.EAT);
        foodDreamyPineappleCake4 = new FoodItem("dreamy_pineapple_cake4", 5, 1.5f, false, true, new ItemStack(ItemList.foodDreamyPineappleCake3), 32,1, EnumAction.EAT);
        foodDreamyPineappleCake5 = new FoodItem("dreamy_pineapple_cake5", 5, 1.5f, false, true, new ItemStack(ItemList.foodDreamyPineappleCake4), 32,1, EnumAction.EAT);
        foodDreamyPineappleCake6 = new FoodItem("dreamy_pineapple_cake6", 5, 1.5f, false, true, new ItemStack(ItemList.foodDreamyPineappleCake5), 32,1, EnumAction.EAT);
        foodDreamyPineappleCake7 = new FoodItem("dreamy_pineapple_cake7", 5, 1.5f, false, true, new ItemStack(ItemList.foodDreamyPineappleCake6), 32,1, EnumAction.EAT);

        foodDreamyCake = new FoodItem("dreamy_cake", 5, 1.5f, false, true,new PotionEffect[]{new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2)}, air, 48, 64, EnumAction.EAT);
        foodDreamyCake2 = new FoodItem("dreamy_cake2", 5, 1.5f, false, true, new PotionEffect[]{new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2)}, new ItemStack(ItemList.foodDreamyCake), 48, 1, EnumAction.EAT);
        foodDreamyCake3 = new FoodItem("dreamy_cake3", 5, 1.5f, false, true, new PotionEffect[]{new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2)}, new ItemStack(ItemList.foodDreamyCake2), 48, 1, EnumAction.EAT);
        foodDreamyCake4 = new FoodItem("dreamy_cake4", 5, 1.5f, false, true, new PotionEffect[]{new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2)}, new ItemStack(ItemList.foodDreamyCake3), 48, 1, EnumAction.EAT);
        foodDreamyCake5 = new FoodItem("dreamy_cake5", 5, 1.5f, false, true, new PotionEffect[]{new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2)}, new ItemStack(ItemList.foodDreamyCake4), 48, 1, EnumAction.EAT);
        foodDreamyCake6 = new FoodItem("dreamy_cake6", 5, 1.5f, false, true, new PotionEffect[]{new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2)}, new ItemStack(ItemList.foodDreamyCake5), 48, 1, EnumAction.EAT);
        foodDreamyCake7 = new FoodItem("dreamy_cake7", 5, 1.5f, false, true, new PotionEffect[]{new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 2)}, new ItemStack(ItemList.foodDreamyCake6), 48, 1, EnumAction.EAT);

        // Get Update.
        pizzaRawPizza = new ItemItems("raw_pizza");
        pizzaRawDreamyPizza = new ItemItems("raw_dreamy_pizza");
        pizzaRawGalaxyPizza = new ItemItems("raw_galaxy_pizza");
        pizzaRawPineapplePizza = new ItemItems("raw_pineapple_pizza");
        pizzaRawMeatPizza = new ItemItems("raw_meat_pizza");

        pizzaDreamyPizza = new ItemItems("dreamy_pizza");
        pizzaGalaxyPizza = new ItemItems("galaxy_pizza");
        pizzaPineapplePizza = new ItemItems("pineapple_pizza");
        pizzaMeatPizza = new ItemItems("meat_pizza");

        foodDreamyPizzaSide = new FoodItem("dreamy_pizza_side", 4, 0.5f, false, true, EnumAction.EAT);
        foodGalaxyPizzaSide = new FoodItem("galaxy_pizza_side", 4, 0.5f, false, true, EnumAction.EAT);
        foodPineapplePizzaSide = new FoodItem("pineapple_pizza_side", 4, 0.5f, false, true, EnumAction.EAT);
        foodMeatPizzaSide = new FoodItem("meat_pizza_side", 4, 0.5f, true, true, EnumAction.EAT);
        foodSandwich = new FoodItem("sandwich", 8, 0.5f, false, true, EnumAction.EAT);

        foodCheeseCream = new FoodItem("cream_cheese", 1, 0.5f, false, true, EnumAction.EAT);
        foodDreamyPie = new FoodItem("dreamy_pie", 8, 0.5f, false, true, EnumAction.EAT);
        foodGalaxyPie = new FoodItem("galaxy_pie", 8, 0.5f, false, true, EnumAction.EAT);
        foodDreamyMixJuice = new FoodItem("dreamy_mix_juice", 8, 1.2f, false, true, EnumAction.DRINK);

        toolPizzaWheel = new Pizza_Wheel("wheel");
    }

    public static void renderRegistry() {
        for (Item item : ITEM_LIST) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
