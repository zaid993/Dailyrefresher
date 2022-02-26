package javaReviews;
import java.util.LinkedList;
public class LinkedListReview {


    /*When To Use:
     *Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
     */

    public static void main(String[] args) {



        // Use addFirst() to add the item to the beginning
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("Mercedes");
        System.out.println(cars);

        // Use removeFirst() remove the first item from the list
        cars.removeFirst();
        System.out.println(cars);

        // Use removeLast() remove the last item from the list
        cars.removeLast();
        System.out.println(cars);

        // Use getFirst() to display the first item in the list
        System.out.println(cars.getFirst());

        // Use getLast() to display the last item in the list
        System.out.println(cars.getLast());

    }
}
