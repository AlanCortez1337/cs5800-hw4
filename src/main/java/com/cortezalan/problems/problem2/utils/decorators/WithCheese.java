package com.cortezalan.problems.problem2.utils.decorators;

import com.cortezalan.problems.problem2.utils.foodItems.FoodItem;

public class WithCheese implements FoodItem {
    private static WithCheese instance = null;
    public static WithCheese getInstance() {
        if (instance == null) {
            instance = new WithCheese();
        }
        return instance;
    }

    public double calculatePrice() {
        return 0.50;
    }
}
