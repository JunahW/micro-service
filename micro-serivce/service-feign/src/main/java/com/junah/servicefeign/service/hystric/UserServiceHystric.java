package com.junah.servicefeign.service.hystric;

import com.junah.servicefeign.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by wengjunhe on 2019/01/2019/1/16 0016.
 */
@Component
public class UserServiceHystric implements UserService {
    @Override
    public String getUserList() {
        return "服务器挂了！";
    }
}
