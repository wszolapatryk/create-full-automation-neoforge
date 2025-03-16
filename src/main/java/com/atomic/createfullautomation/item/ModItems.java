package com.atomic.createfullautomation.item;

import com.atomic.createfullautomation.CreateFullAutomation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateFullAutomation.MODID);

    public static final DeferredItem<Item> INKBOTTLE = ITEMS.registerItem("ink_bottle",
    		Item::new, new Item.Properties());
    public static final DeferredItem<Item> GLOWINKBOTTLE = ITEMS.registerItem("glow_ink_bottle",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> COSMICSOOT = ITEMS.registerItem("cosmic_soot",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> VOIDGOO = ITEMS.registerItem("void_goo",
            Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
