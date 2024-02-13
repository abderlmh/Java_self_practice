package tasks12_oop_encapsulation;

public class Rectangle {

    private double width;
    private double length;
    private double area;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("The width cannot be set to negative or zero values.");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("The length cannot be set to negative or zero values.");
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return (length*width)*2;
    }

    public String toString() {

        return "Rectangle{" +
                "width =" + getWidth() +
                ", length = " + getLength() +
                ", Area = " + calcArea() +
                ", Perimeter = "+calcPerimeter()+
                '}';
    }
}
