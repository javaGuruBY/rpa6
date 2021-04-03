package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {

    private void sum(int a, int b, int c){
        int result = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + result);
    }

    public static void main(String[] args) {
        System.out.println("RandomGeneratorDemo");

        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);

        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        randomGeneratorDemo.sum(a, b, c);
    }
}
