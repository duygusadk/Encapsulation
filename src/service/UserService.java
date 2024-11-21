package service;

import model.User;

import java.util.List;

public class UserService {

    private List<User> users;

    public boolean logUser(String userName, String password) {
        for (var user : users) {
            return user.getUsername().equalsIgnoreCase(userName) && user.getPassword().equals(password);
        }
        return false;
    }

    public boolean registerUser(String userName, String password) {
        for (var user : users) {
            if (user.getUsername().equals(userName)) {
                return false;
            }
        }
        users.add(new User(userName, password));
        return true;
    }

    public User getUserByName(String userName) {
        for (User user : users) {
            if (user.getUsername().equals(userName)) {
                return user;
            }
        }
        return null;
    }


}
