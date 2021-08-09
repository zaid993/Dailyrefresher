package Review;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//
//int [] arr = {1,2,3,4};
//int i = 0;
//do{
//    System.out.println(arr[i] +" ");
//    i++ ;
//}while (i< arr.length-1);
//        System.out.println("-------------------------------------");
//
        for (int j = 1; j <=22; j++) {

            if (j==13 || j==17){

                continue;
            }
            if (j==19){
                break;
            }
            System.out.println(j);

        }
        System.out.println("a");
//        System.out.println("-------------------------------------");
//        for (int k = 1; k <=32 ; k++) {
//            if (k%2==0){
//                System.out.println(k+" is Even");
//            }else if (k%2!=0){
//                System.out.println(k+" is Odd");
//            }
//
//        }
//
//        Scanner scam = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = scam.nextInt();
//        if (num>0){
//            for (int i = 1; i <=10 ; i++) {
//                int res = num*i;
//                System.out.println(num+" * "+i+ " = "+res);
//
//            }
//        }
//        System.out.println("-------------------------------------");
//        System.out.println("-------------------------------------");
//
//        int n = 0;
//        int sum = 0;
//        while (n<=10){
//            if (n%2==0){
//                sum+=n;
//            }
//            n++;
//
//        }
//        System.out.println(sum);

//        System.out.println("-------------------------------------");
//        System.out.println("-------------------------------------");
//        Scanner scan = new Scanner(System.in);
//        System.out.println(" enter his/her username and password");
//        String user;
//        String pass;
//
//        String correctuser = "Zaid";
//        String correctpass = "aa";
//
//
//        do {
//            System.out.println(" enter his/her username and password");
//            user = scan.next();
//            pass = scan.next();
//        } while (!(correctpass.equals(pass) && correctuser.equals(user)));
//        System.out.println("Access granted");

//        while (!(correctpass.equals(pass)&& correctuser.equals(user))){
//
//            System.out.println(" enter his/her username and password");
//             user= scan.next();
//             pass = scan.next();
//        }
//
//        System.out.println("Access granted");
//    }
    }}
