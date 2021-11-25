package JavaR.array_Methods;

import java.util.Arrays;

public class UniqueOverloading {
    public static void main(String[] args) {

        int [] n1 = {1,2,2,3,4,5,5,5,5,5,5,};
        int elements = 1;
        int all [] = uniqueElements(n1,elements);
        System.out.println("all = " + all);




    }



    // find if elements is unique and return them in array
    public static int[] uniqueElements(int[] arr, int element){

        int[] result = {};
        //find the frequency
        int i=0;
        int frequency =0;
        for (int each : arr) {
            if (each==element){
                frequency++;
            }
            if (frequency==1){
                result[i++]=each;
            }

        }


            return   result;
    }




}
