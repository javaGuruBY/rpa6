package l2ex2;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        RandomGenerator generate = new RandomGenerator();
        int a = generate.generator();
        int b = generate.generator();
        int c = generate.generator();
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println(" Sum = " + (a + b + c));
    }
}
