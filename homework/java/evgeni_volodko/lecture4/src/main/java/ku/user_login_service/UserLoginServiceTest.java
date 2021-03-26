package ku.user_login_service;

public class UserLoginServiceTest {

    public static void main(String[] args) {
        UserLoginServiceTest testRunner = new UserLoginServiceTest();
        testRunner.test1();
    }

    public void test1(){
        String testDescription = "Should correctly login or block user";
        String login = "tom";
        String password = "qwerty";
        User user = new User(login, password);
        UserLoginService victim = new UserLoginService();

        boolean expectedLogin = false;
        boolean actualLogin = victim.login(user, "asf");
        checkThatEqual(expectedLogin, actualLogin, testDescription);

        int expectedTrials = 2;
        int actualTrials = user.getTrials();
        checkThatEqual(expectedTrials, actualTrials, testDescription);

        expectedLogin = true;
        actualLogin = victim.login(user,"qwerty");
        checkThatEqual(expectedLogin, actualLogin, testDescription);

        expectedTrials = 3;
        actualTrials = user.getTrials();
        checkThatEqual(expectedTrials, actualTrials, testDescription);

        victim.login(user, "asf");
        victim.login(user, "asf");
        victim.login(user, "asf");

        boolean expectedBlock = true;
        boolean actualBlock = user.isBlocked();
        checkThatEqual(expectedBlock, actualBlock, testDescription);
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
