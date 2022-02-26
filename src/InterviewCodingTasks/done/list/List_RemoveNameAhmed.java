package InterviewCodingTasks.done.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Zaid","Safy","Ahmed"));

        System.out.println("removeName(names) = " + removeName(names));
        System.out.println("removeAlls(names) = " + removeAlls(names));
        System.out.println("removeIFs(names) = " + removeIFs(names));


    }



    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */


    // solution 1
    public List<String> remove1(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }

    public static List<String> removeName(List<String> names){
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("Ahmed")){
                it.remove();
            }
        }
        return names;

    }


    // solution 2
    public List<String> remove2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }

    //remove all
    public static List<String> removeAlls(List<String> lista){
      lista.removeAll(Arrays.asList("Ahmed"));
        return lista;
    }


    // solution 3
    public List<String> remove3(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }

    // remove if lambda
    public static List<String> removeIFs(List<String> s){
        s.removeIf(n -> n.equalsIgnoreCase("Ahmed"));
        return s;
    }




}
