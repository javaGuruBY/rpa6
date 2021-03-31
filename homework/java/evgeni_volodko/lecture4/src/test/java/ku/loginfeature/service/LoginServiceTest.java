package ku.loginfeature.service;

import ku.loginfeature.bin.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;

    @Test
    public void checkUserPasswordPositive(){
        User user = getUser();

        String userInput = "qwerty";

        boolean actual = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actual);
    }

    @Test
    public void checkUserPasswordNegative(){
        User user = getUser();

        String userInput = "not qwerty";

        boolean actual = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actual);
    }

    @Before
    public void setUp(){
       this.loginService = new LoginService();
    }


    private User getUser() {
        User user = new User();
        user.setPassword("qwerty");
        return user;
    }
}