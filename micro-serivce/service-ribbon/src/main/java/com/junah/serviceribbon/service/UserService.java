package com.junah.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wengjunhe on 2019/01/2019/1/16 0016.
 */
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public String getUserList(){
        return restTemplate.getForObject("http://service-user/userList",String.class);
    }
}
