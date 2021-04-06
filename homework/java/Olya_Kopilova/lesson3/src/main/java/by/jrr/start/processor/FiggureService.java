package by.jrr.start.processor;

import by.jrr.start.bean.Figure;
import by.jrr.start.service.CalculatorFabric;
import by.jrr.start.service.SquareCalculator;

public class FiggureService {

    public static String calculateSquare(Figure figure) throws Exception {
        SquareCalculator squareCalculator = CalculatorFabric.getCalculator(figure);
        return getFomattedResult(squareCalculator.calculate(figure));
    }

    private static String getFomattedResult(double result) {
        return String.format("S = %.2f", result);
    }
}
