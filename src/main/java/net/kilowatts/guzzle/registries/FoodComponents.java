package net.kilowatts.guzzle.registries;

import net.minecraft.item.FoodComponent;


public class FoodComponents
{


    public static final FoodComponent POPCORN = (new FoodComponent.Builder().snack().hunger(1).saturationModifier(0.3f).build());
    public static final FoodComponent MUFFIN = (new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build());
    public static final FoodComponent COCOLATE_MUFFIN = (new FoodComponent.Builder().hunger(5).saturationModifier(1f).build());
    public static final FoodComponent CORN = (new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build());



}
