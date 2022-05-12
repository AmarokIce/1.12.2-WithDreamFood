package club.someoneice.dreampineallpe.init;

import club.someoneice.dreampineallpe.Dreamlet;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Dreamlet.MODID)
public class ItemRegister {
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {

        IForgeRegistry<Item> registry = event.getRegistry();
        for (Item object : ItemList.ITEM_LIST)
        {
            registry.register(object);
        }
    }
}
