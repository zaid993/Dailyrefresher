package Review.Inheritance.cybertek;

import java.time.LocalDate;

public final class tester extends employee {

    public tester(String name, char gender, LocalDate dOB, String jobTitle, int ID, double salary) {
        super(name, gender, dOB, jobTitle, ID, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }

    @Override
    public void attend() {
        System.out.println(getJobTitle()+" "+getName()+" is at a meeting");

    }
}
