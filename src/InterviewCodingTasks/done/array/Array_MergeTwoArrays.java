package InterviewCodingTasks.done.array;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        System.out.println("Arrays.toString(concatTwoArrays(arr1,arr2)) = "
                + Arrays.toString(concatTwoArrays(arr1, arr2)));
    }



    /*
    Write a return method that can concat two arrays
     */

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
        return result;

    }

    public static int[] AddTwo(int[] arr, int[] arr2){

        int[] res = new int[arr.length + arr2.length];

        int i = 0;
        //without increment it won't work so create a var for iteration 👆🏻
        for (int each : arr) {
            res[i++] = each;
        }
        for (int each2 : arr2) {
            res[i++]=each2;
        }

        return res;
    }

}
