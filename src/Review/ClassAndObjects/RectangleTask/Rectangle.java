package Review.ClassAndObjects.RectangleTask;

public class Rectangle {
    public double length;
    public double width;


    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }




    public double calArea(){
        return length*width;
    }

    public double perimeter(){
        return 2*(length+width);
    }



    public void getInfo(){
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("calArea() = " + calArea());
        System.out.println("perimeter() = " + perimeter());
    }

    public String toString(){
        return "width:"+width+", Length: "+length+", Area: "+calArea()+", Perimeter: "+perimeter();

    }



}
