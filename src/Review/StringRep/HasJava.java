package Review.StringRep;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        /*
        Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
        such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
        The string may be any length, including 0.
         */


//        if (word.charAt(0)=='j'|| word.charAt(0)=='J' && (word.charAt(1)=='a'|| word.charAt(1)=='A'
//                )){
//            System.out.println(true);
//        }else if ( word.charAt(1)=='j' || word.charAt(1)=='J'&& word.charAt(2)=='a' || word.charAt(2)=='A')
//        {
//            System.out.println(true);
//        }else {
//            System.out.println(exists);
//        }


        if (word.charAt(0)=='j' || word.charAt(1)=='j' && word.charAt(1)=='a' && word.charAt(2)=='a'){
            System.out.println(true);
        } else {
            System.out.println(exists);
        }

//
//if (word.length()>4&& word.substring(0,4).equals("java")||word.substring(1,5).equals("java")){
//exists=true;
//}else{
//exists=false;
//}
//        System.out.println(exists);








    }
}
