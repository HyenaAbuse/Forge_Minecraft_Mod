package net.nora.groxmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nora.groxmod.GroxMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GroxMod.MOD_ID);

    public static final RegistryObject<Item> CUP = ITEMS.register("cup",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PILOT = ITEMS.register("pilot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DESPAIR = ITEMS.register("despair",
            ()-> new Item(new Item.Properties()));


    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
