package net.spacenerd.spacefoodmod.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spacenerd.spacefoodmod.Main;


public class NewItems {

    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(NewFoodComponent.CHEESE)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }

    public static void registerModItems(){Main.LOGGER.info("Registring Mod for " + Main.MOD_ID);}
}
