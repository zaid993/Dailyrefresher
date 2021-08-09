package das;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class das {
    public static void main(String[] args) {


        LocalDate christmas = LocalDate.of(2022,1,7);
        System.out.println(christmas);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/YYYY EEEE");


        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String res =  christmas.format(df);
        System.out.println("res = " + res);


        LocalTime now = LocalTime.now();
        System.out.println(now);


        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("now1 = " + now1);




        String[] str ={"Jenna","Ivana", "Katya","Mariana","Zaid"};
        LocalDate[] dob = { LocalDate.of(1994,3,1),
                LocalDate.of(1984,8,7),
                LocalDate.of(1987,4,20),
                LocalDate.of(1990,10,30),
                LocalDate.of(1993,9,26)
        };

        LocalDate youngest = dob[0];
        for (LocalDate each : dob) {
            if (youngest.isBefore(each)){
                youngest=each;
            }
            if (each.isLeapYear()){
                System.out.println("each = " + each);
            }
        }
        System.out.println("youngest = " + youngest);

        String result = LocalDate.of(2022,1,1).format(DateTimeFormatter.ofPattern("MMMM/dd/YYYY"));

        System.out.println(result);





        LocalDate Ivanabd = LocalDate.of(1984,8,7);
        LocalDate Katyadb = LocalDate.of(1984,8,3);
        boolean r = Ivanabd.isAfter(Katyadb);
        System.out.println(r);
    }
}
