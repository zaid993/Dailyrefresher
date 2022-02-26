package InterviewCodingTasks.done.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,123,124,142,123,23,42,53,64,75,86));
        System.out.println("removePredicate(list) = " + removePredicate(list));
        System.out.println("removeIterator(list) = " + removeIterator(list));
    }
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */


    // solution 1
    public List<Integer> remove1(List<Integer> list){

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }

        return list;
    }



    // solution 2
    public List<Integer> remove2(List<Integer> list){
        list.removeIf(number -> number > 100);
        return list;
    }


    public static List<Integer> removePredicate(List<Integer> list){
        list.removeIf(n ->n  > 100);
        return list;
    }

    public static List<Integer> removeIterator(List<Integer> list){
        Iterator <Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next() > 100){
                it.remove();
               // continue;
            }
        }
        return list;
    }






    }
