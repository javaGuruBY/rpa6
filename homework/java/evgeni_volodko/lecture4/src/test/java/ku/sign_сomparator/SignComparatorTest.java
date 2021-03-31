package ku.sign_сomparator;

import org.junit.Assert;
import org.junit.Test;


public class SignComparatorTest {

    private String positiveNum = "Number is positive";
    private String negativeNum = "Number is negative";
    private String zeroNum = "Number is equal to zero";

    @Test
    public void comparePositive() {
        String result = SignComparator.compare(1);
        Assert.assertEquals(positiveNum, result);
    }

    @Test
    public void compareNegative() {
        String result = SignComparator.compare(-1);
        Assert.assertEquals(negativeNum, result);
    }

    @Test
    public void compareZero() {
        String result = SignComparator.compare(0);
        Assert.assertEquals(zeroNum, result);
    }
}