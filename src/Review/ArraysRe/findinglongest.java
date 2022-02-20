package Review.ArraysRe;

import java.util.Scanner;

public class findinglongest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

    String longest =words[0];
        for (String each : words) {
            if (longest.length()<each.length()){
                longest=each;
            }
        }
        System.out.println(longest);



    }
}
