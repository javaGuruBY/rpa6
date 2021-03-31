package ku.color_detector;

import org.junit.Assert;
import org.junit.Test;

public class ColorDetectorTest {

    @Test
    public void detectInvisibleLight() {
        String result = ColorDetector.detect(379);
        String invisibleLight = "Invisible Light";
        Assert.assertEquals(invisibleLight, result);

        result = ColorDetector.detect(751);
        Assert.assertEquals(invisibleLight, result);
    }

    @Test
    public void detectViolet() {
        String violet = "Violet";
        String result = ColorDetector.detect(380);
        Assert.assertEquals(violet, result);

        result = ColorDetector.detect(449);
        Assert.assertEquals(violet, result);
    }

    @Test
    public void detectBlue() {
        String blue = "Blue";
        String result = ColorDetector.detect(450);
        Assert.assertEquals(blue, result);

        result = ColorDetector.detect(494);
        Assert.assertEquals(blue, result);
    }

    @Test
    public void detectGreen() {
        String green = "Green";
        String result = ColorDetector.detect(495);
        Assert.assertEquals(green, result);

        result = ColorDetector.detect(569);
        Assert.assertEquals(green, result);
    }

    @Test
    public void detectYellow() {
        String yellow = "Yellow";
        String result = ColorDetector.detect(570);
        Assert.assertEquals(yellow, result);

        result = ColorDetector.detect(589);
        Assert.assertEquals(yellow, result);
    }

    @Test
    public void detectOrange() {
        String orange = "Orange";
        String result = ColorDetector.detect(590);
        Assert.assertEquals(orange, result);

        result = ColorDetector.detect(619);
        Assert.assertEquals(orange, result);
    }

    @Test
    public void detectRed() {
        String red = "Red";
        String result = ColorDetector.detect(620);
        Assert.assertEquals(red, result);

        result = ColorDetector.detect(749);
        Assert.assertEquals(red, result);
    }
}