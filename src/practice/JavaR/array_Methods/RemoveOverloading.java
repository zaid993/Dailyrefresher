package practice.JavaR.array_Methods;

import java.util.Arrays;

public class RemoveOverloading {
    public static void main(String[] args) {
        int [] ar1 = {2,1,3,4,5};
        int inde = 4;


        int[] news = removeByIndex(ar1,inde);
        System.out.println("Arrays.toString(news) = " + Arrays.toString(news));

        double [] ar2 = {2.0,1.5,3.2,4.6,5.8};
        double indexes = 4;
        double [] arr3 = removeByIndex(ar2,2);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));


        String[] str = {"Zaid","Zaiods","Samda","wewers"};
        int ix = 1;
        String[] st2 = removeByIndex(str,ix);
        System.out.println("Arrays.toString(st2) = " + Arrays.toString(st2));



        char[] ch = {'A','W','R'};
        int inx = 2;
        char [] ch2 = removeByIndex(ch,inx);
        System.out.println("Arrays.toString(ch2) = " + Arrays.toString(ch2));

    }


    // method to remove int by index from array
    public static int[] removeByIndex(int[] arr , int index){
        int [] rs= Arrays.copyOf(arr,arr.length-1);

        for (int i = 0, j =0; i < arr.length; i++) {
            if (i == index){
                continue;
            }
            rs[j++]=arr[i];

        }
        return rs;
    }

    // method to remove double by index from array
    public static double[] removeByIndex(double[] arr , int index){

        double [] rs= Arrays.copyOf(arr,arr.length-1);
        for (int i = 0, j =0; i < arr.length; i++) {
            if (i == index){
                continue;
            }
            rs[j++]=arr[i];

        }
        return rs;
    }

    // method to remove String by index from array
    public static String[] removeByIndex(String[] arr , int index){
        String [] rs= Arrays.copyOf(arr,arr.length-1);
        for (int i = 0, j =0; i < arr.length; i++) {
            if (i == index){
                continue;
            }
            rs[j++]=arr[i];

        }
        return rs;
    }

    // method to remove char by index from array
    public static char[] removeByIndex(char[] arr , int index){
        char [] rs= Arrays.copyOf(arr,arr.length-1);
        for (int i = 0, j =0; i < arr.length; i++) {
            if (i == index){
                continue;
            }
            rs[j++]=arr[i];

        }
        return rs;
    }




    // remove dups unsuccessful



}
