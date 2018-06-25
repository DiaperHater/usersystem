package system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.model.AuthCredentials;
import system.model.User;

@Repository
public class Dao {

    @Autowired
    private UsersDB usersDB;

    public User getUser(AuthCredentials creds) {
        for (User u : usersDB.getAllUsers()){
            if(u.getUserName().equals(creds.getUserName()) &&
                    u.getPassword().equals(creds.getPassword())){
                return u;
            }
        }
        return null;
    }
}
