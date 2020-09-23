package com.knight.controllers;

import com.knight.pojo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by forget on 2020/9/23.
 */
@RestController
public class restController {

    @GetMapping(path = "/hello")
    public AjaxResponse hello(){
        return new AjaxResponse(200, "hello world");
    }

    @GetMapping(path = "/hello_cn")
    public AjaxResponse sayhi() {
        return new AjaxResponse(200, "你好,世界");
    }

    @GetMapping(path = "/version")
    public AjaxResponse doc(){
        return new AjaxResponse(200,"系统版本:1.0.0",null);
    }

}
