package myTopicByTopic.Inheritance.cybertek;

import java.time.LocalDate;

public class teacher extends employee{
    public teacher(String name, char gender, LocalDate dOB, String jobTitle, int ID, double salary) {
        super(name, gender, dOB, jobTitle, ID, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");

    }

    @Override
    public void attend() {
        System.out.println(getJobTitle()+" "+getName()+" is in class");

    }


    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" is sleeping");

    }
}
