package com.cortezalan.problems.problem2.utils.rewards;

public class GoldTier implements LoyaltyStatus {
    public double applyLoyaltyDiscounts(double price){
        return price - 5.00;
    }
}
