package system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.model.AuthCredentials;
import system.model.User;

@Repository
public class LoginDao {

    @Autowired
    private UserDao userDao;

    public User getUser(AuthCredentials creds) {
        for (User u : userDao.getAllUsers()){
            if(u.getUserName().equals(creds.getUserName()) &&
                    u.getPassword().equals(creds.getPassword())){
                return u;
            }
        }
        return null;
    }
}
