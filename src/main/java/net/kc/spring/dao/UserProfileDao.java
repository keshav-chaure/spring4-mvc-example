package net.kc.spring.dao;

import net.kc.spring.model.UserProfile;

import java.util.List;

/**
 * Created by keshav.chaure on 6/8/2018.
 */
public interface UserProfileDao {
    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
