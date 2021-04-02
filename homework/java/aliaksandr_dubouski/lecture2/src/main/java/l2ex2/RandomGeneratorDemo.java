package l2ex2;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        RandomGenerator generate = new RandomGenerator();
        int x = generate.generator();
        int y = generate.generator();
        int z = generate.generator();
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
        System.out.println(" z = " + z);
        System.out.println(" Sum = " + (x + y + z));
    }
}
