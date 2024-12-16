package org.example.exercicePizza.impl;

public abstract class Holding {
    private String statutSocial;
    private int nombreEmployes;
    private double CAPrevisionnel;

    public String getStatutSocial() {
        return statutSocial;
    }

    public void setStatutSocial(String statutSocial) {
        this.statutSocial = statutSocial;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    public double getCAPrevisionnel() {
        return CAPrevisionnel;
    }

    public void setCAPrevisionnel(double CAPrevisionnel) {
        this.CAPrevisionnel = CAPrevisionnel;
    }

    public Holding(String statutSocial, int nombreEmployes, double CAPrevisionnel) {
        this.statutSocial = statutSocial;
        this.nombreEmployes = nombreEmployes;
        this.CAPrevisionnel = CAPrevisionnel;
    }
}
