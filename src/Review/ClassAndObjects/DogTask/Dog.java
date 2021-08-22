package Review.ClassAndObjects.DogTask;

public class Dog {

    public String name, breed, color, size;
    public int age;
    public double price;
    public char gender;

    public void setInfo(String name, String breed, String color, String size, int age, double price, char gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.price = price;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating"+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+ drink);
    }

    public void bark( ){
        System.out.println(name+" is barking");
    }

    public void play( ){
        System.out.println(name+" is playing");
    }


    public void getInfo() {

        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("color = " + color);
        System.out.println("size = " + size);
        System.out.println("age = " + age);
        System.out.println("price = " + price);
        System.out.println("gender = " + gender);


    }
}
