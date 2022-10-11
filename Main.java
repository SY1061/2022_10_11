public class Main {
    public static void main(String[] args){
        User user = new User("ksy123@naver.com", "010-1111-2222");
        sendSmsMessage(user, "실습예제입니다.");
    }

    public static void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to " + user.phoneNumber + " : " + message);
    }

    public static void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent to " + user.phoneNumber + " : " + message);
    }
}