package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.LoginDao;

@Service
public class LoginService {

    @Autowired
    private LoginDao dao;

    public int getUserAccessLevel(String userName, String password) {
        return dao.getUserAccessLevel(userName, password);
    }
}
