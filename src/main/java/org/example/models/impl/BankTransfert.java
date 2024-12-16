package org.example.models.impl;

import org.example.models.abstracts.Payment;

public class BankTransfert extends Payment {

    public BankTransfert(int solde) {
        super(solde);
    }

    @Override
    protected void paymentMethod() {
        System.out.println("Paiement par virement bancaire");
    }
}
