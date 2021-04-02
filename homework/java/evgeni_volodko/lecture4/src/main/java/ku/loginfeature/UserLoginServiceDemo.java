package ku.loginfeature;


import ku.loginfeature.bean.User;
import ku.loginfeature.service.LoginService;

public class UserLoginServiceDemo {

    public static void main(String[] args) {

        User userOne = new User();
        userOne.setPassword("qwerty");
        LoginService ls = new LoginService();

        System.out.println(ls.login(userOne, "qwerty1"));
        System.out.println(ls.login(userOne, "qwerty"));
        System.out.println(ls.login(userOne, "qwert"));
        System.out.println(ls.login(userOne, "qwert"));
        System.out.println(ls.login(userOne, "qwert"));

    }
}
