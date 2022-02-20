package Review.StaticMandV;

import java.util.ArrayList;
import java.util.Arrays;

public class Review {


    public static void main(String[] args) {
        System.out.println("method() Review = " + method());
        System.out.println("Hello World");



    }


    public String name, lastName;
    public static String school = "Cybertek";

     protected static ArrayList<Character> gender = new ArrayList<>();

    static {
            gender.addAll(Arrays.asList('F','M')) ;
            school= "Hi";
        System.out.println(school);
        System.out.println(gender);
    }

    public Review(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }



    public static String method(){
        return "Ivana";
    }


    public static void name(){
        System.out.println("Katya");
    }




    @Override
    public String toString() {
        return "Review{" +
                "name ='" + name + '\'' +
                ", lastName ='" + lastName + '\'' +
                '}';
    }




}
