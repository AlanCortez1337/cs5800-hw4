package com.cortezalan.problems.problem2.utils.decorators;

import com.cortezalan.problems.problem2.utils.foodItems.FoodItem;

public class WithColeSlaw implements FoodItem {
    private static WithColeSlaw instance = null;
    public static WithColeSlaw getInstance() {
        if (instance == null) {
            instance = new WithColeSlaw();
        }
        return instance;
    }

    public double calculatePrice() {
        return 0.75;
    }
}
