package com.gskurko;

public class MathOperationsDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations'!\n");

        System.out.println("1) Addition '+':");
        int a = 100;
        int b = 45;
        System.out.println("a = " + a + ", b = " + b);

        int sum = a + b;
        System.out.println("a + b = "+ a + " + " + b + " = " + sum);

        System.out.println("\n2) Subtraction '-':");
        int x = 40;
        int y = 18;
        System.out.println("x = " + x + ", y = " + y);
        int sub = x - y;
        System.out.println("x - y = " + x + " - " + y + " = " + sub);

        System.out.println("\n3) Division '/':");
        int m = 15;
        int n = 3;
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m / n = " + m + " / " + n + " = " + 15 / 3);

        System.out.println("\n4) Multiplication '*':");
        int q = 10;
        int w = 4;
        System.out.println("q = " + q + ", w = " + w);
        System.out.println("q * w = " + q + " * " + w + " = " + q * w);
    }
}
