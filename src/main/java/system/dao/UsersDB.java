package system.dao;

import org.springframework.stereotype.Repository;
import system.model.Department;
import system.model.User;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Max on 16.07.2017.
 */

@Repository
public class UsersDB {
    private List<User> users = Arrays.asList(
            new User(Department.DEVELOPMENT, "Fedor", 28, "admin", "admin", 3, 900, "Minsk 21-67", "@gmail.com"),
            new User(Department.DESIGN, "Dima", 28, "user1", "pass1", 2, 900, "Minsk 21-67", "@gmail.com"),
            new User(Department.SALES, "Olga", 28, "user3", "pass3", 2, 900, "Minsk 21-67", "@gmail.com"),
            new User(Department.DEVELOPMENT, "Vitya", 28, "user2", "pass2", 1, 900, "Minsk 21-67", "@gmail.com"),
            new User(Department.DEVELOPMENT, "Kolya", 28, "user4", "pass4", 1, 900, "Minsk 21-67", "@gmail.com"),
            new User(Department.DEVELOPMENT, "Lena", 28, "user5", "pass5", 1, 900, "Minsk 21-67", "@gmail.com"));

    public List<User> getAllUsers() {
        return users;
    }
}
