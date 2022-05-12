package club.someoneice.dreampineallpe.block.pizza;

/*
import club.someoneice.dreampineallpe.init.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemLead;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public class DreamerPizza extends Block {
    public DreamerPizza(Material material){
        super(material);
    }

    private int QuantityDropped;

    public DreamerPizza(int QuantityDropped) {
        super(Material.SNOW);
        new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);

        this.QuantityDropped = QuantityDropped;
    }

    public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer Player, int side, float posX, float posY, float posZ)
    {
        if (Player.field_71071_by.func_70448_g().func_77973_b() == ItemList.PizzaWheel)
        {
            EntityItem Item = new EntityItem(world, x, y, z, new ItemStack(ItemList.PizzaSlice, this.QuantityDropped + 2, 0));
            if (!world.isRemote)
            {
                world.onEntityAdded(Item);
                if (!(Player instanceof FakePlayer)) {
                    Item.onCollideWithPlayer(Player);
                }
            }
            return true;
        }
        return false;
    }

}
*/