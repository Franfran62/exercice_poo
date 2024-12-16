package org.example.models.impl;

import org.example.models.abstracts.Payment;

public class BankTransfert extends Payment {

    public BankTransfert(int solde) {
        super(solde);
    }

    @Override
    public void pay() {
        System.out.println("Paiement par virement bancaire");
    }
}
