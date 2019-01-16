package com.junah.serviceorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wengjunhe on 2019/01/2019/1/16 0016.
 */
@RestController
public class OrderController {

    @GetMapping(value = "orders")
    public String getOrders(){
        return "orders";
    }
}
