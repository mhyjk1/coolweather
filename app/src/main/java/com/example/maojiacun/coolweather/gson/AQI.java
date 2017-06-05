package com.example.maojiacun.coolweather.gson;

/**
 * Created by maojiacun on 2017/6/5 0005.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
