package Review.StringRep.w3School.abstraction.interfas;

public class Dog implements Activities{


    @Override
    public void sleep() {
        System.out.println("Dog slept");
    }

    @Override
    public void sound() {
        System.out.println("Dog farted");
    }
}

interface Activities{
    void sleep();
    void sound();
}



class main{
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sleep();
        dog.sound();


    }
}