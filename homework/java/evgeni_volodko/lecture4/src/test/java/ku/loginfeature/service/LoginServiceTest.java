package ku.loginfeature.service;

import ku.loginfeature.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;
    String positiveUserInput = "qwerty";
    String negativeUserInput = "not qwerty";

    @Test
    public void checkUserPasswordPositive(){

        boolean actual = loginService.checkUserPassword(user, positiveUserInput);
        Assert.assertTrue(actual);
    }

    @Test
    public void checkUserPasswordNegative(){

        boolean actual = loginService.checkUserPassword(user, negativeUserInput);
        Assert.assertFalse(actual);
    }

    @Test
    public void reduceLoginAttempts(){
        loginService.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void loginPositive(){
        boolean actual = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actual);
    }

    @Test
    public void loginNegative(){
        boolean actual = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actual);
        Assert.assertEquals(2, user.getLoginAttempts() );
    }

    @Test
    public void aster3WrongPasswords_ShouldBlockUser(){
        loginService.login(user, negativeUserInput);
        Assert.assertFalse(user.isBlocked());
        Assert.assertEquals(2, user.getLoginAttempts() );

        loginService.login(user, negativeUserInput);
        Assert.assertFalse(user.isBlocked());
        Assert.assertEquals(1, user.getLoginAttempts() );

        loginService.login(user, negativeUserInput);
        Assert.assertTrue(user.isBlocked());
        Assert.assertEquals(0, user.getLoginAttempts() );
    }

    @Test
    public void blockUser(){
        loginService.blockUser(user);
        Assert.assertTrue(user.isBlocked());
    }

    @Before
    public void setUp(){
       this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
    }

    private User getUser() {
        User user = new User();
        user.setPassword("qwerty");
        return user;
    }
}