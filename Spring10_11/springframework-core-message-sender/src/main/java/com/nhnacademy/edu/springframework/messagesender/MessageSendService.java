package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private final MessageSender messageSender;

    @Value("${from}")
    private String from;

    @Autowired
    public MessageSendService(@Qualifier("emailMessageSender") MessageSender messageSender){
        System.out.println("--------constructor Injection-----------");
        this.messageSender = messageSender;
    }

//    @Autowired
//    @Qualifier("emailMessageSender")
//    public void setSmsMessageSender(MessageSender messageSender){
//            System.out.println("setSmsMessageSender invoked!");
//        this.messageSender = messageSender;
//    }
//    setter Injection 의 예


    public void Message(){
        System.out.println("From : " + from);
        messageSender.sendMessage(new User("abc123", "000-1111-1111"), "실습 예제");
    }
}
