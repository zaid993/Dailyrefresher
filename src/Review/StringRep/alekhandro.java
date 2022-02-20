package Review.StringRep;

import Review.StaticMandV.Review;

import java.util.Scanner;

public class alekhandro{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        if (a.contains("alejandro") && a.contains("project")){
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }

        System.out.println("Review.school = " + Review.school);


    }
}
