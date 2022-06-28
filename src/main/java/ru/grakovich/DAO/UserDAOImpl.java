package ru.grakovich.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.grakovich.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager manager;


    @Override
    public List<User> allUser() {
        return manager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        manager.persist(user);
    }

    @Override
    public User getUserById(long id) {
        TypedQuery<User> q = manager.createQuery("select u from User u where u.id=:id",User.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }

    @Override
    public void delete(Long id) {
       User user = manager.find(User.class, id);
       manager.remove(user);
    }

    @Override
    public void update(User user) {
        manager.merge(user);
    }
}
