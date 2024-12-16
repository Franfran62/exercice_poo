package org.example;

import org.example.models.impl.BankTransfert;
import org.example.models.impl.CreditCard;
import org.example.models.impl.Paypal;

public class Main {
    public static void main(String[] args) {

        var creditCard = new CreditCard(100);
        creditCard.pay();

        var paypal = new Paypal(200);
        paypal.pay();

        var bankTransfert = new BankTransfert(300);
        bankTransfert.pay();
    }
}