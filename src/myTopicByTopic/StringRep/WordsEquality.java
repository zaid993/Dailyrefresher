package myTopicByTopic.StringRep;

import java.util.Scanner;

public class WordsEquality {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String word1 = s.next();
    String word2 = s.next();

    if (word1.equals(word2)){
        System.out.println(word1+ " equals "+word2);
    }else {
        System.out.println(word1+" does not equal "+word2);
    }








/*
if they are equal output "word1 equals word2"

otherwise output "word1 does not equal word2"
 */

}}
