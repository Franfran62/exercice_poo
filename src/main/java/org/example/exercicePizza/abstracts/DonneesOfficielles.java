package org.example.exercicePizza.abstracts;

import org.example.exercicePizza.Adresse;

public class DonneesOfficielles {

    private Adresse adresse;
    private String StatutSocial;

    public DonneesOfficielles(Adresse adresse, String statutSocial) {
        this.adresse = adresse;
        StatutSocial = statutSocial;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getStatutSocial() {
        return StatutSocial;
    }

    public void setStatutSocial(String statutSocial) {
        StatutSocial = statutSocial;
    }
}
