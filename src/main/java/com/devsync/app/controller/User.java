package com.devsync.app.controller;

import com.devsync.app.service.UserService;
import com.devsync.app.viewmodel.Device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to handle user actions.
 */
@RestController()
@RequestMapping("/user")
public class User {

    private UserService userService;

    /**
     * Constructor.
     * @param userService the UserService object to provide user specific actions
     */
    @Autowired
    public User(UserService userService) {
        this.userService = userService;
    }

    /**
     * Handler to return a list of all devices linked to the user.
     * @return list of devices linked
     */
    @RequestMapping("/devices")
    public Device devices() {
        return new Device();
    }

}
