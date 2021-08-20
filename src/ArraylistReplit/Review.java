package ArraylistReplit;

import java.util.ArrayList;
import java.util.Arrays;

public class Review {
    public static void main(String[] args) {
//        String name = "3";
//
//        int k = Integer.parseInt(name); // Primitive (AutoBoxing)
//        System.out.println("k = " + k);
//        System.out.println("-------------------");
//        Integer n = Integer.valueOf(name); // Object (Wrapper Class) (no boxing)
//        System.out.println("n = " + n);
//
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.addAll(Arrays.asList(1,2,3,4));
//        arr.remove(3);
//        arr.remove(Integer.valueOf(3));
//        System.out.println(arr);
//        System.out.println("-------------------");
//        System.out.println("-------------------");
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        System.out.println(numbers);
//        numbers.add(2);
//        System.out.println(numbers);
//
//        System.out.println("numbers.get(1) = " + numbers.get(1));
//
//        System.out.println("numbers.size() = " + numbers.size());
//
//        numbers.set(0,3);
//        System.out.println("numbers = " + numbers);
//
//        boolean r =  numbers.remove(Integer.valueOf(0));
//        System.out.println("r = " + r);
//        System.out.println("numbers = " + numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ha");
        names.add("Zuly");
        names.add("Nate");
        names.add("Ivana");
        names.add("Katyosha");
        names.add("Bilgunn");

        System.out.println(names);

        names.set(0,"Zaid");
        System.out.println(names);
        names.add(0,"Ha");
        System.out.println(names);

        System.out.println("names.size() = " + names.size());
        names.clear();
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());


        System.out.println("-----------------");
        ArrayList<String> datas = new ArrayList<>();

        datas.addAll(Arrays.asList("Zaid","Dayz","Jenna"));
        System.out.println("datas = " + datas);
        System.out.println("datas.indexOf(\"Jenna\") = " + datas.indexOf("Jenna"));
        System.out.println("datas.lastIndexOf(\"Dayz\") = " + datas.lastIndexOf("Dayz"));





    }
}
