package by.jrr.start;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
