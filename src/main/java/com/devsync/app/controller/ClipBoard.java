package com.devsync.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by hitesh on 27-08-2017.
 */
@RestController
public class ClipBoard {

    @RequestMapping("/clipboard/{name}")
    public String hello(@PathVariable String name){
        System.out.println("hello folk: " + name);
        return "hello folks and " + name;
    }
}
