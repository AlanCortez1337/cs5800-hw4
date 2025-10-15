package com.cortezalan.problems.problem1.utils;

public class EmailChannel extends Notification {
    public EmailChannel(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public void sendNotification() {
        this.paymentType.makePayment();
        System.out.println("Sent Email Notification");
    };
}
