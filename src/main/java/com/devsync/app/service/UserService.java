package com.devsync.app.service;

import com.devsync.app.model.Device;
import com.devsync.app.model.User;

import java.util.List;

/**
 * Represents a service to provide support for user specific actions such as Login, Add a device etc.
 */
public interface UserService {

    /**
     * Gets a list of all devices linked to a user.
     * @param user user for which linked devices are extracted
     * @return list of devices
     */
    List<Device> getDevices(User user);

    /**
     * Adds a device to the list of all devices linked to a user.
     * @param user target user to which specified device needs to linked
     * @param device the device to be linked
     */
    void addDevice(User user, Device device);
}