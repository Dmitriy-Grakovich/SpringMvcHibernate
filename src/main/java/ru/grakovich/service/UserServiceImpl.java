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
        return userDAO.findAll();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User getUserById(long id) {
        return userDAO.findById(id).get();
    }

    @Override
    public void update(Long id, String name, String lastName, Integer age) {
        User user = getUserById(id);
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        userDAO.save(user);
    }

    @Override
    public void deleteFilm(Long id) {
        userDAO.delete(getUserById(id));
    }
}
