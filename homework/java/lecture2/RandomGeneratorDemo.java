package com.gskurko;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to Random Generator Demo!\n");

        double a = Math.random() * 5; //getting random number from 0 to 5
        double b = Math.random() * 200 - 100; //getting random number from -100 to 100

        Random r = new Random(); //creating Random object that help us create random values
        double c = r.nextDouble() * 60; //getting random number with Random object

        double sum = a + b + c; //getting sum of random values
        System.out.printf("%f + %f + %f = " + sum, a, b, c); //printing result in terminal
    }
}
