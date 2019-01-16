package com.junah.servicefeign.service;

import com.junah.servicefeign.service.hystric.UserServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wengjunhe on 2019/01/2019/1/16 0016.
 */
@FeignClient(value = "service-user",fallback = UserServiceHystric.class)
public interface UserService {
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    String getUserList() ;
}
