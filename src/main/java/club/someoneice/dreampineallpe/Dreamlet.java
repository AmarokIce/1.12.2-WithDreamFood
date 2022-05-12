package club.someoneice.dreampineallpe;

import club.someoneice.dreampineallpe.init.ItemList;
import club.someoneice.dreampineallpe.init.ItemRegister;
import club.someoneice.dreampineallpe.recipes.Cooking;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Dreamlet.MODID, name = Dreamlet.NAME, version = Dreamlet.VERSION)
public class Dreamlet {
    public static final String MODID = "pineapple";
    public static final String NAME = "Dreaming With Pineapples";
    public static final String VERSION = "1.0";
    public static CreativeTabs pineapple = new CreativeTabs("pineapple") {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemList.foodDreamyPineappleCake); //TODO Take the Icon for New Group
        }
    };
    private static Logger logger;


    @Mod.Instance(Dreamlet.MODID)
    public static Dreamlet instance;

    public Dreamlet() {
        MinecraftForge.EVENT_BUS.register(this);
    }

/*
    @EventHandler
    public void init(FMLInitializationEvent event) {

        GetRecipes.initShapedRecipes();
        GetRecipes.initShapelessRecipes();
        GetRecipes.initSmeltingRecipes();
        FMLCommonHandler.instance().bus().register(instance);

        MinecraftForge.EVENT_BUS.register(new DropHandler());
        MinecraftForge.EVENT_BUS.register(new ItemEventHandler());

        proxy.registerRenders();
    }
*/


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    ItemList.init();
    MinecraftForge.EVENT_BUS.register(new ItemRegister());
        MinecraftForge.EVENT_BUS.register(new Cooking());
}

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
