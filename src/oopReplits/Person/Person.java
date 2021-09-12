package oopReplits.Person;
class Person {

private String firstName, lastName;
    private int age;

    public Person() {
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }

    public Person(String firstName, String lastName, int age) {
       setFirstName(firstName);
       setLastName(lastName);
       setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return firstName +" | "+ lastName +" | "+ age;
    }
}