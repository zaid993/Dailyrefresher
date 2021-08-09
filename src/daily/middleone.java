package daily;

import java.util.Scanner;

public class middleone { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = scan.next();

    if (word.length()%2!=0){
        if (word.length()>=3){
            System.out.println(word.charAt(word.length()/2));
        }else {
            System.out.println(word+word+word);
        }

    }else if (word.length()%2==0){
        if (word.length()>=4){
            System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2));

        }else {
            System.out.println(word+word);
        }

    }












}}
