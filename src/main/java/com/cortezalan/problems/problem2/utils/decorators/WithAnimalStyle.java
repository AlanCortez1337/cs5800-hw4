package com.cortezalan.problems.problem2.utils.decorators;

import com.cortezalan.problems.problem2.utils.foodItems.FoodItem;

public class WithAnimalStyle implements FoodItem {
    private static WithAnimalStyle instance = null;
    public static WithAnimalStyle getInstance() {
        if (instance == null) {
            instance = new WithAnimalStyle();
        }
        return instance;
    }

    public double calculatePrice() {
        return 1.25;
    }
}
