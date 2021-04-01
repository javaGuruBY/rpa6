package by.jrr.start;

public class Division {
    private double a;
    private double b;

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate() {
        double res = 0.0;
        if (b != 0){
            res = a / b;
            System.out.println("(a / b)" + (a / b));
        }else
            System.out.println("Bad number");

        return res;
    }
}
