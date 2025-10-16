package com.cortezalan.problems.problem2.utils.rewards;

public class SilverTier implements LoyaltyStatus {
    public double applyLoyaltyDiscounts(double price){
        return price - 3.50;
    }
}
