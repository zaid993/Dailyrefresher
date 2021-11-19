package JavaR;

public class Unique {
    public static void main(String[] args) {

        // using loop find unique
        String str = " zzzzzzzzaiiiiiiiiiddddd";
        String u = "";
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                u+=str.charAt(i);
            }
        }

        System.out.println("u = " + u);


        // using Arr and loop
        int [] arr = {1,2,3,4,1,2,4,5};

        //first find the frequency of 1 element so basically unique means occurred 1 time take first element and compare it with the rest

        for (int j = 0; j < arr.length; j++) {

            //to find for all elements put all of it inside another loop
            // this is the first element
            int element = arr[j];
            int countF = 0;
            for (int i = 0; i < arr.length; i++) {

                if (element==arr[i]){
                    countF++;
                }

            }
            if (countF==1) System.out.println("element = " + element);
        }









    }
}
