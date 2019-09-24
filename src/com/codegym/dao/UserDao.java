package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAccount("hungav");
        u1.setPassword("123456");
        u1.setName("An Viết Hưng");
        u1.setEmail("hungav@codegym.com");
        u1.setAge(25);
        users.add(u1);

        User u2 = new User();
        u2.setAccount("hungav1");
        u2.setPassword("123456");
        u2.setName("Hưng An Viết");
        u2.setEmail("hungav1@codegym.com");
        u2.setAge(26);
        users.add(u1);
    }

    public static User checkUser(Login login){
        for (User u:users){
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
