package com.wage.springcloud.service;

import com.wage.springcloud.entities.User;
import com.wage.springcloud.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author wage
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    private final Logger logger= LoggerFactory.getLogger(getClass());

    private static final BCryptPasswordEncoder ENCODER =new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        Optional<User> existing=userRepository.findById(user.getUsername());
        existing.ifPresent(it->{
            throw new IllegalArgumentException("user already exists"+it.getUsername());
        });
        String password=ENCODER.encode(user.getPassword());
        user.setPassword(password);
        userRepository.save(user);
        logger.info("new user has been created:{}"+user.getUsername());
    }
}
