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
        return new AjaxResponse();
    }

}