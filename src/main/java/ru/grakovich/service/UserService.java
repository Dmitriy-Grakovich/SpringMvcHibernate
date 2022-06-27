package ru.grakovich.service;

import ru.grakovich.model.User;

import java.util.List;

public interface UserService {
    List<User> allUser();

    void save(User user);

    User getUserById(long id);

    void update(Long id, String name, String lastName, Integer age);

    void delete(Long id);
}
