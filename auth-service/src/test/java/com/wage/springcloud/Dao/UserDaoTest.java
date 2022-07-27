package com.wage.springcloud.Dao;

import com.wage.springcloud.entities.User;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author wage
 * @version 1.0
 */

public class UserDaoTest {
    private UserDao userDao;

    @Test
    public void shouldSaveAndFindUserByName(){
        User user=new User();
        user.setUserName("name");
        user.setPassword("password");
        userDao.save(user);

        Optional<User> found= userDao.findById(user.getUsername());
    }
}
