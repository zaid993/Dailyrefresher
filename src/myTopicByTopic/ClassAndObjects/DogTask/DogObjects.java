package myTopicByTopic.ClassAndObjects.DogTask;

public class DogObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.name= "Spank";
        dog1.breed= "husk";
        dog1.gender= 'F';
        dog1.size= "large";
        dog1.age= 12;
        dog1.price= 3000;
        dog1.color= "Black";

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.gender);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println("---------------------------------");


        Dog dog2 = new Dog();
        dog2.setInfo("Beb","Husky","White","Large",11,300.0,'M');

        dog1.bark();
        dog2.bark();

        dog2.play();
        dog1.eat("Khara");

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");


        dog1.getInfo();


    }
}
