package com.devsync.app.viewmodel;

import com.devsync.app.annotation.ViewModel;

/**
 * ViewModel representing a Device.
 */
@ViewModel
public class Device {

    private String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
