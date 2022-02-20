package Review.StringRep;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstname = email.substring(0,email.indexOf("_"));
        String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        if (email.contains("_")){
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@"))+"_"+email.substring(0,email.indexOf("_"))+"@"+domain+".com");

        }else if (!email.contains("_")){
            System.out.println(email);
        }

        System.out.println("First name: "+firstname.substring(0,1).toUpperCase()+firstname.substring(1,firstname.length())+"\nLast name: "+last.substring(0,1).toUpperCase()+last.substring(1,last.length())+"\nDomain: "+domain);


        /*
        First name: Craig
Last name: Federighi
Domain: apple
         */
    }
}
