package com.example.maojiacun.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by maojiacun on 2017/6/5 0005.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
