package ku.user_login_service;

public class UserTest {

    public static void main(String[] args) {
        UserTest testRunner = new UserTest();
        testRunner.test1();
    }

    public void test1(){
        String testDescription = "Should correctly gives userdata";
        String login = "tom";
        String password = "qwerty";
        User victim = new User(login, password);

        String expected = login;
        String actual = victim.getLogin();
        checkThatEqual(expected,actual,testDescription);

        expected = password;
        actual = victim.getPassword();
        checkThatEqual(expected,actual,testDescription);

        boolean expectedBlock = false;
        boolean actualBlock = victim.isBlocked();
        checkThatEqual(expectedBlock, actualBlock, testDescription);

        victim.decreaseTrials();
        victim.resetTrials();
        victim.decreaseTrials();
        victim.decreaseTrials();
        actualBlock = victim.isBlocked();
        checkThatEqual(expectedBlock, actualBlock, testDescription);

        int expectedTrials = 1;
        int actualTrials = victim.getTrials();
        checkThatEqual(expectedTrials, actualTrials, testDescription);

        victim.decreaseTrials();
        actualBlock = victim.isBlocked();
        checkThatEqual(expectedBlock, actualBlock, testDescription);

        victim.blockUser();
        expectedBlock = true;
        actualBlock = victim.isBlocked();
        checkThatEqual(expectedBlock, actualBlock, testDescription);
    }

    public void checkThatEqual(String expected, String actual, String testDescription){
        if (expected.equals(actual))
            System.out.println(testDescription + ": has passed!");
        else{
            System.out.println(testDescription + ": has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }

    public void checkThatEqual(int expected, int actual, String testDescription){
        if (expected == actual)
            System.out.println(testDescription + ": has passed!");
        else{
            System.out.println(testDescription + ": has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }

    public void checkThatEqual(boolean expected, boolean actual, String testDescription){
        if (expected == actual)
            System.out.println(testDescription + ": has passed!");
        else{
            System.out.println(testDescription + ": has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
