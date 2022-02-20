package Review.StringRep;

import java.util.Scanner;

public class Seperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();


        String big = word;
        for (int i = 0; i <=count -2 ; i++) {

            big= big+separator+word;
            System.out.println(big);
        }

        




    }
}
