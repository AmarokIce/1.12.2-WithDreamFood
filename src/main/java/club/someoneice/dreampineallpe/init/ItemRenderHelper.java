package club.someoneice.dreampineallpe.init;

import club.someoneice.dreampineallpe.Dreamlet;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid= Dreamlet.MODID)
public final class ItemRenderHelper {
    @SubscribeEvent
    public static void onModelReg(ModelRegistryEvent event) {
        for(Item item : ItemList.ITEM_LIST){
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }

        /*
        ModelLoader.setCustomModelResourceLocation(ItemList.foodCream, 0, new ModelResourceLocation(ItemList.foodCream.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamParty, 0, new ModelResourceLocation(ItemList.foodDreamParty.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyJelly, 0, new ModelResourceLocation(ItemList.foodDreamyJelly.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodSweetCream, 0, new ModelResourceLocation(ItemList.foodSweetCream.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineapple, 0, new ModelResourceLocation(ItemList.foodDreamyPineapple.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodVegetarian, 0, new ModelResourceLocation(ItemList.foodVegetarian.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodSmallCake, 0, new ModelResourceLocation(ItemList.foodSmallCake.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodNastyAppleCake, 0, new ModelResourceLocation(ItemList.foodNastyAppleCake.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodMushroomSoup, 0, new ModelResourceLocation(ItemList.foodMushroomSoup.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamySmallCake, 0, new ModelResourceLocation(ItemList.foodDreamySmallCake.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleJar, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleJar.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleCake, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleCake.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleCake2, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleCake2.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleCake3, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleCake3.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleCake4, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleCake4.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleCake5, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleCake5.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleCake6, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleCake6.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPineappleCake7, 0, new ModelResourceLocation(ItemList.foodDreamyPineappleCake7.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyCake, 0, new ModelResourceLocation(ItemList.foodDreamyCake.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyCake2, 0, new ModelResourceLocation(ItemList.foodDreamyCake2.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyCake3, 0, new ModelResourceLocation(ItemList.foodDreamyCake3.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyCake4, 0, new ModelResourceLocation(ItemList.foodDreamyCake4.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyCake5, 0, new ModelResourceLocation(ItemList.foodDreamyCake5.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyCake6, 0, new ModelResourceLocation(ItemList.foodDreamyCake6.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyCake7, 0, new ModelResourceLocation(ItemList.foodDreamyCake7.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaRawPizza, 0, new ModelResourceLocation(ItemList.pizzaRawPizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaRawDreamyPizza, 0, new ModelResourceLocation(ItemList.pizzaRawDreamyPizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaRawGalaxyPizza, 0, new ModelResourceLocation(ItemList.pizzaRawGalaxyPizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaRawPineapplePizza, 0, new ModelResourceLocation(ItemList.pizzaRawPineapplePizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaRawMeatPizza, 0, new ModelResourceLocation(ItemList.pizzaRawMeatPizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaDreamyPizza, 0, new ModelResourceLocation(ItemList.pizzaDreamyPizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaGalaxyPizza, 0, new ModelResourceLocation(ItemList.pizzaGalaxyPizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaPineapplePizza, 0, new ModelResourceLocation(ItemList.pizzaPineapplePizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.pizzaMeatPizza, 0, new ModelResourceLocation(ItemList.pizzaMeatPizza.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPizzaSide, 0, new ModelResourceLocation(ItemList.foodDreamyPizzaSide.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodGalaxyPizzaSide, 0, new ModelResourceLocation(ItemList.foodGalaxyPizzaSide.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodPineapplePizzaSide, 0, new ModelResourceLocation(ItemList.foodPineapplePizzaSide.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodMeatPizzaSide, 0, new ModelResourceLocation(ItemList.foodMeatPizzaSide.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodSandwich, 0, new ModelResourceLocation(ItemList.foodSandwich.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodCheeseCream, 0, new ModelResourceLocation(ItemList.foodCheeseCream.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyPie, 0, new ModelResourceLocation(ItemList.foodDreamyPie.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodGalaxyPie, 0, new ModelResourceLocation(ItemList.foodGalaxyPie.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.foodDreamyMixJuice, 0, new ModelResourceLocation(ItemList.foodDreamyMixJuice.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.toolPizzaWheel, 0, new ModelResourceLocation(ItemList.toolPizzaWheel.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(ItemList.Meteorite, 0, new ModelResourceLocation(ItemList.Meteorite.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ItemList.DragonJar, 0, new ModelResourceLocation(ItemList.DragonJar.getRegistryName(), "inventory"));
         */
    }
}
