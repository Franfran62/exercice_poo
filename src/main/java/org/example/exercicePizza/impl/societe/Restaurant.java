package org.example.exercicePizza.impl.societe;

import org.example.exercicePizza.abstracts.impl.donneesofficielles.Societe;
import org.example.exercicePizza.Adresse;
import org.example.exercicePizza.Menu;

public class Restaurant extends Societe {

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Restaurant(Holding holding, Adresse adresse, String statutSocial, int nombreEmployes, double chiffreAffaire, boolean livraisonADomicile, Menu menu) {
        super(holding, adresse, statutSocial, nombreEmployes, chiffreAffaire);
        this.menu = menu;
    }
}
