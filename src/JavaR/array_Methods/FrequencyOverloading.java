package JavaR.array_Methods;

public class FrequencyOverloading {
    public static void main(String[] args) {

        int [] n1 = {1,2,2,3,4,5,5,5,5,5,5,};
        int e1 = 2;
        int countEle = elementFrequency(n1,e1);
        System.out.println("countint = " + countEle);


        double [] n12 = {1.7,2.2,2.1,3.4,4.5,5.5,5.5,5.6,5.7,5.8,5.9};
        double e12 = 2.2;
        int countEle2 = elementFrequency(n12,e12);
        System.out.println("countdouble = " + countEle2);



        String [] n123 = {"Zaid","Zaid","zAID","Java"};
        String e123 = "Java";
        int countEle22 = elementFrequency(n123,e123);
        System.out.println("countString = " + countEle22);


        char [] n1232 = {'A','W','R','A','W','R','k'};
        char e1232 = 'k';
        int countEle222 = elementFrequency(n1232,e1232);
        System.out.println("countchar = " + countEle222);





    }


    //find the frequency of element from int array
    public static int elementFrequency(int[] arr , int element){

        // for this we need to access to elements not to indexes
        int frequency = 0;
        // so we use for each loop
        for (int eachElement : arr) {
            if (eachElement == element){
                frequency++;
            }

        }
        return frequency;
    }

    //find the frequency of element from double array
    public static int elementFrequency(double[] arr , double element){

        // for this we need to access to elements not to indexes
        int frequency = 0;
        // so we use for each loop
        for (double eachElement : arr) {
            if (eachElement == element){
                frequency++;
            }

        }
        return frequency;
    }

    //find the frequency of element from String array
    public static int elementFrequency(String[] arr , String element){

        // for this we need to access to elements not to indexes
        int frequency = 0;
        // so we use for each loop
        for (String eachElement : arr) {
            if (eachElement.equalsIgnoreCase(element)){
                frequency++;
            }

        }
        return frequency;
    }

    //find the frequency of element from char array
    public static int elementFrequency(char[] arr , char element){

        // for this we need to access to elements not to indexes
        int frequency = 0;
        // so we use for each loop
        for (char eachElement : arr) {
            if (eachElement == element){
                frequency++;
            }

        }
        return frequency;
    }



}
