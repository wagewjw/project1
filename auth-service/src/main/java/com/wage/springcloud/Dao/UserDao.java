package com.wage.springcloud.Dao;

import com.wage.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.CrudRepository;

/**
 * @author wage
 * @version 1.0
 */
@Mapper
public interface UserDao extends CrudRepository<User,String> {
}
