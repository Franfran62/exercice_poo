package org.example.models.impl;

import org.example.models.Account;
import org.example.models.interfaces.Payment;

public class CreditCard implements Payment {

    private Account account;

    public CreditCard(Account account) {
        this.account = account;
    }

    @Override
    public void paymentMethod() {
        System.out.println("Paiement par carte bancaire");
    }

    @Override
    public void pay(Account toAccount, int amount) {
        this.account.setSolde(this.account.getSolde() - amount);
        this.paymentMethod();
        toAccount.addToSolde(amount);
    }
}
