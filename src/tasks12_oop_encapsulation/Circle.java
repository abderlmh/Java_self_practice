package tasks12_oop_encapsulation;

public class Circle {

    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", area= "+area()+
                ", perimeter"+perimeter()+
                '}';
    }
}
