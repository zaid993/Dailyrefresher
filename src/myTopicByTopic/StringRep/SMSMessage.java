package myTopicByTopic.StringRep;

import java.util.Scanner;

public class SMSMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();








        String sender= message.substring(message.indexOf("<")+1,message.indexOf(">"));
        String phoneNumber= message.substring(message.indexOf("[")+1,message.indexOf("]"));
        String messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("sender : "+sender);
        System.out.println("phone : "+phoneNumber);
        System.out.println("message : "+messageBody);























//
//        String first = scan.next();
//        String second = scan.next();
//        String fullname=first.substring(0,1).toUpperCase()+first.substring(1,first.length())+" "+second.substring(0,1).toUpperCase()+second.substring(1,second.length());
//
//        sender=fullname;
//
//
//        System.out.println("Enter Phone number");
//        String three= scan.next();
//        String Secondthree=scan.next();
//        String four= scan.next();
//        phoneNumber= three+"-"+Secondthree+"-"+four;
//
//        System.out.println("Enter your message");
//        scan.nextLine();
//        String sms = scan.nextLine();
//        messageBody=sms;
//
//        System.out.println("Sender: "+sender+"\nPhone Number: "+phoneNumber+"\nMessage body: "+messageBody);
//
//
//
//



    }
}
