package by.jrr.start;

public class MathOperationsDemo {
    private Addition addition;
    private Division division;
    private Multiplication multiplication;
    private Substraction substraction;

    public static double calculate(double a, double b, String command){
        double res = 0.0;
        switch (command) {
            case "+":
               res = new Addition(a, b).calculate();
               break;
            case "-":
                res = new Substraction(a, b).calculate();
                break;
            case "*":
                res = new Multiplication(a, b).calculate();
                break;
            case "/":
                res = new Division(a, b).calculate();
                break;
            default:
            System.out.println("Found command!");
        }
        return res;
    }
}
