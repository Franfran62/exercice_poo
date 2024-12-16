package org.example.models.impl;

import org.example.models.abstracts.Shape;
import org.example.models.Area;

public class Rectangle extends Shape implements Area {

    public Rectangle(double[] dimensions) {
        super(dimensions);
    }

    @Override
    public double area() {
        return getDimensions()[0] * getDimensions()[1];
    }
}
