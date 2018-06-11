package net.kc.spring.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by keshav.chaure on 6/8/2018.
 */
public class QuickPasswordEncodingGenerator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String password = "abc125";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));
    }
}
