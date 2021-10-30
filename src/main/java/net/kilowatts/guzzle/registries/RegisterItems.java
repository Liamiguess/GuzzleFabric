package net.kilowatts.guzzle.registries;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class RegisterItems 
{

    //Items used only for Recipes
    public static final Item DOUGH = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item BREAD_DOUGH = new Item(new Item.Settings().group(ItemGroup.FOOD));

    //Food items, using FoodComponents
    public static final Item POPCORN = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.POPCORN).maxCount(99));
    public static final Item MUFFIN = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.MUFFIN));
    public static final Item CHOCOLATE_MUFFIN = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.COCOLATE_MUFFIN));
    public static final Item CORN = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CORN));


    public static void RegisterAll()
    {
    
        //Register Items for Recipes
        Registry.register(Registry.ITEM, new Identifier("guzzle", "dough"), DOUGH);
        Registry.register(Registry.ITEM, new Identifier("guzzle", "bread_dough"), BREAD_DOUGH);

        //Register Food Items
        Registry.register(Registry.ITEM, new Identifier("guzzle","popcorn"), POPCORN);
        Registry.register(Registry.ITEM, new Identifier("guzzle", "muffin"), MUFFIN);
        Registry.register(Registry.ITEM, new Identifier("guzzle", "chocolate_muffin"), CHOCOLATE_MUFFIN);
        Registry.register(Registry.ITEM, new Identifier("guzzle","corn"), CORN);
        
    }

}