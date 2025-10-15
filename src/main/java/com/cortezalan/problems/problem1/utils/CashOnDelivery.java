package com.cortezalan.problems.problem1.utils;

public class CashOnDelivery implements PaymentType {
    public String makePayment() {
        String paymentType = "Made Cash Payment";
        System.out.println(paymentType);
        return paymentType;
    }
}
