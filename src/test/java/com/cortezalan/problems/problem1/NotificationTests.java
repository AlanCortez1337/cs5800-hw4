package com.cortezalan.problems.problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cortezalan.problems.problem1.utils.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NotificationTests {
    private static CashOnDelivery cashPayment;
    private static OnlinePaymentNotification onlinePayment;
    private static BitcoinPayment bitcoinPayment;
    private static EmailChannel emailChannel;
    private static SmsChannel smsChannel;
    private static PushChannel pushChannel;

    @BeforeAll
    protected static void setUp() throws Exception {
        cashPayment = new CashOnDelivery();
        onlinePayment = new OnlinePaymentNotification();
        bitcoinPayment = new BitcoinPayment();

        emailChannel = new EmailChannel(cashPayment);
        smsChannel = new SmsChannel(onlinePayment);
        pushChannel = new PushChannel(bitcoinPayment);
    }

    @Test
    public void emailCashPaymentNotification() {
        String notificationResult = emailChannel.sendNotification();
        assertEquals("Made Cash Payment, Sent Email Notification.", notificationResult);
    }

    @Test
    public void smsOnlinePaymentNotification() {
        String notificationResult = smsChannel.sendNotification();
        assertEquals("Made Online Payment, Sent SMS Notification.", notificationResult);
    }

    @Test
    public void pushBitcoinPaymentNotification() {
        String notificationResult = pushChannel.sendNotification();
        assertEquals("Made BitCoin Payment, Sent Push Notification.", notificationResult);
    }
}
