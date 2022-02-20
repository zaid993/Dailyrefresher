package Review.Enums;

public class TestEnum {
    public static void main(String[] args) {
    Browser browser = Browser.chrome;

        switch (browser) {
            case chrome:
                System.out.println("Chrome");
                break;
            case firefox:
                System.out.println("firefox");
                break;
            case edge:
                System.out.println("edge");
                break;
            case opera:
                System.out.println("opera");
                break;
        }





}

}
