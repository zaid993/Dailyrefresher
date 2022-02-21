package InterviewCodingTasks.done.array;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {

        int arr [] = {1231,41541521,41,241,41,4};
//        System.out.println("Arrays.toString(reverse(arr)) = " + Arrays.toString(reverse(arr)));

        System.out.println("Arrays.toString(revers2(arr)) = " + Arrays.toString(revers2(arr)));
    }

    /*
    write a function that can reverse an array
     */


    public static int[] reverse(int[] arr){

        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }




    public static int[] revers2(int [] arr){
        int [] res = new int[arr.length];
        // two opposed increments j and i
        for (int i = res.length -1, j= 0 ; i >= 0; i--,j++) {
            res[j]= arr[i];

        }

        return res;
    }

}
