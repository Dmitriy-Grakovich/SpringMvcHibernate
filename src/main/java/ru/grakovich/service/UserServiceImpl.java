package ru.grakovich.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.grakovich.DAO.UserDAO;
import ru.grakovich.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> allUser() {
        return userDAO.allUser();
    }
}
