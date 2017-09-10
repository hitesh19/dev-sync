package com.devsync.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by hitesh on 27-08-2017.
 */
@RestController
public class ClipBoard {

    private final Logger logger;

    ClipBoard() {
        logger = LoggerFactory.getLogger(ClipBoard.class);
    }

    @RequestMapping("/clipboard/{name}")
    public String hello(@PathVariable String name){

        logger.info("hello folk: " + name);
        return "hello folks and " + name;
    }
}
