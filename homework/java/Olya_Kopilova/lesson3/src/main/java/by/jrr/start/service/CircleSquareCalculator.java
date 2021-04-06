package by.jrr.start.service;

import by.jrr.start.bean.Circle;
import by.jrr.start.bean.Figure;

public class CircleSquareCalculator implements SquareCalculator {
    @Override
    public double calculate(Figure figure) {
        Circle circle = (Circle) figure;
        double radius = circle.getRadius();
        double result = Math.PI * (radius * radius);
        return result;
    }
}
