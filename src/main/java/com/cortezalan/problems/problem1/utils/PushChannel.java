package com.cortezalan.problems.problem1.utils;

public class PushChannel extends Notification {
    public PushChannel(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public String sendNotification() {
        String paymentType = this.paymentType.makePayment();
        String notificationType = "Sent Push Notification";
        System.out.println(notificationType);

        return paymentType + ", " + notificationType + ".";
    }
}
