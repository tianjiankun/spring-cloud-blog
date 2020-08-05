package com.tian.article;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MQSenderTest extends ArticleApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue", "I am Amqp");
    }

    @Test
    public void sendSCDN() {
        amqpTemplate.convertAndSend("myBlog", "CSDN", "I am SCND Amqp");
    }
    @Test
    public void sendCN() {
        amqpTemplate.convertAndSend("myBlog", "CN", "I am CN Amqp");
    }
}
