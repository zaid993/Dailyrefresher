package myTopicByTopic.ArraysRe;

import java.util.Arrays;

public class AssessmentReview {
    public static void main(String[] args) {
//        String[] b ={"B","J","Z","L","M","f","b","w","r","u","5","7","%","@","$","?","!"};
//        int[] values= {7,5,9,3,4,5,8,0,2,3,4,5,6,8,9};
//        Arrays.sort(values);
//        System.out.println(Arrays.toString(values));
//        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
//
//        String str = "Zaid is fun";
//        String str2 = str.replace(" ","");
//        char[] ch2 = str2.toCharArray();
//        System.out.println(Arrays.toString(ch2));
//        String[] nn= str.split(" ");
//        System.out.println(Arrays.toString(nn));
//        char[] ch=  str.toCharArray();
//        System.out.println(Arrays.toString(ch));
//
//        boolean isEqual = Arrays.equals(ch,ch2);
//        System.out.println(isEqual);

//int[] num1 = {1,2,3,4,5};
//        int[] num2 = {6,7,8};
//        int[] num3 =Arrays.copyOf(num1,num1.length+ num2.length);
//
//        System.out.println(Arrays.toString(num3));
//
//        for (int i = num1.length,j=0; i <=num3.length-1 ; i++,j++) {
//            num3[i]=num2[j];
//
//        }
//        System.out.println(Arrays.toString(num3));

//        int[] ns = {3,7,8,9,10,11,12,23,421};
//        System.out.println(Arrays.binarySearch(ns, 23));


//
//        char[] ch={'Z','W','?','#','9','9','1','4','Q'};
//        char[] ch2 = Arrays.copyOfRange(ch,4,8);
//        System.out.println(Arrays.toString(ch2));
//        Arrays.sort(ch);
//        System.out.println(Arrays.toString(ch));
//       int n = Arrays.binarySearch(ch,'9');
//        System.out.println(n);
//
//        String []  str = {"Jenna", "Nathan","Ivana","Zaid"};
//        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.binarySearch(str, "Zaid"));
//    }
    int[][] a = {{4,32,2},{6,23,3,7},{4,5,6,78,4}};

        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(Arrays.toString(a[i])+" ");

                for (int j =a[i].length-1, K=0; j >=0; j--,K++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }


//        for (int[] each : a) {
//            for (int j =each.length-1, K=0; j >=0; j--,K++) {
//                System.out.print(each[j]+" ");
//            }
//            System.out.println();
//        }















    }
}
