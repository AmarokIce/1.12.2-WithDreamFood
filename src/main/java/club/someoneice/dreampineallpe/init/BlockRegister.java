package club.someoneice.dreampineallpe.init;

import club.someoneice.dreampineallpe.Dreamlet;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Dreamlet.MODID)
public class BlockRegister {
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {

        IForgeRegistry<Block> registry = event.getRegistry();
        for (Block object : BlockList.BLOCK_LIST)
        {
            registry.register(object);
        }
    }
}

