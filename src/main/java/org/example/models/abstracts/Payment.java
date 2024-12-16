package org.example.models.abstracts;

public abstract class Payment {

     private int solde;

     public Payment(int solde) {
         this.solde = solde;
     }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int newSolde) {
         if (newSolde < -300) {
                throw new IllegalArgumentException("Solde insuffisant");
         }
        this.solde = newSolde;
    }

    public void pay(int amount) {
         if (amount > this.solde) {
             throw new IllegalArgumentException("Solde insuffisant");
         }
         this.setSolde(this.solde - amount);
         this.paymentMethod();
         System.out.println("Votre nouveau solde: " + this.solde);
    }

    protected void paymentMethod() {
        System.out.println("Paiement par défaut");
    }
}
