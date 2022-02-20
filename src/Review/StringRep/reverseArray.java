package Review.StringRep;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        String[] arr = {"java", "python", "C#"};
//first reverse one of them then reverse the rest
        for (int j = 0; j <arr.length ; j++) {
            String e = arr[j]; // for first element (java)
            String reverse = ""; // the result will be here
            for (int i = e.length()-1; i >=0 ; i--) {
                reverse+=e.charAt(i);
            }

            arr[j]=reverse;
        }


        System.out.println(Arrays.toString(arr));








    }
}
