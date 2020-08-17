package com.tian.article;

import com.tian.article.message.StreamClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;

public class StreamSenderTest extends ArticleApplicationTests  {

    @Autowired
    private StreamClient streamClient;

    @Test
    public void processTest() {
        streamClient.output().send(MessageBuilder.withPayload("a").build());
    }
}
