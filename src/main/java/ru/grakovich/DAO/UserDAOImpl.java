package ru.grakovich.DAO;

import org.springframework.stereotype.Component;
import ru.grakovich.model.User;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {
    @Override
    public List<User> allUser() {
        return null;
    }
}
