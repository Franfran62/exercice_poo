package org.example;

import org.example.models.Account;
import org.example.models.impl.BankTransfert;
import org.example.models.impl.CreditCard;
import org.example.models.impl.Paypal;

public class Main {
    public static void main(String[] args) {
        var AcountA = new Account(100);
        var AcountB = new Account(200);

        var creditCard = new CreditCard(AcountA);
        var bankTransfert = new BankTransfert(AcountB);
    }
}
