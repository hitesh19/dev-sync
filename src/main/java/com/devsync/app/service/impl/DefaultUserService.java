package com.devsync.app.service.impl;

import com.devsync.app.model.Device;
import com.devsync.app.model.User;
import com.devsync.app.service.UserService;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Default implementation of the UserService.
 */
@Service
public class DefaultUserService implements UserService {

    public List<Device> getDevices(User user) {
        throw new NotImplementedException();
    }

    public void addDevice(User user, Device device) {
        throw new NotImplementedException();
    }
}
