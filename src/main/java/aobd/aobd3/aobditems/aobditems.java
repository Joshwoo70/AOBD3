package aobd.aobd3.aobditems;

import aobd.aobd3.Base.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class aobditems {
    public static ItemBase dust;
    public static void init() {
        Bee = register(new ItemBase("bee_script").setCreativeTab(CreativeTabs.MISC));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
