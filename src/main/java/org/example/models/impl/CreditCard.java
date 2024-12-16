package org.example.models.impl;

import org.example.models.abstracts.Payment;

public class CreditCard extends Payment {

    public CreditCard(int solde) {
        super(solde);
    }

    @Override
    protected void paymentMethod() {
        System.out.println("Paiement par carte de Crédit");
    }
}
