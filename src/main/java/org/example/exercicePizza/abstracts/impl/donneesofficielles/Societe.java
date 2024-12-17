package org.example.exercicePizza.abstracts.impl.donneesofficielles;

import org.example.exercicePizza.Adresse;
import org.example.exercicePizza.abstracts.DonneesOfficielles;
import org.example.exercicePizza.impl.societe.Holding;

public abstract class Societe extends DonneesOfficielles {

    private Holding holding;
    private int nombreEmployes;
    private double chiffreAffaire;

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public Holding getHolding() {
        return holding;
    }

    public void setHolding(Holding holding) {
        this.holding = holding;
    }

    public Societe(Holding holding, Adresse adresse, String statutSocial, int nombreEmployes, double chiffreAffaire) {
        super(adresse, statutSocial);
        this.holding = holding;
        this.nombreEmployes = nombreEmployes;
        this.chiffreAffaire = chiffreAffaire;
    }
}
