package ku.loginfeature.service;

import ku.loginfeature.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;
    User blockedUser;
    String positiveUserInput = "qwerty";
    String negativeUserInput = "not qwerty";

    @Test
    public void checkUserPasswordPositive(){

        boolean actual = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actual);
    }

    @Test
    public void checkUserPasswordNegative(){

        boolean actual = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actual);
    }

    @Test
    public void reduceLoginAttempts(){
        loginService.login(user, negativeUserInput);
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
        user.setLoginAttempts(1);
        loginService.login(user, negativeUserInput);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void restoreAttempts(){
        user.setLoginAttempts(1);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after1Incorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after2Incorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after3Incorrect_ShouldRestoreAttempts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        boolean actual = loginService.login(user, positiveUserInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
        Assert.assertFalse(actual);
    }

    @Before
    public void setUp(){
       this.loginService = new LoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();

        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        Assert.assertEquals(0, blockedUser.getLoginAttempts());
        Assert.assertTrue(blockedUser.isBlocked());
    }

    @Test
    public void blockedUserLoginShouldReturnFalse(){
        boolean actual = loginService.login(blockedUser, positiveUserInput);
        Assert.assertFalse(actual);
    }

    private User getUser() {
        User user = new User();
        user.setPassword("qwerty");
        return user;
    }

    private User getBlockedUser() {
        User user = new User();
        user.setPassword("qwerty");
        user.setLoginAttempts(0);
        user.setBlocked(true);
        return user;
    }
}
