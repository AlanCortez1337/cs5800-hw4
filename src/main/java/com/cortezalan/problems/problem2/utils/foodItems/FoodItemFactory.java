package com.cortezalan.problems.problem2.utils.foodItems;

public class FoodItemFactory {
    public static FoodItem getFood(FOOD_ITEM foodItem) {
        switch (foodItem) {
            case FOOD_ITEM.BURGER:
                return new Burger();
            case FOOD_ITEM.FRIES:
                return new Fries();
            case FOOD_ITEM.HOTDOG:
                return new HotDog();
            default:
                return null;
        }
    }
}
