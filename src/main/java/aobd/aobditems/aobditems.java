package aobd.aobditems;

import aobd.Aobd;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class aobditems {
    public static ItemVariants dust;
    public static void init() {
        dust = register(new ItemVariants("dust").setCreativeTab(Aobd.aobdTab));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
