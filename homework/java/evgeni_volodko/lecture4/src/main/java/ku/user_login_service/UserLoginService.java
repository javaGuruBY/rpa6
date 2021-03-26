package ku.user_login_service;

public class UserLoginService {

    public boolean login(User user, String password){
        if (password.equals(user.getPassword())){
            if (!user.isBlocked())
                user.resetTrials();
            return true;
        }
        else{
            user.decreaseTrials();
            if (user.getTrials() <= 0) {
                user.blockUser();
                System.out.println("User blocked");
            }
            return false;
        }
    }
}
