package com.cortezalan.problems.problem1.utils;

public class SmsChannel extends Notification {
    public SmsChannel(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public String sendNotification() {
        String paymentType = this.paymentType.makePayment();
        String notificationType = "Sent SMS Notification";
        System.out.println(notificationType);

        return paymentType = " " + notificationType + ".";
    };
}
