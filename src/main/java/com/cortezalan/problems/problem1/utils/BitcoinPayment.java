package com.cortezalan.problems.problem1.utils;

public class BitcoinPayment implements PaymentType {
    public String makePayment() {
        String paymentType = "Made BitCoin Payment";
        System.out.println(paymentType);
        return paymentType;
    }
}
