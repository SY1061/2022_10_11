package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.AnnotationConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args){
        String baseline = "com.nhnacademy.edu.springframework.messagesender";
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(baseline);

//        MessageSender smsSender = context.getBean("smsMessageSender", MessageSender.class);
//        MessageSender emailSender = context.getBean("emailMessageSender", MessageSender.class);
//
//        smsSender.sendMessage(new User("abc123", "000-1111-2222"), "sms 실습");
//        emailSender.sendMessage(new User("abc123", "000-1111-2222"), "email 실습");
        MessageSendService smsSender = context.getBean("messageSendService", MessageSendService.class);
        smsSender.Message();

        context.close();
    }
}
