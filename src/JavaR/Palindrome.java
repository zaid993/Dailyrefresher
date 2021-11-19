package JavaR;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        // if reverse equlas to regular

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();
        String reversed ="";

        for (int i = word.length()-1; i >=0; i--){
            reversed+=word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)){
            System.out.println("Is palindrome");
        }














    }
}
