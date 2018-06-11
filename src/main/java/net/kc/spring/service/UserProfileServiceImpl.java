package net.kc.spring.service;

import net.kc.spring.dao.UserProfileDao;
import net.kc.spring.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by keshav.chaure on 6/8/2018.
 */
@Service
@Transactional
public class UserProfileServiceImpl implements UserProfileService {
    @Autowired
    UserProfileDao dao;

    public UserProfile findById(int id) {
        return dao.findById(id);
    }

    public UserProfile findByType(String type){
        return dao.findByType(type);
    }

    public List<UserProfile> findAll() {
        return dao.findAll();
    }
}
