package javaTasks.morningOfficeHoursTasks.javaTasks.morningOfficeHoursTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class RemoveNumber {

    /*
    Given a list of Integers ..... remove all values greater than 100.
     */

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(23,45,120,67,180,240));
        System.out.println(remove1(numbers));
        System.out.println(remove2(numbers));

    }

    // solution 1 --> Iterator
    public static List<Integer> remove1(List<Integer> list){
        Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }
        return list;
    }



    // solution 2 --> Lambda exp. removeIf()
    public static List<Integer> remove2(List<Integer> list){
        list.removeIf(number ->number>100);

        return list;
    }

}
