package com.krm.tutorialmod.item;

import com.krm.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item ICE_ETHER = registerItems("ice_ether",new Item(new FabricItemSettings()));
    public static final Item FIRE_ETHER = registerItems("fire_ether",new Item(new FabricItemSettings()));

    private static  void addItemsToIG(FabricItemGroupEntries fabricItemGroupEntries){
    fabricItemGroupEntries .add(ICE_ETHER);
    }
    private static  void addItemsToIG1(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries .add(FIRE_ETHER);
    }

    private static Item registerItems(String name,Item item){
    return Registry.register(Registries.ITEM,new Identifier(TutorialMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIG);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(Moditems::addItemsToIG1);
    }
}
