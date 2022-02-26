package javaTasks.morningOfficeHoursTasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class RemoveName {

    /*
    Given a list of people' names: "Leslie","John","Ali","John","Ayse"
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Leslie","John","Ali","John","Ayse"));

        System.out.println(remove1(names));
        System.out.println(remove2(names));
        System.out.println(remove3(names));

    }


    // solution 1 --> Iterator
    public static List<String> remove1(List<String> names) {

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("John")) {
                it.remove();
            }
        }
        return names;
    }

    // solution 2 --> removeAll()
    public static List<String> remove2(List<String> names) {
        //names.remove("John");

        names.removeAll(Arrays.asList("John"));
        return names;
    }


    // solution 3 --> Lambda exp. removeIf()
    public static List<String> remove3(List<String> names) {
        names.removeIf(name -> name.equals("John"));
        return names;
    }


}
