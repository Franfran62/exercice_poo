package org.example.models.impl;

import org.example.models.Area;

public class Circle implements Area {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
