package net.kc.spring.service;

import net.kc.spring.model.User;

import java.util.List;

/**
 * Created by keshav.chaure on 6/8/2018.
 */
public interface UserService {
    User findById(int id);
    User findBySSO(String sso);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserBySso(String sso);
    List<User> findAllUsers();
    boolean isUserSSOUnique(Integer id, String sso);
}
