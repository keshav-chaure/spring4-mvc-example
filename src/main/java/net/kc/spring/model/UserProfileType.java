package net.kc.spring.model;

import java.io.Serializable;

/**
 * Created by keshav.chaure on 6/8/2018.
 */
public enum UserProfileType implements Serializable {
    USER("USER"),
    DBA("DBA"),
    ADMIN("ADMIN");

    String userProfileType;

    private UserProfileType(String userProfileType) {
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType() {
        return userProfileType;
    }
    }
