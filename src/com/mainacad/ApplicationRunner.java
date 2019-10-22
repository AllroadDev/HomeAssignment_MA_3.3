package com.mainacad;

import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setBase(13.5);
        triangle.setHeights(10.0);

        Circle circle = new Circle();
        circle.setRadius(7.5);

        Square square = new Square();
        square.setSide(45.0);

        Shape maxShape;
        Shape minShape;

        if (circle.getArea() > square.getArea()) {
            maxShape = (Shape) circle;

        } else {
            maxShape = (Shape) square;
        }
        if (maxShape.getArea() < triangle.getArea()) {
            maxShape = (Shape) triangle;
        }
        System.out.println(" Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());


        if (circle.getArea() > square.getArea()) {
            minShape = (Shape) circle;

        } else {
            minShape = (Shape) square;
        }

        if (minShape.getArea() > triangle.getArea()) {
            minShape = (Shape) triangle;

        }
        System.out.println(" Min shape is " + minShape.getClass().getSimpleName() + " and has area " + minShape.getArea() );
    }
}
