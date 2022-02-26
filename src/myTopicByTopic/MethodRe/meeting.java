package myTopicByTopic.MethodRe;

import java.util.ArrayList;
import java.util.Arrays;

public class meeting {

    public static void main(String[] args){
//    sum(2,3,4);
//
//    biggest(2,3);


    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(0,1);
    arr.add(2,3);
    arr.addAll(Arrays.asList(5,6,7,8,9));
        System.out.println(arr);
        System.out.println(arr.get(5));
        System.out.println(arr.size());
        arr.set(4,10);
        System.out.println(arr);
        boolean r = arr.remove((Integer) 10);
        System.out.println(r);



    }

//    public static void biggest(int num1, int num2){
//        if (num1>num2){
//            System.out.println(num1);
//        }else {
//            System.out.println(num2);
//        }
//    }
//
//    public static void sum(int n1, int n2, int n3){
//        int sum = n1+n2+n3;
//        System.out.println(sum);
//    }






}
