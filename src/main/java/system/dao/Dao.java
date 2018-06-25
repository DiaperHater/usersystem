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

    public User getUserById(int userId) throws Exception {
        for (User u : usersDB.getAllUsers()){
            if(u.getId() == userId){
                return u;
            }
        }
        throw new Exception("No user with id: "+ userId);
    }

    public void saveUser(User userToStore) {
        for (User u : usersDB.getAllUsers()){
            if (u.getId() == userToStore.getId()){
                u = userToStore;
            }
        }
    }
}
