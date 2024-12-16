package org.example.models.interfaces;

import org.example.models.Account;

public interface Payment {

    public void pay(Account toAccount, int amount);

    public void paymentMethod();
}
