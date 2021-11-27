package com.example.SpringbootTest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device implements Serializable {

    private int deviceId;

    private String deviceName;

    private int amount;

    private String link;

    @Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", amount=" + amount + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
