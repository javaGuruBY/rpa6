package ku.loginfeature.service;

import ku.loginfeature.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;

    @Test
    public void checkUserPasswordPositive(){

        String userInput = "qwerty";

        boolean actual = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actual);
    }

    @Test
    public void checkUserPasswordNegative(){

        String userInput = "not qwerty";

        boolean actual = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actual);
    }

    @Test
    public void reduceLoginAttempts(){
        loginService.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void loginPositive(){
        String userInput = "qwerty";

        boolean actual = loginService.login(user, userInput);
        Assert.assertTrue(actual);
    }

    @Test
    public void loginNegative(){
        String userInput = "not qwerty";

        boolean actual = loginService.login(user, userInput);
        Assert.assertFalse(actual);
        Assert.assertEquals(2, user.getLoginAttempts() );
    }

    @Before
    public void setUp(){
       this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    private User getUser() {
        User user = new User();
        user.setPassword("qwerty");
        return user;
    }
}