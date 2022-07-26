package com.wage.springcloud.client;

import com.wage.springcloud.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wage
 * @version 1.0
 */

@FeignClient(name = "auth-service")
public interface AuthServiceClient {

//    @RequestMapping(method = RequestMethod.POST,value = "/uaa/users",consumes = MediaType.APPLICATION_JSON_VALUE);
    void create(User user);
}
