package com.sinfusi.freedom.rm.controller;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConsumerMq {

    @Value("${rabbitmq.queue.testMq}")
    private String testMq;

    @RabbitListener(admin = "rabbitAdmin",
            bindings = @QueueBinding(value = @Queue(value = "${rabbitmq.queue.testMq}", durable = "true", autoDelete = "false"),
                    exchange = @Exchange(value = "default.topic", durable = "true", type = "topic"),
                    key = "${rabbitmq.queue.testMq}"),containerFactory = "pointTaskContainerFactory")
    public void getMsg(String msg){
        System.out.println("接受测试消息："+msg);
    }
}
