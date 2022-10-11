package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender{

    public EmailMessageSender(){
        System.out.println("Email 생성자 생성");
    }

    public void cleanup(){
        System.out.println("EmailMessageSender cleanup called!!");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }
}
