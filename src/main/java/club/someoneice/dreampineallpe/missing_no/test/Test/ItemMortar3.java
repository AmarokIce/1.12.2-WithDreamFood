
package club.someoneice.dreampineallpe.missing_no.test.Test;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.pasterdream.ElementsPasterdreamMod;
import net.pasterdream.creativetab.TabPasterDream;

@ElementsPasterdreamMod.ModElement.Tag
public class ItemMortar3 extends ElementsPasterdreamMod.ModElement {
	@GameRegistry.ObjectHolder("pasterdream:mortar_3")
	public static final Item block = null;
	public ItemMortar3(ElementsPasterdreamMod instance) {
		super(instance, 660);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("pasterdream:mortar_3", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			this.setMaxDamage(99);
			this.maxStackSize = 1;
			this.setUnlocalizedName("mortar_3");
			this.setRegistryName("mortar_3");
			this.setCreativeTab(TabPasterDream.tab);
			this.setContainerItem(this);
			OreDictionary.registerOre("toolMortar", this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

	}
}
