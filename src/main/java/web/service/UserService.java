package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    void addUser(User user);

    List<User> getAllUsers();

    void updateUser(Long id, User u);

    void removeUserById(Long id);
}
