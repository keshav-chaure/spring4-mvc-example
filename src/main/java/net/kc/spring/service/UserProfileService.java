package net.kc.spring.service;

import net.kc.spring.model.UserProfile;

import java.util.List;

/**
 * Created by keshav.chaure on 6/8/2018.
 */
public interface UserProfileService {
    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}
