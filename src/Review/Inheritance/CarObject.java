package Review.Inheritance;

public class CarObject extends Vehicle{

    public String model = "Camaro";

    public static void main(String[] args) {

        CarObject carObject = new CarObject();
        System.out.println("carObject.model = " + carObject.model);

        carObject.honking();
        System.out.println( carObject.make +" "+carObject.model);


    }
}
