package com.wage.springcloud.repository;

import com.wage.springcloud.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wage
 * @version 1.0
 */
@Repository
public interface UserRepository extends CrudRepository<User,String> {
}
