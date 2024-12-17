package org.example.exercicePizza;

public class Adresse {

    private String rue;
    private String ville;
    private int codePostal;
    private String complement;

    public Adresse(String rue, String ville, int codePostal, String complement) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.complement = complement;
    }

    public Adresse(String rue, String ville, int codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.complement = null;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
