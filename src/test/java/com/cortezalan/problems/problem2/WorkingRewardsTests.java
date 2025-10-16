package com.cortezalan.problems.problem2;

import com.cortezalan.problems.problem2.utils.rewards.BronzeTier;
import com.cortezalan.problems.problem2.utils.rewards.GoldTier;
import com.cortezalan.problems.problem2.utils.rewards.SilverTier;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkingRewardsTests {
    private static BronzeTier bronzeTier;
    private static SilverTier silverTier;
    private static GoldTier goldTier;

    @BeforeAll
    protected static void setUp() throws Exception {
        bronzeTier = new BronzeTier();
        silverTier = new SilverTier();
        goldTier = new GoldTier();
    }

    @Test
    public void applyBronzeTierDiscount() {
        double appliedLoyaltyDiscounts = bronzeTier.applyLoyaltyDiscounts(10);
        assertEquals(10, appliedLoyaltyDiscounts);
    }

    @Test
    public void applySilverTierDiscount() {
        double appliedLoyaltyDiscounts = silverTier.applyLoyaltyDiscounts(10);
        assertEquals(6.50, appliedLoyaltyDiscounts);
    }

    @Test
    public void applyGoldTierDiscount() {
        double appliedLoyaltyDiscounts = goldTier.applyLoyaltyDiscounts(10);
        assertEquals(5, appliedLoyaltyDiscounts);
    }
}
