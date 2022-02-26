package myTopicByTopic.ArraylistRepeat;

import java.util.ArrayList;
import java.util.Scanner;

public class AppenPosSum {
    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> number) {

        int sum = 0;
        ArrayList<Integer> positive = new ArrayList<>();
        for (int i = 0; i <number.size() ; i++) {
            if (number.get(i) >0){
                positive.add(number.get(i));
                sum+= number.get(i);

            }
        }
        positive.add(sum);
        return positive;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));
    }
}