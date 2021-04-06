package by.jrr.start.service;

import by.jrr.start.bean.Figure;
import by.jrr.start.bean.Rectangle;
import by.jrr.start.bean.Triangle;

public class TriangleSquareCalculator implements SquareCalculator {
    @Override
    public double calculate(Figure figure) {
        Triangle triangle = (Triangle) figure;
        double result = (triangle.getHeith() * triangle.getGround())/2;
        return result;
    }
}
