package com.cortezalan.problems.problem1.utils;

public class SmsChannel extends Notification {
    public SmsChannel(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public void sendNotification() {
        this.paymentType.makePayment();
        System.out.println("Sent SMS Notification");
    };
}
