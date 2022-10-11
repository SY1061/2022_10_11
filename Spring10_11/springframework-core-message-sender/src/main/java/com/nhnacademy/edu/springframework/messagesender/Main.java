package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        User user = new User("ksy123@naver.com", "010-1111-2222");
        //new MessageSendService(new SmsMessageSender()).Message();
        main.sendSmsMessage(user, "실습예제입니다.");
    }

    public void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    public void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
}
