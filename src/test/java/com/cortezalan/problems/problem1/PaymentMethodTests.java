package com.cortezalan.problems.problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cortezalan.problems.problem1.utils.BitcoinPayment;
import com.cortezalan.problems.problem1.utils.CashOnDelivery;
import com.cortezalan.problems.problem1.utils.OnlinePaymentNotification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PaymentMethodTests {
    private static CashOnDelivery cashPayment;
    private static OnlinePaymentNotification onlinePayment;
    private static BitcoinPayment bitcoinPayment;

    @BeforeAll
    protected static void setUp() throws Exception {
        cashPayment = new CashOnDelivery();
        onlinePayment = new OnlinePaymentNotification();
        bitcoinPayment = new BitcoinPayment();
    }

    @Test
    public void makeCashPayment() throws Exception {
        String paymentResult = cashPayment.makePayment();
        assertEquals("Made Cash Payment", paymentResult);
    }

    @Test
    public void makeOnlinePayment() throws Exception {
        String paymentResult = onlinePayment.makePayment();
        assertEquals("Made Online Payment", paymentResult);
    }

    @Test
    public void makeBitCoinPayment() throws Exception {
        String paymentResult = bitcoinPayment.makePayment();
        assertEquals("Made BitCoin Payment", paymentResult);
    }
}
