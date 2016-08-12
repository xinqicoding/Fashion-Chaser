package com.example.qixin.fashionchaser.service;

import com.example.qixin.fashionchaser.data.Channel;

/**
 * Created by lyluy on 2016/4/4.
 */
public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
