package org.example.exercice2.impl;

import org.example.exercice2.Operation;

public class Addition implements Operation {

    public Addition() {
    }

    @Override
    public double calcul(double a, double b) {
        return a + b;
    }
}
