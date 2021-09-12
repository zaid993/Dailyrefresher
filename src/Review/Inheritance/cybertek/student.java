package Review.Inheritance.cybertek;

import java.time.LocalDate;

public class student extends Person {

    private String school;
    private int StudentID;

    public student(String name, char gender, LocalDate dOB, String school, int studentID) {
        super(name, gender, dOB);
        setSchool(school);
        setStudentID(studentID);
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }



    public void attendClass(){
        System.out.println(getName()+" is attending class");
    }

    @Override
    public String toString() {
        return "student{" +
                super.toString()+
                "school='" + school + '\'' +
                ", StudentID=" + StudentID +
                '}';
    }
}
