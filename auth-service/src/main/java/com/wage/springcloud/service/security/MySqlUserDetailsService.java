package com.wage.springcloud.service.security;

import com.wage.springcloud.Dao.UserDao;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wage
 * @version 1.0
 */

@Service
public class MySqlUserDetailsService implements UserDetailsService {

    @Resource
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findById(username).orElseThrow(()->new UsernameNotFoundException(username));
    }
}
