package myTopicByTopic.StringRep;

import java.util.Scanner;

public class marriage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.nextLine().toLowerCase();

        while(!(answer.equals("yes") || (answer.equals("no")))){
            System.out.println("Fuck..., how about $10'000 cash for the decision? ");
            answer = scan.nextLine().toLowerCase();
        }

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("You are fucked forever");
        }else {
            System.out.println("Smart man!");
        }
        scan.close();
    }
}
