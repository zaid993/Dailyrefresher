package Review.MethodRe;

import java.util.Scanner;

public class uniqueNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int i = 0; i <nums.length ; i++) {
            int unique = nums[i];
            int count=0;
            for (int each : nums) {
                if (unique==each){
                    count++;
                }

            }
            if (count==1){
                System.out.println(unique);
            }
        }

    }
}
