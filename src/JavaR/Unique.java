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
            if (countF==1) System.out.print(element+" ");;
        }


        System.out.println();

        // find unique element using For Each loop
        String [] programm = {"Java","Java","C#","Python"};


        for (String names : programm) {
            //put all of this inside another loop
            // first find compare first element
            int cont = 0;
            for (String each : programm) {

                if (each.equalsIgnoreCase(names)){
                    cont++;

                }
            }
            if (cont==1){
                System.out.print(names+" ");
            }


        }


        System.out.println();



        // find unique element using For Each loop
        char [] chr = {'A','B','C','A','H','A','J'};

        for (char every : chr) {
            //put inside another
            //start with first element
            int f = 0 ;
            for (char each : chr) {
                if (each==every){
                    f++;
                }
            }

            if (f==1){
                System.out.print(every+" ");
            }

        }

        System.out.println();



        // using the nested loop finding the first unique element
        // just like the usual, find the first element frequency

        int [] numbers = {1,1,11,1,2,3,3,4,5,7,8,9,4,5,6,7};

        // now we creat a var to contain firstelemetn
        int firstUnique = 0;
        for (int j = 0; j < numbers.length; j++) {
            //put it inside another loop
            // first compare elem with rest or find frequency of first element
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]==numbers[j]){
                    count++;
                }

            }
            if (count==1){
                firstUnique=numbers[j];
                break;
            }
        }
        System.out.println("firstUnique = " + firstUnique);
        System.out.println();



        // using the for each finding the first unique element
        // same steps

        int [] ns = {1,1,1,2,3,3,4,5,7,8,9,4,5,6,7};

        int first = 0;


        for (int eachElement : ns) {
            //put this for each inside another for each
            int cunt=0;
            for (int element : ns) {
                if (element==eachElement){
                    cunt++;
                }
            }

            if (cunt==1){
                first=eachElement;
                break;
                // now create a var or directly print the first element
            }

        }

        System.out.println("first = " + first);

        System.out.println();




        // first unique char from a string

        String strr = "asasadsadqweqwewqrqwrwqjmnlp";

        // for and for each can applied here

        //her we convert str to char array
        for (char each : strr.toCharArray()) {
            if (strr.indexOf(each)==strr.lastIndexOf(each)){
                System.out.println("each = " + each);
                break;
            }

        }


    }
}
