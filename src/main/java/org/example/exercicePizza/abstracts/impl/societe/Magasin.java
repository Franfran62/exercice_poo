package org.example.exercicePizza.abstracts.impl.societe;

import org.example.exercicePizza.Adresse;
import org.example.exercicePizza.abstracts.impl.donneesofficielles.Societe;
import org.example.exercicePizza.impl.societe.Holding;

public abstract class Magasin extends Societe {

    private boolean livraisonADomicile;

    public Magasin(Holding holding, Adresse adresse, String statutSocial, int nombreEmployes, double chiffeAffaire, boolean livraisonADomicile) {
        super(holding, adresse, statutSocial, nombreEmployes, chiffeAffaire);
        this.livraisonADomicile = livraisonADomicile;
    }
}
