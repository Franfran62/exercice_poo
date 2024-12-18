package org.example.exercicePizza.impl.societe;

import org.example.exercicePizza.Adresse;
import org.example.exercicePizza.abstracts.DonneesOfficielles;
import org.example.exercicePizza.abstracts.impl.donneesofficielles.Societe;

import java.util.List;

public class Holding extends DonneesOfficielles {

    private List<Societe> societes;
    private int nombreEmployes;
    private double CAPrevisionnel;

    private Holding(Adresse adresse, String statutSocial, List<Societe> societes) {
        super(adresse, statutSocial);
        this.societes = societes;
    }

    public List<Societe> getSocietes() {
        return societes;
    }

    public void setSocietes(List<Societe> Societes) {
        this.societes = Societes;
        this.calculCAPrevisionnel();
        this.calculNombreEmployes();
    }

    public void addSociete(Societe Societe) {
        this.societes.add(Societe);
        this.calculCAPrevisionnel();
        this.calculNombreEmployes();
    }

    private void calculCAPrevisionnel() {
        for (Societe Societe : societes) {
            this.CAPrevisionnel += this.CAPrevisionnel + Societe.getChiffreAffaire();
        }
    }

    private void calculNombreEmployes() {
        for (Societe Societe : societes) {
            this.nombreEmployes += this.nombreEmployes + Societe.getNombreEmployes();
        }
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public double getCAPrevisionnel() {
        return CAPrevisionnel;
    }
}
