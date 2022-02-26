package myTopicByTopic.ArraylistRepeat;

import java.util.ArrayList;
import java.util.Scanner;

public class getsize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        // Write your code below
        int sum = 0;
//        for (Integer each : list) {
//            sum+=each;
//        }
//        System.out.println(sum);

        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        System.out.println(sum);



    }
}
/*
Task: Given an ArrayList of Integers called list,
 find and print the sum of all the numbers in the list
 */