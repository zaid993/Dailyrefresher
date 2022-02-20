package Review.ArraylistRepeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatAll {

    //create your method below
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> b) {
        ArrayList<Boolean> repeated = new ArrayList<>();
        for (int j = 0; j  <=1 ; j++) {
            for (int i = 0; i < b.size(); i++) {
                repeated.addAll(Arrays.asList(b.get(i)));
            }
        }

    return repeated;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));
    }
}