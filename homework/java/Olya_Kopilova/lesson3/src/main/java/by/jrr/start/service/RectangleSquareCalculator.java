package by.jrr.start.service;

import by.jrr.start.bean.Figure;
import by.jrr.start.bean.Rectangle;

public class RectangleSquareCalculator implements SquareCalculator {
    @Override
    public double calculate(Figure figure) {
        Rectangle rectangle = (Rectangle) figure;
        double result = rectangle.getLength() * rectangle.getWidth();
        return result;
    }
}
