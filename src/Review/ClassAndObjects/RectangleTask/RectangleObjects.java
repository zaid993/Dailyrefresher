package Review.ClassAndObjects.RectangleTask;

public class RectangleObjects {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(12,6);
        rectangle1.length=6;
        rectangle1.width=3;
        rectangle1.getInfo();
        System.out.println("----------------------------------");

        System.out.println("rectangle1 = " + rectangle1);

    }
}
