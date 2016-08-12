package com.example.qixin.fashionchaser.service;

import com.example.huangm26.fashionchaser.data.Channel;


public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
