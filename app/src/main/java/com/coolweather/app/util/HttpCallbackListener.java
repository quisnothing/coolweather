package com.coolweather.app.util;

/**
 * Created by 渠不与 on 2016/8/16 0016.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);

}
