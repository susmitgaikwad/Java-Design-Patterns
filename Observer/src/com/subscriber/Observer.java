package com.subscriber;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
