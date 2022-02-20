package Review.StringRep;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            String word = inp.nextLine();
            //write your code below
            String vowel= "";

        for (int i =0 ; i <word.length() ; i++) {
             char eachCharacter = word.charAt(i);
            if (eachCharacter=='a'||eachCharacter=='e'||eachCharacter=='i'||eachCharacter=='u'||eachCharacter=='o'||eachCharacter=='y'){
                vowel+=eachCharacter;
            }

        }
        System.out.println(vowel);
}}
