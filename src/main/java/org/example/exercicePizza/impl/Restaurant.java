package org.example.exercicePizza.impl;

public class Restaurant  {
    private Holding holding;
    private Adresse adresse;
    private String statut;
    private int nombreDeSalarie;
    private double chiffreAffaire;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getNombreDeSalarie() {
        return nombreDeSalarie;
    }

    public void addOneSalarie() {
        this.nombreDeSalarie++;
    }

    public void addSalaries(int nombreDeSalarie) {
        this.nombreDeSalarie += nombreDeSalarie;
    }

    public void removeOneSalarie() {
        this.nombreDeSalarie--;
    }

    public void removeSalaries(int nombreDeSalarie) {
        this.nombreDeSalarie -= nombreDeSalarie;
    }

    public void setNombreDeSalarie(int nombreDeSalarie) {
        this.nombreDeSalarie = nombreDeSalarie;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public Restaurant(Adresse adresse, String statut, int nombreDeSalarie, double chiffreAffaire, Holding holding) {
        this.adresse = adresse;
        this.statut = statut;
        this.nombreDeSalarie = nombreDeSalarie;
        this.chiffreAffaire = chiffreAffaire;
        this.holding = holding;
    }
}
