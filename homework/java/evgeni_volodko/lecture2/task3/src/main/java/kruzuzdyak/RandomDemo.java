package kruzuzdyak;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(51);
        int b = r.nextInt(51);
        int c = r.nextInt(51);
        int sum = a + b + c;

        System.out.printf("Random numbers:\n%d, %d, %d\n", a, b, c);
        System.out.printf("Sum of random numbers = %d", sum);
    }
}
