package by.jrr.start.service;

import by.jrr.start.bean.Circle;
import by.jrr.start.bean.Figure;
import by.jrr.start.bean.Rectangle;
import by.jrr.start.bean.Triangle;

public class CalculatorFabric {

    public static SquareCalculator getCalculator(Figure figure) throws Exception {
        SquareCalculator squareCalculator;
        if (figure instanceof Circle) {
            squareCalculator = new CircleSquareCalculator();
        } else if (figure instanceof Rectangle) {
            squareCalculator = new RectangleSquareCalculator();
        }else if(figure instanceof Triangle) {
            squareCalculator = new TriangleSquareCalculator();
        } else {
            throw new Exception("no such figures!");
        }
        return squareCalculator;
    }
}
