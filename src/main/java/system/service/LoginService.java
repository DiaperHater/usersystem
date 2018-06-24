package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.LoginDao;
import system.model.AuthCredentials;
import system.model.User;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public User getUser(AuthCredentials creds) {
        return loginDao.getUser(creds);
    }
}
