package com.cortezalan.problems.problem1.utils;

public class EmailChannel extends Notification {
    public EmailChannel(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public String sendNotification() {
        String paymentType = this.paymentType.makePayment();
        String notificationType = "Sent Email Notification";
        System.out.println(notificationType);

        return paymentType = " " + notificationType + ".";
    };
}
