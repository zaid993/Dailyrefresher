package InterviewCodingTasks.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2,3,4,5};
        System.out.println("Arrays.toString(remove(arr)) = " + Arrays.toString(remove(arr)));
        System.out.println("Arrays.toString(removeDuplicates3(arr)) = " + Arrays.toString(removeDuplicates3(arr)));
    }
    /*
    Write a function that can remove the duplicates from an array of integers
     */


    // solution 1
    public static int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }

    public static int[] remove(int[] arr){
        return Arrays.stream(arr).distinct().toArray();
    }


    //solution 2
    public static int[] removeDuplicates2(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: array){
            if(!list.contains(each)){
                list.add(each);
            }
        }

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;

    }


    public static int[] removeDuplicates3(int[] array){

        List<Integer> list = new ArrayList<>();
        // to add non dup elements
        for (int each : array) {
            if (!list.contains(each)){
                list.add(each);
            }
        }

        //re-define the size
        array= new int[list.size()];

        //take the list elements and add them to the array
        //need iteration for the for each loop
        int i =0;
        for (Integer each : list) {
            array[i++] = each;
        }
        // or use the for loop
//        for (int i = 0; i < list.size(); i++) {
//             array[i] = list.get(i);
//
//        }
        return array;



    }



}
