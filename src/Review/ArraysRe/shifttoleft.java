package Review.ArraysRe;

import java.util.Arrays;
import java.util.Scanner;

public class shifttoleft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        String left = Arrays.toString(nums);
        if (size==1){
            System.out.println(left);
       }else {

           String shiftted = left.substring(4, left.length() - 1) + ", " + left.substring(1, 2) + "]";
           System.out.println("[" + shiftted);
       }

    }
}
