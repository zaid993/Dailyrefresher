package myTopicByTopic.StringRep;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (i=0; i<=n-1; i++) {
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }









    }
}
