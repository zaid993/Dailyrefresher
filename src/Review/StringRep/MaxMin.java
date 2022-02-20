package Review.StringRep;

public class MaxMin {
    public static void main(String[] args) {
/*
 write a program that can find the maximum number from an array of integers
    ex:
            array = {10,5, 4, 400, 50, 0, -1};
            output: 400
write a program that can find the minimum number from an array of integers
    ex:
            array = {10,5, 4, 400, 50, 0, -1};
            output: -1
 */
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int min = nums[0];
        int max = nums [0];
        for (int i = 0; i <=nums.length-1 ; i++) {
            int number = nums[i];
            if (number<min){
                min=number;
            }
        }
        System.out.println("min = " + min);


        for (int i = 0; i < nums.length ; i++) {
            int each = nums[i];
            if (each>max);
            max=each;
        }
        System.out.println("max = " + max);

    }
}
