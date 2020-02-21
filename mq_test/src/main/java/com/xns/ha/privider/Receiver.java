package com.xns.ha.privider;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: xns
 * @Date: 20-2-21 下午7:15
 */
@Component
public class Receiver {

    @RabbitListener(queuesToDeclare = @Queue("hello"))
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver: "+hello);
    }
}
