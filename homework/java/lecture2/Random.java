package com.random_oleg_romanovich;

import java.util.Random;


public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(100);
        int b = randomGenerator.nextInt(100);
        int c = randomGenerator.nextInt(100);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        int sum = a + b + c;
        System.out.println();
        System.out.print("a + b + c = ");
        System.out.print(a);
        System.out.print(" + ");
        System.out.print(b);
        System.out.print(" + ");
        System.out.print(c);
        System.out.print(" = ");
        System.out.print(sum);

    }
}
