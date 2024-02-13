package tasks12_oop_encapsulation;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2);
        double area = circle1.area();
        double perimerter = circle1.perimeter();
        System.out.println(""+circle1);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimerter);

    }
}
