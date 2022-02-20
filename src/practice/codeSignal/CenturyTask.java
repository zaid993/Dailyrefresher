package practice.codeSignal;

public class CenturyTask {

    public static void main(String[] args) {

        System.out.println("Century(279) = " + Century(279));


    }

    /**
     * Given a year, return the century it is in.
     * The first century spans from the year 1 up to and including the year 100,
     * the second - from the year 101 up to and including the year 200, etc.
     */

    public static int Century(int year){
        int cent = 0;

        // while loop
        while (year > 0){
            year= year-100;
            cent++;
        }
        return cent;
    }




}
