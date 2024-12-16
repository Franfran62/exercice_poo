package org.example.models;

public class Account {

    private int solde;

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        if (solde < -300) {
            throw new IllegalArgumentException("Solde insuffisant");
        }
        this.solde = solde;
    }

    public void addToSolde(int amount) {
        this.solde += amount;
    }

    public Account(int solde) {
        this.solde = solde;
    }
}
