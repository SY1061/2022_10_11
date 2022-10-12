package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:message.properties")
// annotation 으로 했을 때 properties 파일 가져오는 방법.
public class ServiceConfig {
    @Autowired
    private MainConfig mainConfig;

    @Bean
    public MessageSendService messageSendService(){
        return new MessageSendService(mainConfig.smsMessageSender());
    }
}
