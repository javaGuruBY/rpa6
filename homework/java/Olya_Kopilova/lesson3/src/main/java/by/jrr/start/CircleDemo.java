package by.jrr.start;

public class CircleDemo {
    public static void main (String[] args) {
        double radius = 3;
        Circle circleSquare = new Circle();
        circleSquare.calculateArea(radius);
    }
}

class Circle {
    double radius;

    void calculateArea (double rds) {
        radius = rds;
        double area = Math.PI * (radius * radius);
        System.out.println("S = " + area);
    }
}