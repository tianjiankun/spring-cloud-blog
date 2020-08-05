package com.tian.article.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MQReceiver {
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message) {
        log.info("MQ receiver: {}", message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("CSDNQueue"),
            exchange = @Exchange("myBlog"),
            key = "CSDN"
    ))
    public void processCSDN(String message) {
        log.info("MQ receiver: {}", message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("CNQueue"),
            exchange = @Exchange("myBlog"),
            key = "CN"
    ))
    public void processCN(String message) {
        log.info("MQ receiver: {}", message);
    }
}
