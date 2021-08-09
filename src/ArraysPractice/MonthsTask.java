package ArraysPractice;

import java.util.Scanner;

public class MonthsTask {
    public static void main(String[] args) {
/*
Create an array that holds 12 months names
User should be able to enter month index and output should be:
“The month name is <MonthName>”
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day number");
        int n = scan.nextInt();

//        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","JUl","Aug","Sep","Oct","Nov","Dec"};
//
//        if (n>=1 && n<=12){
//            System.out.println("The month name is "+months[n-1]);
//
//
//        }else{
//            System.out.println("invalid entry");
//        }



        String[] days = {"mon","tue","wed","thur","fri","sat","sun"};

        if (n>=1 && n<=7){
            System.out.println("The day name is "+days[n-1]);


        }else{
            System.out.println("invalid entry");
        }

    }
}
