package javaReviews;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayVSArrayList {

    /*An array is a basic functionality provided by Java.
     *ArrayList is part of the collection framework in Java.
     * Arrray members are accessed using [], while
     * ArrayList has a set of methods to access elements and modify them.
     */

    public static void main(String[] args) {
        // Input array
        int[] arr1 = new int[2];
        arr1[0] = 1;
        arr1[1] = 2;

        // Printing first element of array
        System.out.println(arr1[0]);

        // ArrayList
        // Creating an arrayList with initial capacity
        ArrayList<Integer> arrL1 = new ArrayList<>();

        // Adding elements to ArrayList
        // using add() method
        arrL1.add(1);
        arrL1.add(2);

        // Printing alongside accessing
        // elements of ArrayList
        System.out.println(arrL1.get(0));


        /*The array is a fixed-size data structure while ArrayList is not.
         *One need not mention the size of the ArrayList while creating its object.
         * Even if we specify some initial capacity, we can add more elements.
         */

        // Normal Array
        // Need to specify the size for array
        int[] arr2 = new int[3];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;

        // We cannot add more elements to array arr[]

        // ArrayList
        // Need not to specify size

        // Declaring an Arraylist of Integer type
        ArrayList<Integer> arrL2 = new ArrayList<>();
        ArrayList<String> arrst = new ArrayList<>();
        // Adding elements to ArrayList object
        arrL2.add(1);
        arrL2.add(2);
        arrL2.add(3);
        arrL2.add(4);

        // We can add more elements to arrL

        // Print and display Arraylist elements
        System.out.println(arrL2);
        // Print and display array elements
        System.out.println(Arrays.toString(arr2));


        /*An array can contain both primitive data types as well as objects of a class
         *depending on the definition of the array.
         * However, ArrayList only supports object entries, not the primitive data types.
         */
        /*Note: When we do arraylist.add(1) than it converts the primitive int data type
         *into an Integer object which is as illustrated in below example
         */

        // allowed
        int[] array = new int[3];

        // allowed, however, need to be initialized
        ArrayVSArrayList[] array1 = new ArrayVSArrayList[3];

        // not allowed (Uncommenting below line causes compiler error)
        // ArrayList<char> arrL = new ArrayList<char>();

        // Allowed
        ArrayList<Integer> arrL3 = new ArrayList<>();
        ArrayList<String> arrL4 = new ArrayList<>();
        ArrayList<Object> arrL5 = new ArrayList<>();

        System.out.println("Successfully compiled and executed");
    }

}
