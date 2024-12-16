package org.example.models.impl;

import org.example.models.Account;
import org.example.models.interfaces.Payment;

public class BankTransfert implements Payment {

    private Account account;

    public BankTransfert(Account account) {
        this.account = account;
    }

    @Override
    public void paymentMethod() {
        System.out.println("Paiement par virement bancaire");
    }

    @Override
    public void pay(Account toAccount, int amount) {
        this.account.setSolde(this.account.getSolde() - amount);
        this.paymentMethod();
        toAccount.addToSolde(amount);
    }
}
