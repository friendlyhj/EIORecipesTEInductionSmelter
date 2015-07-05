package com.XFactHD.eiorteis.init;

import com.XFactHD.eiorteis.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{
    public static final Item GRMix = new itemGRMix();
    public static final Item ingotSteel = new itemIngotSteel();

    public static void init() {
        GameRegistry.registerItem(GRMix, "itemGRMix");
        GameRegistry.registerItem(ingotSteel, "ingotSteel");
    }
}