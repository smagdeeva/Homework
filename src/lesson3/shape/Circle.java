package lesson3.shape;


public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square() {
        return radius * radius * Math.PI;

    }
}