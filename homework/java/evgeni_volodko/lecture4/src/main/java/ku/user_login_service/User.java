package ku.user_login_service;

public class User {

    private final String login;
    private final String password;
    private boolean isBlocked;
    private int trials;

    public User(String login, String password){
        this.login = login;
        this.password = password;
        isBlocked = false;
        trials = 3;
    }

    public void resetTrials(){
        trials = 3;
    }

    public int getTrials(){
        return trials;
    }

    public void decreaseTrials(){
        trials--;
    }

    public void blockUser(){
        isBlocked = true;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public boolean isBlocked(){
        return isBlocked;
    }

    public static void main(String[] args) {
        User user = new User("Tom", "qwerty");
        user.decreaseTrials();
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        user.decreaseTrials();
        System.out.println(user.isBlocked());
        user.blockUser();
        System.out.println(user.isBlocked());
        System.out.println(user.getTrials());
    }
}
