package com.skyline.learn.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/8/14.
 */
@RestController
public class helloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}
