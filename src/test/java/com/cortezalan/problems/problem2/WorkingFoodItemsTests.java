package com.cortezalan.problems.problem2;

import com.cortezalan.problems.problem2.utils.foodItems.FOOD_ITEM;
import com.cortezalan.problems.problem2.utils.foodItems.FoodItem;
import com.cortezalan.problems.problem2.utils.foodItems.FoodItemFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkingFoodItemsTests {
    private static FoodItemFactory foodItemFactory;
    private static FoodItem burger;
    private static FoodItem fries;
    private static FoodItem hotdog;

    @BeforeAll
    protected static void setUp() throws Exception {
        foodItemFactory = new FoodItemFactory();
        burger = foodItemFactory.getFood(FOOD_ITEM.BURGER);
        fries = foodItemFactory.getFood(FOOD_ITEM.FRIES);
        hotdog = foodItemFactory.getFood(FOOD_ITEM.HOTDOG);
    }

    @Test
    public void getBurgerPrice() {
        double foodItemPrice = burger.calculatePrice();
        assertEquals(10.25, foodItemPrice);
    }

    @Test
    public void getFriesPrice() {
        double foodItemPrice = fries.calculatePrice();
        assertEquals(5.50, foodItemPrice);
    }

    @Test
    public void getHotDog() {
        double foodItemPrice = hotdog.calculatePrice();
        assertEquals(7.25, foodItemPrice);
    }
}
