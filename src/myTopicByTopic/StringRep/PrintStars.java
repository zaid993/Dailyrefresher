package myTopicByTopic.StringRep;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int i = 0; i <=n ; i++) {
            System.out.print("*"+"*");
        }
    }
}
