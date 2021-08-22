package MethodReplits;

public class splitinfo {

    public static void person(String str){


        String[] array = str.split(",");
        String first = "person name: "+array[0];
        String last = "last name: "+array[1];
        String age = "age:  "+array[2];
        String Personinfo=first+"\n"+last+"\n"+age;
        System.out.println(Personinfo);
    }

    public static void main(String[] args) {
        String person = "Joe,doe,30";
        person(person);
    }









}
