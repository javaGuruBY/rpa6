package by.jrr.start;

public class MathOperationsDemo {

    public void addition(int a, int b){
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public void subtraction(int a, int b){
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    public void multiplication(int a, int b){
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    public void division(int a, int b){
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }

    public void remainder(int a, int b){
        int result = a % b;
        System.out.println(a + " % " + b + " = " + result);
    }

    public static void main(String[] args) {
        System.out.println("MathOperationsDemo");

        MathOperationsDemo mathOperationsDemo = new MathOperationsDemo();
        mathOperationsDemo.addition(5, 6);
        mathOperationsDemo.subtraction(9, 3);
        mathOperationsDemo.multiplication(6, 8);
        mathOperationsDemo.division(9, 3);
        mathOperationsDemo.remainder(7, 3);

    }


}
