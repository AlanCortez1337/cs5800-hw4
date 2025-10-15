package com.cortezalan.problems.problem1.utils;

public class PushChannel extends Notification {
    public PushChannel(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public void sendNotification() {
        this.paymentType.makePayment();
        System.out.println("Sent Push Notification");
    };
}
