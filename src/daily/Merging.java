package daily;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3 = new int[arr1.length+arr2.length];

        int a = 0;//index of 3rd arr
        for (int i = 0; i <arr1.length ; i++) {
        arr3[a++]+=arr1[i];
        }
        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i <arr2.length ; i++) {
            arr3[a++]+=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));



    }
}
