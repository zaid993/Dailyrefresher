package ArraysReplits;

import java.util.Arrays;
import java.util.Scanner;

public class reversemanulaay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int one =nums[0];
        nums[0]=nums[6];
        nums[6]=one;
        int two = nums[1];
        nums[1]=nums[5];
        nums[5]=two;
        int three= nums[2];
        nums[2]=nums[4];
        nums[4]=three;
        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}
