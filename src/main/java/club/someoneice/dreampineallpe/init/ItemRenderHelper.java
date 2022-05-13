package club.someoneice.dreampineallpe.init;

import club.someoneice.dreampineallpe.Dreamlet;
import net.minecraft.block.Block;
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


        for(Block block : BlockList.BLOCK_LIST){
		    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(String.valueOf(block), "inventory"));
        }
    }
}
