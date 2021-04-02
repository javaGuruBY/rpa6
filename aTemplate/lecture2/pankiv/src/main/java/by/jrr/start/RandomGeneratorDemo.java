package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {
    private AdditionRand additionRand;


    static double calculate(double rand1, double rand2, double rand3) {
        double res = 0.0;
        rand1 = Math.random();
        rand2 = Math.random();
        rand3 = Math.random();
        res = new AdditionRand(rand1, rand2, rand3).calculate();
        System.out.println("Random number1: " + rand1);
        System.out.println("Random number2: " + rand2);
        System.out.println("Random number3: " + rand3);
        return res;
    }
}
