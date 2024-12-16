package org.example.exercice2.impl;

import org.example.exercice2.Operation;

public class Multiplication implements Operation {

    public Multiplication() {
    }

    @Override
    public double calcul(double a, double b) {
        return a * b;
    }
}
