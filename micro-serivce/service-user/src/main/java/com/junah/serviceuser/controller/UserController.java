package com.junah.serviceuser.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wengjunhe on 2019/01/2019/1/16 0016.
 */
@RestController
public class UserController {

    @GetMapping(value = "userList")
    @ApiOperation(value = "查询用户列表")
    public String getUserList(HttpServletRequest request) {
        int remotePort = request.getRemotePort();
        int localPort = request.getLocalPort();
        return "我的端口号是：" + localPort;
    }
}
