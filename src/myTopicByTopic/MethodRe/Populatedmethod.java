package myTopicByTopic.MethodRe;

import java.util.Arrays;
import java.util.Scanner;

public class Populatedmethod {
    public static int[] populate(int[] r) {
        // your codes here:
      return r;
    }


    // Do not change
    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
