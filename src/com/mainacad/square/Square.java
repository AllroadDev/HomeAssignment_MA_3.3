package com.mainacad.square;

import com.mainacad.figure.Figure;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
        return side*side;
    }
}
