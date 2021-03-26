package ku.stock;

public class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.test1();
    }

    public void test1(){
        String testDescription = "Should correctly show prices";
        String companyName = "GOOG";
        double firstPrice = 10;
        Stock victim = new Stock(companyName, firstPrice);

        double expected = 10;
        double actual = victim.getCurrentPrice();
        checkThatEqual(expected, actual, testDescription);

        actual = victim.getMaxPrice();
        checkThatEqual(expected, actual, testDescription);

        actual = victim.getMinPrice();
        checkThatEqual(expected, actual, testDescription);

        victim.updatePrice(15);
        expected = 10;
        actual = victim.getMinPrice();
        checkThatEqual(expected, actual, testDescription);

        expected = 15;
        actual = victim.getMaxPrice();
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

    public void checkThatEqual(double expected, double actual, String testDescription){
        if (Math.abs(expected - actual) <= 0.001)
            System.out.println(testDescription + ": has passed!");
        else{
            System.out.println(testDescription + ": has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
