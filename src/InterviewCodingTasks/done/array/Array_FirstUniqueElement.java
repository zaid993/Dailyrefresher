package InterviewCodingTasks.done.array;

public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 41, 23, 2, 4};
        int arr2[] = {5,4,5,6,6,3,2,1};





    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {


            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }




        }

        return firstDuplicated;

    }


//    public static int firstDuplicatedElement2(int[] array) {
//
//        int first = 0;
//
//        // create a loop to loop through all of them
//        for (int each : array) {
//
//
//            // these are the first steps to compare the first element and see if it is a dup
//            int frequency = 0;
//            for (int each2 : array) {
//                if (each == each2) {
//                    frequency++;
//                }
//            }
//
//            if (frequency > 1) {
//                first = each;
//                break;
//            }
//        }
//
//        return first;
//
//    }
//
//
//    public static int firstDuplicated(int[] array){
//        int firstDup = 0;
//
//
//        for (int each : array) {
//
//            int frq = 0;
//            for (int each2 : array) {
//                if (each==each2){
//                    frq++;
//                }
//            }
//            if (frq > 1){
//                firstDup=each;
//                break;
//            }
//        }
//
//
//        return firstDup;
//    }


}
