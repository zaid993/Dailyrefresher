package practice.codeSignal;

public class Product {
    public static void main(String[] args) {
        int [] arr  = {3, 6, -2, -5, 7, 3};

        System.out.println("product(arr) = " + product(arr));

    }


    /**
     * Given an array of integers,
     * find the pair of adjacent elements that has the largest product and return that product.
     * @param inputArray
     * @return
     */


    public static int product(int[] inputArray) {
        int max = inputArray[0] * inputArray[1]; // ضرب اول رقمين و قارن الضرب مالم مع كل رقمين متتاليين و اذا غشعم اكبغ حددم كناتج
        for (int i = 1; i < inputArray.length - 1; i++) {
            int temp = inputArray[i] * inputArray[i+1];
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }











        //        int max = inputArray[0];
//        int max2 = inputArray[1];
//
//        int product;
//
//        for (int i = 0; i < inputArray.length; i++) {
//           if (max>inputArray[i]){
//               max=inputArray[i];
//           }
//           if (max2>inputArray[i] && max2<max){
//               max2=inputArray[i];
//           }
//        }
//        product = max*max2;
//        return product;
//
//    }


//        int product = 1;
//        for (int each : inputArray) {
//
//
//            int maxx = 0;
//            int secondMax = 0;
//
//            if (each > maxx) {
//                each = maxx;
//                product *= each;
//            }
//
//            if (each < maxx && each > secondMax) {
//                each = secondMax;
//                product *= each;
//
//            }
//        }
//        return product;
//    }
}
