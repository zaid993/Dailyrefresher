package Review.ArraylistRepeat;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {

    //create your method below
    public static ArrayList<Integer> timesTwo(ArrayList<Integer>nums) {

        ArrayList<Integer> d = new ArrayList<>();

        for (int i = 0; i <nums.size() ; i++) {
           d.add(nums.get(i)*2);
        }
        return d;
    }




    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }

}
