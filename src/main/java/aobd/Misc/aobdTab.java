package aobd.Misc;

import aobd.Aobd;
import aobd.aobditems.aobditems;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * CreativeTabs. Nuff said.
 */
public class aobdTab extends CreativeTabs {
    public aobdTab() {
        super(Aobd.MOD_ID);
        setBackgroundImageName("item_search.png");
    }

    @Override
    @MethodsReturnNonnullByDefault
    public Item getTabIconItem() {
        return aobditems.dust;
    }
    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
