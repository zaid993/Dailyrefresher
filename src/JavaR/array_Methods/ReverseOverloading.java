package JavaR.array_Methods;

import java.util.Arrays;

public class ReverseOverloading {
    public static void main(String[] args) {

        int[] or = {1,2,3,4,5};
        int[] rev = reverseArray(or);
        System.out.println("Arrays.toString(rev) = " + Arrays.toString(rev));



        double[] or2 = {1.4,2.5,3.6,4.7,5.8};
        double[] rev2 = reverseArray(or2);
        System.out.println("Arrays.toString(rev2) = " + Arrays.toString(rev2));



        String[] or3 = {"Zaid","Mehmet","Each","Java","Lord"};
        String[] rev3 = reverseArray(or3);
        System.out.println("Arrays.toString(or3) = " + Arrays.toString(rev3));



        char[] or4 = {'A','W','R'};
        char[] rev4 = reverseArray(or4);
        System.out.println("Arrays.toString(rev4) = " + Arrays.toString(rev4));




    }




    //method to reverse int array
    public static int[] reverseArray(int[] arr ){
        int[] reversed = new int[arr.length];

        for (int i = arr.length-1, j=0; i >= 0 ; i--,j++) {
            reversed[j]=arr[i];
        }
        return reversed;
    }


    //method to reverse double array
    public static double[] reverseArray(double[] arr ){
        double[] reversed = new double[arr.length];

        for (int i = arr.length-1, j=0; i >= 0 ; i--,j++) {
            reversed[j]=arr[i];
        }
        return reversed;
    }

    //method to reverse String array
    public static String[] reverseArray(String[] arr ){
        String[] reversed = new String[arr.length];

        for (int i = arr.length-1, j=0; i >= 0 ; i--,j++) {
            reversed[j]=arr[i];
        }
        return reversed;
    }


    //method to reverse char array
    public static char[] reverseArray(char[] arr ){
        char[] reversed = new char[arr.length];

        for (int i = arr.length-1, j=0; i >= 0 ; i--,j++) {
            reversed[j]=arr[i];
        }
        return reversed;
    }

}
