package l2ex2;

public class RandomGenerator {
    protected int generator() {
        double w = Math.random();
        w = w * 100;
        return (int) w;
    }

}
