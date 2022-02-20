package Review.StringRep;

public class unique {
    public static void main(String[] args) {
        /*
3. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4
 */
        int[] arr ={1,1,2,3,3,4};


        for (int j = 0; j < arr.length; j++) {
            int ele = arr[j];
            int counte = 0;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]==ele){
                    counte++;
                }
                if (counte==1){
                    System.out.println(ele);}
            }

        }


//        public static void main(String[] args) {
//            int[] arr ={1,1,2,3,3,4};
//
//            for (int j = 0; j < arr.length; j++) {
//
//                int element = arr[j]; //1
//                int count = 0;  // to store the frequency of element
//                for (int i = 0; i < arr.length ; i++) { // used for finding the frequency of one element
//                    if(arr[i] == element){  // if the element is occurred in the array
//                        count++;
//                    }
//                }
//
//                if(count == 1){ // to check if the element is unique
//                    System.out.print(element+" ");
//                }







    }
}
