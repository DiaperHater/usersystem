package system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.List;

@Repository
public class LoginDao {

    @Autowired
    private UserDao usersDao;

    public int getUserAccessLevel(String userName, String password) {
        List<User> users = usersDao.getAllUsers();

        for (User u : users){
            if(u.getName().equals(userName) && u.getPassword().equals(password)){
                return u.getAccessLevel();
            }
        }

        return 0;
    }
}
