package org.example.models.impl;

import org.example.models.abstracts.Payment;

public class CreditCard extends Payment {

    public CreditCard(int solde) {
        super(solde);
    }

    @Override
    public void pay() {
        System.out.println("Paiement par carte bancaire");
    }
}
