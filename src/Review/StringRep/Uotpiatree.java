package Review.StringRep;

public class Uotpiatree {
    public static void main(String[] args) {
        /*
        The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year.
        Show 10 years of growth of the Utopian Tree.

        year 1 - growth 1 cm
        tree size: 1cm
         */
            int size = 0;

        for (int i = 1; i <=10; i++) {
            if (i==1) {
                System.out.println("year" + i + " - growth " + i + "cm");
                size+=i;
                System.out.println("tree size: "+size+"cm");
            }
            if (i==2){

                System.out.println("year" + i + " - growth " + (i-1) + "cm");
                size+=i-1;
                System.out.println("tree size: "+size+"cm");
            }if (i==3){
                System.out.println("year" + i + " -  growth " + (i-2) + "cm");
                size+=i-2;
                System.out.println("tree size: "+size+"cm");
            }
            if (i==4){
                System.out.println("year" + i + " - growth " + (i-2) + "cm");
                size+=i-2;
                System.out.println("tree size: "+size+"cm");
            }
            if (i==5){
                System.out.println("year" + i + " - growth " + (i-3) + "cm");
                size+=i-3;
                System.out.println("tree size: "+size+"cm");
            }
            if (i==6){
                System.out.println("year" + i + " - growth " + (i-4) + "cm");
                size+=i-4;
                System.out.println("tree size: "+size+"cm");
            }
            if (i==7){
                System.out.println("year" + i + " - growth " + (i-5) + "cm");
                size+=i-5;
                System.out.println("tree size: "+size+"cm");
            }
            if (i==8){
                System.out.println("year" + i + " - growth " + (i-6) + "cm");
                size+=i-6;
                System.out.println("tree size: "+size+"cm");
            }
            if (i==9){
                System.out.println("year" + i + " - growth " + (i-7) + "cm");
                size+=i-7;
                System.out.println("tree size: "+size+"cm");
            }if (i==10){
                System.out.println("year" + i + " - growth " + (i-8) + "cm");
                size+=i-8;
                System.out.println("tree size: "+size+"cm");
            }






        }





    }
}
