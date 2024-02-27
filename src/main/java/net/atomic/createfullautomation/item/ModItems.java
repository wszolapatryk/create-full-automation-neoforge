package net.atomic.createfullautomation.item;

import net.atomic.createfullautomation.CreateFullAutomation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateFullAutomation.MOD_ID);

    public static final RegistryObject<Item> INKBOTTLE = ITEMS.register("ink_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOWINKBOTTLE = ITEMS.register("glow_ink_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COSMICSOOT = ITEMS.register("cosmic_soot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOIDGOO = ITEMS.register("void_goo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
