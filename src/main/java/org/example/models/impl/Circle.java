package org.example.models.impl;

import org.example.models.Area;
import org.example.models.abstracts.Shape;

public class Circle extends Shape implements Area {

    public Circle(double[] dimensions) {
        super(dimensions);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getDimensions()[0], 2);
    }
}
