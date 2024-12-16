package org.example.models.impl;

import org.example.models.Account;
import org.example.models.interfaces.Payment;

public class Paypal implements Payment {

    private Account account;

    public Paypal(Account account) {
        this.account = account;
    }

    @Override
    public void paymentMethod() {
        System.out.println("Paiement par Paypal");
    }

    @Override
    public void pay(Account toAccount, int amount) {
        this.account.setSolde(this.account.getSolde() - amount);
        this.paymentMethod();
        toAccount.addToSolde(amount);
    }
}
