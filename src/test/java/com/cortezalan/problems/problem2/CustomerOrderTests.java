package com.cortezalan.problems.problem2;

import com.cortezalan.problems.problem2.utils.Customer;
import com.cortezalan.problems.problem2.utils.FoodOrderItem;
import com.cortezalan.problems.problem2.utils.decorators.ADD_ON_OPTIONS;
import com.cortezalan.problems.problem2.utils.foodItems.FOOD_ITEM;
import com.cortezalan.problems.problem2.utils.rewards.GoldTier;
import com.cortezalan.problems.problem2.utils.rewards.LoyaltyStatus;
import com.cortezalan.problems.problem2.utils.rewards.SilverTier;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerOrderTests {
    private static Customer basicBronzeTierHotDogOrder;
    private static Customer basicBronzeTierBurgerOrder;
    private static Customer silverTierFriesAndCheeseOrder;
    private static Customer goldTierBurgerWithAnimalStyleAndHotDogWithColeslawOrder;

    @BeforeAll
    protected static void setUp() throws Exception {
        basicBronzeTierHotDogOrder = new Customer();
        basicBronzeTierBurgerOrder = new Customer();

        LoyaltyStatus silverTier = new SilverTier();
        silverTierFriesAndCheeseOrder = new Customer(silverTier);

        LoyaltyStatus goldTier = new GoldTier();
        goldTierBurgerWithAnimalStyleAndHotDogWithColeslawOrder = new Customer(goldTier);
    }

    @Test
    public void addFoodItemToOrder() {
        ArrayList<ADD_ON_OPTIONS> addOnOptions = new ArrayList<ADD_ON_OPTIONS>();
        FoodOrderItem foodItem = new FoodOrderItem(FOOD_ITEM.HOTDOG, addOnOptions);
        ArrayList<FoodOrderItem> customerOrder = new ArrayList<FoodOrderItem>();

        customerOrder.add(foodItem);
        basicBronzeTierHotDogOrder.addItemToOrder(foodItem);

        assertEquals(customerOrder.size(), basicBronzeTierHotDogOrder.getCustomerOrder().size());
        for (int i = 0; i < customerOrder.size(); i++) {
            assertEquals(customerOrder.get(i), basicBronzeTierHotDogOrder.getCustomerOrder().get(i));
            assertEquals(customerOrder.get(i), basicBronzeTierHotDogOrder.getCustomerOrder().get(i));
        }
    }

    @Test
    public void getOrderTotalPriceWithBronzeTierCustomer() {
        ArrayList<ADD_ON_OPTIONS> addOnOptions = new ArrayList<ADD_ON_OPTIONS>();
        FoodOrderItem foodItem = new FoodOrderItem(FOOD_ITEM.BURGER, addOnOptions);

        basicBronzeTierBurgerOrder.addItemToOrder(foodItem);

        assertEquals(10.25, basicBronzeTierBurgerOrder.customerOrderTotalPrice());
    }

    @Test
    public void getOrderTotalPriceWithSilverTierCustomer() {
        ArrayList<ADD_ON_OPTIONS> addOnOptions = new ArrayList<ADD_ON_OPTIONS>();
        addOnOptions.add(ADD_ON_OPTIONS.CHEESE);

        FoodOrderItem foodItem = new FoodOrderItem(FOOD_ITEM.FRIES, addOnOptions);
        silverTierFriesAndCheeseOrder.addItemToOrder(foodItem);

        assertEquals(2.50, silverTierFriesAndCheeseOrder.customerOrderTotalPrice());
    }

    @Test
    public void getOrderTotalPriceWithGoldTierCustomer() {
        ArrayList<ADD_ON_OPTIONS> burgerAddOnOptions = new ArrayList<ADD_ON_OPTIONS>();
        burgerAddOnOptions.add(ADD_ON_OPTIONS.ANIMAL_STYLE);

        FoodOrderItem burgerItem = new FoodOrderItem(FOOD_ITEM.BURGER, burgerAddOnOptions);
        goldTierBurgerWithAnimalStyleAndHotDogWithColeslawOrder.addItemToOrder(burgerItem);

        ArrayList<ADD_ON_OPTIONS> hotdogAddOnOptions = new ArrayList<ADD_ON_OPTIONS>();
        hotdogAddOnOptions.add(ADD_ON_OPTIONS.COLESLAW);

        FoodOrderItem hotdogItem = new FoodOrderItem(FOOD_ITEM.HOTDOG, hotdogAddOnOptions);
        goldTierBurgerWithAnimalStyleAndHotDogWithColeslawOrder.addItemToOrder(hotdogItem);

        assertEquals(14.5, goldTierBurgerWithAnimalStyleAndHotDogWithColeslawOrder.customerOrderTotalPrice());
    }
}
