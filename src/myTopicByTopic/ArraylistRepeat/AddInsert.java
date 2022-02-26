package myTopicByTopic.ArraylistRepeat;

import java.util.ArrayList;

public class AddInsert {
    public static void main(String [] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("app");
        words.add("downtown");
        words.add("raining");

        // Your code here
        words.add(0,"hey");
        words.add(3,"yo");




        // Do not touch below
        System.out.println(words);

    }
}
/*
Task: Given an ArrayList of Strings called words,
insert "hey" in the 0th index and then insert "yo" in the 3rd index.
 */