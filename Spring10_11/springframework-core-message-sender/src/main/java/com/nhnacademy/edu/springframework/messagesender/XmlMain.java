package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//            System.out.println("------------");
//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).Message();
//            System.out.println("------------");
//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).Message();
            MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
            service.Message();
            System.out.println("------------");

            context.close();
//            System.out.println("------------");
//            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).Message();
//            System.out.println("------------");

            // try문 안에 context  실행했을 때는 context.close()함수를 쓰지 않고도 cleanup 가능.

            /*MessageSender smsMessageSender = context.getBean("smsMessageSender"", MessageSender.class);
            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

            smsMessageSender.sendMessage(new User("abc123", "010-2222-2222"), "sms");
            emailMessageSender.sendMessage(new User("def123","ksy123@naver.com"), "email");*/
        }

}
