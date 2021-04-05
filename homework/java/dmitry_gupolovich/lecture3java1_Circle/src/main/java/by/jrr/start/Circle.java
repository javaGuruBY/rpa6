package by.jrr.start;

/**
 * Created by User on 27.03.2021.
 */
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
