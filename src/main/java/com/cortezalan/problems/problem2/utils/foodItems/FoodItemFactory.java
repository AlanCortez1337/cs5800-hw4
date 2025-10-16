package com.cortezalan.problems.problem2.utils.foodItems;

public class FoodItemFactory {
    public static FoodItem getFood(FOOD_ITEM foodItem) {
        return switch (foodItem) {
            case FOOD_ITEM.BURGER -> new Burger();
            case FOOD_ITEM.FRIES -> new Fries();
            case FOOD_ITEM.HOTDOG -> new HotDog();
            default -> null;
        };
    }
}
