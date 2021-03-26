package ku.color_detector;

public class ColorDetectorTest {

    public static void main(String[] args) {
        ColorDetectorTest testRunner = new ColorDetectorTest();
        testRunner.test1();
    }

    public void test1(){
        String testDescription = "Should correctly identify the color of light";

        ColorDetector victim = new ColorDetector();

        int w0 = 0;
        int w1 = 350;
        int w2 = 449;
        int w3 = 480;
        int w4 = 550;
        int w5 = 588;
        int w6 = 600;
        int w7 = 711;
        int w8 = 1064;

        String expected = "Invisible Light";
        String actual = victim.detect(w0);
        checkThatEqual(expected, actual, testDescription);

        expected = "Invisible Light";
        actual = victim.detect(w1);
        checkThatEqual(expected, actual, testDescription);

        expected = "Violet";
        actual = victim.detect(w2);
        checkThatEqual(expected, actual, testDescription);

        expected = "Blue";
        actual = victim.detect(w3);
        checkThatEqual(expected, actual, testDescription);

        expected = "Green";
        actual = victim.detect(w4);
        checkThatEqual(expected, actual, testDescription);

        expected = "Yellow";
        actual = victim.detect(w5);
        checkThatEqual(expected, actual, testDescription);

        expected = "Orange";
        actual = victim.detect(w6);
        checkThatEqual(expected, actual, testDescription);

        expected = "Red";
        actual = victim.detect(w7);
        checkThatEqual(expected, actual, testDescription);

        expected = "Invisible Light";
        actual = victim.detect(w8);
        checkThatEqual(expected, actual, testDescription);
    }

    public void checkThatEqual(String expected, String actual, String testDescription) {
        if (expected.equals(actual))
            System.out.println(testDescription + ": has passed!");
        else {
            System.out.println(testDescription + ": has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
