package org.example.models.abstracts;

public abstract class Shape {

    private double[] dimensions;

    public Shape(double[] dimensions) {
        this.dimensions = dimensions;
    }

    public double[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(double[] dimensions) {
        this.dimensions = dimensions;
    }
}
