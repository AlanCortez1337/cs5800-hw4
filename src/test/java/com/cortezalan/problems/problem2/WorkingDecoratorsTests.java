package com.cortezalan.problems.problem2;

import com.cortezalan.problems.problem2.utils.decorators.WithAnimalStyle;
import com.cortezalan.problems.problem2.utils.decorators.WithCheese;
import com.cortezalan.problems.problem2.utils.decorators.WithColeSlaw;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkingDecoratorsTests {
    private static WithAnimalStyle withAnimalStyle;
    private static WithCheese withCheese;
    private static WithColeSlaw withColeSlaw;

    @BeforeAll
    protected static void setUp() throws Exception {
        withAnimalStyle = new WithAnimalStyle();
        withCheese = new WithCheese();
        withColeSlaw = new WithColeSlaw();
    }

    @Test
    public void getWithAnimalStyleAddOnPrice() {
        double foodItemPrice = withAnimalStyle.calculatePrice();
        assertEquals(1.25, foodItemPrice);
    }

    @Test
    public void getWithCheeseAddOnPrice() {
        double foodItemPrice = withCheese.calculatePrice();
        assertEquals(0.50, foodItemPrice);
    }

    @Test
    public void getWithColeSlawAddOnPrice() {
        double foodItemPrice = withColeSlaw.calculatePrice();
        assertEquals(0.75, foodItemPrice);
    }
}
