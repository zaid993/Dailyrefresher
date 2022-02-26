package myTopicByTopic.StringRep;

import java.util.Scanner;

public class X_x {
    public static void main(String[] args) {
        /*
        Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
        otherwise print the string unchanged.


         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("x") || word.endsWith("x")) {
            if (word.startsWith("x") && word.endsWith("x")) {
                System.out.println(word.substring(1, word.length() - 1));
            }
             else if (word.endsWith("x")) {
                System.out.println(word.substring(0, word.length() - 1));
            } else if (word.startsWith("x")) {
                System.out.println(word.substring(1, word.length()));
            }

        }else if (word.startsWith("x") || word.endsWith("x")){
            if (word.startsWith("x") && word.endsWith("x")) {
                System.out.println(word.substring(1, word.length() - 1));
            }
            else if (word.endsWith("x")) {
                System.out.println(word.substring(0, word.length() - 1));
            } else  if (word.startsWith("x")) {
                System.out.println(word.substring(1, word.length()));
            }
        }else {
            System.out.println(word);
        }




    }}