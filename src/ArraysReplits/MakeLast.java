package ArraysReplits;

import java.util.Scanner;

public class MakeLast {
    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE
            int last=nums[nums.length-1];

            System.out.print("[");
            int [] newarr = new int[(nums.length*2)-1];
            for (int i = 0 ; i <=newarr.length-1; i++){

                System.out.print(+newarr[i]+", ");


            }
            System.out.println(last+"]");
}}}

