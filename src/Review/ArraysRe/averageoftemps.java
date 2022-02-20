package Review.ArraysRe;

import java.util.Scanner;

public class averageoftemps {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
            scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

    // Do not touch above. Use array temps
    int sum =0;
    int average =0;

    for (double each : temps) {
        sum+=each;

    }
    System.out.println("sum = " + sum);

    average=sum/ temps.length;
    System.out.println("average = " + average);

}
}
