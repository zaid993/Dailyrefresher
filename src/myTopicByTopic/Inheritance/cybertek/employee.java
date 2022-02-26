package myTopicByTopic.Inheritance.cybertek;

import java.time.LocalDate;

public class employee extends Person{

    private String jobTitle;
    private int ID;
    private double salary;

    public employee(String name, char gender, LocalDate dOB, String jobTitle, int ID, double salary) {
        super(name, gender, dOB);
        setJobTitle( jobTitle );
        setID(ID);
        setSalary(salary);
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            return;
        }
        this.salary = salary;
    }




    public void work(){
        System.out.println(getName()+" is working");
    }



    public void attend(){
        System.out.println(getName()+" is attending");
    }


    @Override
    public String toString() {
        return "employee{" +
                super.toString()+
                "jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
