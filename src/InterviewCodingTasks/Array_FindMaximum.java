package InterviewCodingTasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,3,4,2,4,214,14,1,42,41,421424,2,42};

        System.out.println("maxValue(arr) = " + maxValue(arr));
        System.out.println("maxValue2(arr) = " + maxValue2(arr));

    }

    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }


    public static int maxValue2(int[] n) {
        int max = n[0];

        for (int each : n) {
            if (each>max){
                max = each;
            }

        }
        return max;
    }


    }
