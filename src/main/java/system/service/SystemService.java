package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.Dao;
import system.model.AuthCredentials;
import system.model.User;

@Service
public class SystemService {

    @Autowired
    private Dao dao;

    public User getUserWithCredentials(AuthCredentials creds) {
        return dao.getUser(creds);
    }

    public User getUserById(int userId) throws Exception {
        return dao.getUserById(userId);
    }

    public void saveUser(User user) {
        dao.saveUser(user);
    }
}
