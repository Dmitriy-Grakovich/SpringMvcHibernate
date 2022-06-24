package ru.grakovich.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import ru.grakovich.model.User;



public interface UserDAO extends JpaRepository<User,Long> , JpaSpecificationExecutor<User>{

}