package org.example.models.impl;

import org.example.models.abstracts.Payment;

public class Paypal extends Payment {

    public Paypal(int solde) {
        super(solde);
    }

    @Override
    public void pay() {
        System.out.println("Paiement par Paypal");
    }
}
