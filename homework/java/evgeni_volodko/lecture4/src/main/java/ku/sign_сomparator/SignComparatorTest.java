package ku.sign_сomparator;

public class SignComparatorTest {

    public static void main(String[] args) {
        SignComparatorTest testRunner = new SignComparatorTest();
        testRunner.test1();
    }

    public void test1(){
        String testDescription = "Should correctly identify the number";

        SignComparator victim = new SignComparator();

        String expected = "Number is positive";
        String actual = victim.compare(11);
        checkThatEqual(expected, actual, testDescription);

        expected = "Number is negative";
        actual = victim.compare(Integer.MIN_VALUE);
        checkThatEqual(expected, actual, testDescription);

        expected = "Number is equal to zero";
        actual = victim.compare(0);
        checkThatEqual(expected, actual, testDescription);
    }

    public void checkThatEqual(String expected, String actual, String testDescription){
        if (expected.equals(actual))
            System.out.println(testDescription + ": has passed!");
        else{
            System.out.println(testDescription + ": has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }



}
