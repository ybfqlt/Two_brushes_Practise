package com.xns.ha.consumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: xns
 * @Date: 20-2-21 下午7:14
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello" + new Date();
        System.out.println("Sender: "+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
