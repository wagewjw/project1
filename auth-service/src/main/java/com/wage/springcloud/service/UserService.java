package com.wage.springcloud.service;

import com.wage.springcloud.entities.User;

/**
 * @author wage
 * @version 1.0
 */
public interface UserService {
    /**
     *
     * @param user 实体对象：{账户，密码}
     */
    void create(User user);
}
