package com.bcit.test.untils;

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
