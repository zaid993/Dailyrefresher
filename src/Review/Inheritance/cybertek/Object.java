package Review.Inheritance.cybertek;

import java.time.LocalDate;

public class Object {
    public static void main(String[] args) {

        student student = new student("hidy",'M', LocalDate.of(1993,9,26),"CyberTek",12);
        student.drink("coffee");
        student.sleep();
        student.eat("bugs");
        student.study();
        student.attendClass();
//        student.work();
//        student.attend();
        System.out.println(student);


        tester tester = new tester("Heba",'F', LocalDate.of(1990,5,2),"SDET",13,125000);
        tester.drink("coffee");
        tester.sleep();
        tester.eat("bugs");
        tester.work();
        tester.attend();
        System.out.println(tester);




        developer developer = new developer("Zainab",'M', LocalDate.of(1890,3,5),"dev",14,160000);
        developer.drink("water");
        developer.sleep();
        developer.eat("codes");
        developer.work();
        developer.attend();
        System.out.println(developer);

        teacher teacher = new teacher("Asyia",'F',LocalDate.of(1990,1,1),"Teach",1,200000);
        teacher.drink("water");
        teacher.sleep();
        teacher.eat("codes");
        teacher.work();
        teacher.attend();
        System.out.println(teacher);


    }
}
