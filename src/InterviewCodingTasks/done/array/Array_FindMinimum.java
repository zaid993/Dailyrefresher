package InterviewCodingTasks.done.array;

public class Array_FindMinimum {

    /*
    Write a function that can find the maximum number from an int Array
     */


    public static void main(String[] args) {

        int [] arr = {-231,1,32,32,4,24,42,14,214,12,41,24,1,1,2,3,4,5,6,8};
        System.out.println("minValue(arr) = " + minValue(arr));
        System.out.println("minxValue2(arr) = " + minxValue2(arr));


    }
    public static int minValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }


    public static int minxValue2(int[] n) {

        int min = n[0];

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }

}