package org.example.models.abstracts;

public abstract class Payment {

     private int solde;

     public Payment(int solde) {
         this.solde = solde;
     }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void pay() {
        System.out.println("Paiement");
    }
}
