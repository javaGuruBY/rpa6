package ku.loginfeature.service;

import ku.loginfeature.bin.User;

public class LoginService {

    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
