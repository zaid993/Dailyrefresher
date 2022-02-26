package myTopicByTopic.StringRep;

import java.util.Arrays;

public class arrayclassmates {
    public static void main(String[] args) {
/*
1. create string array, and store the names of your  class mates (10)
            print the first three characters of each name
 */

String[] classmates = {"zaid","zarbon","zovanaa","zardina","zobia","zafra","zhpa","zsda","zds","zqwe",};
        System.out.println(Arrays.toString(classmates));
        for (int i = 0; i <classmates.length ; i++) {
            System.out.println(classmates[i].substring(0,3));
        }

    }
}
