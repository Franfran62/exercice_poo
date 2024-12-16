package org.example.exercice2.impl;

import org.example.exercice2.Operation;

public class Soustraction implements Operation {
    public Soustraction() {
    }

    @Override
    public double calcul(double a, double b) {
        return a - b;
    }
}
