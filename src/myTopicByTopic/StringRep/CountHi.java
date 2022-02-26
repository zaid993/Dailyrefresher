package myTopicByTopic.StringRep;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count =0;


        for (int i = 0; i <=str.length()-2 ; i++) {
            String each = str.substring(i,i+2);
            if (each.equals("hi")){
                count++;
            }
        }
        System.out.println(count);
    }
}
