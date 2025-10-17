package com.cortezalan.problems.problem2.utils;

import com.cortezalan.problems.problem2.utils.decorators.ADD_ON_OPTIONS;
import com.cortezalan.problems.problem2.utils.foodItems.FOOD_ITEM;
import com.cortezalan.problems.problem2.utils.rewards.GoldTier;
import com.cortezalan.problems.problem2.utils.rewards.LoyaltyStatus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LoyaltyStatus goldTier = new GoldTier();
        Customer customer = new Customer(goldTier);

        System.out.println("~~CUSTOMER ORDER~~");
        System.out.println("Hotdog w/ Cheese + Coleslaw");

        ArrayList<ADD_ON_OPTIONS> hotDogAddOnOptions = new ArrayList<>();
        hotDogAddOnOptions.add(ADD_ON_OPTIONS.CHEESE);
        hotDogAddOnOptions.add(ADD_ON_OPTIONS.COLESLAW);
        FoodOrderItem hotdog = new FoodOrderItem(FOOD_ITEM.HOTDOG, hotDogAddOnOptions);

        System.out.println("Burger w/ Cheese x4 + Animal Style");
        ArrayList<ADD_ON_OPTIONS> burgerAddOnOptions = new ArrayList<>();
        burgerAddOnOptions.add(ADD_ON_OPTIONS.ANIMAL_STYLE);
        burgerAddOnOptions.add(ADD_ON_OPTIONS.CHEESE);
        burgerAddOnOptions.add(ADD_ON_OPTIONS.CHEESE);
        burgerAddOnOptions.add(ADD_ON_OPTIONS.CHEESE);
        burgerAddOnOptions.add(ADD_ON_OPTIONS.CHEESE);
        FoodOrderItem burger = new FoodOrderItem(FOOD_ITEM.BURGER, burgerAddOnOptions);

        System.out.println("Fries w/ Coleslaw");
        ArrayList<ADD_ON_OPTIONS> friesAddOnOptions = new ArrayList<>();
        burgerAddOnOptions.add(ADD_ON_OPTIONS.COLESLAW);
        FoodOrderItem fries = new FoodOrderItem(FOOD_ITEM.FRIES, friesAddOnOptions);

        customer.addItemToOrder(hotdog);
        customer.addItemToOrder(burger);
        customer.addItemToOrder(fries);

        double orderTotal = customer.customerOrderTotalPrice();

        System.out.println("TOTAL: " + orderTotal);
        System.out.println("~~~~~~~~~~~~~~~~~~");
    }
}
