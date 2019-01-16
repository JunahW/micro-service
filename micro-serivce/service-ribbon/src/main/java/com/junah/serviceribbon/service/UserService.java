package com.junah.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "userError")
    public String getUserList(){
        return restTemplate.getForObject("http://service-user/userList",String.class);
    }

    /**
     * 熔断时调用的方法
     * @return
     */
    public String  userError(){
        return "ribbo-hystrix 服务器挂了！";
    }
}
