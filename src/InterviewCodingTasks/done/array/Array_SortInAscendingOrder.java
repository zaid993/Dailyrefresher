package InterviewCodingTasks.done.array;

import java.util.Arrays;

public class Array_SortInAscendingOrder {
    public static void main(String[] args) {
        int arr [] = {14,141,51,51,51515,5215214,4124124,2,4};
        System.out.println(Arrays.toString(sortingArrayAsc(arr)));
        System.out.println(Arrays.toString(sortingArray(arr)));

    }

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

    public static int[] sortingArrayAsc(int[] arr) {

//        The java.util.Arrays.copyOfRange(short[] original, int from, int to)
//        method copies the specified range of the specified array into a new array
        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }

    //my way
    public static int[] sortingArray(int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[arr.length];
        for (int i = 0,j=0; i < arr.length;j++, i++) {
            res[j]= arr[i];
        }
        return res;
    }


    }
