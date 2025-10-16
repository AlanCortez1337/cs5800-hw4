package com.cortezalan.problems.problem2.utils;

import com.cortezalan.problems.problem2.utils.decorators.ADD_ON_OPTIONS;
import com.cortezalan.problems.problem2.utils.decorators.WithAnimalStyle;
import com.cortezalan.problems.problem2.utils.decorators.WithCheese;
import com.cortezalan.problems.problem2.utils.decorators.WithColeSlaw;
import com.cortezalan.problems.problem2.utils.foodItems.FoodItem;
import com.cortezalan.problems.problem2.utils.foodItems.FoodItemFactory;
import com.cortezalan.problems.problem2.utils.rewards.BronzeTier;
import com.cortezalan.problems.problem2.utils.rewards.LoyaltyStatus;

import java.util.ArrayList;

public class Customer {
    private ArrayList<FoodOrderItem> customerOrder = new ArrayList<FoodOrderItem>();
    private LoyaltyStatus loyaltyStatus;

    public Customer() {
        this.loyaltyStatus = new BronzeTier();
    }

    public Customer(LoyaltyStatus loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public void addItemToOrder(FoodOrderItem foodItem) {
        this.customerOrder.add(foodItem);
    }

    public ArrayList<FoodOrderItem> getCustomerOrder() {
        return this.customerOrder;
    }

    public double customerOrderTotalPrice() {
        double total = 0;

        for (FoodOrderItem orderItem : customerOrder) {
            FoodItemFactory foodItemFactory = new FoodItemFactory();
            FoodItem foodItem = foodItemFactory.getFood(orderItem.foodItem);

            total += foodItem.calculatePrice();

            for (ADD_ON_OPTIONS addOnOption : orderItem.addOnOptions) {
                switch (addOnOption) {
                    case ADD_ON_OPTIONS.ANIMAL_STYLE:
                        total += WithAnimalStyle.getInstance().calculatePrice();
                        break;
                    case ADD_ON_OPTIONS.CHEESE:
                        total += WithCheese.getInstance().calculatePrice();
                        break;
                    case ADD_ON_OPTIONS.COLESLAW:
                        total += WithColeSlaw.getInstance().calculatePrice();
                        break;
                    default:
                        total += 0;
                        break;
                }
            }
        }

        return loyaltyStatus.applyLoyaltyDiscounts(total);
    }
}
