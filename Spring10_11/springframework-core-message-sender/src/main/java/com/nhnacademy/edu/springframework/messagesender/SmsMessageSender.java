package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.stereotype.Component;


public class SmsMessageSender implements MessageSender{
    public SmsMessageSender(){
        System.out.println("Sms 생성자 생성");
    }

    public void init(){
        System.out.println("SmsMessageSender init called!!");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
}
