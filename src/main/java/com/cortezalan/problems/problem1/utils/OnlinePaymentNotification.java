package com.cortezalan.problems.problem1.utils;

public class OnlinePaymentNotification implements PaymentType {
    public String makePayment() {
        String paymentType = "Made Online Payment";
        System.out.println(paymentType);
        return paymentType;
    }
}
