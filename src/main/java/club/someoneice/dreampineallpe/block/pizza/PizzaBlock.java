package club.someoneice.dreampineallpe.block.pizza;

import club.someoneice.dreampineallpe.Dreamlet;
import club.someoneice.dreampineallpe.init.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;

public class PizzaBlock extends Block {
    public PizzaBlock(String name){
        super(Material.SNOW);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setSoundType(SoundType.SNOW);
        this.setHardness(1F);
        this.setResistance(10F);
        this.setCreativeTab(Dreamlet.pineapple);

        new AxisAlignedBB(0, 0, 0, 16, 4, 16);

        BlockList.BLOCK_LIST.add(this);
    }

}
