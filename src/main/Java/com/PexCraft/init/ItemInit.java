package com.PexCraft.init;
import java.util.ArrayList;
import java.util.List;

import com.PexCraft.objects.items.ItemBase;
import net.minecraft.item.Item;
public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item PEX_INGOT = new ItemBase("pex_ingot");
    public static final Item LEX_INGOT = new ItemBase("pex_ingot");
}