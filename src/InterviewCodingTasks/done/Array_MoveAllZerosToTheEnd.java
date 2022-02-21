package InterviewCodingTasks.done;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    public static void main(String[] args) {


        int arr [] = {0,0,0,2,312,3124,123,0,30,0};
        System.out.println("Arrays.toString(moveZerosToTheEnd(arr)) = "
                + Arrays.toString(moveZerosToTheEnd(arr)));

        System.out.println("Arrays.toString(moveZeroes(arr)) = "
                + Arrays.toString(moveZeroes(arr)));


    }
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }


    public static int[] moveZeroes(int[] arr){
        int res [] = new int[arr.length];
        // in ascending order from 0 to ------- etc
        Arrays.sort(arr);
        int i = 0 ;
        for (int each : arr) {
            // i need a condition
            if (each != 0)
            res[i++]=each;

        }
    return res;}


}
