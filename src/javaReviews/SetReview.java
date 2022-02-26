package javaReviews;
import java.util.*;
public class SetReview {



    public static void main(String[] args) {

        /*
         * No duplicate elements.
         *
         * Three classes of Set are HashSet, LinkedHashSet, and TreeSet
         *
         * HashSet >>  not insertion ordered >> it is faster than other two Set structure
         *
         * LinkedHashSet >> insertion ordered.
         *
         * TreeSet >> sorted
         *
         * The elements in a HashSet are not ORDERED, but the elements in a
         * LinkedHashSet can be retrieved in the order in which they were inserted into
         * the set
         *
         * In TreeSet, which guarantees that the elements in the set are sorted.
         */

        // add()
        Set<String> colors = new HashSet<>();
        colors.addAll(Arrays.asList("Blue","Yellow","Orange","Red"));
        colors.add("Purple");
        colors.add("pink");
        System.out.println(colors);

        //contains
        System.out.println(colors.contains("Red"));

        //isEmpty()
        System.out.println(colors.isEmpty());

        //remove(String)
        colors.remove("Red");
        System.out.println(colors);

        //size()
        System.out.println(colors.size());

        //clear()
        colors.clear();
        System.out.println(colors);


        // AddAll method for union of two set

        // Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<>();

        // Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);

//
        //Iterator for accesing elements

        // Creating a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Set using TreeSet: " + numbers);

        // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next()+" ");

        }


    }
}
