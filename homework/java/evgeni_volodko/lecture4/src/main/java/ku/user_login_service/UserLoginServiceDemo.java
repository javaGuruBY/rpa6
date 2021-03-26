package ku.user_login_service;

public class UserLoginServiceDemo {

    public static void main(String[] args) {

        User userOne = new User("Tom", "qwerty");
        UserLoginService uls = new UserLoginService();

        System.out.println(uls.login(userOne, "qwerty1"));
        System.out.println(uls.login(userOne, "qwerty"));
        System.out.println(uls.login(userOne, "qwert"));
        System.out.println(uls.login(userOne, "qwert"));
        System.out.println(uls.login(userOne, "qwert"));

    }
}
