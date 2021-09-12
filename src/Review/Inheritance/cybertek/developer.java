package Review.Inheritance.cybertek;

import java.time.LocalDate;

public final class developer extends employee{
    public developer(String name, char gender, LocalDate dOB, String jobTitle, int ID, double salary) {
        super(name, gender, dOB, jobTitle, ID, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is writing code");

    }

    @Override
    public void attend() {
        System.out.println(getJobTitle()+" "+getName()+" is attending scrum meeting");

    }
}
