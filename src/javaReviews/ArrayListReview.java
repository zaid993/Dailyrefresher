package javaReviews;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListReview {

    /*
     * ArrayList and LinkedList are defined under the List interface.
     * The List interface extends Collection to define an insertion ordered collection with duplicates allowed.
     * ArrayList is a resizable-array implementation of the List interface.

     * list.add()
     * list.contains()
     * list.remove()
     * list.set()
     * list.get()
     * list.size()
     * list.indexOf()
     * list.lastIndexOf()
     * Collections.sort(list)
     * Collections.frequency(list, object)
     */

    public static void main(String[] args) {

        // add()
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");
        System.out.println(colors);


        //get(index)
        System.out.println(colors.get(2));

        //set(index,String el)
        colors.set(2,"Blue");
        System.out.println(colors);

        //contains
        System.out.println(colors.contains("Red"));

        //remove(index or String)
        colors.remove("Red");
        System.out.println(colors);

        //size()
        System.out.println(colors.size());

        //for
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }

        //for each
        for(String str:colors){
            System.out.println(str);
        }

        //sort()
        Collections.sort(colors);
        System.out.println(colors);

        //indexOf()
        System.out.println(colors.indexOf("Blue"));

        //lastIndexOf()
        System.out.println(colors.lastIndexOf("Blue"));

        //Collections.frequency
        System.out.println(Collections.frequency(colors,"Blue"));

        //clear()
//        colors.clear();
//        System.out.println(colors);


    }
}
