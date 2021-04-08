package by.jrr.start;

public class LightColor {

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println(lightColorDetector.detect(500));
    }
}
