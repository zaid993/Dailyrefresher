package javaTasks.morningOfficeHoursTasks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SetIntersection {



    /*
     * return a Set equal to the intersection of the parameter Sets using retainAll() method
     * set1 --> 1,2,3,4,5     set2 --> 2,4,6,8
     */
    public static void main(String[] args) {
        Set<Integer> set1 =new HashSet<>();
        set1.addAll(Arrays.asList(1,2,3,4,5 ));
        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(2,4,6,8));

        set1.retainAll(set2); // removes all not matching elements, keeps matching only
        System.out.println(set1);

        set2.retainAll(set1);
        System.out.println(set2);


    }
}
