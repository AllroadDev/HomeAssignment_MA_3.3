package com.mainacad.triangle;

import com.mainacad.figure.Figure;

public class Triangle extends Figure {

    private double base;
    private double heights;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeights() {
        return heights;
    }

    public void setHeights(double heights) {
        this.heights = heights;
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
        return (base * heights) / 2 ;
    }
}
