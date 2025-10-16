package com.cortezalan.problems.problem2.utils;

import com.cortezalan.problems.problem2.utils.decorators.ADD_ON_OPTIONS;
import com.cortezalan.problems.problem2.utils.foodItems.FOOD_ITEM;

import java.util.ArrayList;

public class FoodOrderItem {
    public FOOD_ITEM foodItem;
    public ArrayList<ADD_ON_OPTIONS> addOnOptions;

    public FoodOrderItem(FOOD_ITEM foodItem, ArrayList<ADD_ON_OPTIONS> addOnOptions) {
        this.foodItem = foodItem;
        this.addOnOptions = addOnOptions;
    }
}
