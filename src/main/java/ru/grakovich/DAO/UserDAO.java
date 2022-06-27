package ru.grakovich.DAO;


import ru.grakovich.model.User;

import java.util.List;


public interface UserDAO{

    List<User> allUser();

    void save(User user);

    User getUserById(long id);

    void delete(Long id);

    void update(User user);
}