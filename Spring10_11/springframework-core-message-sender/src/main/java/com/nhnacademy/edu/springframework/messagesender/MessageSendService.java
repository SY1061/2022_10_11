package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {
    //private final MessageSender messageSender;
    private MessageSender messageSender;

    public MessageSendService(){

    }

    public void setSmsMessageSender(MessageSender messageSender){
        System.out.println("setSmsMessageSender invoked!");
        this.messageSender = messageSender;
    }

    public void setEmailMessageSender(MessageSender messageSender){
        System.out.println("setEmailMessageSender invoked!");
        this.messageSender = messageSender;
    }

//    public void setMessageSender(MessageSender messageSender){
//        System.out.println("setMessageSender invoked!");
//        this.messageSender = messageSender;
//    }
//    setter Injection 의 예

    public MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }
//    Constructor Injection 의 예

    public void Message(){
        messageSender.sendMessage(new User("", ""), "실습 예제");
    }
}
