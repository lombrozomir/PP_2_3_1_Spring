package web.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import web.model.User;

import java.util.List;


public interface UserService {

    void createUsersTable();

    void dropUsersTable();

    void createUser(User user);

    List<User> getAllUsers();

    void updateUser(User user);

    boolean deleteUser(long id);

    User getUserById(long id);
}
