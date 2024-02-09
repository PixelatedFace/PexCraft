package com.PexCraft.objects.items;

import com.PexCraft.PexCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

    }
    public void registerModels() {
        PexCraft.proxy.registerItemRenderer(this, 0, "Inventory");
    }
}
