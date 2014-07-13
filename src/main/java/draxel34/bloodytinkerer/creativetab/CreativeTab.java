package draxel34.bloodytinkerer.creativetab;


import draxel34.bloodytinkerer.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static final CreativeTabs BloodyTinkerer = new CreativeTabs(Reference.modId)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemById(54);
        };

        @Override
    public String getTranslatedTabLabel()
        {
            return("Bloody Tinkerer");
        }
    };
}
