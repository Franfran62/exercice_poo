package org.example.exercicePizza.impl.societe;

import org.example.exercicePizza.Catalogue;
import org.example.exercicePizza.abstracts.impl.societe.Magasin;
import org.example.exercicePizza.Adresse;

public class MagasinDeJouet extends Magasin {

    private Catalogue catalogue;

    public MagasinDeJouet(Holding holding, Adresse adresse, String statutSocial, int nombreEmployes, double chiffreAffaire, Catalogue catalogue, boolean livraisonADomicile) {
        super(holding, adresse, statutSocial, nombreEmployes, chiffreAffaire, livraisonADomicile);
        this.catalogue = catalogue;
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }
}
