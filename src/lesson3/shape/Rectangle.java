package lesson3.shape;

import lesson3.shape.Shape;

public class Rectangle implements Shape {
    private double width;
    private double length;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double square() {
        return width * length;

    }
}
