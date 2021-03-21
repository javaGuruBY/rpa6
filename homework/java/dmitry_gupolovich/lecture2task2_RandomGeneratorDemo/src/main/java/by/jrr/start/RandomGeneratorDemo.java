package by.jrr.start;

import java.util.Arrays;

/**
 * 1. Сгенерировать 3 случайных числа и вывести их на экран.
 * 2. Посчитать сумму этих чисел и вывести результат на экран.
 */
public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int array[] = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = (int) (Math.random() * 500);
        }
        Arrays.stream(array).forEach(x -> System.out.printf("%s ", x));
        System.out.println("\nSum array is = " + Arrays.stream(array).sum());
    }
}

