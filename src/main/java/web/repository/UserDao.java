package web.repository;

import web.model.User;

import java.util.List;

public interface UserDao {


    void createUsersTable();
    void dropUsersTable();
    void createUser(User user);
    List<User> getAllUsers();
    void updateUser(User user);
    boolean deleteUser(long id);
    User getUserById(long id);
}
