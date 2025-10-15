package com.cortezalan.problems;

import com.cortezalan.problems.problem1.utils.*;

public class Main {
    public static void main(String[] args) {
        OnlinePaymentNotification onlinePayment = new OnlinePaymentNotification();
        CashOnDelivery cashPayment = new CashOnDelivery();
        BitcoinPayment bitcoinPayment = new BitcoinPayment();

        System.out.println("---- PART 1 ----");
        EmailChannel emailOnlinePaymentNotification = new EmailChannel(onlinePayment);
        SmsChannel smsOnlinePaymentNotification = new SmsChannel(onlinePayment);
        EmailChannel emailCashPaymentNotification = new EmailChannel(cashPayment);
        SmsChannel smsCashPaymentNotification = new SmsChannel(cashPayment);

        emailOnlinePaymentNotification.sendNotification();
        smsOnlinePaymentNotification.sendNotification();
        emailCashPaymentNotification.sendNotification();
        smsCashPaymentNotification.sendNotification();
        System.out.println("---- PART 2 ----");
        EmailChannel emailBitCoinPaymentNotification = new EmailChannel(bitcoinPayment);
        SmsChannel smsBitCoinPaymentNotification = new SmsChannel(bitcoinPayment);
        emailBitCoinPaymentNotification.sendNotification();
        smsBitCoinPaymentNotification.sendNotification();
        System.out.println("---- PART 3 ----");
        PushChannel pushBitCoinPaymentNotification = new PushChannel(bitcoinPayment);
        PushChannel pushCashPaymentNotification = new PushChannel(bitcoinPayment);
        pushBitCoinPaymentNotification.sendNotification();
        pushCashPaymentNotification.sendNotification();

    }
}
