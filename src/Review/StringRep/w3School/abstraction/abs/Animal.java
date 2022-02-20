package Review.StringRep.w3School.abstraction.abs;

public abstract class Animal {

        public abstract void animalSound(); // no body

    // abstract and regular methods

        public void sleep() {
            System.out.println("Zzz");
        }

//        From the example above, it is not possible to create an object of the Animal class:

}



class Dog extends Animal{


    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

}


class main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.animalSound();
        dog.sleep();



    }


}