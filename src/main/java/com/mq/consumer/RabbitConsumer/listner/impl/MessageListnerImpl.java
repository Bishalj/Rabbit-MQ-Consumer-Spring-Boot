package com.mq.consumer.RabbitConsumer.listner.impl;

import org.springframework.amqp.core.Message;
import com.mq.consumer.RabbitConsumer.listner.MessageListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageListnerImpl implements MessageListener {


    @Override
    public void onMessage(String message) {
        System.out.println(new Date());
        try{
            Thread.sleep(5000 );
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Message received: "+message);
        System.out.println(new Date());
    }
}
