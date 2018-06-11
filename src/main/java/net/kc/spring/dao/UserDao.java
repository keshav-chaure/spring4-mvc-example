package net.kc.spring.dao;

import net.kc.spring.model.User;

import java.util.List;

/**
 * Created by keshav.chaure on 6/8/2018.
 */
public interface UserDao {
    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();
}
