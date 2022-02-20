package Review.StringRep.w3School.polymrophism;

public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}


class Jungle{
    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.animalSound();


        Animal dog = new Dog();
        dog.animalSound();

        Animal pig = new Pig();
        pig.animalSound();





    }
}
