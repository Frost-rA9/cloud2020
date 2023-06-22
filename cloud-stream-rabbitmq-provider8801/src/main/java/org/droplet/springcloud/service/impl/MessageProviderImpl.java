package org.droplet.springcloud.service.impl;

import org.droplet.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.UUID;

@EnableBinding(Source.class) // 定义一个消息发送的管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息发送的管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        this.output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***serial: " + serial)  ;
        return serial;
    }
}
