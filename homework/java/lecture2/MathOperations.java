package math_operations_oleg_romanovich;

public class MathOperations {

    public static void main(String[] args){
        System.out.println("Welcome to the 'Math Operations'!");

        int a = 69;
        int b = 35;

        System.out.println("1) Addition '+':");
        System.out.println("a = ");
        System.out.println(a);
        System.out.println(", ");
        System.out.println("b = ");
        System.out.println(b);

        int sum = a + b;

        System.out.println();
        System.out.println("a + b = ");
        System.out.println(a);
        System.out.println(" + ");
        System.out.println(b);
        System.out.println(" = ");
        System.out.println(sum);

        System.out.println("2) Subtraction '-':");
        long x = 48;
        long y = 30;
        System.out.println("x = " + x + ", y = " + y);

        long difference = x - y;
        System.out.println("x - y = " + x + " - " + y + " = " + difference);

        System.out.println("3) Multiplication '*':");
        short h = 20;
        short g = 18;
        System.out.println("h = " + h + ", g = " + g);
        System.out.println("h * g = " + h + " * " + g + " = " + (20 * 18));

        System.out.println("4) Division '/':");
        short m = 45;
        short n = 5;
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m / n = " + m + " / " + n + " = " + (45 / 5));
    }
}
