package com.mq.consumer.RabbitConsumer.listner;

public interface MessageListener {
    public void onMessage(String message);
}
