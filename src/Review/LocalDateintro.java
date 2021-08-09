package Review;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateintro {


    public static void main(String[] args) {

       LocalDate eid= LocalDate.of(1993,9,26);

        System.out.println(eid);
        // YYYY-MM-dd
        System.out.println("---------------------------------");

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("---------------------------------");
String[] Students = {"Z","Z","Z","Z","Z"};
LocalDate[] DOB = {LocalDate.of(1993,9,26),LocalDate.of(1993,9,26),LocalDate.of(1993,9,26),LocalDate.of(1993,9,26),LocalDate.of(1993,9,26)};

        for (int i = 0; i < Students.length; i++) {
            System.out.println(Students[i]+" Born in "+ DOB[i]);
        }

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");


        LocalDate Dof1 = LocalDate.of(1960,2,22);
        LocalDate Dof2 = LocalDate.of(1993,9,26);
        boolean r =  Dof1.isBefore(Dof2);// born before
        System.out.println(r);
       boolean r2= Dof2.isAfter(Dof1);//born after
        System.out.println(r2);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        //leap year: a year, occurring once every four years,
        // that has 366 days including February 29 as an intercalary day.

       boolean leap= Dof1.isLeapYear();
        System.out.println("leap = " + leap);
        boolean leap2= Dof2.isLeapYear();
        System.out.println("leap2 = " + leap2);

        boolean wj =LocalDate.of(1959,7,17).isLeapYear();
        System.out.println("wj = " + wj);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        LocalDate current = LocalDate.now();
        System.out.println("current = " + current);
        LocalDate future = current.plusDays(14);
        System.out.println("future = " + future);
        LocalDate fu = current.plusMonths(2);
        System.out.println("fu = " + fu);

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        //Local time and use same methods .of . now
        LocalTime now =LocalTime.now();
        System.out.println("now = " + now);
        LocalTime breakk = LocalTime.now().plusMinutes(15);
        System.out.println("breakk = " + breakk);

        LocalTime times = LocalTime.of(11,20);
        System.out.println("times = " + times);


        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        // Local Date Time

        LocalDateTime nows =LocalDateTime.now();
        System.out.println("nows = " + nows);

       LocalDateTime nextmonth=  nows.plusMonths(1);
        System.out.println("nextmonth = " + nextmonth);


        System.out.println("---------------------------------");
        System.out.println("---------------------------------");


        //Day time formatter
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY EEEE");
       LocalDate formatted=  LocalDate.now();
        System.out.println("formatted = " + formatted);

        System.out.println(formatted.format(DF));
        System.out.println("---------------------------------");

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime tine = LocalTime.now();
        System.out.println("tine = " + tine);
        System.out.println(tine.format(TF));

        System.out.println("---------------------------------");

        LocalTime t1 = LocalTime.of(12,30);
        System.out.println(t1.format(TF));
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");


        DateTimeFormatter every = DateTimeFormatter.ofPattern("MM/dd/YYYY EEEE, hh:mm a");
        LocalDateTime alheen = LocalDateTime.now();
        System.out.println("alheen = " + alheen);
        System.out.println(alheen.format(every));

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");


        DateTimeFormatter mybirthdayday = DateTimeFormatter.ofPattern("EEEE hh:mm a MM/dd/YYYY");
        LocalDateTime thtat = LocalDateTime.of(1993 ,9,26,15,30);
        System.out.println(thtat.format(mybirthdayday));

        String birt = LocalDate.of(1993,9,26).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("birt = " + birt);

        String[] names = {"zaid","ahmet","memet","mohmet","ahmet"};
        LocalDate[] DOF = {LocalDate.of(1993,9,26),
                LocalDate.of(2000,1,4),
                LocalDate.of(1978,6,21),
                LocalDate.of(1987,5,2),
                LocalDate.of(1954,3,12),
        };

        LocalDate youngest = DOF[0];
        int index = 0;
        for (int i = 0; i < DOF.length; i++) {
            if (youngest.isBefore(DOF[i])){
                youngest=DOF[i];
                index= i;
            }
            if (DOF[i].isLeapYear()){
                System.out.println("Leap year "+names[i]);
            }
        }


        System.out.println("youngest = " + youngest);
        System.out.println(names[index]);

        System.out.println("------------------------------");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE MM/dd/YYYY");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" was born on "+ DOF[i].format(df));
        }



    }
}
