package by.jrr.start;


public class MathOperationsDemo {
    public static void main(String[] args) {
        CustomUtils utils = new CustomUtils();
        double value1 = Math.random() * 500;
        double value2 = 0; // Math.random() * 500;

        System.out.printf("%5.2f + %5.2f = " + "%5.2f%n", value1, value2, getOperation('+').getResult(value1, value2));
        System.out.printf("%5.2f - %5.2f = " + "%5.2f%n", value1, value2, getOperation('-').getResult(value1, value2));
        System.out.printf("%5.2f * %5.2f = " + "%5.2f%n", value1, value2, getOperation('*').getResult(value1, value2));
        if (utils.checkValue(value2)) {
            System.out.printf("%5.2f / %5.2f = " + "%5.2f%n", value1, value2, getOperation('/').getResult(value1, value2));
        } else {
            System.out.printf("Деление на ноль невозможно! Это бесконечность %5.2f / %5.2f", value1, value2);

        }
    }

    /**
     *
     * @param typeOperation - symbol which presented current operation
     * @return anonymous class based on interface Operation which store calculated result
     */
    private static Operation getOperation(char typeOperation) {
        switch (typeOperation) {
            case '*':
                return (value1, value2) -> value1 * value2;
            case '/':
                return (value1, value2) -> value1 / value2;
            case '+':
                return (value1, value2) -> value1 + value2;
            case '-':
                return (value1, value2) -> value1 - value2;
            default:
                return (value1, value2) -> 0.00;
        }
    }
}
