package com.mainacad.circle;

import com.mainacad.figure.Figure;

public class Circle extends Figure {

    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
