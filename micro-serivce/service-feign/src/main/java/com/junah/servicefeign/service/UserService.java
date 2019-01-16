package com.junah.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wengjunhe on 2019/01/2019/1/16 0016.
 */
@FeignClient(value = "service-user")
public interface UserService {
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    String getUserList() ;
}
